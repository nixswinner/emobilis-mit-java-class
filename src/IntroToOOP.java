public class IntroToOOP {
    /*
    * Introduction to OOP(Object Oriented Programming)
    * Programming Paradigms - structure in which code and
    * */
    /*
    OOP
    -Class( state/properties and behaviour/methods- what can they do or achieve ; )
        User - id,name,age,gender[properties]
             -can login, register,

          Car   color,model,engine -
                accelarate,drive,start and stop - methods

    -Object
        specifics
        - an instance of a class - implementation.
         Honda CRV - blue, v4



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

    //OOP principles concepts
    /*
    * 1.Poly morphism
    *  - overloading - a situation we have the same method name but different parameters
    *  - overriding  - we have the same methods name implemented in different @ovveride
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
