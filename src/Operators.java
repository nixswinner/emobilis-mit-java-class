public class Operators {
    public static void main(String[] args) {
        //Operators
        /*
        * Arithmetic Languages
        * -, + addition
        * BODMAS
        * */
        /*
        * String x ="10";
        * */
        /*String x ="10";

        int newvalue = Integer.parseInt(x);
        int y = newvalue*10;*/
        /*
        * type casting - converting a variable from datatype to datatype
        * string --integer
        * interger
        * */
        System.out.println("Arithmetic Operators");
        int num1 = 99;
        int num2 = 5;
        int sum = num1+num2;
        float division = num1/num2;
        System.out.println(division);
        System.out.println("The sum of num1 and num2 is "+(num1+num2));
        System.out.println("The subtraction of num1 and num2 is "+(num1-num2));
        System.out.println("The division of num1 and num2 is "+division);


        System.out.println("Asignment Operators");
        num1 = 100;
        System.out.println("Num1 new value is "+num1);
        /*
        * Assignments
        * =
        * +=
        * */
        /*
        num1 -->100
        num2 -->5
        num1+=num2
        num1=num1+num2 105
        -100+5
        * */
        num1+=num2; //num1= num1+num2
        System.out.println("num1+=num2 "+(num1+=num2));
        System.out.println("num1-=num2 "+(num1-=num2));
        System.out.println("num1*=num2 "+(num1*=num2));

        System.out.println("Auto Increment Operators");
        /*
        num1++; num1 = num1+1
        num1--; num1 = num1-1
        * */
        int newValue = num2++;
        System.out.println("num2++ "+(newValue));

        System.out.println("Logical Operators");
        /*
        * AND, or not
        * && || !
        * boolean values
        * - true and true = true
        *  true and false = false
        * true || false = true
        * !true = false
        * !false = true
        *
        *
        * */

        boolean a,b;
        a = true;
        b=false;

        System.out.println("a and b "+(a && b));//false
        System.out.println("a or b "+(a || b));//true

        System.out.println("Not b "+(!b));//true
        System.out.println("Not a "+(!a));//false


        System.out.println("Comparison Operators");
        //--equal , one greater than or less than the other one
        //equal or greater than
        //equal or less than
        //not equal to

    }
}
