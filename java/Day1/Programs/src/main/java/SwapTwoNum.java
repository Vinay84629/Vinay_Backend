public class SwapTwoNum {
    public static void main (String args[]){
        //Write a program to swap two numbers without using a third variable.
        int a = 10;
        int b = 20;

        System.out.println("Before swap a = : " + a + " B = : " +b);

        a = a + b; //a is 10+20 = 30
        b = a - b; // b is 30 - 20 = 10
        a = a - b; // a is 30 - 10 = 20

        System.out.println("After swap a = : " + a + " B = : " +b);
    }
}