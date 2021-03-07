<pre class="file" data-filename="Dockerfile" data-target="replace">
FROM node:9-alpine as node-builder

WORKDIR /usr/src/app

COPY package.json /usr/src/app

RUN yarn install

COPY . /usr/src/app

RUN yarn build

FROM nginx:1.15-alpine

COPY --from=node-builder /usr/src/app/build /usr/share/nginx/html
</pre>
