public class Hangar {
    // Challenge of Java 07 Inheritance

    public static void main(String[] args) {

        // define vehicles
        Car clio = new Car ("Clio");
        Boat mary = new Boat ("Queen Elizabeth 2");

        // Display Car
        System.out.print ("I'm " + clio.getBrand());
        if (!clio.isMoving()) {
            System.out.println (" I'm not moving" + clio.doStuff());
        } else {
            System.out.println (" I'm moving" + clio.doStuff());  
        }

        // Display Boat        
        System.out.print ("I'm " + mary.getBrand());
        if (!mary.isSwimming()) {
            System.out.println (" I'm not Swimming" + mary.doStuff());
        } else {
            System.out.println (" I'm Swimming" + mary.doStuff());
        }

    }

}
