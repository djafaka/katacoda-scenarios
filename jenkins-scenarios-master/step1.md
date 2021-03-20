Cet etape de notre atelier, correspond a l'installation de Jenkins.

#### Etape 1: Preparation du volume

Préparez le répertoire du volume: nous avons besoin d'un répertoire séparé avec la propriété de l'administrateur pour garder le repertoire de travail de Jenkins. 

Préparons-en un avec les commandes suivantes:

`mkdir /var/jenkins_home`{{execute}}

Attribuez ensuite les permissions suivantes:

`chmod 755 /var/jenkins_home`{{execute}}

#### Etape 2: lancement du conteneur Jenkins: 

Exécutons le conteneur en tant que démon et donnons-lui un nom correct avec la commande suivante:

`docker run -d -u root --name jenkins -p 8080:8080 -p 50000:50000 -v /root/jenkins:/var/jenkins_home jenkins:1.651.1-alpine`{{execute}}

L'environnement a un serveur Jenkins s'exécutant en tant que conteneur Docker. Vous pouvez afficher l'état en utilisant la commande suivante:

`docker ps` {{execute}.

Tous les plugins et configurations sont conservés sur l'hôte à l'adresse _ / root / jenkins_. 
Le port 8080 ouvre le tableau de bord Web, 50000 est utilisé pour communiquer avec d'autres agents Jenkins. Enfin, l'image a une base alpine pour réduire l'encombrement de la taille.

#### Chargement du Tableau de Bord Jenkins

Vous pouvez chargez le tableau de bord de Jenkins avec l'URL suivante:

https://[[HOST_SUBDOMAIN]]-8080-[[KATACODA_HOST]].environments.katacoda.com/

Dans les étapes suivantes, vous utiliserez le tableau de bord pour configurer les plugins et commencer à créer des images Docker.
