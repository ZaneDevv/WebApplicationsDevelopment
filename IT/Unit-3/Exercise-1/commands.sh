#!/bin/bash

# Álvaro Fernández Barrero
# 2026/02/27

# Exploring identity

man who
echo $SHELL

# Help and syntax

man mkdir
help

# File tree

mkdir ~/daw/exercises/unit0
cd ~/daw/exercises/unit0
touch marks data test
nano marks
cat marks
tree ../..

# Manipulating files

mv marks ../marks
cd ../../
cp daw backup

# Permissions

touch confidential
chmod 700 confidential

# Metacharacters [TODO]

touch file1.txt file2.txt fileA.txt fileB.txt manual.pdf

# Visualizing [TODO]

ls -la

# Packing and wrapping up

tar -c toHand.tar ~/Documents/Exercises/*
ls -la /bin

# Paths

cd ~ 
mkdir PROJECT/src PROJECT/bin PROJECT/doc PROJECT/lib
touch ~/PROJECT/src/main.c
chmod 777 ~/PROJECT/src/main.c
touch ~
