When you have your app built, it's time to run the app. To host the files you will need a HTTP server.
Let's use Nginx - high performance HTTP proxy and server.

<pre class="file" data-filename="Dockerfile" data-target="append">
FROM nginx:1.15-alpine
</pre>

Put your files in `/usr/share/nginx/html` to share them with the world.

Build and tag your image using `docker build -t pokedex .`{{execute}} command.

When you are ready, run your app using `docker run -d -p 80:80 pokedex`{{execute}}.
You can reach the app at https://[[HOST_SUBDOMAIN]]-80-[[KATACODA_HOST]].environments.katacoda.com/
