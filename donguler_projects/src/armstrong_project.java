import java.util.Scanner;

public class armstrong_project {
    public static void main(String[] args){

        // armstrong sayısı: 1634= 1^4 + 6^4 + 3^4 + 4^4  (4 basamak sayısı)

        Scanner scanner = new Scanner(System.in);

        System.out.print("sayi giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("basamak sayısını giriniz: ");
        int basamak_sayisi = scanner.nextInt();

        int gecici_sayi = sayi;
        int toplam = 0;

        do{
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi = gecici_sayi / 10;

            toplam += Math.pow(basamak_degeri, basamak_sayisi);   //a'nın b'ninci kuvveti. örn: 2^3
            System.out.println(toplam);



        }while (gecici_sayi > 0);


        if (sayi == toplam){
            System.out.println("bur bir armstrong sayısıdır.");
        }
        else {
            System.out.println("bu sayı bir armstrong sayısı değildir.");
        }
    }
}
