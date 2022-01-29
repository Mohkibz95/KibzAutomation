package Action_Item;

public class ActionItem2_Loop_Array_Conditions {
    public static void main(String[] args) {

        //create a dynamic array for 4 different states, iterate through the values but only print when state is
        //either New York or Texas

        String[] states = new String[4];
        states[0] = "New York";
        states[1] = "Illinois";
        states[2] = "Texas";
        states[3] = "New Jersey";

        for (int i =0; i < states.length;i++){
            //two if conditions
            if(states[i] == "New York"){
                System.out.println("State is " + states[i]);
            }else if (states[i] == "Texas"){
                System.out.println("State is " + states[i]);

            }//End of conditions
        }//End of for loop
    }//End of main
}//End of Class
