package Action_Item;
public class ActionItem_While_DynamicLoop {

    public static void main(String[] args) {

        //iterate through all boroughs defined by dynamic array using while loop
        String[] zipcodes = new String[5];
        zipcodes[0] = "10467";
        zipcodes[1] = "11539";
        zipcodes[2] = "11435";
        zipcodes[3] = "10987";
        zipcodes[4] = "16547";

        //integer dynamic array
        int[] streetNumber = new int[5];
        streetNumber[0]= 200;
        streetNumber[1]= 300;
        streetNumber[2]= 400;
        streetNumber[3]= 500;
        streetNumber[4]= 600;

        //declare and define the initial starting point
        int i = 0;
        //define while loop with your end point(condition)

        while (i< zipcodes.length){

            System.out.println("My current zipcode is " + zipcodes[i] + " and my street number is " + streetNumber[i]);
            i = i+1; //if there is no incrementation, the while loop becomes infinite loop


        }//end of while loop
    }//End of Main
}//End of class
