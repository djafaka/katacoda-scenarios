Dans cette section, nous verrons comment procéder en utilisant deux méthodes différentes: 
la commande de validation Docker et la construction automatisée Dockerfile.

Docker commit
-------------

Commençons par un exemple et préparons une image avec la boîte à outils Git et JDK. 
Nous utiliserons Ubuntu 18.04 comme image de base.

Il n'est pas nécessaire de le créer; la plupart des images de base sont disponibles dans le registre Docker Hub.

1. Exécutez un conteneur depuis ubuntu: 18.04 et connectez-le à sa ligne de commande:

 Lancez `docker run -i -t ubuntu:18.04 /bin/bash`{{execute}}


Nous avons extrait l'image ubuntu: 18.04, l'avons exécutée en tant que conteneur, puis appelé la commande / bin / bash de manière interactive (indicateur -i). 
Vous devriez voir le terminal du conteneur. Étant donné que les conteneurs sont avec état et inscriptibles, nous pouvons faire tout ce que nous voulons dans son terminal.

2. Installer Git

Lancez `apt-get update`{{execute}}

Lancez `apt-get install -y git`{{execute}}

Verifiez ensuite que Git est bien installe

`which git`{{execute}}

