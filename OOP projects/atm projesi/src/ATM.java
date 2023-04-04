import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){

        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("bankaya hoşgeldiniz");
        System.out.println("***************");
        System.out.println("kullanıcı girişi");

        int gitis_hakki = 3;

        while (true){
            if(login.login(hesap)){
                System.out.println("giriş başarılı...");
                break;
            }
            else{
                System.out.println("giriş başarısız...");
                gitis_hakki -= 1;
                System.out.println("giriş hakkınız: " + gitis_hakki);
            }
            if(gitis_hakki == 0){
                System.out.println("giriş hakkınız bitti, sistem bloke oldu");
                return;
            }
        }



        String islemler = "1.bakiye\n"+"2. para yatırma\n"+"3.para çekme\n"+"çıkış için q'ya basınız";
        System.out.println("****************");
        System.out.println(islemler);
        System.out.println("****************");

        while (true){
            System.out.println("işlem seçiniz");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                break;
            }
            else if (islem.equals("1")){
                System.out.println("bakiyeniz: " + hesap.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.println("yatırmak istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatit(tutar);
            }
            else if (islem.equals("3")){
                System.out.println("çekmek istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);

            }
            else{
                System.out.println("geçersiz işlem");
            }
        }

    }

}
