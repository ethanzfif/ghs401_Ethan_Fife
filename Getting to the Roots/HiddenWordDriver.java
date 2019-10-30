import javax.swing.JOptionPane;
public class HiddenWordDriver
{
    public static void main(){
        HiddenWord hide = new HiddenWord("HARPS");
        
        //String guess = JOptionPane.showInputDialog("Guess: ");
        
        //System.out.println(hide.getHint(guess));
        System.out.println( "Getting hint with guess \"AAAAA\": " + hide.getHint( "AAAAA" ) );      
        System.out.println( "Getting hint with guess \"HELLO\": " + hide.getHint( "HELLO" ) );      
        System.out.println( "Getting hint with guess \"HEART\": " + hide.getHint( "HEART" ) );      
        System.out.println( "Getting hint with guess \"HARMS\": " + hide.getHint( "HARMS" ) );      
        System.out.println( "Getting hint with guess \"HARPS\": " + hide.getHint( "HARPS" ) );      
    }
}
