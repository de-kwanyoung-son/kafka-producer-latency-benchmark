벤치마킹 결과
====================================
```
Benchmark                                                               Mode      Cnt      Score   Error  Units
ProduceBenchmark.measureTenPartitioned                                  avgt        5      2.248 ± 0.469  us/op
ProduceBenchmark.measureTwoPartitioned                                  avgt        5      2.354 ± 0.480  us/op
ProduceBenchmark.measureUnpartitioned                                   avgt        5      2.812 ± 0.780  us/op
ProduceBenchmark.measureTenPartitioned                                sample  1383900      3.041 ± 0.272  us/op
ProduceBenchmark.measureTenPartitioned:measureTenPartitioned·p0.00    sample               0.083          us/op
ProduceBenchmark.measureTenPartitioned:measureTenPartitioned·p0.50    sample               0.458          us/op
ProduceBenchmark.measureTenPartitioned:measureTenPartitioned·p0.90    sample               1.292          us/op
ProduceBenchmark.measureTenPartitioned:measureTenPartitioned·p0.95    sample               2.456          us/op
ProduceBenchmark.measureTenPartitioned:measureTenPartitioned·p0.99    sample              12.496          us/op
ProduceBenchmark.measureTenPartitioned:measureTenPartitioned·p0.999   sample            1126.400          us/op
ProduceBenchmark.measureTenPartitioned:measureTenPartitioned·p0.9999  sample            2399.761          us/op
ProduceBenchmark.measureTenPartitioned:measureTenPartitioned·p1.00    sample           53280.768          us/op
ProduceBenchmark.measureTwoPartitioned                                sample  1242419      3.272 ± 0.222  us/op
ProduceBenchmark.measureTwoPartitioned:measureTwoPartitioned·p0.00    sample               0.125          us/op
ProduceBenchmark.measureTwoPartitioned:measureTwoPartitioned·p0.50    sample               0.500          us/op
ProduceBenchmark.measureTwoPartitioned:measureTwoPartitioned·p0.90    sample               2.000          us/op
ProduceBenchmark.measureTwoPartitioned:measureTwoPartitioned·p0.95    sample               5.040          us/op
ProduceBenchmark.measureTwoPartitioned:measureTwoPartitioned·p0.99    sample              17.024          us/op
ProduceBenchmark.measureTwoPartitioned:measureTwoPartitioned·p0.999   sample            1107.968          us/op
ProduceBenchmark.measureTwoPartitioned:measureTwoPartitioned·p0.9999  sample            1657.889          us/op
ProduceBenchmark.measureTwoPartitioned:measureTwoPartitioned·p1.00    sample           46202.880          us/op
ProduceBenchmark.measureUnpartitioned                                 sample  1178453      4.191 ± 0.347  us/op
ProduceBenchmark.measureUnpartitioned:measureUnpartitioned·p0.00      sample               0.083          us/op
ProduceBenchmark.measureUnpartitioned:measureUnpartitioned·p0.50      sample               0.375          us/op
ProduceBenchmark.measureUnpartitioned:measureUnpartitioned·p0.90      sample               1.500          us/op
ProduceBenchmark.measureUnpartitioned:measureUnpartitioned·p0.95      sample               5.040          us/op
ProduceBenchmark.measureUnpartitioned:measureUnpartitioned·p0.99      sample              16.416          us/op
ProduceBenchmark.measureUnpartitioned:measureUnpartitioned·p0.999     sample            1214.464          us/op
ProduceBenchmark.measureUnpartitioned:measureUnpartitioned·p0.9999    sample            3127.148          us/op
ProduceBenchmark.measureUnpartitioned:measureUnpartitioned·p1.00      sample           41943.040          us/op
```