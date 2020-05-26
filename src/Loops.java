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
        do{
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
            System.out.println(trials);
        }while (trials>0);

    }
}
