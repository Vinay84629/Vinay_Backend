public class StringMethod {
    public static void main(String[] args) {
        // let's create a String in pool
        String str1 = "java program";
        // Let's create a String object in heap
        String str2 = new String("JAVA");
        //Create a String with character array

        char c[] = {'A','m','y','r','a'};
        String str3 = new String(c,0,3);
        // Create a String with byte array

        byte b[] = {65,66,67,68,69};
        String str4 = new String(b,1,2);

        //65is 0 , 66 is 1 , 67 is 2 , 68 is 3 and 69 is 4 th offset
        // b,1,2 with gives the output from 1st offset to 2nd length
    }
}

// To check the pool and heap objects

/*String str1 =("java");
String str2 =("Java");
String str3 = new String ("java");
System.out.println(str1);
System.out.println(str1==str2);*/

