package Day4_12122021;

public class Split_Command {

    public static void main(String[] args) {

        //Create a single string
        String message = "I want infinite HoorulAin";
        //Declare String array to split the message to print out only HoorulAin
        String[] arrayMessage = message.split(" ");

        //print out HoorulAin
        System.out.println("result is " + arrayMessage[3]);

    }//End of main
}//End of Class
