

public class Unit
{
    //1 unit
    private String name;
    private int strength;
    private int speed;
    
    public Unit(){
        this.name = "";
        this.strength = 0;
        this.speed = 0;
    }
    
    public Unit(String name, int strength, int speed){
        this.name = name;
        this.strength = strength;
        this.speed = speed;
    }
    
    public String getName(){
        return name;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public int getStats(){
        return strength*speed;
    }
    public String toString(){
        return "Name: " + name + "/tStrength: " + strength + "/tSpeed: " + speed;
    }
}
