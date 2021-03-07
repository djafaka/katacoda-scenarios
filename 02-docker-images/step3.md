Create your own image and try running it with different environment variables.

There is a simple application written in *Python* that just returns all environment variables on each request.
The application is running on port `5000` and uses HTTP to communicate with user.

Create your own image running this application and tag it `my_python_app` (`docker build -t my_python_app.`{{execute}}).

Run 2 containers using your image with different `MY_ENV` variable value:
* One running on port `81` with `MY_ENV=prod`
* Second running on port `82` with `MY_ENV=dev`

# Tips:
* You can base your image on `python:3-alpine`
* The best place to put your app is `/usr/src/app`
* To install dependencies use `pip install --no-cache-dir -r requirements.txt` command
* To run your app, use `python app.py` command
* Use `-p HOST_PORT:CONTAINER_PORT` to expose ports
* Use `-e ENV_NAME=value` to set environment variable value 
