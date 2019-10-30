
public class MyPhone
{
    private String color;
    private int memory;
    private Song[] songArray;
    
    public MyPhone(String color, int memory, Song song1, Song song2, Song song3, Song song4){
        this.color = color;
        this.memory = memory;
        songArray = new Song[4];
        this.songArray[0] = song1;
        this.songArray[1] = song2;
        this.songArray[2] = song3;
        this.songArray[3] = song4;
    }
    
    public MyPhone(String color, int memory, Song[] songArray){
        this.color = color;
        this.memory = memory;
        this.songArray = songArray;
    }
    public int getTotalPlayTime(){
        int length=0;
        for(int i=0; i<songArray.length; i++){
            if(this.songArray[i] != null){
                length+=this.songArray[i].getLength();
            }
        }
        return length;
    }
    public void deleteAllSongs(){
        for(int i=0; i<songArray.length; i++){
            this.songArray[i] = null;
        }
    }
    public String getTotalPlayTimeMinSec(){
        int sec=getTotalPlayTime()%60;
        int min=getTotalPlayTime()/60;
        return min+" min and "+sec+ " sec";
    }
    public String printSongs(){
        String songs="";
        for(int i=0; i<songArray.length; i++){
            if(this.songArray[i] != null){
                songs+="Song " +(i+1)+ ": "+this.songArray[i].getSong()+"\n";
            }
        }
        return songs;
    }
    public String toString(){
        return "Color: "+this.color+" Memory: "+this.memory+" Songs: \n"+printSongs();
    }
    
}
