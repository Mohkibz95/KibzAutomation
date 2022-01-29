package Learning_WithImtiyaz;

public class Strings {
    public static void main(String[] args) {
      //  String a = "Hello";

       // System.out.println(a.length());


     //   String str = "ABCDEFG";
        //If we were to count from 'A' then the index value would be 0. Like that for all characters it will continue to
        // 'G' which is 6. When it's actually 7 characters. But for intelliJ.

       // String extractedString = str.substring(2);
        //System.out.println(extractedString);

        //2 indicates to start from 'C' because the index value is 2.
        //By adding two arguments I can extract specific characters. First argument is initial point, second argument
        //is up to but not including the next character.

        //For example
       // String meg = "ABCDEFG";
      //  String extracted = meg.substring(3,6);
        //It will not include 'G'.

       // System.out.println(extracted);

        /*
        Capture the following middle 3 characters:
        Middle three ("Bunny")
        Middle Three ("Peter")
        Middle Three ("Jamaica")
         */

        String Bunny = "Bunny";
        String Peter = "Peter";
        String Jamaica = "Jamaica";

        String Extraction = Bunny.substring(1,4);
        String Extracted = Peter.substring(1,4);
        String Extract = Jamaica.substring(2,5);
        System.out.println(Extraction);
        System.out.println(Extracted);
        System.out.println(Extract);







    }
}
