import javax.swing.JOptionPane;

public class strings
{
    
    public static void main()
    {
        /*
        String name1 = new String("Greg");
        String name2 = JOptionPane.showInputDialog("Name: ");
        */
        
        /*
        int a = 10;
        int b = 10;
        if(name1.equals(name2)){
            System.out.println("Twins!");
        }
        else{
            System.out.println("Missmatch.");
        }
        */
       
        String[] classmates = {"Ethan", "Drake", null, "Boog", "Reyn", "Skidoosh", "Mark", "aaaaaaAAAAAHHHHHH!!"};
        for (int i=0; i<classmates.length; i++){
            
            if(classmates[i] != null){
                System.out.println(classmates[i].length());
            }
            else{
                System.out.println(4);
            }
        }
       
       
       
    }
    
}
