Now, we want to run things. Let's start with running a single nginx container.

Pour executer le conteneur vous devez disposer d'une image. Pour en trouver une, lancez `docker search nginx`{{execute}} ou naviguer sur [https://hub.docker.com/](https://hub.docker.com/).


Vous pouvez utiliser des balises (visibles uniquement via le navigateur Web) pour exécuter une version spécifique de nginx ou simplement utiliser `latest` (default):
`docker run -d --name my_nginx nginx`{{execute}}. YVous devez ajouter l'option _-d_ pour lancer le conteneur en arrière plan. Autrement il fonctionnerait sur votre terminal.
Vous devrez obtenir un hash (ID) du conteneur comme sortie.

Pour verifier qu'il s'execute, lancez la commande `docker ps`{{execute}}.`

Vous pouvez trouver des détails de bas niveau sur de nombreux objets Docker (conteneurs, images, réseaux) en exécutant `docker inspect`.
Essayez d'inspecter votre conteneur avec la commande: `docker inspect my_nginx`{{execute}} et l'image que vous utilisez `docker inspect nginx`{{execute}}.

Vous pouvez afficher ses processus en exécutant `docker top my_nginx`{{execute}} et ouvrez bash en exécutant `docker exec -it my_nginx bash`. N'hésitez pas à parcourir les fichiers dans le conteneur.
