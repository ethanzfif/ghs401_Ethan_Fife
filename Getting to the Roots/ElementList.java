
import java.util.ArrayList;
public class ElementList
{
    public static void main(){
        ArrayList<String> elementList = new ArrayList<String>();
        
        //fill list with elements
        elementList.add("argon");
        elementList.add("boron");
        elementList.add("carbon");
        elementList.add("flourine");
        elementList.add("gold");
        elementList.add("iron");
        elementList.add("livermorium"); 
        
        System.out.println("The elements are as follows: ");
        for(int i=0; i<elementList.size(); i++){
            System.out.println(elementList.get(i));
        }
        
        //make smallchanges
        elementList.add(1, "bismuth");
        elementList.set(3, "cobalt");
        
        System.out.println("\nThe elements, after some changes, are as follows: ");
        for(int i=0; i<elementList.size(); i++){
            System.out.println(elementList.get(i));
        }
        
        //find elements containing "on"
        System.out.println("\nThe elements containing \"on\" are as follows: ");
        for(int i=0; i<elementList.size(); i++){
            if(elementList.get(i).contains("on")){
                System.out.println(elementList.get(i));
            }
        }
        
        System.out.println("\nThe elements before the letter \"d\" are as follows: ");
        for(int i=0; i<elementList.size(); i++){
            if(elementList.get(i).compareTo("d")>=0){
                elementList.remove(i);
                i--;
            }
            else{
                System.out.println(elementList.get(i));
            }
        }
    }
}
