import javax.swing.JOptionPane;

public class while_loops
{
    public static void main(){
        double sleep = Double.parseDouble(JOptionPane.showInputDialog("How many hours did you sleep last night?"));
        while(sleep < 0 || sleep > 24){
            sleep = Double.parseDouble(JOptionPane.showInputDialog("No, Seriously.\nHow many hours did you sleep last night?"));
        }
        System.out.println("You were asleep for " + sleep + " hours.");
    }
}
