import java.util.Scanner;

public class project3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************");
        String islemler = "1. toplama işlem \n"
                         +"2. çıkartma işlemi \n"
                         +"3. çarpma işlemi \n"
                         +"4. bölme işlemi";
        System.out.println(islemler);
        System.out.println("********************************");

        System.out.print("lütfen yapmak istediğiniz işlemi seçiniz: ");
        String islem = scanner.nextLine();

        int a;
        int b;

        switch (islem){
            case "1":
                System.out.print("değer giriniz: ");
                a = scanner.nextInt();
                System.out.print("değer giriniz: ");
                b = scanner.nextInt();
                System.out.print("toplama işlemi sonucu: " + (a+b));
                break;

            case "2":
                System.out.print("değer giriniz: ");
                a = scanner.nextInt();
                System.out.print("değer giriniz: ");
                b = scanner.nextInt();
                System.out.print("çıkartma işlemi sonucu: " + (a-b));
                break;

            case "3":
                System.out.print("değer giriniz: ");
                a = scanner.nextInt();
                System.out.print("değer giriniz: ");
                b = scanner.nextInt();
                System.out.print("çarpma işlemi sonucu: " + (a*b));
                break;

            case "4":
                System.out.print("değer giriniz: ");
                a = scanner.nextInt();
                System.out.print("değer giriniz: ");
                b = scanner.nextInt();
                System.out.print("bölme işlemi sonucu: " + ((double)a / b));
                break;

            default:
                System.out.println("yanlış değer girdiniz.");
                break;
        }



        }
    }

