#include <stdio.h>
#include <string.h>

/**
* Printing in terminal the ASCII table with its symbol.
* 
* @file ASCII.c
* @date 2025/10/09
* @author Álvaro Fernández Barrero
*/


// Defining ANSI terminal colors

#define ORANGE "\x1B[38;2;255;128;0m"
#define LIGHT_GREEN "\x1B[38;2;17;245;120m"

#define RESET_COLOR "\x1b[0m"



// Defining constants

const unsigned char MAX_NUMBER_IN_A_BYTE = 0b1111111;
char FORMAT[60];

static const char* CONTROL_CHARACTERS[] = {
	"NUL", "SOH", "STX", "ETX", "EOT", "ENQ", "ACK", "BEL",
	"BS",  "TAB", "LF",  "VT",  "FF",  "CR",  "SO",  "SI",
	"DLE", "DC1", "DC2", "DC3", "DC4", "NAK", "SYN", "ETB",
	"CAN", "EM",  "SUB", "ESC", "FS",  "GS",  "RS",  "US",
	"SPA"
};



/**
* @brief Prints all ASCII characters with its numerical version
* @date 2025/10/09
* @author Álvaro Fernández Barrero
*/
void printASCII();


/**
* @brief Obtains the symbol character for the given number according to the ASCII table
* @param Character index
* @return Character associated with the given number
* @date 2025/10/09
* @author Álvaro Fernández Barrero
*/
const char* obtainSymbolByDecimalNumber(int);


/**
* @brief Sets the table format
* @date 2025/10/09
* @author Álvaro Fernández Barrero
*/
void setFormat();


int main()
{
	setFormat();
	printASCII();
	
	return 0;
}


void printASCII()
{
	printf("\n\t-------------------\n");
	
	for (int i = 0; i <= MAX_NUMBER_IN_A_BYTE; i++)
	{
		const char* character = obtainSymbolByDecimalNumber(i);
		printf(FORMAT, i, character);
	}
	
	printf("\t-------------------\n\n");
}


const char* obtainSymbolByDecimalNumber(int index)
{
	if (index <= 32)
	{
		return CONTROL_CHARACTERS[index];
	}
	
	if (index == 127)
	{
		return "DEL";
	}

	static char symbol[2];
	symbol[0] = (char)index;
	symbol[1] = '\0';
	
	return symbol;
}


void setFormat()
{
	strcpy(FORMAT, "\t");
	strcat(FORMAT, ORANGE);
	strcat(FORMAT, "%d");
	strcat(FORMAT, RESET_COLOR);
	strcat(FORMAT, "\t|\t");
	strcat(FORMAT, LIGHT_GREEN);
	strcat(FORMAT, "%s");
	strcat(FORMAT, RESET_COLOR);
	strcat(FORMAT, "\n");
}
