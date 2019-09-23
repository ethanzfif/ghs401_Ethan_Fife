import javax.swing.JOptionPane;

public class InputOutput
{
    
    public static void main(){
        
        String name = JOptionPane.showInputDialog("Whats your name?");
        System.out.println("Hello " + name + "!");
       
        int age = Integer.parseInt(JOptionPane.showInputDialog("Whats your age?"));
        
        if(age >= 16){
            System.out.println(name + "! Lets go driving on the highway!");
        }
        else{
            System.out.println(name + "! Run for it!");
        }
        
    }
    
}
