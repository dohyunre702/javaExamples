package javaJungsuk.OOP;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", "100", "200", "300"));
        System.out.println(concatenate(",", "1", "2", "3"));
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("[" + "," + "]");
    }

    static String concatenate(String delim, String ... args) {
        String result = "";

        for(String str : args) {
            result += str + delim;
        }

        return result;
    }
    /*
    static String concatenate(String ... args) {
        return concatenate("", args);
    }
     */
}
