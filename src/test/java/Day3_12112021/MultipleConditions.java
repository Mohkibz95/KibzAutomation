package Day3_12112021;

public class MultipleConditions {

    public static void main(String[] args) {

        //Define the set of variables
        int a = 1;
        int b = 2;
        int c = 3;

        //Verify a+b > c, a+b < c, a+b == c
        if (a+b > c){
          System.out.println("a & b is greater than c");
        } else if(a+b < c){
            System.out.println("a & b is less than c");

        } else if(a+b == c){

            System.out.println("a & b is equal to c");

        }//End of else condition
    }//End of Main
}//End of Class
