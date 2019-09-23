

public class loops
{
    
   public static void main(){
       String[] firstnames = {"Alex", "Bob", "Sam", "Anne", "Bella"};
       String[] lastnames = {"Baker", "Ross", "Smith", "Frank", "Pensworth"};
       
       System.out.println("First Name \t\tLast Name");
       for(int i=0; i<5; i++){
           //generate numbers
           int pick1 = (int)(Math.random()*firstnames.length);
           int pick2 = (int)(Math.random()*lastnames.length);
           
           System.out.println(firstnames[pick1] + "\t\t\t" + lastnames[pick2]);
       }
       
       int a = 93;
       
       while(a>80){
           System.out.println(a);
           a--;
       }
       
       int name = firstnames.length-1;
       
       while(name>=0){
           System.out.println(firstnames[name]);
           name-=1;
       }
   }
}
