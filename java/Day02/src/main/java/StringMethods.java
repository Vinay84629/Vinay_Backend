public class StringMethods {
    public static void main(String[] args) {
        String str = new String();
        str = "Hello World ";

        int len = str.length();
        //will consider white spaces also
        String trim = str.trim();
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        String sub1 = str.substring(2,10);

        // Replace
        String replace1 = str.replace('e','o');
        String replace2 = str.replace("World","Guddi pie");
        System.out.println(replace2);
    }
}
