import java.util.ArrayList;
public class ArrayListStuff
{
    public static void main(){
        //ArrayList<what it contains> name = new ArrayList<what it contains>();
        ArrayList<String> myList = new ArrayList<String>();
        
        myList.add("duck");
        myList.add("fish");
        myList.add("cow");
        myList.add("snake");
        myList.add("piano");
        
        for(int i=0; i<myList.size();i++){
           System.out.println(myList.get(i)); 
        }
        
        System.out.println("\nMessing with the array list...");
        myList.add(3, "borgur");
        myList.remove(4);
        myList.set(0, "geese");
        
        for(int i=0; i<myList.size();i++){
           System.out.println(myList.get(i)); 
        }
        System.out.println("\nNo O's"); 
        for(int i=0; i<myList.size();i++){
           if(myList.get(i).contains("o")){
               myList.remove(i);
               i--;
           }
        }
        for(int i=0; i<myList.size();i++){
           System.out.println(myList.get(i)); 
        }
    }
}
