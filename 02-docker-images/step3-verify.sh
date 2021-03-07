(( $(docker image ls | grep my_python_app 2>/dev/null | wc -l) >= 1 )) \
    && (( $(curl docker:81 | grep prod 2>/dev/null | wc -l) >= 1 )) \
    && (( $(curl docker:82 | grep dev 2>/dev/null | wc -l) >= 1 )) \
    && echo "done"
