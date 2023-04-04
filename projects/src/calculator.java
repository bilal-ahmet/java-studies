import java.util.Scanner;

public class calculator {

    public static int toplama( int a, int b){
        return a+b;
    }
    public static int toplama( int a, int b, int c) {
        return a + b + c;
    }

    public static int cikartma( int a, int b){
        return a+b;
    }
    public static int cikartma( int a, int b, int c) {
        return a - b - c;
    }

    public static int bolme( int a, int b){
        return a/b;
    }

    public static int carpma( int a, int b){
        return a * b;
    }
    public static int carpma( int a, int b, int c) {
        return a * b * c;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen işlem seçiniz: ");
        String islemler = "1. toplama\n" + "2. çıkartma\n" + "3. çarpma\n" + "4. bölme\n" + "çıkış için q'ya basın";
        System.out.println("***********************");
        System.out.println(islemler);
        System.out.println("***********************");

        while (true){
            System.out.print("\nişlem seçiniz: ");
            String islemsec = scanner.nextLine();


            if(islemsec.equals("1")){
                System.out.print("kaç değer toplayacaksınız (2 veya 3): ");

                int kacsayi = scanner.nextInt();

                if (kacsayi == 2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("toplam: " + toplama(a, b));
                } else if (kacsayi == 3) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("toplam: " + toplama(a, b, c));


                }
            }

            else if (islemsec.equals("2")) {
                System.out.print("kaç değer çıkartacaksınız (2 veya 3): ");


                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("çıkartma sonucu: " + cikartma(a, b));
                } else if (kacsayi == 3) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("çıkartma sonucu: " + cikartma(a, b, c));
                }

            }

            else if(islemsec.equals("3")){
                System.out.print("kaç değer çarpacaksınız (2 veya 3): ");


                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("çıkartma sonucu: " + carpma(a, b));
                } else if (kacsayi == 3) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("çıkartma sonucu: " + carpma(a, b, c));
                }
            }

            else if(islemsec.equals("4")){



                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("çıkartma sonucu: " + bolme(a, b));

            }

            else if(islemsec.equals("q")){
                break;
            }


        }
    }
}
