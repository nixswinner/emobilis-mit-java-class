import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        //control structures.
        //

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter Age");
        int age = scanner.nextInt();
        System.out.println("Your age is "+age);
        if (age>=18){
            System.out.println("You are an Adult");
        }else{
            System.out.println("You are a child");
        }*/
        //if ..else
        //if ...else if(condition)....else

//ctrl +b
        ///switch case
        //Country Code
        //prompt to enter enter the country code then print their coutry name
        //control structures;
        //conditional operators >.<.==,>= <=
        //logical AND && OR || -
        System.out.println("Enter your Country Code: ");
        String code = scanner.next();
        switch (code){
            case "254":
                //expression
                System.out.println("Kenya");
                break;
            case "255":
                //expression
                System.out.println("Tanzania");
                break;
            case "256":
                //expression
                System.out.println("Uganda");
                break;
            default:
                System.out.println("I dont Know that Country");
                break;
        }



    }
}
