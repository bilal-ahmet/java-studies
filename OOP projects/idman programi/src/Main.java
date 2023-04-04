import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("idman programına hoşgeldiniz");

        String idmanlar = "geçerli hareketler\n" + "burpee\n" + "pushup\n" + "situp\n" + "squat";
        System.out.println("******************");
        System.out.println(idmanlar);
        System.out.println("******************");

        System.out.println("bir idman oluşturun");

        System.out.println("burpee sayısı: ");
        int burpee = scanner.nextInt();

        System.out.println("pushup sayısı: ");
        int pushup = scanner.nextInt();

        System.out.println("situp sayısı: ");
        int situp = scanner.nextInt();

        System.out.println("squat sayısı: ");
        int squat = scanner.nextInt();

        scanner.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squat);

        System.out.println("idmanınız başlıyor");


        while(idman.IdmanBittiMi() == false){
            System.out.println("hareket türü(burpee, pushup, situp, squat): ");
            String tur = scanner.nextLine();

            System.out.print("bu hareketten kaç tekrar yapacaksınız: ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
        }

        System.out.println("idmanı bitirdiniz, tebrikler");
    }
}
