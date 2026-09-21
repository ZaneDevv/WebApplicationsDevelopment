#!/usr/bin/env bash

# Author: Álvaro Fernández Barrero
# Date: 20-09-2026

# No parameters offered, no name set
if [ $# -eq 0 ]; then
  echo -e "\e[1;91mYou need to write a parameter to set the new project's name\e[0m";
  exit 1;
fi

# Creating the basic structure
mkdir -p $1/src/styles $1/src/scripts
touch $1/index.html $1/src/styles/main.css $1/src/scripts/main.js

# If more than one configuration was set, manipule the 2nd argument's bits to define which directories generate
if [ $# -ge 2 ]; then
  if [ $(( $((2#$2)) & 1 )) -eq 1 ]; then
    mkdir $1/src/img
  fi

  if [ $(( $((2#$2)) & 2 )) -eq 2 ]; then
    mkdir $1/src/videos
  fi

  if [ $(( $((2#$2)) & 4 )) -eq 4 ]; then
    mkdir $1/src/audios
  fi

  if [ $(( $((2#$2)) & 8 )) -eq 8 ]; then
    mkdir $1/src/fonts
  fi
fi

# Setting the default scripts for the html, css and javascript files
cat > $1/index.html << EOF
<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="./src/styles/main.css">
    
    <title>$1</title>
    
    <script defer src="./src/scripts/main.js"></script>
  </head>

  <body>
    <header>
      <h1>$1</h1>
    </header>
    
    <main>
    </main>
    
    <footer>
    </footer>
  </body>
</html>
EOF

cat > $1/src/styles/main.css << "EOF"
/* -------------------------------------------------
    NORMALIZACION
------------------------------------------------- */

* {
  margin: 0;
  padding: 0;
  
  box-sizing: border-box
}
EOF

cat > $1/src/scripts/main.js << "EOF"
console.log("Hello, World!");
EOF
