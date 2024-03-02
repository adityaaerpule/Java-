package system;

public class CWH_Ch02_Ps01 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade+8);
        System.out.println(grade);

        // Decrypting grade
        grade = (char) (grade-8);
        System.out.println(grade);
    }
}
