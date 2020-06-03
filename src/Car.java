class Car {
    //properties or state of a car
    String color; //class variables
    String model;
    String engine;
    String regNo;

    // alt + insert



//    public Car(String color, String model, String engine, String regNo) {
//        this.color = color;
//        this.model = model;
//        this.engine = engine;
//        this.regNo = regNo;
//    }

    public Car(String model_name) {
        model = model_name;
    }

    public Car(String color, String model, String regNo) {
        this.color = color;
        this.model = model;
        this.regNo = regNo;
    }

    //car behaviours methods - what the car does
    void drive(){
        System.out.println(model+" Driving");
    }
    void accelarate(){
        System.out.println(model+" Accelerate");
    }
    void stop(){
        System.out.println(model+" Stop");
    }
    void start(){
        insertKey();
        checkBatteryLevel();
       // checkFuelLevel();
        System.out.println(model+" Start");
    }
    private void insertKey(){
        System.out.println(" Insert Key");
    }
    private void checkBatteryLevel(){
        System.out.println("Checking Battery Level");
    }
    private void checkFuelLevel(){
        System.out.println("Fuel Level is 70%");
    }

    void setRegNo(String carRegNo){
        regNo = carRegNo;
    }
    String getMyCarRegNo(){
        return regNo;
    }

    //constructors
    //used to initilize properties in a class imediately we create an object
    // model, engine registration

}

