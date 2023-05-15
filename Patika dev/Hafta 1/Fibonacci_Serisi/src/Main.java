import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayi;
        System.out.println("Fibonacci Serisinde kaç sayı olsun?");
        sayi= scan.nextInt();

        System.out.println("Fibonacci dizisi:");

        int a = 0;
        int b = 1;

        for (int i = 0; i < sayi; i++) {
            System.out.print(a + " ");

            int temp = a + b; //geçici değişkene atandı
            a = b;
            b = temp;
        }

    }
}