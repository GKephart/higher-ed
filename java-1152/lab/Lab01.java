public class Lab01 {
  public static void main(String[] args){
    /*
    * I am going to put all of my outputs into variables then display them using
    * printf. while I can just use println to display my outputs i want to do something
    * more complicated
    */

    // this variable will hold my first name
    String firstName = "George",

    // this variable will contain my last name
    lastName = "Kephart",

    // this variable will contain my nickname
    nickName = "George",

    // this variable will contain my Email
    eName = "G.e.Kephart@gmail.com",

    // this variable will contain my experince
    experince = "One year in website design using PHP and Javascript(ng and react)";

    System.out.printf("First Name: %s%n", firstName);
    System.out.printf("Last Name: %s%n", lastName);
    System.out.printf("Nickname: %s%n", nickName);
    System.out.printf("E-Name: %s%n", eName);
    System.out.printf("%s%n", experince);
  }
}
