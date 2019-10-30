

public class SmartKid
{
    private double[] myGrades;
    
    public SmartKid(){
        this.myGrades = new double[]{0.0,0.0,0.0,0.0,0.0};
    }
    
    public SmartKid(double[] myGrades){
        this.myGrades = myGrades;
    }
    
    public double calcGPA(){
        double gpa = 0.0;
        for(int i = 0; i < this.myGrades.length; i++){
            gpa+=this.myGrades[i];
        }
        return gpa/this.myGrades.length;
    }
    
    public String String(){
        String result = "Grades are: ";
        for(int i = 0; i < this.myGrades.length; i++){
            if(i == myGrades.length - 1){
                result += this.myGrades[i];
            }
            else{
                result += this.myGrades[i] + ", ";
            }
        }
        return result;
    }
}
