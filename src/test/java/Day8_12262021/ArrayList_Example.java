package Day8_12262021;

import java.util.ArrayList;

public class ArrayList_Example {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("The bronx");
        cities.add("Queens");
        cities.add("Brooklyn");


        ArrayList<Integer> streetNumber = new ArrayList<>();

        streetNumber.add(10467);
        streetNumber.add(10468);
        streetNumber.add(10469);

        System.out.println("My first city is " + cities.get(0) + " and my first street number is " + streetNumber.get(0));






    }//End of Main
}//End of Class
