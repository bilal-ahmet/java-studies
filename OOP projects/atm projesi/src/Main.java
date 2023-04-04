public class Main {
    public static void main(String[] args){

        ATM atm = new ATM();

        Hesap hesap = new Hesap("bilal ahmet akpınar", "12345", 2000);
        atm.calis(hesap);
        System.out.println("programdan çıkılıyor.");



    }

}
