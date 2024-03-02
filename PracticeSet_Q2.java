package system;
import java.util.Scanner;

public class PracticeSet_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input for marks obtained
        System.out.print("Enter marks obtained in 'Subject1' (out of 100): ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks obtained in 'Subject2' (out of 100): ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks obtained in 'Subject3' (out of 100): ");
        int sub3 = sc.nextInt();

        int sum = sub1 + sub2 + sub3;
        float per = (float)sum/3f;
        System.out.print("The grand total is : " +sum);
        System.out.println("/300");
        System.out.println("Percentage is :" +per);
        float cgpa = per/9.5f;
        System.out.println("Obtained CGPA is " +cgpa);
    }
}
