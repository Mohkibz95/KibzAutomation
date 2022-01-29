package Day2_12052021;

public class WhileLoopWithArray {

    public static void main(String[] args) {

        //iterate through all boroughs defined by dynamic array using while loop
        String[] boroughs = new String[6];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "The Bronx";
        boroughs[2] = "Queens";
        boroughs[3] = "Staten Island";
        boroughs[4] = "Manhattan";
        boroughs[5] = "Long Island";

        //declare and define the initial starting point
        int i = 0;
        //define while loop with your end point(condition)
        while (i< boroughs.length){

           System.out.println("My current borough is " + boroughs[i]);
            i = i+1; //if there is no incrementation, the while loop becomes infinite loop
        }//end of while loop

    }//end of main method
}//end of java class
