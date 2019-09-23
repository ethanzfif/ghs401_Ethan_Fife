
public class Dog
{
    private String name;
    private String breed;
    private double weight;
    
    public Dog(){
        this.name = null;
        this.breed = null;
        this.weight = 0.0;
    }
    
    public Dog(String name, String breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }
    
    //return is a double
    public double weight(){
        return this.weight;
    }
    
    //return is a string
    public String toString(){
        return this.name + " is a " + this.breed + " and it's weight is " + this.weight + " pounds.";
    }
}
