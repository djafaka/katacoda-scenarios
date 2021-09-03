## 1.1 Deploy Istio

Install custom resource definitions ([istio-crds.yaml](./istio-crds.yaml)):

`docker info`{{execute}}.

`kubectl apply -f resources\istio-crds.yaml`{{execute}}.


Install demo configuration ([istio-demo.yaml](./istio-demo.yaml)):


kubectl apply -f istio-demo.yaml


## 1.2 Verify Istio

Running objects:

```
kubectl get all -n istio-system
```

> All components have memory requests

## 1.3 Configure auto proxy injection

Configure default namespance:

```
kubectl label namespace default istio-injection=enabled
```

Check label:

```
kubectl describe namespace default
```

## 1.4 Check what's running

```
kubectl get all

docker info
```
