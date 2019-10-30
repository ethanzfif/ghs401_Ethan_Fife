
public class HiddenWord
{
    private String word;
    
    public HiddenWord(String word){
        this.word = word;
    }
    
    public String getHint(String guess){
        String wordBit;
        String guessBit;
        String hint = "";
        boolean hit = false;
        
        for(int i = 0; i < guess.length(); i++){
            guessBit = guess.substring(i,i+1);
            wordBit = word.substring(i,i+1);
            if(guessBit.equals(wordBit)){
                hint += wordBit;
            }
            else if(word.contains(guessBit)){
                hint += "+";
            }
            else{
                hint += "*";
            }
        }
        return hint;
    }
}
