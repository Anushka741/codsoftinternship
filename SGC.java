import java.util.Scanner;

public class SGC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Student Grade calculator**********");
        System.out.println("Enter the number of subjects:");

        //Here a is a number of subjects
        int a = sc.nextInt();
        int total = 0;
        System.out.println("Enter the marks obtained in"+a+"subjexts respectively:");
        for(int i=0;i<a;i++){
            int marks = sc.nextInt();
            total = total+marks;
        }

        //AP is average percentage
        double AP = (double) total/a;
        String Grade;
        if(AP>=90){
            Grade = "A+";
        }
        else if(AP>=80){
            Grade = "A";
        }
        else if(AP>=70){
            Grade="B";
        }
        else if(AP>=60){
            Grade = "C";
        }
        else if(AP>=50){
            Grade = "D";
        }
        else if(AP>=40){
            Grade = "E";
        }
        else{
            Grade = "Fail(F)";
        }
        System.out.println("Total marks = "+total);
        System.out.println("Average Percentage = "+AP+"%");
        System.out.println("Grade is :"+Grade);
    }
}