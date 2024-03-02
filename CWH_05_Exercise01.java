package system;
import java.util.Scanner;

public class CWH_05_Exercise01 {
    public static void main(String[] args) {
        System.out.println("This is a Percentage calculator program for 5 subjects");
        Scanner sc = new Scanner(System.in);

        //Taking user input for marks obtained
        System.out.print("Enter marks obtained in 'English' (out of 100): ");
        int eng = sc.nextInt();

        System.out.print("Enter marks obtained in 'Hindi' (out of 100): ");
        int hin = sc.nextInt();

        System.out.print("Enter marks obtained in 'Mathematics' (out of 100): ");
        int mat = sc.nextInt();

        System.out.print("Enter marks obtained in 'Science' (out of 100): ");
        int sci = sc.nextInt();

        System.out.print("Enter marks obtained in 'Social Std.' (out of 100): ");
        int sst = sc.nextInt();

        int sum = eng + hin + mat + sci + sst;
        float per = (float)sum/5f;
        System.out.print("The grand total is : ");
        System.out.print(sum);
        System.out.println("/500");
        System.out.print("Percentage is :");
        System.out.println(per);

    }
}
