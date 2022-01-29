package Day2_12052021;

public class forLoopWithArray {
    public static void main(String[] args) {

        //iterate through all boroughs defined by dynamic array using for loop
        String[] boroughs = new String[6];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "The Bronx";
        boroughs[2] = "Queens";
        boroughs[3] = "Staten Island";
        boroughs[4] = "Manhattan";
        boroughs[5] = "Long Island";

        for (int i =0; i < boroughs.length;i++){
            //print statement
            System.out.println("My current borough is " + boroughs[i]);
        }//end for loop
    }//end for main
}//end for java class