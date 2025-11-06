#include <stdio.h>

/**
 * @date 2025/11/06
 * @author Álvaro Fernández Barrero
 */



/**
 * @brief Computes the negative version of the given number (-x)
 * @param The number to turn negative
 * @return The number's negative version
 * @version 1.0
 * @date 2025/11/06
 * @author Álvaro Fernández Barrero
 */
int negativeNumber(int);



int main()
{
	int x = 0;

	printf("Give me a number: ");
	scanf("%d", &x);

	printf("%d x (-1) = %d", x, negativeNumber(x));

	return 0;
}



int negativeNumber(int x)
{
	return ~x + 1;
}
