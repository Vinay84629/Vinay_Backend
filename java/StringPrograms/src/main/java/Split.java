import java.lang.*;

public class Split {
    public static void main(String[] args) {
        //Split the string String str = "apple,banana,cherry"; into individual fruit names.

        String str = new String("apple,banana,cherry");

        String[] fruits = str.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);

        }
    }
}
