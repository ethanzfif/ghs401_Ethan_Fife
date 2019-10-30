import java.util.ArrayList;

public class Squad
{
    //10 units
    private String name;
    private Unit leader;
    private ArrayList<Unit> units;
    
    public Squad(String name, ArrayList<Unit> units){
        this.name = name;
        this.units = units;
        this.leader = chooseLeader();
    }
    
    public String getName(){
        return name;
    }
    
    public Unit getLeader(){
        return leader;
    }
    
    public ArrayList<Unit> getUnits(){
        return units;
    }
    
    public Unit chooseLeader(){
        //higest strength*speed is leader and removed from list
        
        Unit topDog = new Unit();
        int stats = -1;
        for(int i=0; i<units.size(); i++){
            if(units.get(i).getStats()>stats){
                stats = units.get(i).getStats();
                topDog = units.get(i);
            }
        }
        units.remove(units.indexOf(leader));
        
        return topDog;
    }
    
    public String toString(){
        String list = "!!!Squad: " + name + "/t Leader: " + leader.getName() + "/t Units:";
        for(Unit currUnit: units){
            list += currUnit.toString() + "/n";
        }
        return list;
    }
}
