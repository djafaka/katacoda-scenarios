1\. Lancez la commande suivante pour voir l'historique de notre dernier Dockerfile:

`docker history myfiglet`{{execute}}

2\. Modifions notre Dockerfile pour inclure la syntaxe JSON, comme suit:

<pre class="file" data-filename="Dockerfile" data-target="replace"><blockquote>
FROM ubuntu
RUN apt-get update
RUN ["apt-get", "install", "figlet"]
</blockquote></pre>

3\. Ensuite, créez à nouveau le nouveau Dockerfile, comme nous l'avons fait auparavant:

`$ docker build -t myfiglet .`{{execute}}

Output:

```
...
Successfully built xxxxxxxxxxxx
```

4\. Maintenant, comparez la nouvelle histoire avec l'autre:

`docker history myfiglet`{{execute}}

