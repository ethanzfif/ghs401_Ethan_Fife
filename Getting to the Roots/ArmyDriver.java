import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ArmyDriver
{
    public static void main(){
        //ask for size of army and auto fill
        
        /*int units = Integer.parseInt(JOptionPane.showInputDialog("What is the size of your army?"));
        if(units <= 10){
            for(int i=0; i<(units/10)+1; i++){
                Squad 
            }
        }*/
        
        ArrayList<Unit> squadUnits = new ArrayList<Unit>();
        
        Unit unit0 = new Unit("AU000", 10, 10);
        Unit unit1 = new Unit("AU001", 10, 10);
        Unit unit2 = new Unit("AU002", 10, 10);
        Unit unit3 = new Unit("AU003", 10, 10);
        Unit unit4 = new Unit("AU004", 10, 10);
        Unit unit5 = new Unit("AU005", 10, 10);
        Unit unit6 = new Unit("AU006", 10, 10);
        Unit unit7 = new Unit("AU007", 10, 10);
        Unit unit8 = new Unit("AU008", 10, 10);
        Unit unit9 = new Unit("AU009", 10, 10);
        squadUnits.add(unit0);
        squadUnits.add(unit1);
        squadUnits.add(unit2);
        squadUnits.add(unit3);
        squadUnits.add(unit4);
        squadUnits.add(unit5);
        squadUnits.add(unit6);
        squadUnits.add(unit7);
        squadUnits.add(unit8);
        squadUnits.add(unit9);
        
        //Squad squad1 = new Squad("
    }
}
