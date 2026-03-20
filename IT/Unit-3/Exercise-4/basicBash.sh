#!/bin/bash

# Basic usage of commands to manage files and directories

# 1.
cd /home/user # Locating at /home/user
pwd # Checking where we are located at
mkdir clase1cf # Making a directory with the name "clase1cf"
cd clase1cf # Locating at the directory we just created
touch test1.txt # Creating a empty file with the name "test1.txt"
cp test1.txt test2.txt test3.txt # Copying the file test1.txt as test2.txt and test3.txt
cd .. # Locating again at /home/user
cp clase1cf clase1cf_copy # Copying the directory clase1cf as clase1cf_copy
ls -l clase1cf # Listing all the files inside clase1cf
ls -l clase1cf_copy # Listing all the files inside clase1cf_copy

# 2.
cd /home/user # Locating at /home/user
pwd # Checking where we are located at
mkdir exercise2 # Making a directory with the name "exercise2"
cd exercise2 # Locating at the directory exercise2
echo "I'm the best and I deserve the best" > sentence.txt # Making a file with the name "sentence.txt" and the content "I'm the best and I deserve the best"
ls /home/user > list.txt # Creates a new file with the name "list.txt" and whose content is the result of the command ls
cat list.txt # Checking the content of list.txt
df -h > disks.txt # Makes a file "disks.txt" whose content is the system's information
cat disks.txt # Shows the content of the file disks.txt
tree /home > tree.txt # Makes a file "tree.txt" whose content is the result of the tree command
cat tree.txt # Showing the content of tree.txt
ls -l --human-readable /home | grep total > ocupation.txt # Making a file "ocupation.txt" with the bytes occupied by the /home directory
cat ocupation.txt # Showing the content of ocupation.txt

# 3.
cd /home/user # Locating at /home/user
mkdir Practice2 # Creating a directory with the name "Practice2"
mkdir Practice2/First Practice2/Second Practice2/Third # Making directories "First", "Second" and "Third" in the directory Practice2
cd Practice2/First # Locating at the directory First in Practice2
mkdir EV1 EV2 # Making directories EV1 and EV2
echo $USER > EV1/f1.txt # Makes a file "f1.txt" in EV1 whose content is the user's name
cd ../Third # Locating at the directory "Third"
cp ../First/EV1/f1.txt f2.txt # Copying the file f1.txt we created under the name "f2.txt" in the active directory
mv f2.txt ../Second # Moves the file f2.txt to the directory "Second"
tree /home # Showing the tree of the directory /home

# Links to files

# 4.
cd /home/user # Locating at /home/user
mkdir exercise4 # Making the directory "exercise4"
cd exercise4 # Locating at the directory "exercise4" that we just made
cat > texto.txt # Making a file with the content that the user types next
ls -l # Shows all the content in the directory

# Usage of of wildcards

# 6.

cd /home/user # Locating at /home/user
mkdir exercise7 # Making a new directory exercise7
cd exercise7 # Locating at the directory exercise7
touch text1.txt # Creating a new empty file text1.txt
cp text1.txt text2.txt
cp text1.txt text3.txt
cp text1.txt text4.txt
cp text1.txt text5.txt
mkdir files1

