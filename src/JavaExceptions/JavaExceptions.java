package JavaExceptions;

import java.util.Scanner;

public class JavaExceptions {
    public static void main(String[] args) {
        //try - catch exception -
        int ages[] = {12,67,89,90}; //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age Index:");
        try {
            //block of code where there is a potential of an exception
            System.out.println("The age at index 3 "+ages[scanner.nextInt()]);

        }catch (Exception e){
            System.out.println("Exception occured check your index "+e.getMessage());

        }finally {
            System.out.println("Try again");
        }

        System.out.println("End of the Program");




    }
}
