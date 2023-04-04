import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("çalışanlar programına hoş geldiniz...");

        String islemler = "işlemler...\n"+
                            "1. yazılımcı işlemleri\n"+
                            "2. yönetici işlemler\n"+
                            "çıkış için q'ya basınız";

        System.out.println("****************");
        System.out.println(islemler);
        System.out.println("****************");

        while (true){
            System.out.print("işlemi seçiniz: ");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("sistemden çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                yazilimci yazilimci = new yazilimci("bilal ahmet", "akpınar", 2525, "java");
                String yazilimci_islemleri = "1. format at\n"+
                                            "2. bilgileri göster\n"+
                                            "çıkış için q'ya basınız";
                System.out.println(yazilimci_islemleri);
                while(true){
                    System.out.print("işlem seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if(y_islem.equals("q")){
                        System.out.println("yazılımcı işlemlerinden çıkılıyor");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("işletim sistemi: ");
                        String isletim_sistemi_gir = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi_gir);
                    }
                    else if(y_islem.equals("2")){
                        yazilimci.bilgilerigoster();
                    }
                    else{
                        System.out.println("geçersiz yazılımcı işlemi");
                    }
                }
            }

            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("enes ahmet", "akpınar", 2541, 30);
                String yonetici_islemeri = "1. zam yap\n"+
                                            "2. bilgileri göster\n"+
                                            "çıkış için q'ya basınız";
                System.out.println(yonetici_islemeri);
                while(true){
                    System.out.print("işlem seçiniz: ");
                    String yt_islemleri = scanner.nextLine();

                    if(yt_islemleri.equals("q")){
                        System.out.println("yönetici sisteminden çıkılıyor...");
                        break;
                    }
                    else if(yt_islemleri.equals("1")){
                        System.out.print("yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        int zam_miktar = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zam_yap(zam_miktar);
                    }
                    else if(yt_islemleri.equals("2")){
                        yonetici.bilgilerigoster();
                    }
                    else{
                        System.out.println("geçersiz yönetici işlemi...");
                    }
                }
            }

            else{
                System.out.println("geçersiz işlem...");
            }
        }





    }
}
