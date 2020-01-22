# spring-boot-config-openshift

## Build

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

## Kubernetes depoyment

Please read the kubernentes deployment instructions here - [kubernetes instructions ](kubernetes/README.md)

## OpenShift deployment

Please read the OpenShift deployment instructions here - [openshift instructions ](openshift/README.md)
