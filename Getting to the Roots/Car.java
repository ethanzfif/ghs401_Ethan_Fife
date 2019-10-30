

public class Car
{
    private String make;
    private double MPG;
    private boolean isInStock;
    
    public Car(){
        this.make = null;
        this.MPG = 0.0;
        this.isInStock = false;
    }
    
    public Car(String make, double MPG, boolean isInStock){
        this.make = make;
        this.MPG = MPG;
        this.isInStock = isInStock;
    }
    
    public void setMake(String make){
        this.make = make;
    }
    
    public void setMPG(double MPG){
        this.MPG = MPG;
    }
    
    public void setIsInStock(boolean isInStock){
        this.isInStock = isInStock;
    }
    
    public String getMake(){
        return make;
    }
    
    public double getMPG(){
        return MPG;
    }
    
    public boolean getIsInStock(){
        return isInStock;
    }
}
