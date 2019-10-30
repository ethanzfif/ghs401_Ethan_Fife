
public class MyPhoneDriver
{
    public static void main(){
        //constructor 1
        Song song1 = new Song("song1", 100);
        Song song2 = new Song("song2", 100);
        Song song3 = new Song("song3", 100);
        Song song4 = new Song("song4", 100);
        MyPhone phone = new MyPhone("black", 10, song1, song2, song3, song4);
        
        //constructor 2
        Song[] songs = new Song[]{song1, song2, song3, song4};
        MyPhone phone2 = new MyPhone("green", 10, songs);
        
        System.out.println(phone + "\n" + phone2);
        System.out.println("Phone 1 play time: " + phone.getTotalPlayTime() + " or " +  phone.getTotalPlayTimeMinSec() + "\nPhone 2 play time: " + phone.getTotalPlayTime() + " or " +  phone.getTotalPlayTimeMinSec()+"\n");
        
        phone.deleteAllSongs();
        phone2.deleteAllSongs();
        System.out.println(phone + "\n" + phone2);
        System.out.println("Phone 1 play time: " + phone.getTotalPlayTime() + " or " +  phone.getTotalPlayTimeMinSec() + "\nPhone 2 play time: " + phone.getTotalPlayTime() + " or " + phone.getTotalPlayTimeMinSec());
    }
}
