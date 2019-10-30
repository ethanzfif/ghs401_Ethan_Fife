
import java.util.ArrayList;
public class Family
{
    private ArrayList<Relative> members = new ArrayList<Relative>();
    
    public Family(ArrayList<Relative> members){
        this.members = members;
    }
    
    public void sortByAge(){
        //sort until sorted via swapping
        boolean unsorted = true;
        boolean flag = false;
        while(unsorted){
            //sort
            for(int i=0; i<members.size()-1; i++){
                if(members.get(i).getAge() > members.get(i+1).getAge()){
                    members.add(i, members.get(i+1));
                    members.remove(i+2);
                }
            }
            //check
            for(int i=0; i<members.size()-1; i++){
                if(members.get(i).getAge() > members.get(i+1).getAge()){
                    flag = true;
                }
            }
            System.out.print(toString());
            if(!flag){
                unsorted = false;
            }
            else{
                System.out.print("fail");
            }
        }
    }
    
    public String toString(){
        String fam = "Family:\n";
        for(Relative currRelative: members){
            fam += currRelative.getName() + "\n";
        }
        return fam;
    }
}
