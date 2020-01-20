### package app
```
./mvnw package
```

### docker build
```
./mvnw com.google.cloud.tools:jib-maven-plugin:dockerBuild -Dimage=hmanikkothu/spring-boot-config-k8s
```

### docker push 
```
docker push hmanikkothu/spring-boot-config-k8s
```