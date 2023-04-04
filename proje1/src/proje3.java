import java.util.Scanner;

public class proje3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("birinci sayı: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("ikinci sayı: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("değiştirilmeden önce girilen sayılar: ");
        System.out.println("birinci sayı: " + sayi1 + " ikinci sayı: " + sayi2);

        /*
        double birinci = sayi1;
        sayi1 = sayi2;                          // böyle de olur
        sayi2 = birinci;
        */

        System.out.println("değiştirildikten sonra: ");
        sayi1 = sayi2;
        sayi2 = sayi1;

        System.out.println("birinci sayı: " + sayi1 + " ikinci sayı: " + sayi2);


    }
}
