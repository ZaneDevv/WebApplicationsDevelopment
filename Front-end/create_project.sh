#!/usr/bin/env bash

# Author: Álvaro Fernández Barrero
# Date: 20-09-2026

if [ $# -eq 0 ]; then
  echo -e "\e[1;91mYou need to write a parameter to set the new project's name\e[0m";
  exit 1;
fi

mkdir -p $1/src;

touch $1/index.html;
touch $1/src/index.js;

cat > $1/index.html << "EOF"
<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Document</title>
    
    <script defer src="./src/index.js"></script>
  </head>

  <body>
  </body>
</html>
EOF

cat > $1/src/index.js << "EOF"
/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
  console.log("-------------------------\nEXERCISE 1\n-------------------------");
}

// ---------------------------------------------------
// Run exercises
// ---------------------------------------------------

doExercise1();
EOF