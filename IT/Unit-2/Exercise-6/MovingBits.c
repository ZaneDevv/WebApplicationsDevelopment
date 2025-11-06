#include <stdio.h>


/**
 * @date 2025/11/06
 * @author Álvaro Fernández Barrero
 */


/**
 * @brief Computes the integer half of the given number (equivalent to (int)(x/2))
 * @param The number to obtain the integer half from
 * @return The integer half of the given number
 * @date 2025/11/06
 * @author Álvaro Fernández Barrero
 */
int halfNumber(int x);



/**
 * @brief Raises 2 to the given number (equivalent to pow(2, x))
 * @param The number to raise 2 to
 * @return 2^x
 * @date 2025/11/06
 * @author Álvaro Fernández Barrerp
 */
int raise2ToX(int x);



int main()
{
	// Defining variables

	int x = 0;


	// Setting x's value

	printf("Set a number: ");
	scanf("%d", &x);


	// Printing result

	printf("The integer half of %d is %d\n", x, halfNumber(x));
	printf("2^%d = %d\n", x, raise2ToX(x));

	return 0;
}



int halfNumber(int x)
{
	return x >> 1;
}



int raise2ToX(int x)
{
	return 1 << x;
}
