/*Extra Credit: A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *                                            a2 + b2 = c2
 *For example, 32 + 42 = 9 + 16 = 25 = 52.
 *There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 *Find the product abc.
*/

public class Pothagorean_Triplet
{
    public static void main(){
        //create variables
        int a = 1;
        int b = 1;
        int c = 1;
        int pothag = 0;
        boolean calculating = true;
        
        //what to do (-_-)?
        /*what do we know about abc?
         * a+b+c=1000
         * all natural numbers
         * a2+b2=c2
         * 
         * what do we want to know about abc?
         * a*b*c = ?
         * natural number
         * 
         * how to find abc
         * brute force? find all additions making 1000
         * 
         * c = root(a2+b2)
         * c = -a - b + 1000
         * a = -b - c + 1000
         * 
         * c = root(b2 - b - c + 1000)
         * just find b?
         * 
         * heck it, brute force
         * 
         * at most
         * a=1 b=2 c=997
         */
        
        while(calculating){
            while(a<=997){
                
                while(b<=997){
                    
                    while(c<=997){
                        
                        if((a+b+c)==1000){
                            pothag = (a*a) + (b*b);
                            if(pothag==(c*c)){
                                
                                calculating = false;
                            }
                            
                            break;
                            
                            
                        }
                        else{
                            c++;
                        }
                        
                    }
                    
                    if(calculating){
                        c=1;
                        b++;
                    }
                    else{
                        break;
                    }
                    
                }
                
                if(calculating){
                    b=1;
                    a++;
                }
                else{
                    break;
                }
                
            }
            
            calculating = false;
            
        }
        System.out.println(a*b*c);
    }
}
















