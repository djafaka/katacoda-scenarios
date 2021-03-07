But what if we want to expose multiple containers and we don't want to choose ports manually?

Docker can do this for us! Simply don't specify host port:
`docker run -d --name dynamic_nginx -p 80 nginx`{{execute}} and the port will be chosen by Docker so that there will be no collisions.

To check which port has been assigned, use `docker port dynamic_nginx 80`{{execute}}.
You can also achieve this by running `docker ps`{{execute}}

To check if the service is available there, go to  
https://[[HOST_SUBDOMAIN]]-[[KATACODA_HOST]].environments.katacoda.com/
and enter the port number.
