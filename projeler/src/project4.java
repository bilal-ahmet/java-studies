import java.util.Scanner;

public class project4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. vize notunuzu giriniz: ");
        int vize1 = scanner.nextInt();

        System.out.print("2. vize notunuzu giriniz: ");
        int vize2 = scanner.nextInt();

        System.out.print("final notunuzu giriniz: ");
        int fnal = scanner.nextInt();

        System.out.print("lütfen genel not ortalamanızı giriniz: ");
        double gno = scanner.nextDouble();

        int toplam = (vize1*30/100)+(vize2*30/100)+(fnal*40/100);
        System.out.println("ortalama notunuz: " + toplam);


        if (toplam >= 90) {
            System.out.println("harf notunuz AA");
        }
        else if (toplam >= 80){
            System.out.println("harf notunuz BA");
        }
        else if (toplam >= 70){
            System.out.println("harf notunuz BB");
        }
        else if (toplam >= 60){
            System.out.println("harf notunuz CB");
        }
        else if (toplam >= 50){
            System.out.println("harf notunuz CC");
        }
        else if (toplam >= 45){
            System.out.println("harf notunuz DC");
        }
        else if (toplam >= 40){
            System.out.println("harf notunuz DD");

            if (gno < 2.5){
                System.out.println("olum kendine gel lan okulun uzar bak kalırsın ortada");
            }
            else {
                System.out.println("ortalmanız sınırdan yüksekte, ancak bu derse daha çok çalışın.");
            }
        }
        else {
            System.out.println("kaldınız, harf notunuz FF");
        }


















    }
}
