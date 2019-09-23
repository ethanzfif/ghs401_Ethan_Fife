

public class GhostDriver
{
   public static void main(){
       Ghost g1 = new Ghost();
       Ghost g2 = new Ghost();
       Ghost g3 = new Ghost();
       //toString automatically chosen
       System.out.println(g1);
       
       Ghost g4 = new Ghost("purple", 85, 12);
       System.out.println(g4);
       
       g4.bumpSpeed();
       System.out.println(g4);
       
       g4.bumpSpeed(58);
       System.out.println(g4);
       
       //print color twice
       g4.doubleColor();
       System.out.println(g4);
       g4.doubleColor();
       System.out.println(g4);
       
       g4.levelUp();
       System.out.println(g4);
   }
}
