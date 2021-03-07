We will try to create an optimized Docker image that contains only the build artifacts using multi-stage build.

To start, first download the Pokedex repository
`curl -L https://github.com/IonBazan/pokedex/archive/master.tar.gz | tar --strip-components=1 -zx`{{execute}} 

