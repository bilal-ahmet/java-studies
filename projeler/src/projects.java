import java.util.Scanner;

public class projects {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // girilen 3 sayının en büyüğünü bulma
        /*
        System.out.println("3 tane tam sayı giriniz: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("en büyük sayı: " + a);
        }
        else if (b > a && b > c) {
            System.out.println("en büyük sayı: " + b);
        }
        else if (c > a && c > b) {
            System.out.println("en büyük sayı: " + c);
        }
        else if (a == b && a == c) {
            System.out.println("bütün sayılar birbirne eşit");
        }

         */


        // başka bir çözüm yolu

        System.out.print("birinci sayı: ");
        int a = scanner.nextInt();
        System.out.print("ikinci sayı: ");
        int b = scanner.nextInt();
        System.out.print("üçüncü sayı: ");
        int c = scanner.nextInt();

        int maks = 0;

        if (a >= b && a >= c){
            maks = a;
        }
        else if (b >= a && b >= c){
            maks = b;
        }
        else {
            maks = c;
        }

        System.out.println("en büyük sayı: " + maks);


    }
}
