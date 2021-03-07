To enable other developers easily change parameters of your setup you may pass environment variables to each `docker-compose` command.
However, it is easier to put them in `.env` file - Docker Compose will handle it automatically.

There is already one entry there: `COMPOSE_PROJECT_NAME=wordpress`. This is predefined variable telling Docker Compose how to prefix the containers.

Move the parts that should be configured by developers to `.env` file and use them in `docker-compose.yml` file:

```yaml
services:
  service1:
    image: my_app
    ports:
      - "${APP_PORT}:80"
```

This way you let other developers configure the port that is exposed if they already have it occupied by other app.
Note that you can use the variables almost everywhere in the file to customize your stack.
