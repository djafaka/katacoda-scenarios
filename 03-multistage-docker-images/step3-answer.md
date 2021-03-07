<pre class="file" data-filename="Dockerfile" data-target="append">
COPY --from=node-builder /usr/src/app/build /usr/share/nginx/html
</pre>
