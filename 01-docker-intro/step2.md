Dans cette section, nous verrons comment procéder en utilisant deux méthodes différentes: 

la commande de validation Docker et la construction automatisée Dockerfile.

Docker commit
-------------

Nous utiliserons Ubuntu 18.04 comme image de base.

Il n'est pas nécessaire de le créer; la plupart des images de base sont disponibles dans le registre Docker Hub.

Étape 1: Extraction de l'image et exécution du conteneur

 Lancez `docker pull nginx`{{execute}}

Une fois l'image téléchargée, nous allons l'exécuter de manière à pouvoir utiliser la fenêtre du terminal comme ceci:

`docker run --name nginx-template-base -p 8080:80 -e TERM=xterm -d nginx`{{execute}}

Nous avons nommé ce nginx-template-base car ce sera sur quoi sera basé notre modèle.


