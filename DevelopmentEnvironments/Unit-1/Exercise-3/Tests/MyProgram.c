#include <stdio.h>
#include "Operations.h"

int main (void)
{
	int num1, num2, result;
	
	printf("Let\'s subtract two numbers.\n");
	
	printf("Write a number:\n");
	scanf("%d", &num1);
	
	printf("Write another one:\n");
	scanf("%d", &num2);
	
	resultado = subtract(num1, num2);
	printf("The result is %d \n", result);
	
	return 0;
}
