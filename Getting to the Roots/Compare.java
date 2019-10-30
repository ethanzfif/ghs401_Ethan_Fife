
public class Compare
{
    public static void main(){
        String fruit1 = "pinnapple";
        String fruit2 = "Pinnapple";
        
        System.out.println(fruit2);
        fruit2 = fruit2.toLowerCase();
        System.out.println(fruit2);
        fruit2 = fruit2.toUpperCase();
        System.out.println(fruit2);
        
        System.out.println(fruit1.compareTo(fruit2));
        
        int num = 50;
        
        boolean run = true;
        
        while(run){
            System.out.println(num);
            num-=5;
            
            if(num <= 0){
                run = false;
            }
        }
        
        String food = "pasta and meatballs";
        
        boolean hasPhrase = food.contains("meat");
        
        System.out.println("meat?" + hasPhrase);
    }
}
