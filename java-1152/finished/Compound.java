public class Compound {

    public static void main (String[] args){
        double amount;
        double princible = 1000;
        double rate = .05;

        // display header
        System.out.printf("%s%20s%n", "Year","Amount on deposit");

        //calculate amount on deposit
        for (int year = 1; year <=10; ++year){

            //calculate new amount for specified year
            amount = princible * Math.pow(1.0 + rate, year);

            // display the year and the amount
            System.out.printf("%4d%,20.2f%n", year, amount);
        }

    }
}
