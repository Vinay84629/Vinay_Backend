public class ExtractSubstring {
    public static void main(String[] args) {

        String str = "Welcome to Java";

        String sub = str.substring(11,15);
        System.out.println(sub);
    }
}
//The substring(int beginIndex) method returns the substring starting from the specified index up to the end.
// Since "Java" starts at index 11, str.substring(11) extracts "Java".
