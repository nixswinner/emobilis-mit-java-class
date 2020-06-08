package oop;

public class InterfacesExample {
    public static void main(String[] args) {

        FuelCar fuelCar = new FuelCar();
        fuelCar.drive();

        System.out.println("---------------------------------------");

        SelfDriving selfDriving = new SelfDriving();
        selfDriving.drive();
    }

    /*
    *
    * Interfaces  - special type class -
    * we do define - give
    *
    * -gives poly morphism
    * - ensure
    * -implementated -
    * */
}
class FuelCar implements drive {

    @Override
    public void drive() {
        System.out.println("Check Fuel");
        System.out.println("Remove HandBrake");
        System.out.println("Step on Clutch");
        System.out.println("Change the gear from Parking to Gear 1");
        System.out.println("Step on Accelerate");
    }
}

class SelfDriving implements drive{

    @Override
    public void drive() {
        System.out.println("Press Power Button");
        System.out.println("Select Destinantion");
        System.out.println("Start Journey");
    }
}

class MyChars implements CharSequence {

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {

        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}

interface drive{
    void drive();
}
