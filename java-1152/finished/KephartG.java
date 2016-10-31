// im guessing that example 3.26 will print out 1 < 2
public class KephartG{

  public static void main(String[] args) {

  //define first variable
  int row = 10;

  //begin the loop
  while (row >= 1) {

    // define the second variable
    int column = 1;

    //begin the loop inside of the loop
    while (column <= 10) {

      //out print
      System.out.print(row % 2 == 1 ? "<" : ">");
      ++column;
    }

    --row;
    System.out.println();
    }
  }
}
