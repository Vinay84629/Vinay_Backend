import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
    int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = sc.nextInt();
    switch(num)
    {
        case 1:
        System.out.println("Ramya");
        break;
        case 2:
        System.out.println("Amyra");
        break;
        case 3:
        System.out.println("Guddi");
        break;
        case 4:
        System.out.println("idiot");
    }
    }
}
