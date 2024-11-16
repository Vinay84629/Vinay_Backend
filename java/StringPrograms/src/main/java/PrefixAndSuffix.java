public class PrefixAndSuffix {
    public static void main(String[] args) {
        //String str = "HelloWorld";, check if the string starts with "Hello" and ends with "World".

        String str = "Hello World";

        boolean startsWith = str.startsWith("Hello");
        boolean endsWith = str.endsWith("World");

        System.out.println(startsWith);
        System.out.println(endsWith);

    }
}
//The startsWith() method checks if the string starts with the specified prefix,
// and endsWith() checks if it ends with the specified suffix. Both methods return true in this case.