public class IntroToOOP {
    /*
    * Introduction to OOP(Object Oriented Programming)
    * Programming Paradigms - structure in which code and
    * */
    /*
    OOP
    *
    * */
    /*class followed by the name of that class \
    * */

    //class we haved fruit
    //need to create an instance of the fruit -creating an object
    // name of the class name of the object = name of the class


    public static void main(String[] args) {
        Fruit apple = new Fruit(); // create an instance of class fruit / an object
        apple.showFruitName("My apple");
    }

    //OOP principles
    /*
    * 1.Polymorphism
    * 2.Encapulations
    * 3.Inheritance
    * 4.abstraction
    * */
}

class Fruit{
//    properties or attribures -
    //class variables
    //methods - behavior
    String name;
    String expryDate;

    void showFruitName(String fname){
        System.out.println("The fruit is "+fname);
    }
}
