Create a simple WordPress stack using `wordpress` and `mysql:5.7` images.

To configure DB credentials, use `MYSQL_DATABASE`, `MYSQL_USER` and `MYSQL_PASSWORD` variables on MySQL container.
To set these credentials on WP container, use `WORDPRESS_DB_HOST`, `WORDPRESS_DB_NAME`,`WORDPRESS_DB_USER` and `WORDPRESS_DB_PASSWORD` variables. 


# Remember to:
* Expose WordPress on 8080 port
* Set proper DB credentials in both containers
* Set `MYSQL_ROOT_PASSWORD` variable for MySQL to start
* Mount `/var/lib/mysql` directory somewhere not to lose the data

Check [documentation](https://docs.docker.com/compose/compose-file/) if you need any help.

When ready, run `docker-compose up`{{execute}} to setup your environment.

# Protip:
You can use `docker-compose logs`{{execute}} to view services logs.
