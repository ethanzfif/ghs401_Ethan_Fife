
public class Panda
{
    private String country;
    private double weight;
    
    //constructors
    public Panda(){
        this.country = null;
        this.weight = 0.0;
    }
    
    public Panda(String country, double weight){
        this.country = country;
        this.weight = weight;
    }
    
    //methods
    public void setCountry(String country){
        this.country = country;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    //returns
    public String getCountry(){
        return this.country;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public String toString(){
        return "This panda is from " + this.country + " and has a weighs " + this.weight + " lbs.";
    }
}
