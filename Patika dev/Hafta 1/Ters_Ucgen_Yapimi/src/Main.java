import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        int basamak=scan.nextInt();
        for(int i=basamak;i>0;i--){
            //System.out.println(i);
            int tut=i;
            for(int j=0;j<tut;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}