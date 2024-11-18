import java.util.Scanner;

public class RadixOfNumber {
    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radix String : ");
        name = sc.nextLine();

        if (name.matches("[01]+")) {
            System.out.println("Binary radix = 2");
        } else if (name.matches("[0-7]+")) {
            System.out.println("Octal , Radix = 8");
        } else if (name.matches("[0-9A-Fa-f]+")) {
            System.out.println("Hexadecimal radix = 16");
        } else {
            System.out.println("Number is invalid");
        }
    }
}
//String
//0101 -- Binary radix 2
//0-7 -- Octal radix 8
//0-9A-f -- Hexadecimal radix 16