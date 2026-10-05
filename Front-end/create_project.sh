#!/usr/bin/env bash

# Author: Álvaro Fernández Barrero
# Date: 20-09-2026

if [ $# -eq 0 ]; then
    echo -e "\e[1;91mYou need to write a parameter to set the new project's name\e[0m";
    exit 1;
fi

exercises_amount=1;
if [ $# -ge 2 ] && [ $2 -gt 1 ]; then
    exercises_amount=$2;
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
EOF

for i in $(seq 1 $exercises_amount); do
    cat >> $1/src/index.js << EOF

// ---------------------------------------------------
// EXERCISE $i
// ---------------------------------------------------

function doExercise$i()
{
    console.log("-------------------------\nEXERCISE $i\n-------------------------");
    
    
}
EOF
done

cat >> $1/src/index.js << "EOF"

// ---------------------------------------------------
// Run exercises
// ---------------------------------------------------

EOF

for i in $(seq 1 $exercises_amount); do
    cat >> $1/src/index.js << EOF
doExercise$i();
EOF
done
