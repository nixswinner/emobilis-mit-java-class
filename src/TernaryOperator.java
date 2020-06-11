public class TernaryOperator {
    public static void main(String[] args) {
        //ternary operator
        //if else
        int age=10;

        String agegroup;

       /* if (age>=18){
            agegroup="Adult";

        }else{
            agegroup="Child";
        }*/
        /*
        * evaluate - result statement
        * */
        /*
        Syntax
        (expression- condition )?"Adult":-when
        -evaluate a
         */


       agegroup=age>=18?"Adult":"Child";


        System.out.println(agegroup);
    }
}
