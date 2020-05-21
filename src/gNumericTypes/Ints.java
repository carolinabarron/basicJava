package gNumericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); //función para imprimir mensaje y tomar valor introducido para var x
	    int x = Input.get_int();
	    
	    // prompt user for y
	    System.out.print("y is "); //función para imprimir mensaje y tomar valor introducido para var y
	    int y = Input.get_int();
	    
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n"); //función para imprimir mensaje con resultado de x+y
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n"); //función para imprimir mensaje con resultado de x-y
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n"); //función para imprimir mensaje con resultado de x*y
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n"); //función para imprimir mensaje con resultado de x/y
	    System.out.print("The reminder of " + x + " over "+ y + " is " + (x % y) + "\n"); //función para imprimir mensaje con resultado del xmody
	}
}


