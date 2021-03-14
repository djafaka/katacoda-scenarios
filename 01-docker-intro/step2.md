Dans cette section, nous verrons comment procéder en utilisant deux méthodes différentes: 

la commande de validation Docker et la construction automatisée Dockerfile.

Docker commit
-------------

Nous utiliserons Ubuntu 18.04 comme image de base.

Il n'est pas nécessaire de le créer; la plupart des images de base sont disponibles dans le registre Docker Hub.

Étape 1: Extraction de l'image et exécution du conteneur

 Lancez `docker pull nginx`{{execute}}

 Verifiez que l'image est bien recupere:

 `docker images | grep nginx`{{execute}}


Ensuite, nous allons l'exécuter de manière à pouvoir utiliser la fenêtre du terminal comme ceci:


`docker run --name mon-template-base -p 8080:80 -e TERM=xterm -d nginx`{{execute}}

Nous avons nommé ce nginx-template-base car ce sera sur quoi sera basé notre modèle.

Lancez la commande suivante pour afficjer l'image que vous venez de 


Étape 2: Accès et modification du conteneur

Ensuite, nous devons accéder au conteneur. 
Lorsque vous avez exécuté la commande docker run, elle vous aura présenté un long numéro d'identification. 
Vous en aurez besoin pour accéder à l'image. 

Exécutez la commande suivante sur le terminal:

```
var=`docker ps | tail -1 | awk '{ print $1 }'` 
```{{execute}}

echo $var


docker exec -it ID_CONTENEUR bash


Où ID_CONTAINER est l'ID qui vous est présenté lorsque vous avez exécuté la commande d'exécution.


Après avoir exécuté cette commande, vous vous retrouverez dans le terminal du conteneur en cours d'exécution. 
Maintenant, ajoutons le logiciel nécessaire pour le modèle. 

Pour ce faire, exécutez les commandes suivantes:


