/**
* George Kephart
* g.e.kephart@gmail.com
* 2-18-16
* CSCI-1152-101
*/


import java.util.Scanner;

public class Lab02 {
  // main method being used
  public static void main(String[] args) {

    //create Scanner to obtain imput through command line
    Scanner input = new Scanner(System.in);
    /**
    * i will go back through and mess with these im pretty sure they need to be doubles
    * anyways i am declaring all need variable at the global level just so i dont forget any
    */

    // number of exceptions
    int exceptions;
    // gross income
    double gIncome;
    // income from bank intrest
    double iIncome;
    // income made from Capital gains
    double cIncome;
    // charitble contriubtions
    double contributions;
    // total income which equals gincome plus iIncome plus cincome
    double tIncome;
    // adjusted income which equals tincome minus (exceptions*1500) - negContributions
    double aIncome;
    // total tax will need a few if statements to check tax braket and compute final answer.
    double totalTax;

    /**
    * gain needed input from the user to calculate total tax
    */

    System.out.print("Number of Exceptions: ");
		exceptions = input.nextInt();

    System.out.print("Gross Salary: ");
		gIncome = input.nextDouble();

    System.out.print("Intrest Income: ");
		iIncome = input.nextDouble();

    System.out.print("Capital Gains: ");
		cIncome = input.nextDouble();

    System.out.print("Charitble Contributions: ");
		contributions = input.nextDouble();

    // do needed calculations to determine total income and display the information
    tIncome = gIncome + iIncome + cIncome;

    System.out.printf("Total Income: $%.2f%n", tIncome);

    // do the needed calculations to determine adjusted income and display the information
    aIncome = (tIncome) - (exceptions*1500 + contributions);

    System.out.printf("Adjusted Income: $%.2f%n", aIncome);

    /**
    *this if block will calculate total tax if and only adjusted tax is less than 10,000
    */

    if( aIncome < 10000) {

      // since the totalTax is less than 10,000 there is no tax liability
      totalTax = 0;
      System.out.printf("Total Tax: %.2f%n", totalTax);
    }

    /**
    *this if block will claclaute total if and only adjusted tax is greater than 10,000 and less than 32,000
    */
    else if (aIncome >= 10000 &  aIncome < 32000) {
      // total tax is calculated by the formula given the tax rate is 15%
      totalTax = ((aIncome-10000)*0.15);
      System.out.printf("Total Tax: $%.2f%n", totalTax);
    }

    /**
    *this if block will calculate totalTax if and only if  adjusted income is greater than 32,000 ad less than 50,000
    */
    else if (aIncome > 32000 && aIncome <= 50000) {
      //totaltax is calculated with formula given, but 3200 is added to make up for previous braket and the tax rate is 23%
      totalTax = (((aIncome - 32000) * .23) + 3300);
      System.out.printf("Total Tax: $%.2f%n", totalTax);
    }
    /**
    * this is the final catch if adjusted  iIncome is greater than 50,000 the calculations will execute
    */

    else {
      // totaltax is calculated with the formula given but 7440 will be added to make up for the previous tax brackets and the tax rate is now 285
      totalTax = ((aIncome - 50000) * .28) + 7440;
      System.out.printf("Total Income: $%.2f%n", totalTax);

    }

  }
}
