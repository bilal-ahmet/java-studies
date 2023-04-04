import java.util.Scanner;

public class proje4 {
    public static void main(String[] args){

        //dik üçgenin hipotenüsünü bulma

             //benim yaptığım
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("birinci kenarın uzunluğu: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("ikinci kenarın uzunlğunu giriniz: ");
        double kenar2 = scanner.nextDouble();

        double hipotenus = (kenar1 * kenar1) + (kenar2 * kenar2);

        System.out.print("hipotenüs uzunluğu: " + Math.sqrt(hipotenus));
        */


        int a;
        int b;

        System.out.print("birinci kenar: ");
        a = scanner.nextInt();

        System.out.print("ikinci sayı: ");
        b = scanner.nextInt();

        double h = Math.sqrt(a * a + b * b);
        System.out.print("hiponüs:" + h);

    }
}
