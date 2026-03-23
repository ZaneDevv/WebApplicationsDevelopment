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

# 4. Links to files
cd /home/user # Locating at /home/user
mkdir exercise4 # Making the directory "exercise4"
cd exercise4 # Locating at the directory "exercise4" that we just made
cat > texto.txt <<EOF # Creating the file "texto.txt" with the given content using a here-doc
Este es el ejercicio 4
EOF
ln -s texto.txt enlace.lnk # Creating a symbolic link called "enlace.lnk" pointing to "texto.txt"
ls -l # Showing the long listing of the directory (includes the link)
file * # Showing the types of files contained in the directory

# 5. User and group files
# The following lines correspond to fields in /etc/passwd, /etc/group, and /etc/shadow:
#   usuario:x:1000:1000:usuario,,,:/home/usuario:/bin/bash
#     Fields: username, password (x indicates shadowed), UID, GID, GECOS, home directory, shell
#   adm:x:4:usuario
#     Fields: group name, password (x), GID, member list (usuario is a member)
#   usuario:$6$WTv783cQ0mQ6cw3U8dXpKmwSL37lGaLjKwCa/:15607:0:99999:7:::
#     Fields: username, encrypted password, last change, min days, max days, warn period, inactive, expire (from /etc/shadow)

# 6. Wildcard usage
cd /home/user # Locating at /home/user
mkdir exercise6 # Making a new directory exercise6
cd exercise6 # Locating at the directory exercise6
touch text1.txt # Creating a new empty file text1.txt
cp text1.txt text2.txt # Copying as text2.txt
cp text1.txt text3.txt # Copying as text3.txt
cp text1.txt text4.txt # Copying as text4.txt
cp text1.txt text5.txt # Copying as text5.txt
mkdir files1 # Creating directory files1
cp *.txt files1/ # Copying all files ending in .txt into files1
mkdir files2 # Creating directory files2
cp text*.txt files2/ # Copying all files that start with "text" and end with ".txt" into files2
mkdir files3 # Creating directory files3
cp text[1-3].txt files3/ # Copying files that start with "text" followed by a number from 1 to 3 into files3
ls -lR # Showing the long listing of the current directory and all its subdirectories recursively

# 7. Operations with file content
cd /home/user # Locating at /home/user
mkdir exercise7 # Creating the directory exercise7
cd exercise7 # Locating at the directory exercise7
cat > notas.txt <<EOF # Creating the file with the student data using a here-doc
Nombre MME SOM REDES APLOF FOL
Miguel 6 5 7 8 9
Antonio 3 4 2 6 7
Luis 8 8 7 9 9
Sara 2 3 5 6 1
Maria 6 7 5 8 8
EOF
sort notas.txt > orden.txt # Sorting lines alphabetically and redirecting to orden.txt
cut -d' ' -f1,2,3 notas.txt > notas_miguel.txt # Extracting columns 1,2,3 (space separated) for all lines
cut -d' ' -f1,5 notas.txt > notas_aplof.txt # Extracting columns 1 and 5 for APLOF
cut -d' ' -f1,4 notas.txt > notas_redes.txt # Extracting columns 1 and 4 for REDES
cut -d' ' -f1,6 notas.txt > notas_fol.txt # Extracting columns 1 and 6 for FOL
grep "Antonio" *.txt # Showing lines containing "Antonio" in all .txt files
wc -l -w -c *.txt # Counting lines, words, and characters of all .txt files

# 8. GUI: Ubuntu panel
# This step must be done manually via the graphical interface:
# - Right-click on the left side panel, select "Panel Settings"
# - Set size to 65 pixels
# - Add the items: "Exit", "Sticky Notes", "CPU Frequency Monitor", "Search Files", "Eyes"
# - Add a sticky note with the reminder: "Examen de SO Viernes 31 de Enero"

# 9. Associating files with programs
# This step must be done manually:
# - Right-click any .txt file, choose "Properties" -> "Open With"
# - Select Writer, then set as default
# - Test, then change to gedit following the same procedure

# 10. Information about users and groups
more /etc/passwd # Display the content of /etc/passwd paginated
cut -d: -f1,3,7 /etc/passwd # Show username, UID, and shell for each user using cut
wc -l /etc/passwd # Count the number of users (lines in /etc/passwd)
wc -l /etc/group # Count the number of groups (lines in /etc/group)
cut -d: -f1,3 /etc/group # Show group name and GID for all groups
grep "^usuario:" /etc/group | cut -d: -f4 # Show members of the group "usuario" (assuming it exists)

# 11. Commands
which gedit # Locate the executable of gedit
sudo find / -name auth.log 2>/dev/null # As superuser, locate the file auth.log
firefox https://platform.example.com & # Run firefox in the background opening the platform URL (replace URL with actual)
cd /home/user && sudo ls /etc/init.d && sleep 3 && sudo tree /etc/rc2.d # Stay in /home/user and execute multiple commands in one line
# Using pipes and redirections:
ls /etc/*.conf 2>/dev/null | wc -l # Count the number of .conf files in /etc
ls /var/log/*.log 2>/dev/null | wc -l > volcado.txt # Create a file "volcado.txt" with the number of .log files in /var/log
