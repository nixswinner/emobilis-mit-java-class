public class Inheritance {
    public static void main(String[] args) {
        Animals cow = new Animals();
        cow.setName("My cow");
        cow.breath();
        System.out.println(cow.getName());

        HumanBeings john = new HumanBeings();
        john.setName("John Doe");
        john.breath();
        System.out.println(john.getName());

        Elephants myelephant = new Elephants();
        myelephant.setName(" Elephant");

        System.out.println(myelephant.getName());

        Animals.animalscount(10);

        //Ctr + B
        // final const
        final String name="My Name";
        //name = "Jane Mary";
        final float tax = 16.0f;
       // tax=20.0f;
        displayOnConsole(name);

    }
    private static void displayOnConsole(String data){
        System.out.println(data);
    }
}

 class Animals{
    private String name;
    private String species;

    //provide setters and getters - set a value property or get value of a given property
    //ALT + Insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void breath(){
        System.out.println(this.getName()+" Breaths");
    }
    public void move(){
        System.out.println("Moves");
    }
     static void animalscount(int count){
        System.out.println("There are "+count+" ");
    }
}
/*
* parent
*   .{inheritance} extends parent
*   '
* Child
*
* //OOP A child class inherits from a parent class
* - child class to a sub-class and the parent super class
* */
class HumanBeings extends Animals {
     String nationality;
     String location;
     String emailAddress;

}

class Elephants extends Animals{
    String tusks;
    String weight;
    String age;
}


