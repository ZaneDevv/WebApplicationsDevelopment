#include <stdio.h>

/**
* Printing in terminal the ASCII table with its symbol.
* 
* @file ASCII.c
* @date 2025/10/09
* @author Álvaro Fernández Barrero
*/


const unsigned char MAX_NUMBER_IN_A_BYTE = 0b1111111;


/**
* @brief Prints all ASCII characters with its numerical version
* @date 2025/10/09
* @author Álvaro Fernández Barrero
*/
void printASCII();


int main()
{
	printASCII();
	return 0;
}


void printASCII()
{
	for (int i = 0; i <= MAX_NUMBER_IN_A_BYTE; i++)
	{
		unsigned char character = (char)i;
		printf("%d\t%c\n", i, character);
	}
}
