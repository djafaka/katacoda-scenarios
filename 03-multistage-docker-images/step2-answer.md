<pre class="file" data-filename="Dockerfile" data-target="append">
WORKDIR /usr/src/app

COPY . /usr/src/app

RUN yarn install

RUN yarn build
</pre>
