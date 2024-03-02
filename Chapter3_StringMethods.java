package system;

public class Chapter3_StringMethods {
    public static void main(String[] args) {
        String name = "Aditya";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

//        String lstr = name.toLowerCase();
//        System.out.println(lstr);
//
//        String ustr = name.toUpperCase();
//        System.out.println(ustr);
//
//        String nonTrimmedString = "    Aditya is a good boy.    ";
//        System.out.println(nonTrimmedString);
//
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));

        System.out.println(name.replace('a', 'x'));
        System.out.println(name.replace("ty", "iii"));

        System.out.println(name.startsWith("Adi"));
        System.out.println(name.startsWith("s"));
        System.out.println(name.startsWith("a"));
        System.out.println("-------------------");
        System.out.println(name.endsWith("tya"));
        System.out.println(name.endsWith("s"));
        System.out.println(name.endsWith("A"));
        System.out.println("-------------------");
        System.out.println(name.charAt(3));

        System.out.println("-------------------");
        System.out.println(name.indexOf("t"));

        System.out.println("-------------------");
        System.out.println(name.equals("Aditya"));
        System.out.println(name.equals("aditya"));

        System.out.println("-------------------");
        System.out.println(name.equalsIgnoreCase("AdiTyA"));

        System.out.println("I am escape sequence \" double quotes");

//        escape sequences
//                \n
//                \t
//                \\
//                \"
    }
}
