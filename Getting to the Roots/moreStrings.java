
public class moreStrings
{
    public static void main(){
        String school = "Granada High School";
        
        System.out.println(school.substring(8,12));
        
        for(int i = 0; i < school.length()-1; i++){
            System.out.println(school.substring(i,i+2));
        }
    }
}
