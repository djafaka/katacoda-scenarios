Put this in your `docker-compose.yml` file:
<pre class="file" data-filename="docker-compose.yml" data-target="replace">
version: '3'
services:
  wp:
    image: wordpress
    ports:
      - "${WP_PORT}:80"
    environment:
      WORDPRESS_DB_HOST: db
      WORDPRESS_DB_NAME: "${DB_NAME}"
      WORDPRESS_DB_USER: "${DB_USER}"
      WORDPRESS_DB_PASSWORD: "${DB_PASS}"
      
  db:
    image: mysql:5.6
    environment:
      MYSQL_DATABASE: "${DB_NAME}"
      MYSQL_USER: "${DB_USER}"
      MYSQL_PASSWORD: "${DB_PASS}"
      MYSQL_ROOT_PASSWORD: "${DB_PASS}"
    volumes:
      - ./mysql-data:/var/lib/mysql
</pre>

Put this in your `.env` file:
<pre class="file" data-filename=".env" data-target="append">
WP_PORT=8080

DB_NAME=my_wp
DB_USER=user
DB_PASS=pass
</pre>

and update your stack using `docker-compose up -d`{{execute}}
