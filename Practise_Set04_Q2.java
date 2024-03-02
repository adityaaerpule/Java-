package system;

import java.util.Scanner;

public class Practise_Set04_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a Marksheet generation program");
        System.out.print("Marks obtained in subject 1 (out of 100) : ");
        int marks1 = sc.nextInt();
        if(marks1<1 || marks1>100){
            System.out.println("Invalid marks");
            return;
        }
        else{
            System.out.print("Enter marks in subject 2 (out of 100) : ");
        }
        int marks2 = sc.nextInt();
        if(marks2<1 || marks2>100){
            System.out.println("Invalid marks");
            return;
        }
        else{
            System.out.print("Enter marks in subject 3 (out of 100) : ");
        }

        int marks3 = sc.nextInt();
        if(marks3<1 || marks3>100){
            System.out.println("Invalid marks");
            return;
        }
        else{
            System.out.print("Total Marks = ");
        }

        System.out.println(marks3+marks1+marks2);

        float per = (float) (marks3+marks1+marks2)/3;
        System.out.println("Percentage = " +per);

        if (marks1<33){
            System.out.println("Failed in Subject 1");
            return;
        }

        if (marks2<33){
            System.out.println("Failed in Subject 2");
            return;
        }

        if (marks3<33){
            System.out.println("Failed in Subject 3");
            return;
        }

        if (per < 40.0) {
            System.out.println("Failed");
        } else {
            System.out.print("Passed in : ");
            if (per >= 60.0) {
                System.out.println("I division");
            } else if (per >= 45.0) {
                System.out.println("II division");
            } else {
                System.out.println("III division");
            }
        }
    }
}
