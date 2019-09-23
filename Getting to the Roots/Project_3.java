import javax.swing.JOptionPane;

public class Project_3
{
    
    public static void main(){
        //authentication
        String school = JOptionPane.showInputDialog("What is the name of your school?");
        if(school.equals("Granada") || school.equals("granada")){
            String mascot = JOptionPane.showInputDialog("What are you school mascots?");
            if(mascot.equals("Matadors") || mascot.equals("matadors")){
               
                //array of names
                String[] names = {"Dirk", "Charley", "Waldo", "Reyn"};
                
                names[1] = null;
               
                //Locating Waldo
                for(int i=0; i<names.length; i++){
                    //checking for an empty slot
                    if(names[i] == null){
                        System.out.println("Slot " + (i+1) + " is empty.");
                    }
                    else{
                        if(names[i].equals("Waldo")){
                           System.out.println("Waldo found in slot " + (i+1) + ".");
                        }
                        else{
                           System.out.println("Waldo was not found in slot " + (i+1) + ". " + names[i] + " found instead");
                        }
                    }
                }
                //favorite movie character
                String character = "Jim Hawkins";
                String userCharacter = JOptionPane.showInputDialog("Who is your favorite movie character?");
                if(character.equals(userCharacter)){
                    System.out.println("We have the same taste in movies!");
                }
                else{
                    System.out.println("We do not have the same favorite character");
                }
            }
            else{
                System.out.println("Mascot is Incorrect");
            }
        }
        else{
            System.out.println("School is Invalid");
        }
    }
}
