import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double boy=0;
        double kilo = 0;
        //double hesaplama;



        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy=scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo=scan.nextDouble();
        System.out.println("Vücut kitle endeksiniz: "+kilo/(boy*boy));





    }
}