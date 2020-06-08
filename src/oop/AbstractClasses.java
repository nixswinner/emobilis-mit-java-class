package oop;

public class AbstractClasses {

    //class - meant for inheritance - cannot instati
    //classification : Kingdom - Animalie -
    public static void main(String[] args) {
        child child = new child();

    }
}
 abstract class HumanBeing{
    int age;
    double height;
    double weight;
}

//child,adult,aged
class child extends HumanBeing{
    String name;
    String parent_name;
}

class Adult{

}

