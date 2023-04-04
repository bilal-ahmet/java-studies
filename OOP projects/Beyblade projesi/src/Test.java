// polymorphizm kullnarak beyblade programı

import jdk.internal.dynalink.beans.BeansLinker;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("beyblade programına hoş geldiniz...");
        System.out.println("çıkış için q'ya basın");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("hangi beyblade'i üretmek istiyorsunuz");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("programdan çıkılıyor...");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beyblade_uret(islem);

                if(beyblade == null){
                    System.out.println("lütfen geçerli bir beyblade ismi giriniz");
                }
                else{
                    beyblade.BilgileriGoster();
                    beyblade.saldir();
                    beyblade.KutsalCanavarOrtayaCikar();
                }
            }

        }
    }
}
