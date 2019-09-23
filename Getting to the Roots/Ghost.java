

public class Ghost
{
    //instance variables for the class "ghost"
    private String color;
    private int speed;
    private int level;
    
    //zero argument constructor
    public Ghost(){
        this.color = null;
        this.speed = 1;
        this.level = 1;
        //System.out.println("Default ghost created.");
    }
    
    public void doubleColor(){
        this.color = color + " " + color;
    }
    
    public void bumpSpeed(){
        this.speed++;
    }
    
    public void bumpSpeed(int up){
        this.speed+=up;
    }
    
    public void levelUp(){
        this.level++;
    }
    //two argument constructor
    public Ghost(String hue, int move, int lvl){
        this.color = hue;
        this.speed = move;
        this.level = lvl;
        //System.out.println("Custom ghost created.");
    }
    
    
    //return string using method toString()
    public String toString(){
        return "Color: " + this.color + ", Speed: " + this.speed + " Level: " + this.level;
    }
}
