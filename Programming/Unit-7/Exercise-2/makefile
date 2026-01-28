all: compile run clean

compile:
	@javac *.java com/*/*.java

run: Program.class
	@java Program

clean:
	@rm *.class com/*/*.class