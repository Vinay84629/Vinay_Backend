public class StringMethods {
    public static void main(String[] args) {
        String str = new String();
        str = "Hello World";

        int len = str.length();
        String trim = str.trim();
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        String sub1 = str.substring(2,10);
        System.out.println(lower);
    }
}
