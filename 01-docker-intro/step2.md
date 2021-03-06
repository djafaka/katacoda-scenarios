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

Étape 2: Accès et modification du conteneur

Ensuite, nous devons accéder au conteneur. 
Lorsque vous avez exécuté la commande docker run, elle vous aura présenté un long numéro d'identification. 
Vous en aurez besoin pour accéder à l'image. 

Exécutez la commande suivante sur le terminal:

Recuperation de l'ID du conteneur:

```
idConteneur=`docker ps | tail -1 | awk '{ print $1 }'` 
```{{execute}}


Puis entrez dans le terminal du conteneur:

 `docker exec -it $idConteneur bash`{{execute}}

Après avoir exécuté cette commande, vous vous retrouverez dans le terminal du conteneur en cours d'exécution. 
Maintenant, ajoutons quelques outils nécessaire pour le modèle. 

Pour ce faire, exécutez les deux commandes succesives suivantes pour installer l'outil git a l'image existante:

`apt update`{{execute}}

Puis la commande:

`apt-get install  git -y`{{execute}}

Étape 3: Valider les modifications

Maintenant que nous avons modifié le conteneur, nous devons valider les modifications. 

Quittez d'abord le conteneur avec la commande exit:

`exit`{{execute}}
Pour valider les modifications et créer une nouvelle image basée sur lesdites modifications, exécutez la commande:

 `docker commit $idConteneur nginx-template`{{execute}}

 Si vous émettez les images de menu fixe de commande, vous devriez maintenant voir le nouveau conteneur:

`docker images`{{execute}}

À ce stade, vous pouvez créer un nouveau conteneur, en utilisant la nouvelle image, et avoir toutes les modifications déjà en place. 

Lancez un nouveau conteneur a partir de notre template, la commande ressemblerait à quelque chose comme suit:

`docker run --name nginx-dev -p 8082:80 -e TERM=xterm -d nginx-template`{{execute}}

Lancez la commande d'affichage des conteneurs suivante, ou vous pouvez constater que le mouveau conteneur mginx-dev est bien cree a partir de notre template mon-temnplate-base:

`docker ps`{{execute}}

Si vous accédez à ce nouveau conteneur en cours d'exécution (à l'aide de la commande sudo docker exec), vous verrez maintenant que toutes les modifications sont en place et prêtes à être utilisées (en particulier git qui est installe):

```
idConteneur2=`docker ps | head -2 | tail -1 | awk '{ print $1 }'`
```{{execute}}

Puis entrez dans le terminal du conteneur:

 `docker exec -it $idConteneur2 bash`{{execute}}

Et lancer la commande git qui doit s'afficher:

`git `{{execute}}

Pour afficher les journaux d'un conteneur en cours d'execution lancez la commande docker logs.

Par exemple:


`exit`{{execute}}
 `docker logs $idConteneur2`{{execute}}


Pour arrêter un conteneur en cours d'exécution, utilisez l'option docker stop avec le nom du conteneur
que vous souhaiter arrêter, ici par exemple le second conteneur:

 `docker stop  $idConteneur2`{{execute}}

 Pour supprimer un conteneurm utilisez la commande docker rm <ID_CONTENEUR>

 Par Exemple

 `docker rm $idConteneur2`{{execute}}



Passons a present a la seconde option, avec l'utilisation de fichier Dockerfile

Utilisation de fichier Dockerfile
---------------------------------


Commencons deja par supprimer toutes les instances Docker en cours d'execution avec la commande suivante:

 `docker stop $(docker ps -a -q)`{{execute}}

  `docker rm $(docker ps -a -q)`{{execute}}


Pour démarrer la construction, nous aurons besoin du Node 9. Basez votre image sur une version légère de Linux Alpine.

<pre class="file" data-filename="Dockerfile" data-target="replace">
FROM node:9-alpine as node-builder
</pre>

Pour utiliser le cache de construction lorsqu'il est disponible, nous avons déjà ajouté `Dockerfile` à` .dockerignore` afin qu'il ne soit pas copié dans le contexte de construction.

Maintenant, copiez les fichiers sur l'image et construisez l'application en utilisant `yarn install` et` yarn build`.
Les artefacts de construction seront stockés dans le répertoire `build`.

Construisez votre image Docker en utilisant `docker build .` {{execute}}.