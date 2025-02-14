# java-nacos-demo

# build
```
mvn clean package
```

# running
```
java -jar target/nacos-config-demo-1.0-SNAPSHOT.jar --spring.cloud.nacos.config.server-addr=127.0.0.1:8848
```

# test
```
curl http://localhost:8081/config
```
