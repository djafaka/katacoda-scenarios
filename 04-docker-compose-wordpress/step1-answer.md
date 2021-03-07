Put this in your `docker-compose.yml` file:
<pre class="file" data-filename="docker-compose.yml" data-target="replace">
version: '3'
services:
  wp:
    image: wordpress
    ports:
      - "8080:80"
    environment:
      WORDPRESS_DB_HOST: db
      WORDPRESS_DB_NAME: my_wp
      WORDPRESS_DB_USER: user
      WORDPRESS_DB_PASSWORD: pass
      
  db:
    image: mysql:5.6
    environment:
      MYSQL_DATABASE: my_wp
      MYSQL_USER: user
      MYSQL_PASSWORD: pass
      MYSQL_ROOT_PASSWORD: pass
    volumes:
      - ./mysql-data:/var/lib/mysql
</pre>

and run the stack using `docker-compose up -d`{{execute}}
