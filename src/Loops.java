import java.awt.*;
import java.util.Scanner;

public class Loops {
    //Loops or Iterators
    public static void main(String[] args) {
        //Loops - we repeat a given block of code -
        /*
        * 1.While
        * 2.do while
        * 3.for loop
        * 4.foreach
        * */
        //while loop
        /*
        //syntax
        * while (condition){
            //block of code
        }
        *
        * */
        int x =3;
        //DRY Do not Repeat Yourself
        //Print Hello World 3 times
        while (x>0){
           // System.out.println("Hello World");
            x--;//decrement
        }

        /*
        * x=3
        * 3>0 - true
        * x=2
        * 2>0 -true
        * print
        * x=1
        * 1>0
        * print
        * x=0
        * 0>0 -false
        *
        * */

        //simulate a pin input in a sim card
        //we give 2 trials after the first wrong - else block
        Scanner scanner = new Scanner(System.in);
        String correctPin="0000";
        int trials = 0;

        //do while
        /*do{
            //action that happens before the condition loop
            System.out.print("Hello, Enter your Pin: ");
            String pinInput = scanner.next();
            if (pinInput.equals(correctPin)){
                System.out.println("Welcome. Glad to See You");
                trials=0;
            }else{
                trials++;
                System.out.println("Wrong Pin.Try again");
                if (trials==3){
                    System.out.println("You are blocked");
                    break;
                }
            }
            //System.out.println(trials);
        }while (trials>0);*/

        String firstname = "Demba"; //an array of characters char
        String secondName = "DembaDaniel";
        /*boolean result = firstname.equals(secondName);
        if (result){
            System.out.println(firstname+" is the same as "+secondName);
        }else{
            System.out.println(firstname+" is the not same as "+secondName);
        }*/
        /*
        * initiator
        * condition
        increment/decrement*/
        //String - arrays of characters - "abcd" a-0
        //System.out.println("The character at position 1 "+firstname.charAt(1));
        if (firstname.length()==secondName.length()){

            int samevalue=0;
            for (int i=0;i<firstname.length();i++){
                //assumption firstname and second name are of the same length
                if (firstname.charAt(i)==secondName.charAt(i)){
                    samevalue+=0;
                }else{
                    samevalue+=1;
                }
            }
            if (samevalue>0){
                System.out.println("Not the same "+samevalue);
            }else{
                System.out.println("Same "+samevalue);
            }

        }else{
            System.out.println("Not the same");
        }


       /* for (int i=0;i<secondName.length();i++){
            System.out.println(secondName.charAt(i));
        }*/

        //for loop nested loops
         /*for (int i=0;i<firstname.length();i++){
            System.out.println(secondName.charAt(i));
             for (int j=0;j<secondName.length();j++){

             }
        }*/



    }
}
