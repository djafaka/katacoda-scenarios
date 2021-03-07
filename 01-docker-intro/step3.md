The container is running and serving the content but unfortunately you cannot access it from outside yet.

To allow others connect to your container you need to expose one of the ports on your machine. 
To achieve this, use _-p_ option. The syntax is `-p [hostPort:]<containerPort>`.

Let's also specify container name so we won't need to call `docker ps` to fetch it.

Run `docker run -d --name exposed_nginx -p 80:80 nginx`{{execute}} to run a new container and expose it's 80 port on host's port 80.

Your nginx should now be available at: 
https://[[HOST_SUBDOMAIN]]-80-[[KATACODA_HOST]].environments.katacoda.com/
