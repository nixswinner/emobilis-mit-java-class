import java.util.List;
import java.util.Scanner;

public class JavaMethods {
    /*
     * Methods are same as functions in languages in php
     *
     * its a named block of code statements - int x=10;
     * - It provides modularization
     * -Modularization is the aspect of grouping our related code statements
     * that need to be used together for instance
     * we could have a calculator application -
     * In this calculator we are task to perform arithmetic operation such as sum,substraction,division,multiplication
     * we could then decide to put the above arithmetic operation .
     * Each as a block of code i.e we could use a method to do
     *
     * First let consider the different types of methods in java.
     * Just like any other programming language methods type do not change
     * 1.We could a method that just execute a related code statements to achieve a given objective i.e do sum of two
     * integers .
     * 2.A method can receive a set of inputs to work on i.e for sum method we could have it require us specifying which set
     * integers to work on i.e x and y.
     * 3.Method could also return results after perform an operation , consideration a sum method we may want it
     * to return the results of addition of two numbers back to us
     *
     * .Methods operation
     * 1. 2 main methods operation is
     *       ->Creation or declaring a method. We shall learn the synatx in a few
     *       ->call the method - this the process of invoking the method - making to start its operation.
     * 1.Creating a method in java
     * This is the syntax.
     * access modifier return_type method_name(){
     *   we have the body
     *   //block of code here
     * }
     * */
    //access modifier - public,private,protected
    /*
     * public -
     * private
     * protected
     *
     * access-modified return-type
     * -return-type - specifies data-type void
     * -name alphabetic, _ $,
     * - avoid java keywords/reserved names e.g class,new,main etc
     * (){
     * method
     *
     * }
     *
     * */
    public static void main(String[] args) {

        //call /invoke nameofthe method ();
        //sayHello();
        //String mygreeting =myGreetings();

        //System.out.println(myGreetings());

        //sayMyName("John Doe");
        while (true){
            additionOfTwoIntegers();
        }


       /* String[] vowels = new String[]{"a", "b", "c"};

        // Convert String Array to List
        List<String> list =Arrays.asList(vowels);

        String input ="a";
        if(list.contains(input.toLowerCase())){
            System.out.println("Hello A");
        }else {

        }*/

    }
    public static void additionOfTwoIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();

        sum(x,y);
    }
     static void sayHello(){
        System.out.println("Hello , I am glad to see you!");
    }
    public static String myGreetings(){
        return "Good afternoon";
    }
    //passing into a method - we have method to receive arguments
    //sum - add two integers -
    //parameters / input into - data_type name of the input
    //sum x and y
    //integers -
    public static void sum(int x,int y){
        //int sum = x+y;
        System.out.println("Sum is "+(x+y));
    }

    public static void sayMyName(String name){
        System.out.println("My name is "+name);
    }
}
