package baaki_ke_doubts.java_basics.object_creation_in_java;// Pass by reference and value

import java.io.*;
class Demo {
	int x = 10;
	int y = 20;

	int display(Demo A, Demo B)
	{
		// Updating value using argument
		A.x = 95;

		System.out.println("x = " + x);

		System.out.println("y = " + y);

		return 0;
	}
}
class Main1 {
	public static void main(String[] args)
	{
		Demo C = new Demo();

		Demo D = new Demo();

		// updating value using primary reference
		// variable
		D.y = 55;

		C.display(C, D); // POINT 1

		D.display(C, D); // POINT 2
	}
}
