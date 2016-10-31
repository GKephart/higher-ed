import java.util.Scanner;

public class Hw2Qu29 {
  // main method begins the execution of Java application

  public static void main(String[] args) {
    // create a Scanner to obtain input from the command line
    Scanner input = new Scanner(System.in);

    int a;
    int b;
    int c;
    int d;
    int result;

    System.out.print("enter a");
    a = input.nextInt();

    System.out.print("enter b");
    b = input.nextInt();

    System.out.print(" enter c");
    c = input.nextInt();

    System.out.print("d");
    d = input.nextInt();

    result = d % a * c + a % b + a;

    System.out.printf("Sum is %d%n", result);
  }
}
