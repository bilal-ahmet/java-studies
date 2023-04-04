public class yazilimci extends Calisan {

    private String diller;

    public yazilimci(String ad, String soyad, int id, String diller) {
                                // Calisan classı private olduğu için yeni contructor yazdık.
        super(ad, soyad, id);
        this.diller = diller;
    }

    public void formatAt(String isletim_sistemi){
        System.out.println(getAd() + " " + isletim_sistemi + "işletim sistemini yüklüyor.");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("yazılımcının bildiği diller: " + diller);
    }
}
