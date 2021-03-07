[[ $(docker ps --format "{{.Image}}" | grep nginx | wc -l) -ge 1 ]] && echo "done"
