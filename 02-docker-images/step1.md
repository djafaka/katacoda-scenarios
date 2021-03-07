To list your local images, simply run `docker image ls`{{execute}} or alias `docker images`{{execute}}.

To download an image from registry, run `docker pull [repo/]<image-name>[:tag]`. Good examples are:
* `docker pull mysql`{{execute}} - pulls `latest` image of official `mysql` repository
* `docker pull mysql:8`{{execute}} - pulls image tagged `8` of official `mysql` repository
* `docker pull microsoft/dotnet:runtime`{{execute}} - pulls Microsoft .NET `runtime`

Run `docker image ls`{{execute}} again and check which images are available now. 
Notice there are 2 MySQL images with same hash. This is because tag `8` and `latest` point at the same image.
