/**
* George Kephart
* G.e.kephart@gmail.com
* 10/23/2016
* java-1152
* //
**/

import java.util.Arrays;

class Lab03 {
  public static void main(String args[]){
    //array of strings that is composed of the runners names
    String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Danial", "Neda", "Aaron", "Kate" };
    //array of intgers of the times for the runners
    int[] array = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265
    };
    //create a new array so that the indexs of the orignal array stays prestine.
    int[] sortedArray = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265
    };

    // use the util.Arrays to sort the times array and use the sorted array to find the corresponding index in the origianl array 
    Arrays.sort(sortedArray);
    int index0 = sortedArray[0];
    int index1= sortedArray[1];

    // use the original array to grab to find the corresponding index to find firstplace
    int firstPlace = getArrayIndex(array, index0);

    // use the original array to grab to find the corresponding index to find second place name
    int secondPlace = getArrayIndex(array, index1);

    //display the information according to specification.
    System.out.printf("%s%8s%n", "Name", "time");
    System.out.printf("%s%7d%n", names[firstPlace], sortedArray[0]);
    System.out.printf("%s%7d%n", names[secondPlace], sortedArray[1]);

  }
  /**
  * param arr[] that the index will be taken from
  * param int value that will be used to find what the corresponding index of the orignal array is.
  *
  */
  public static int getArrayIndex(int[] arr,int value) {
    int k=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i] == value){
         k=i;
        break;
      }
    }
    return k;
  }
}
