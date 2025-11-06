#include <stdio.h>

/**
 * @date 2025/11/06
 * @author Álvaro Fernández Barrero
 */

int main()
{
	// Defining variables

	int a = 0;
	int b = 0;


	// Setting the values

	printf("Set the value of a [0/1]: ");
	scanf("%d", &a);

	printf("Set the value of b [0/1]: ");
	scanf("%d", &b);

	a = a < 0 ? 0 : a > 1 : 1;
	b = b < 0 ? 0 : b > 1 : 1;


	printf("%d AND %d = %d\n", a, b, a & b);
	printf("%d OR %d = %d\n", a, b, a | b);
	printf("%d XOR %d = %d\n", a, b, a ^ b);


	return 0;
}
