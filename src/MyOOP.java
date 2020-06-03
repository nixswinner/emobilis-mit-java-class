public class MyOOP {
    public static void main(String[] args) {
        //object -
        //Syntax
        //DRY -
        // ClassName objectname = new ClassName();
        Car honda = new Car("Honda"); //created a an object called honda
        honda.start();
        honda.accelarate();
        honda.stop();
        honda.setRegNo("KCX 567E");
        String regNo = honda.getMyCarRegNo();
        displayOnConsole(" My Honda Registration Number is "+regNo);

        displayOnConsole("-----------------");

        Car nissan = new Car("Nissan");
        nissan.setRegNo("KCV 786V");
        displayOnConsole("Nissan RegNo is "+nissan.getMyCarRegNo());
        nissan.start();

        displayOnConsole("--------------------");
        Car vw = new Car("VW");
        vw.setRegNo("KBX 778R");
        displayOnConsole("My VW Registration number is "+vw.getMyCarRegNo());

        Car toyota = new Car("Black","Toyota","KCD 567G");
        displayOnConsole( toyota.getMyCarRegNo());


        //constructors
    }
    private static void displayOnConsole(String data){
        System.out.println(data);
    }
}
