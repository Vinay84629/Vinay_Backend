public class StringMethods2 {
    public static void main(String[] args) {
        String str = "JavaProgramming";

        //Given the string String str = "JavaProgramming";, write a code snippet to check if the character at index 4 is 'P'

        char index1 = str.charAt(4);
        boolean index = str.charAt(4) == 'P';

        System.out.println(index1);
        System.out.println("Is the 4th character in the String is P? : "+index);
    }
}
