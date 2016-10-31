// figure 2.7 Addition
// addition program that inputs two then diplays them as their sum
import java.util.Scanner;

public class Addition {
  // main method begins the execution of Java application

  public static void main(String[] args) {
    // create a Scanner to obtain input from the command line
    Scanner input = new Scanner(System.in);

    int number1;
    int number2;
    int sum;

    System.out.print("enter the first number");
    number1 = input.nextInt();

    System.out.print("enter the second number");
    number2 = input.nextInt();

    sum = number1 + number2; // actual logic taking place

    // displays the sum
    System.out.printf("Sum is %d%n", sum);
  }
}
