# Spring Boot config integration demo in OpenShift 

This demo showcases Springboot externalized config integration with ConfigMap in an OpenShift environment  

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

## deploy into OpenShift 

Please read the deployment instructions for OpenShift here - [openshift instructions ](openshift/README.md)


```
The same can be deployed into a kubernetes environment as well, follow the deployment instructions here - [kubernetes instructions ](kubernetes/README.md)
```

