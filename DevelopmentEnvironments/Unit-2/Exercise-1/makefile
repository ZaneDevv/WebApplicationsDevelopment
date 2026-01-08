# Learning about makefiles
# date: 2026/01/08
# author: Álvaro Fernández Barrero

#####################################
# VARIABLES
#####################################

neededFiles := Program.java
defaultCode := 'public class Program \n{\n\tpublic static void main(String[] args) \n\t{ \n\t\tSystem.out.println("Hello, World!"); \n\t} \n}'

#####################################
# TARGETS
#####################################

# Calls to all targets
all: compile run clean


# Running the program compiled program. If Program.class is not found, it will compile the code
run: compile Program.class
	java Program


# Compiling the code Program.java. If the file is not found, it will create it with the default "Hello, World!" program 
compile: ${neededFiles}
	javac Program.java


# Creates a new Program.java file with a default "Hello, World!" program
Program.java:
	touch Program.java
	echo ${defaultCode} > Program.java


# Removes the compiled file
clean: Program.class
	rm Program.class
