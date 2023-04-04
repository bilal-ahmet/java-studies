import java.util.Scanner;

public class kullanici_girisi {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        String sys_kullanici_adi = "bilal";
        String sys_parola = "12345";

        System.out.println("*****************");
        System.out.println("kullanıcı girşine hoşgeldiniz.");
        System.out.println("*****************");

        while (true){
            System.out.print("kullanıcı adı: ");
            String kullanici = scanner.nextLine();
            System.out.print("parola: ");
            String parola = scanner.nextLine();

            if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("hoşgeldiniz " + kullanici);
                break;
            }
            else if(kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                System.out.println("parolanız yanlış");
                giris_hakki -= 1;
                System.out.println("giriş hakkı: " + giris_hakki);
            }
            else if(!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("kullanıcı adınız yanlış");
                giris_hakki -= 1;
                System.out.println("giriş hakkı: " + giris_hakki);
            }
            else {
                System.out.println("kullanıcı adınız ve parolanız yanlış.");
                giris_hakki -=1;
                System.out.println("giriş hakkı: " + giris_hakki);
            }


            if(giris_hakki == 0){
                System.out.println("giriş hakkınız bitti, lütfen 24 saat sonra tekrar deneyiniz");
                break;
            }






        }

    }
}
