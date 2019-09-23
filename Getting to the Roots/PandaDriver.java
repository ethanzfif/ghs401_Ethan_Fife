

public class PandaDriver
{
    public static void main(){
        String[] pandaBois = new String[3];
        pandaBois[0] = new Panda("Tribotaran", 67.4);
        pandaBois[1] = new Panda("Pansto", 547839.298);
        pandaBois[2] = new Panda("Dan", 2.0);
        
        for(int i = 0; i < pandaBois.length; i++){
            System.out.println(pandaBois[i]);
        }
    }
}
