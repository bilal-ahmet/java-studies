import java.util.Scanner;

public class atm_project {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("***************");
        String islemler = "1. bakiye öğrenme\n"
                +"2. para çekme\n"
                +"3. para yatırma\n"
                +"4. çıkış";

        System.out.println(islemler);
        System.out.println("***************");

        System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:");
        String islem = scanner.nextLine();


        while(true){
            switch (islem){
                case 1:



            }

        }
        */


        /*
        String islemler = "1. bakiye öğrenme\n"
                + "2. para çekme\n"
                + "3. para yatırma\n"
                + "4. çıkış";

        System.out.println(islemler);
        System.out.println("***************");

        System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:");
        String is = scanner.nextLine();

        int i = 1;
        while (i < 5) {
            if (i == 1) {
                System.out.println("bakiyeniz: 25 tl");
                break;

            } else if (i == 2) {
                System.out.println("çekmek istediğiniz tutarı yazınız: ");
                int cekme = scanner.nextInt();

                if (cekme > 2000) {
                    System.out.println("maksimum tutarın üzerinde lütfen daha düşük bir tutar giriniz.");
                }
            } else if (i == 3) {
                System.out.println("yatırmak istediğiniz tutarı yazınız: ");
                int yatırma = scanner.nextInt();

                if (yatırma > 2000) {
                    System.out.println("maksimum tutarın üzerinde lütfen daha düşük bir tutar giriniz.");
                }

            }



        }

         */



        String islemler = "1. bakiye öğrenme\n"
                + "2. para çekme\n"
                + "3. para yatırma\n"
                + "çıkış için q'ya basın";

        System.out.println("***************");
        System.out.println(islemler);
        System.out.println("***************");

        int bakiye = 1000;

        while (true){

            System.out.print("lütfen işlem seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {

                System.out.println("programdan çıkılıyor...");
                break;
            }

            else if (islem.equals("1")) {
                System.out.println("bakiyeniz: " + bakiye);
            }

            else if (islem.equals("2")) {
                System.out.println("çekmek istediğiniz tutarı giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                if(bakiye - tutar < 0){
                    System.out.println("bakiyeniz yetersiz. bakiyeniz: " + bakiye);
                }
                else {
                    bakiye -= tutar;
                    System.out.println("yeni bakiyeniz: " + bakiye);

                }
            }

            else if (islem.equals("3")) {
                System.out.println("yatırmak istediğiniz tutar");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                bakiye += tutar;
                System.out.println("yeni bakiyeniz: " + bakiye);
            }
            else{
                System.out.println("geçersiz işlem");
            }
        }














    }
}

