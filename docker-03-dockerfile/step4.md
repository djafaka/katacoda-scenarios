Lorsque nous créons une image à partir d'un fichier docker, nous devons considérer les fichiers que nous pourrions préinstaller sur notre image. 
Pour cela, nous allons copier les fichiers du "contexte de construction", qui est le répertoire contenant le Dockerfile. 
Nous pouvons l'utiliser pour "dockeriser" une application. 

Regardons cela de plus pret !

1\. Let's now create a new directory and name it `helloworld`. 

2\. Inside that directory we will create a new file, we will name that file `helloworld.c`, and we copy the following content into it:

```
int main () {
puts("Hello, world!");
return 0;
}
```

3\. Now, from inside our `helloworld` directory, create a new "Dockerfile" and copy the following code into it:

```
FROM ubuntu
RUN apt-get update
RUN apt-get install -y build-essential
COPY helloworld.c /
RUN make helloworld
CMD /helloworld
```

> **NOTE:** See how we are using the COPY command in our Dockerfile to bring our application into our container. This is called "dockerizing" and it's very useful.

4\. Okay, now for the fun part! We can test our project as we have done before. First, let's build out our Dockerfile to create the image we will use, like this:

`docker build -t worldhello .`{{execute}}

5\. Run it! 

`docker run worldhello`{{execute}}

Well?
