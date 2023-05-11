import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz?: ");
        int sayi = scan.nextInt();

        System.out.print("1. Sayıyı giriniz: ");
        int deger= scan.nextInt();
        int max=deger;
        int min=deger;

        for (int i=1;i<sayi;i++){
            System.out.print((i+1)+". Sayıyı giriniz: ");
            deger= scan.nextInt();

            if(deger>max){
                max=deger;
            }
            if(deger<min){
                min=deger;
            }

        }
        System.out.println("En büyük sayi: "+max);
        System.out.println("En büyük sayi: "+min);





    }
}