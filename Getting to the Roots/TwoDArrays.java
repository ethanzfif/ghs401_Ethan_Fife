
public class TwoDArrays
{
    public static void main(){
        String[][] matrix = new String[4][2];
        matrix[0][0] = "Ethan";
        
        for(int r=0; r<matrix.length; r++){
            for(int c=0; c<matrix[r].length; c++){
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
