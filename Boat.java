public class Boat extends Vehicle {  

    // extension
    private boolean swimming;

    public Boat (String brand) {
        super (brand);
        this.swimming = false;
    }

    public boolean isSwimming() {  
        return swimming;  
    }  

    public void setSwimming (boolean swimming) {  
        this.swimming = swimming;
    }

    // Override
    public String doStuff() {  
        return " and I go glug glug!";  
    }

}