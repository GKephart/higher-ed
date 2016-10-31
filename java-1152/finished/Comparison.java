// fig 2.15: comparison.java
// compare integers using if statements, realtional operatots and equaility operators
import java.util.Scanner;// autoloader

public class Comparison {

	//main method being used
	public static void main(String[] args){

		//create Scanner to obtain imput through command line
		Scanner input = new Scanner(System.in);

		int n1; //first number being declared
		int n2; // second number being compared

		System.out.print("enter first number");
		n1 = input.nextInt();

		System.out.print("enter second nuber");
		n2 = input.nextInt();

		if (n1 == n2)
		System.out.printf("%d == %d%n", n1, n2);

		if (n1 != n2)
		System.out.printf("%d != %d%n", n1, n2);

		if (n1 < n2)
		System.out.printf ("%d < %d%n", n1, n2);

		if (n1 > n2)
		System.out.printf ("%d > %d%n", n1, n2);

		if (n1 <= n2)
		System.out.printf("%d <= %d%n", n1, n2);

		if (n1 >= n2)
		System.out.printf("%d >= %d%n", n1, n2);


	}

}
