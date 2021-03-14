Créer un nouveau Dockerfile est facile. 
Suivez les etapes suivantes pour créer un nouveau répertoire et initialiser un nouveau Dockerfile vide.

1\. Creation d'un fichier Dockerfile sous le repertoire:

```
$ cd monimage
$ vim Dockerfile
```

>NOTE: Vim est utilisé par défaut, n'hésitez pas à utiliser un autre éditeur de texte disponible.
  
2\. Copiez le texte suivant dans le nouveau Dockerfile:

<pre class="file" data-filename="monimage\Dockerfile" data-target="append"><blockquote>
FROM ubuntu
RUN apt-get -y update
RUN apt-get install -y figlet
</blockquote></pre>

3\. Après avoir enregistré le fichier, exécutez comme suit:

`docker build -t myfiglet .`{{execute}}

Output:

```
Sending build context to Docker daemon 2.048 kB
Sending build context to Docker daemon
Step 0 : FROM ubuntu
---> xxxxxxxxxxxx
Step 1 : RUN apt-get update
---> Running in xxxxxxxxxxxx
---> xxxxxxxxxxxx
Removing intermediate container xxxxxxxxxxxx
Step 2 : RUN apt-get install figlet
---> Running in xxxxxxxxxxxx
---> xxxxxxxxxxxx
Removing intermediate container xxxxxxxxxxxx
Successfully built xxxxxxxxxxxx
```

>NOTE: Les nombres seront différés en fonction du numéro de build, par hôte.

4\. Faites tourner la nouvelle image en utilisant le (-it) pour vous assurer que notre conteneur est interactif. 

`docker run -it myfiglet`{{execute}}


5\. Maintenant, la partie amusante! Pour confirmer le succès, donnez-lui la commande suivante, qui est unique à Figlet:

`figlet hello`{{copy}}

_Pretty cool, huh?_

Et bien sûr, assurez-vous de sortir de votre conteneur:
`exit`{{copy}}
