

public class CarRentalDriver
{
    public static void main(){
        CarRental fizzBuzz = new CarRental();
        
        System.out.println("The highest MPG is " + fizzBuzz.getHighestMPG() + ".");
        System.out.println(fizzBuzz.getPercentInStock() + "% are in stock.");
    }
}
