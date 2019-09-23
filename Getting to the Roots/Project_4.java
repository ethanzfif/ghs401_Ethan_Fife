import javax.swing.JOptionPane;

public class Project_4
{
    public static void main(){
        int numbers = 0;
        int min = 10;
        int max = 100;
        int greatest = 0;
        int least = 1000;
        
        //get array length
        while(numbers < 10 || numbers > 20){
            numbers = Integer.parseInt(JOptionPane.showInputDialog("How many numbers, from 10 and 20, would you like?"));
        }
        
        //fill array
        int[] numberArray = new int[numbers];
        for(int i = 0; i < numberArray.length; i++){
            numberArray[i] = (int)(Math.random()*(max - min + 1) + min);
        }
        
        //find greatest and least
        for(int i = 0; i < numberArray.length; i++){
            if(numberArray[i] > greatest){
                greatest = numberArray[i];
            }
            if(numberArray[i] < least){
                least = numberArray[i];
            }
        }
        
        //print
        for(int i = 0; i < numberArray.length; i++){
            System.out.print(numberArray[i] + " ");
        }
        System.out.println("\ngreatest " + greatest);
        System.out.println("least " + least);
    }
}
