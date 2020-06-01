import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //An array is a variable with has more than one value - same data type
        //Names - John,Jane,Peter
        //Ages - int
        //Prices -
        //Create an array - how access values - Types
        //Types -
        //1.Indexed 0,
        //2.Multidimential array - array inside another array
        //syntax - Data type [] name_of_the_array
        //String[] names;//create
        String[]names = {"John","Peter","Jane"};//index
        //access

       /* System.out.println("Length of array is "+names.length);
        System.out.println("The first value "+names[2]);
        //loops
        for (int i=0;i<names.length;i++){
            System.out.println(" "+names[i]);
        }

        int ages[]={12,78};*/
        int valuesToInsert=4;
        String[] name = new String[valuesToInsert];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<valuesToInsert;i++){
            System.out.println("Enter name: ");
            name[i] = scanner.next();
        }
        System.out.println("Names Inserted are: ");
        for (int i=0;i<valuesToInsert;i++){
            System.out.println(name[i]);
        }

        //double[]prices = new double[10];
        //prices[0]=3.9;


    }
}
