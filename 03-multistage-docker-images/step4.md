You may know that usually `package.json` and dependencies don't change as often as the code.
Docker invalidates cache when any of copied files changes so copying whole sources before installing dependencies will require to fetch the dependencies each time something changes in the code.

You can see this by adding a new file to app sources: `touch test1`{{execute}} and building the image again `docker build .`{{execute}}

You can avoid that by dividing copying the sources and `package.json` into two steps.

(See solution or try for yourself)

Then build the image again with `docker build .`{{execute}}, add anything to sources again: `touch test2`{{execute}} and rebuild the image again `docker build .`{{execute}}. 
You should see a big difference.
