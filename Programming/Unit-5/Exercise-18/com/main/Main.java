package com.main;

import com.shapes.*;


/**
 * @version 1.0
 * @date 2025/11/20
 * @author Álvaro Fernández Barrero
 */

public class Main
{
	public static void main(String[] args)
	{
		// Defining variables

		Rectangle rectangle0 = new Rectangle(50);
		Rectangle rectangle1 = new Rectangle(100, 150);


		// Testing

		System.out.print(rectangle0.toString());
		System.out.print("-------------------------\n");
		System.out.print(rectangle1.toString());
		System.out.print("-------------------------\n");


		System.out.printf("Is rectangle 1 a square: %b\n", rectangle0.isSquare());
		System.out.printf("Is rectangle 2 a square: %b\n\n", rectangle1.isSquare());

		System.out.printf("Rectangle 1\'s area: %.3f\n", rectangle0.computeArea());
		System.out.printf("Rectangle 2\'s area: %.3f\n", rectangle1.computeArea());
	}
}