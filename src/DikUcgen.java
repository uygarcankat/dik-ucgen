import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dik kenar uzunluğunu giriniz ");
        double dik_kenar = input.nextDouble();
        System.out.println(dik_kenar);
        System.out.println("Lütfen diğer dik kenar uzunluğunu giriniz ");
        double alt_kenar = input.nextDouble();
        System.out.println(alt_kenar);
        System.out.println("Hipotenusu hesaplayalım");
        double hipotenus = Math.sqrt( Math.pow(dik_kenar,2) + Math.pow(alt_kenar,2));
        System.out.println("Hipotenus uzunluğu:"+ hipotenus);
        System.out.println("Cevre hesaplayalım");
        double cevre =  (alt_kenar + dik_kenar + hipotenus) ;
        System.out.println("Cevre:"+ cevre);
        System.out.println("Alan hesaplayalım");
        double alan = (alt_kenar * dik_kenar) / 2 ;
        System.out.println("Alan:" + alan);




    }
}

