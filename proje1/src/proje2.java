import java.util.Scanner;

public class proje2 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("aracınızın km'de ne kadar yaktığını giriniz: ");
        double yakit = scanner.nextDouble();
        System.out.println("bilgileriniz kayıt ediliyor...");

        System.out.print("kaç km yol yaptığınızı giriniz: ");
        double km = scanner.nextDouble();
        System.out.println("bilgileriniz kayıt ediliyor...");

        double tutar = km * yakit;
        System.out.println("gideceğiniz km için yakacağınız yakıt: " + tutar);
    }
}
