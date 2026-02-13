all: compile run clean

compile:
	@clear
	@sleep 0.1
	@javac *.java com/*/*.java

run: Program.class
	@java Program

clean:
	@rm *.class com/*/*.class