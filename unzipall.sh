#simple script to uncompress (unzip and 7z files) a set of compressed filed in a directory and generate a folder in the same directory as 
# of the compressed file. In this case, .zip and .7z files are analyzed

#for zip files
find -name '*.zip' -exec sh -c 'unzip -d "${1%.*}" "$1"' _ {} \;

#for 7z files 
find -name '*.7z' -exec sh -c '7za x "$1" -o"${1%.*}"' _ {} \;



