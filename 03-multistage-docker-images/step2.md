To start the build we will need Node 9. Base your image on lightweight Linux Alpine build.

<pre class="file" data-filename="Dockerfile" data-target="replace">
FROM node:9-alpine as node-builder
</pre>

To use build cache when available, we've already added `Dockerfile` to `.dockerignore` so it won't be copied to build context.

Now copy the files to the image and build the app using `yarn install` and `yarn build`.
Build artifacts will be stored in `build` directory.

Build your Docker image using `docker build .`{{execute}}.

