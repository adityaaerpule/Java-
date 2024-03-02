package system;
import java.util.Scanner;

public class PracticeSet_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program converts Kilometers into Miles (aprrox)");
        System.out.print("Enter value of KM - ");
        float km = sc.nextFloat();
        float ml = km/1.609f;
        System.out.println("Equivalent Miles = " +ml);
    }
}
