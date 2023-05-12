import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi=scan.nextInt();
        int tut;
        int toplam=0;
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                tut=i;
                //System.out.println(tut); bölen sayıları yazdırır
                toplam+= tut;

            }

        }
        if(toplam!=sayi || (sayi==0) ){
            System.out.println(sayi+" Mükemmel sayı değildir");
        }
        else{
            System.out.println(sayi+" Mükemmel sayıdır");
        }

       // System.out.println(toplam);
        
    }
}