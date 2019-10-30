
import java.util.ArrayList;
public class SubstringAndForEach
{
    public static void main(){
        String[] cereals = {"goose flakes", "wheatabix", "sugar", "steel cut oats", "diabetes"};
        
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("goose");
        animals.add("geese");
        animals.add("hamster");
        animals.add("cow");
        animals.add("table");
        
        //foreach loop cannot modify
        for(String currCereal: cereals){
            currCereal = null;
        }
        for(String currCereal: cereals){
            System.out.println(currCereal);
        }
        
        for(String currAnimal: animals){
            currAnimal = null;
        }
        for(String currAnimal: animals){
            System.out.println(currAnimal);
        }
    }
}
