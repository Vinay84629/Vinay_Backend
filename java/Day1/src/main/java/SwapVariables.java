public class SwapVariables {
    public static void main(String[] args) {
        //Write a Java program to swap the values of two integer variables without using a third variable.

        int a = 10;
        int b = 20;

        System.out.println("before swap a=" +a+" and b=" +b);

        a = a+b; //30
        b = a-b; //30-20 = 10
        a = a-b; //30-10 = 20

        System.out.println("After swap a=" +a+" and b=" +b);
    }
}
