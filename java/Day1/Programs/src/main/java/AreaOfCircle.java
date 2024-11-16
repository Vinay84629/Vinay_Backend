import java.util.Scanner;
import java.util.Scanner.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        //calculate the area of circle by taking user input

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle : ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius ; //Formula is pir^2
        System.out.println(area);
    }
}