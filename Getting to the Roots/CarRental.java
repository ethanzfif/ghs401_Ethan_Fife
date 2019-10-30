

public class CarRental
{
    private Car[] cars = new Car[4];
        
    public CarRental(){
        cars[0] = new Car();
        cars[1] = new Car("Blee", 5.6, true);
        cars[2] = new Car("Bloo", 19.2, true);
        cars[3] = new Car("Blah", 8.63, true);
    }
        
    public double getHighestMPG(){
        double MPG = 0.0;
        for(int i = 0; i < cars.length; i++){
            //check for null and if MPG is improved
            if(cars[i].getMPG() != 0.0 && cars[i].getMPG() > MPG){
                MPG = cars[i].getMPG();
            }
        }
        return MPG;
    }
    
    public double getPercentInStock(){
        double stock = 0.0;
        for(int i = 0; i < cars.length; i++){
            if(cars[i].getIsInStock()){
                stock++;
            }
        }
        return (stock/cars.length)*100;
    }
}
