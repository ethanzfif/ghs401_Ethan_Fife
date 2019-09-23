

public class random
{
    
    public static void main(){
        
        for(int i=0;i<10;i++){
            int num = (int)(Math.random()*11 + 90);
            
            System.out.println(num);
            System.out.println(num%97);
        
        }
        
    }
  
}
