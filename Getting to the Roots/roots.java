import javax.swing.JOptionPane;

public class roots
{
    
    public static void main(){
        //ask for the values 'a', 'b', and'c'
        int a = Integer.parseInt(JOptionPane.showInputDialog("Input the value of 'a'"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Input the value of 'b'"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Input the value of 'c'"));
        
        //find 'b' squared
        int bs = b*b;
        
        //find '4ac'
        int ac = 4*a*c;       
        
        int bma = bs - ac;
        if(bma < 0){
            System.out.println("Sorry, your discriminant is negative. We cannot process imaginary roots right now…");
            }
        else{
           
            double sqrt = Math.sqrt(bma);
            double fr = (-1 * b + sqrt) / (2*a);
            double sr = (-1 * b - sqrt) / (2*a);
            System.out.println("The first root is " + fr);
            System.out.println("The second root is " + sr);
        }
    }
  
    
    
}
