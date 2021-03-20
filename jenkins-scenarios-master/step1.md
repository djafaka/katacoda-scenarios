The environment has a Jenkins server running as a Docker container. You can view the status using `docker ps`{{execute}}.

Prepare the volume directory: We need a separate directory with admin
ownership to keep the Jenkins home. Let's prepare one with the following
commands:

`mkdir /var/jenkins_home`{{execute}}

`chmod 755 /var/jenkins_home`{{execute}}

Run the Jenkins container: Let's run the container as a daemon and give it a proper name with the following command:

`docker run -d -u root --name jenkins -p 8080:8080 -p 50000:50000 -v /root/jenkins:/var/jenkins_home jenkins:1.651.1-alpine`{{execute}}

All plugins and configurations get persisted to the host at _/root/jenkins_. Port 8080 opens the web dashboard, 50000 is used to communicate with other Jenkins agents. Finally, the image has an alpine base to reduce the size footprint.

#### Load Dashboard

You can load the Jenkins' dashboard via the following URL https://[[HOST_SUBDOMAIN]]-8080-[[KATACODA_HOST]].environments.katacoda.com/

In the next steps, you'll use the dashboard to configure the plugins and start building Docker Images.
