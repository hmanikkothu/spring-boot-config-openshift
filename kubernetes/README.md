
### deploy to k8s
```
# create RBAC 
kubectl apply -f kubernetes/sa-role-rb.yaml

# create deployment 
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
