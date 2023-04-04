
public class çarpım_tablosu {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            System.out.println("***********************");
            for(int j = 1; j <= 10; j++){

                System.out.println(i + " x " + j + "=" + (i*j));
            }
            System.out.println("***********************");
        }


        // iç içe for döngüsü kullanarak yapıldı. içeride kalan for döngüsü tamamlanınca dışardaki 2. aşamaya geçiyor.


    }
}
