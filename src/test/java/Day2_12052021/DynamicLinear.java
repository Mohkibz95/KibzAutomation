package Day2_12052021;

public class DynamicLinear {
    public static void main(String[] args) {


        //create a String dynamic array for countries
        String[] countries = new String[6]; //you set the limit/boundaries for your array
        //now you define your values by the variables indexing
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "Bangladesh";
        countries[3] = "Pakistan";
        countries[4] = "India";
        countries[5] = "Russia";

        System.out.println("My country is " + countries[5]);

        //integer dynamic array
        int[] houseNumber = new int[5];
        houseNumber[0]= 200;
        houseNumber[1]= 300;
        houseNumber[2]= 400;
        houseNumber[3]= 500;
        houseNumber[4]= 600;

        System.out.println("My country is " + houseNumber[4]);

    }//end of main method
}//end of java class
