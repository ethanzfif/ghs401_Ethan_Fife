
public class DogDriver
{
    public static void main(){
        Dog basic = new Dog();
        Dog custom = new Dog("Doug", "Labrador", 20);
        
        System.out.println(basic);
        System.out.println(custom);
        System.out.println(custom.weight());
    }
}
