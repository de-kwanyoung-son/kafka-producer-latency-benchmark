package org.example;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class ProduceBenchmark {

    private Producer<String, String> producer;
    private int key = 1;
    private final String value = "Benchmark";

    @Setup
    public void setup() {
        Properties props = new Properties();
        props.put("bootstrap.servers", System.getenv("BOOTSTRAP_SERVERS"));
        props.put("acks", "1");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        producer = new KafkaProducer<>(props);
    }

    @TearDown
    public void teardown() {
        producer.close();
    }

    @Benchmark
    @BenchmarkMode({Mode.AverageTime, Mode.SampleTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    // 토픽의 파티션이 한 개일 경우
    public void measureUnpartitioned() {
        producer.send(new ProducerRecord<>("benchmark_latency_unpartitioned", Integer.toString(key), value));
        key++;
    }

    @Benchmark
    @BenchmarkMode({Mode.AverageTime, Mode.SampleTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    // 토픽의 파티션이 두 개일 경우
    public void measureTwoPartitioned() {
        producer.send(new ProducerRecord<>("benchmark_latency_partitioned", Integer.toString(key), value));
        key++;
    }

    @Benchmark
    @BenchmarkMode({Mode.AverageTime, Mode.SampleTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    // 토픽의 파티션이 세 개일 경우
    public void measureTenPartitioned() {
        producer.send(new ProducerRecord<>("benchmark_latency_partitioned_ten", Integer.toString(key), value));
        key++;
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(ProduceBenchmark.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
