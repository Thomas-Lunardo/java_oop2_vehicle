public class Hangar {

    public static void main(String[] args) {


        Car bolid = new Car("Féfé"); 
        bolid.setKilometers(66);
        System.out.println(bolid.doStuff());

        Boat jack = new Boat("Jack");
        jack.setKilometers(666);
        System.out.println(jack.doStuff());

    }
}