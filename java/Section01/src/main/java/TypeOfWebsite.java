import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args) {

        String url;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the URL : ");
        url = sc.nextLine();

        String protocol = url.substring(0,url.indexOf(":"));

        if(protocol.equals("http")){
            System.out.println("Hypertext Transfer Protocol");
        }else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");}

        String ext = url.substring(url.lastIndexOf(".")+1);

        if(ext.equals("com")) {
            System.out.println("Commercial");
        }else if(ext.equals("org")) {
            System.out.println("Organisation");
        }else if(ext.equals("net"))
            System.out.println("Network");
    }
}



//        int day;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        day = sc.nextInt();
//
//        if(day==1){
//            System.out.println("Monday");
//        }else if(day==2){
//            System.out.println("Tuesday");
//        }else if(day==3){
//            System.out.println("Wednesday");
//        }else if(day==4){
//            System.out.println("Thursday");
//        }else if(day==5){
//            System.out.println("Friday");
//        }else if(day==6){
//            System.out.println("Saturday");
//        }else if(day==7){
//            System.out.println("Sunday");
//        }else{
//            System.out.println("Invalid");
//        }