(( $(docker image ls | grep mysql 2>/dev/null | wc -l) >= 1 )) && echo "done"
