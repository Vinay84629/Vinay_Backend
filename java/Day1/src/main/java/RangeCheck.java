import java.util.Scanner;

public class RangeCheck
{
    public static void main(String[] args)
    {
        //rite a Java program that checks if a given integer is within the range of byte data type.
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer value : ");
        int number = sc.nextInt();

        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
        {
            System.out.println("given number is : " + number + " Within the byte range");
        }
        else
        {
            System.out.println("Given number : " + number + "is Out of byte range");
        }
    }
}
