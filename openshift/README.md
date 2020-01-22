### namespace: spring-boot-config

### Create ServiceAccount, Role, RoleBinding
```
oc create sa-role-rb.yml
```

### Create Service
```
oc create service.yml
```

### Create Route
```
co create route.yml
```

### Create DeploymentConfig
```
oc create deploymentconfig.yml
```

#### Other useful commands - minishift

```
# get cluster info/status 
oc status

# login as system admin
oc login -u system:admin

# login as normal user
oc login -u user

# make a user cluster admin 
oc adm policy add-cluster-role-to-user cluster-admin admin

# generate object from template
oc process -f templates/default/deploymentConfig.yml --param-file params.properties -o yaml

```
