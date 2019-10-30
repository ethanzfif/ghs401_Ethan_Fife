

public class Song
{
    private String title;
    private int length;
    
    public Song(String title, int length){
        this.title = title;
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public String getSong(){
        return title;
    }
}
