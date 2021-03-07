OK, we have the nginx serving the files but how can we make it serve files from our filesystem?

You can use volumes to share files between containers and host. Any change made on host will be visible on container and vice-versa.

Notice we've prepared `index.html` file in the working directory: `cat index.html`{{execute}}.

Let's try mounting current directory as nginx webroot (`/usr/share/nginx/html`):
`docker run -d --name mounted_nginx -p 90:80 -v $PWD:/usr/share/nginx/html nginx`{{execute}}

The container should start and our content should be served ad port 90:
https://[[HOST_SUBDOMAIN]]-90-[[KATACODA_HOST]].environments.katacoda.com/

You can now edit your `index.html` using your favorite editor: `vim index.html`{{execute}} and watch the changes applied immediately!
