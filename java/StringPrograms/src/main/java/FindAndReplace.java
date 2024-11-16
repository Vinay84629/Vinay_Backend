public class FindAndReplace {
    public static void main(String a[]){

        //Replace "Java" with "Python" in the string String str = "I love Java programming".

        String str = "i love java programing";

        String replace = str.replace("java" , "python");
        System.out.println(replace);
    }
}
//The replace() method replaces occurrences of a substring with another substring. Here, "Java" is replaced with "Python" in the original string.