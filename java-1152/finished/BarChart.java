// fig 6.6 bar chart
public class BarChart {
    public static void main(String[] args){
      // create the initialarray
      int[] array = {0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
      //display output
      System.out.println("Grade distrubution:");
      // for each array element, output a bar of the chart
      for (int counter = 0; counter < array.length; counter++) {
        // output bar label (0-9, 10-19, etc.. to 100)
        // diplay 100 first so that 100 ends at the bottom also a nice way to start the if loop
        if (counter == 10)
          System.out.printf("%5d: ", 100);
        else
          System.out.printf("%02d-%02d:", counter * 10,counter * 10 + 9);
      // print the bar of astricks
      for (int stars = 0; stars < array[counter]; stars++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
