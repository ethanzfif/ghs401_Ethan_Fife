

public class SmartKidDriver
{
    public static void main(){
        SmartKid nic = new SmartKid(new double[]{2.5,3.0,3.0,4.0,3.5});
        
        System.out.println("Nic has a GPA of " + nic.calcGPA());
    }
}
