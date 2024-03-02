package system;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user.");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number1");
//        int a = sc.nextInt();
//        System.out.println("Enter number2");
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.print("The sum is ");
//        System.out.println(sum);
        System.out.println("Enter a string (Single word)");
        String scr1 = sc.next();
        System.out.println(scr1);

        System.out.println("Enter a string (Sentence)");
        String scr2 = sc.nextLine();
        System.out.println(scr2);
    }
}
