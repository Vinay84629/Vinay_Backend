import java.util.Scanner;

public class ConditionlStatement {
    public static void main(String[] args) {
        int m1,m2,m3;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Marks for m1 , m2, m3 : ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        float sum = m1+m2+m3;
        float avg = sum / 3;

        if(avg>=60 && avg<=70) {
            System.out.println("The total is above avg : " + avg + "\nGrade is A");
        }
        else if(avg<60 && avg>35){
            System.out.println("The total is below avg : " + avg + "\nGrade is B");
        }
        else{
            System.out.println("The Student fail");
        }
    }
}
//{
//    public static void main(String args[]) {
//        int age;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter age of the person : ");
//        age = sc.nextInt();
//
//        if (age>=0 && age<=18){
//            System.out.println("The person is Still younger : " + age);
//        }
//        else if (age>18 && age<=60){
//            System.out.println("The person is elder : " + age);
//        }
//        else{
//            System.out.println("The person is aged more than 60years : " + age);
//        }
//    }
//
//}

        //    {
//        int num;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        num = sc.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("given number is even  : " + num);
//        }
//        else{
//            System.out.println("Given number is odd : " + num);
//        }
//    }
/*
    {
        int a = 5,b=15,c=4;

        if(a>b && a>c)
        {
            System.out.println("A is greater ");
        }
        else if (b>c)
        {
                System.out.println("B is greater than A and c");
        }
        else
        {
                System.out.println("C is greater than A and B");
        }
    }
}
*/
