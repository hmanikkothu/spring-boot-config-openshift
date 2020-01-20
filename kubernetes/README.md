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

### deploy to k8s
```
kubectl apply -f kubernetes/deployment.yaml
```

### test
```
curl localhost:8080/svcmessage

# output
Hello. - Defaulte service.message from application.yml
```

### update ConfigMap to live replace the config
```
kubectl edit cm spring-boot-config-k8s

# update the data section with appropriate key: values

```
