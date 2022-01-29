package Action_Item;

public class ActionItem_For_DynamicLoop {

    public static void main(String[] args) {

        //iterate through all zipcodes defined by dynamic array using for loop
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

        for (int i =0; i < zipcodes.length;i++) {
            //print statement

            System.out.println("My current zipcode is " + zipcodes[i] + " and my street number is " + streetNumber[i]);

        } //End for loop
    }//End of Main Method
}//End of Java class
