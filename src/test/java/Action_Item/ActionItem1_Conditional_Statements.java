package Action_Item;

public class ActionItem1_Conditional_Statements {

    public static void main(String[] args) {

        //Define the set of variables
        int grade = 76;

        if (grade >= 90 && grade <=100){
            System.out.println("My grade is A");

        }else if (grade >= 80 && grade <=89){
            System.out.println("My grade is B");

        }else if (grade >= 70 && grade <=79){
            System.out.println("My grade is C");

        }else if (grade >= 60 && grade <=69){
            System.out.println("My grade is D");

        }else {
            System.out.println("My grade is F");

        }//End of else condition
    }//End of Main
}//End of Class
