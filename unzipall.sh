find -name '*.zip' -exec sh -c 'unzip -d "${1%.*}" "$1"' _ {} \;
find -name '*.7z' -exec sh -c '7za x "$1" -o"${1%.*}"' _ {} \;



