#!/usr/bin/env bash

# Author: Álvaro Fernández Barrero
# Date: 20-09-2026

if [ $# -ne 1 ]; then
  echo -e "\e[1;91mYou need to write a parameter to set the new project's name\e[0m";
  exit 1;
fi

mkdir -p $1/src/styles $1/src/scripts $1/src/img $1/src/videos $1/src/audios $1/src/fonts
touch $1/index.html $1/src/styles/main.css $1/src/scripts/main.js

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
