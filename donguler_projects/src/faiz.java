import java.util.Scanner;

public class faiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.print("ana para değerinizi giriniz: ");
        int ana_para = scanner.nextInt();
        System.out.print("kaç yıl vade istiyorsunuz: ");
        int vade = scanner.nextInt();
        int toplam = 0;


        while(true){

            if(vade == 1){
                toplam = (ana_para * 106 / 100);
                System.out.println("1 yılın sonunda ana paranız: " + toplam);
                break;
            }
            else if(vade == 2){
                toplam = (ana_para * 106 / 100);
                System.out.println("2 yılın sonunda ana paranız: " + toplam);
                break;
            }
        }

         */


        System.out.println("bankamıza hoşgeldiniz, faiz oranı %6");
        int anapara,vade;
        System.out.print("yatırmak istediğiniz tutarı giriniz: ");
        anapara = scanner.nextInt();
        System.out.print("kaç yıl vade istiyorsunuz: ");
        vade = scanner.nextInt();

        double toplampara = anapara;
        double faiz = 0.06;


        for (int i = 1; i <= vade; i++){
            toplampara += (toplampara * faiz);
            System.out.println(i + ". yılın sonunda toplam paranız: " + (int)toplampara);
        }












    }
}
