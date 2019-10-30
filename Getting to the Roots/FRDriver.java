import java.util.ArrayList;
public class FRDriver
{
    public static void main() {
        ArrayList<Relative> list = new ArrayList<Relative>();
        Relative f1 = new Relative("Peter", 6);
        Relative f2 = new Relative("Perry", 23);
        Relative f3 = new Relative("Paul", 32);
        Relative f4 = new Relative("Pat", 12);
        Relative f5 = new Relative("Patrisha", 86);
        Relative f6 = new Relative("Philbert", 21);
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f6);
        
        Family myFamily = new Family(list);
        System.out.println(myFamily);
        myFamily.sortByAge();
        System.out.println();
        System.out.println(myFamily);
    }
}
