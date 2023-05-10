import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        Double armut=2.14;
        int a;
        Double elma=3.67;
        int e;
        Double domates=1.11;
        int d;
        Double muz=0.95;
        int m;
        Double patlıcan=5.00;
        int p;
        double toplam;

        System.out.print("Armut kaç kilo? ");
        a=scan.nextInt();
        System.out.print("Elma kaç kilo? ");
        e=scan.nextInt();
        System.out.print("Domates kaç kilo? ");
        d=scan.nextInt();
        System.out.print("Muz kaç kilo? ");
        m=scan.nextInt();
        System.out.print("Patlıcan kaç kilo? ");
        p=scan.nextInt();
        toplam=(armut*a)+(elma*e)+(muz*m)+(domates*d)+(patlıcan*p);
        System.out.println("Toplam: "+toplam);







    }

}