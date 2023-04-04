import java.util.Scanner;

public class project2 {
    public static void main(String[] args){

        // beden kitle endeksi

        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen kilonuzu giriniz: ");
        float kilo = scanner.nextFloat();

        System.out.print("lütfen boyunuzu giriniz: ");
        float boy = scanner.nextFloat();

        float bki = (kilo / (boy * boy));
        System.out.println("beden kitle endeksiniz: " + bki);

        if (bki <= 18.5) {
            System.out.println("beden kitle endeksine göre zayıfsınız");
        }
        else if (18.5 < bki && bki < 25){
            System.out.println("beden kitle endeksine göre normal kilodasınız");
        }
        else if (25 < bki && bki < 30){
            System.out.println("beden kitle endeksine göre fazla kilolusunuz");
        }
        else if (bki > 30){                         // burada sadece else yazılabilir.
            System.out.println("obezsiniz");
        }


    }
}
