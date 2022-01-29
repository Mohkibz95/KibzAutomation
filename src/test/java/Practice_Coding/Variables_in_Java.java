package Practice_Coding;

public class Variables_in_Java {

    public static void main(String[] args) {

        int x = 1234567891;
        //int can hold values up to 2 billion. If we use a value of more than 2 billion then proceed to using Long
        long g = 1234567891099L;
        //Long can hold up to larger values but make sure to end with L
        double y = 3.14;
        float u = 3.14f;
        //double is better than float because you don't need to add any letter after the value. Double can hold up tp 15 digits.
        boolean z = true;
        //Boolean will only hold 'True' or 'False'
        char symbol = '@';
        String name = "kibria";

        //System.out.println("Hello " +name + "!");

        //Swapping Variables

        String M = "Hot";
        String K = "Warm";
        String Temp;
        //By bringing in another variable(Temp), we were able to swap values between M and K

        Temp = M;
        M = K;
        K = Temp;


        System.out.println("m: "+M);
        System.out.println("k: "+K);






    }//End of main
}//End of class
