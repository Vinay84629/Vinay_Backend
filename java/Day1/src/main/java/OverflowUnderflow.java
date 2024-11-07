public class OverflowUnderflow {
    public static void main(String[] args) {
        // Write a program to demonstrate overflow and underflow in the byte data type.
        byte maxByte = 127;
        byte minByte = -128;

        maxByte++;
        minByte--;

        System.out.println("overflow of maxbyte : " + maxByte);
        System.out.println("underflow of minbyte : " + minByte);
        //Explanation: byte has a range from -128 to 127. Incrementing 127 causes it to overflow to -128 and decrementing -128 underflows to 127.
    }
}
