package Learning_WithImtiyaz;

public class Strings_Part2 {

    public static void main(String[] args) {

        //Utilizing if conditions
        // = means to assign. '==' means to compare. '!=' means not equal to in most programming languages.
        int myAge = 26;
        int wifesAge = 28;

        if (myAge == wifesAge){
            //Then do this
            System.out.println("Ages are same");

        }else {
            System.out.println("Ages are different");
            //else do this
        }//End of if else


        //Let's say we use string variables as opposed to integers

        String A = "Hello";
        String B = "World";
/*
        if (A == "hello") {
        }
        // This is a Trap!!!!! Incorrect
        }//
    */


    //Correct form is the following:
        if (A.equals("Hello")){
            //Use this
        }





    }
}
