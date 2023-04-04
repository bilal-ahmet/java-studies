import java.util.Scanner;

public class proje {
    public static void main(String[] args){

        // vücut kitle indeksi bulma
        // VKE = kilo / boy * boy

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("lütfen kilonuzu giriniz: ");

        if (scanner.hasNextInt()) {

            int kilo = scanner.nextInt();
            System.out.println(" bilgileriniz kayıt ediliyor...");

        }
        else {
            System.out.println("lütfen sayı giriniz");
        }


        System.out.println(" lütfen metre cinsinden boyunuzu giriniz: ");

        if (scanner.hasNextDouble()){

            double boy = scanner.nextInt();
            System.out.println("bilgileriniz kayıt ediliyor...");
        }

        else {
            System.out.println("lütfen sayı giriniz");
        }

        System.out.println(kilo);
        */


        System.out.print("lütfen kilonuzu giriniz: ");
        int kilo = scanner.nextInt();
        System.out.println(" bilgileriniz kayıt ediliyor...");

        System.out.print("lütfen metre cinsinden boyunuzu giriniz: ");
        double boy = scanner.nextDouble();
        System.out.println("bilgileriniz kayıt ediliyor...");

        double VKI = kilo / (boy * boy);

        System.out.println("vücut kitle indeksiniz: " + VKI);
    }
}
