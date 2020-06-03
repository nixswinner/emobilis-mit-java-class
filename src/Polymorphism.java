public class Polymorphism {
    public static void main(String[] args) {
        //method overloading - same method name - different arguments -
        sayHello();
        sayHello("John Doe");

        //Interfaces - polymorphism - [] - abstraction
    }

    public static void sayHello(){
        displayOnConsole("Good Afternoon");
    }
    public static  void sayHello(String name){
        displayOnConsole("Good Afternoon "+name);
    }
    //CTR +D - dupliactates highlighted block
    public static  void sayHello(String name,String age){
        displayOnConsole("Good Afternoon "+name);
    }


    public static void displayOnConsole(String data){
        System.out.println(data);
    }
}
