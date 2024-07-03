# test-log4j
Testing out log4j.

https://www.baeldung.com/java-logging-intro
https://www.baeldung.com/java-log4j-properties-guide

### Slf4J and Log4J4 dependencies

https://www.baeldung.com/slf4j-with-log4j2-logback


### Log4J2 Properties File
https://www.baeldung.com/java-log4j2-config-with-prop-file

### Log4j2 Debugging

-Dlog4j2.debug=true (https://www.googlecloudcommunity.com/gc/Data-Analytics/log4j2-property-not-getting-applied-to-serverless-spark-batch/m-p/618688)

Invocation:
`java -cp target\classes;target\log4j2-0.1-SNAPSHOT-jar-with-dependencies.jar org.joelson.test.log4j2.Slf4j2Example`

`java -cp target\classes;target\log4j2-0.1-SNAPSHOT-jar-with-dependencies.jar -Dlog4j2.debug=true org.joelson.test.log4j2.Slf4j2Example`
