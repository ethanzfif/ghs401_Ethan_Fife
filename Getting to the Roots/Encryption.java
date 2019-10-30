import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Encryption
{
    public static void main(){
        String phrase = JOptionPane.showInputDialog("Please enter the phrase to encrypt: ");
        int push = Integer.parseInt(JOptionPane.showInputDialog("How many letters forward? "));        
        
        System.out.println(ceasarEncrypt(phrase, push));
        
        String phrase2 = JOptionPane.showInputDialog("Please enter the phrase to decrypt: ");
        
        System.out.println(ceasarDecrypt(phrase2, push));
        
    }
    
    public static String ceasarEncrypt(String phrase, int push){
        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");
        alpha.add("d");
        alpha.add("e");
        alpha.add("f");
        alpha.add("g");
        alpha.add("h");
        alpha.add("i");
        alpha.add("j");
        alpha.add("k");
        alpha.add("l");
        alpha.add("m");
        alpha.add("n");
        alpha.add("o");
        alpha.add("p");
        alpha.add("q");
        alpha.add("r");
        alpha.add("s");
        alpha.add("t");
        alpha.add("u");
        alpha.add("v");
        alpha.add("w");
        alpha.add("x");
        alpha.add("y");
        alpha.add("z");
        
        String newPhrase = "";
        for(int i=0; i<phrase.length(); i++){
            String letter = phrase.substring(i, i+1); //grab letter
            int spot = alpha.indexOf(letter); //find on list
            
            if(spot<0){ //not a letter
                newPhrase += letter;
            }
            else{ //good
                spot+=push; //increase index of value
                newPhrase += alpha.get(spot%26); //adds new letter to phrase
            }
        }
        
        return newPhrase;
    }
    
    public static String ceasarDecrypt(String phrase, int push){
        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");
        alpha.add("d");
        alpha.add("e");
        alpha.add("f");
        alpha.add("g");
        alpha.add("h");
        alpha.add("i");
        alpha.add("j");
        alpha.add("k");
        alpha.add("l");
        alpha.add("m");
        alpha.add("n");
        alpha.add("o");
        alpha.add("p");
        alpha.add("q");
        alpha.add("r");
        alpha.add("s");
        alpha.add("t");
        alpha.add("u");
        alpha.add("v");
        alpha.add("w");
        alpha.add("x");
        alpha.add("y");
        alpha.add("z");
        
        String newPhrase = "";
        for(int i=0; i<phrase.length(); i++){
            String letter = phrase.substring(i, i+1); //grab letter
            int spot = alpha.indexOf(letter); //find on list
            
            if(spot<0){ //not a letter
                newPhrase += letter;
            }
            else{ //good
                spot-=push; //decrease index of value
                spot = spot%26;
                if(spot<0){
                    newPhrase += alpha.get(26 + spot); //adds new letter to phrase
                }
                else{
                    newPhrase += alpha.get(spot);
                }
            }
        }
        
        return newPhrase;
    }
}
