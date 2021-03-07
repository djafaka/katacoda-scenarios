Not everyone likes exposing the ports. But managing 2 `docker-compose.yml` filesmay be hard.

You may easily add (or remove) additional things (like ports or envs) to services in separate YML files.
To use them, reference them with `-f` on each `docker-compose` command, for example:

`docker-compose up -d -f docker-compose.yml -f docker-compose.dev.yml`

But this may be a bit confusing - you may forget about passing one of the files and break things. Can't it be done easier?

Yes! You can simply put them in `COMPOSE_FILE` variable:
<pre class="file" data-filename=".env" data-target="append">
COMPOSE_FILE=docker-compose.yml:docker-compose.dev.yml
</pre>

Let's put additional `WORDPRESS_DEBUG` variable and the port in the overlay file:
<pre class="file" data-filename="docker-compose.dev.yml" data-target="replace">
version: '3.6'
services:
  wp:
    ports:
      - "${WP_PORT}:80"
    environment:
      WORDPRESS_DEBUG: '1'
</pre>

Please also remove `ports` field from original `docker-compose.yml` file.

You may now try to update your stack with `docker-compose up -d`{{execute}}
and verify it using `docker inspect wordpress_wp`{{execute}}
