public class Car extends Vehicle {  
    
    // extension
    private boolean moving;

    public Car (String brand) {
        super (brand);
        this.moving = true;
    }

    public boolean isMoving() {  
        return moving;  
    }  
  
    public void setMoving(boolean moving) {  
        this.moving = moving;
    }

    // Override
    public String doStuff() {  
        return " and I go zoom zoom zoom!";  
    }

}