public class Calisan {
    private String ad;
    private String soyad;
    private int id;


    public Calisan(String ad, String soyad, int id){
        this.setAd(ad);
        this.setSoyad(soyad);
        this.setId(id);
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void bilgilerigoster(){
        System.out.println("çalışan bilgileri...");
        System.out.println("ad: " + ad);
        System.out.println("soyad: " + soyad);
        System.out.println("id: " + id);
    }
}



