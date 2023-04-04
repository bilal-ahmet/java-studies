public class Yonetici extends Calisan{
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("yöneticinin sorumlu olduğu kişi sayısı: " + sorumlu_kisi_sayisi);
    }

    public void zam_yap(int zamMiktari){
        System.out.println(getAd() + "çalışanlara " + zamMiktari + " tl zam yapıyor");
    }
}
