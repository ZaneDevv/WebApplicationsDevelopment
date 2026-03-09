#!/bin/bash

# BLOCK 1. PATHS, STRUCTURED AND ADVANCED COMODINS

# 1. Create the structure PROJECT/{src, bin, doc, lib} with a single command mkdir

cd ~
mkdir -p PROJECT{src,bin,doc,lib} # The parameter -p allow us to create nested directories with a single command mkdir


# 2. From home, make a file en PROJECT/src called main.c with an absolute path

touch $HOME/PROJECT/src/main.c # The environment variable $HOME refers to the personal directory of the current user


# 3. Make 100 empty files called data01.txt, data02.txt... to data 100.txt

touch data{01..100}.txt


# 4. Move all the files that contains a 5 in their name to the directory PROJECT/bin using a single metacharacter

cd $HOME
mv *5* PROJECT/bin/


# 5. Remove all the files what have exactly two characters after the word "data" before the extension (for instance, data12.txt)

rm data??.txt # The wildcard ? represents one character, anyone


# 6. Make a hidden file inside a directory that is also hidden

mkdir .hidden
touch .hidden/.hidden_file


# 7. List recursively all the content inside /etc and save the possile errors to a file (look up the error throw)

# The ls's parameter -R lists recursively
# With > we move the standard output to etc_list.txt
# With 2> we move the errors to the file etc_errors

ls -R /etc > etc_list.txt 2> etc_errors.txt

# BLOCK 2. CRITICAL PERMISSIONS AND SECURITY

# 8. Assign permissions in such a way that the group is able to read but the owner can only write (octal mode)

cd ~
touch permissions
chmod 240 permissions

# 2 -> 010 -> -w-
# 4 -> 100 -> r--
# 0 -> 000 -> ---

# 9. Make a file and deny all the permissions. Try to remove it, what happened?

touch permissions_denied
chmod 000 permissions_denied
rm permissions_denied


# 10. With a single command chmod, assign rwx to the user, rx to the group and nothing else to the rest using a symbolical mde

chmod u=rwx,g=rx,o= permissions


# 11. Explain what is the permission 711 in a directory and why it is useful for privacy

chmod 711 permissions

# 7 -> 111 -> rwx
# 1 -> 001 -> x
# This number allows the groups and "other" to exclusively run the file, but the user can do anything he wants


# 12. Remove the execute permission to a directory and try to list its content with ls. What happens?

mkdir directory
chmod -x directory # Removes the executing permission
ls direcory # ls: cannot open directory 'directory': Permission denied


# 13. Change the permissions to all files .txt from a directory to 644 at once

cd directory
touch file1.txt file2.txt file3.txt file4 file5
cd ..
chmod 644 directory/*.txt


# BLOCK 3. PIPES AND FILTERS

# 14. List all files from /usr/bin and count up how many are there using a single pipe with wc -l

ls /usr/bin | wc -l # wc -l counts up the lines


# 15. Look for your username in the file /etc/passwd using grep and a pipe

cat /etc/passwd | grep $USER


# 16. Show the last 5 lines from the manual with the tar command

man tar | tail -n 5


# 17. List the containter of your home reversed alfabetically and save it in a file called list.txt

ls -r ~ > list.txt


# 18. Show the attributes of /etc/passwd and filter the line that contains the word "bash"

cat /etc/passwd | grep bash


# BLOCK 4. Wrapping and professional compression

# 19. Create a file total.tar that contains three different directories with all their content

mkdir dir1 dir2 dir3
tar -cf total.tar dir1 dir2 dir3


# 20. Comprime a file .tar with gzip and obtain the rate of compression on screen

gzip -v file.tar # The parameter -v shows the reduction percentage


# 21. Without extracting the content, generate a detailed list of what is inside a file .tar .gz

# The parameter -tvf lists detailed content without extracting
tar -tvf *.tar
tar -tvf *.gz


# 22. Create a wrapped backup.tar of your directory PROJECT but exclude the files from the file bin

tar -cf backup.tar --exclude='PROJECT/bin' PROJECT


# 23. Add a new file README.txt to a file documents.tar that already exists

tar -rf documents.tar README.txt


# 24. Unzip a file .gz keeping the original file (look up the option -k of gzip)

gzip -d -k file.gz


# BLOCK 5. Administration and environment

# 25. Localizate the absolute path of your directory home using the environment variable ~ and the command realpath

realpath ~


# 26. Enter in the terminal as root (if you are allowed) and create a file that the standard user cannot remove

sudo su
touch /root/secure
chmod 000 /root/secure


# 27. Use the command man to check how to make ls to show the file's size in a "human" format (KB, MB)

man ls # We can use either the parameter -h or --human-readable


# 28. Create a temporal alias called list that runs ls -laR

alias list='ls -laR'


# 29. Indetify the UID and GID of your user analyzing the line that corresponds to /etc/passwd

grep "^$USER:" /etc/passwd


# 30. Try to change the default sheel of yhe user in /etc/passwd (only the theory of how you would do it with either an editor or command)

sudo chsh -s /bin/bash user
