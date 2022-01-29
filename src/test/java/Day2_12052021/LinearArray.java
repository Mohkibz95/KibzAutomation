package Day2_12052021;

public class LinearArray {

    public static void main(String[] args) {

        //create a linear string array for cities
        //declare the variable first
        String[] cities,zipcodes;
        //define the linear array for cities
        cities = new String[]{"Brooklyn","Queens","Manhattan","Staten Island","Bronx"};
        zipcodes = new String[]{"11111","22222","33333","44444","10467"};

        //declare int variable
        int[] streetNumber;
        //define integer array for street number
        streetNumber = new int[]{22,44,55,66,77,88};
        //print the last city and last zipcode
        System.out.println("My last city is " +cities[4] + " and street number is " + zipcodes[4]);
    }//end of main method
}//end of java class
