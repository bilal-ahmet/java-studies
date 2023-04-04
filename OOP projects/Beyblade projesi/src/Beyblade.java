public class Beyblade {

    private String beybaldeci;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybaldeci, int donusHizi, int saldiriGucu) {
        this.beybaldeci = beybaldeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }


    public void saldir () {
        System.out.println(beybaldeci + " " + saldiriGucu + " ve" + donusHizi + " ile saldırıyor");
    }

    public void KutsalCanavarOrtayaCikar() {
        System.out.println("bu beyblade'in kutsal canavarı bulunmuyor");
    }

    public void BilgileriGoster() {
        System.out.println("beybladeci ismi: " + beybaldeci);
        System.out.println("Saldırı gücü: " + saldiriGucu);
        System.out.println("Dönüş hızı: " + donusHizi);
    }



    public String getBeybaldeci() {
        return beybaldeci;
    }

    public void setBeybaldeci(String beybaldeci) {
        this.beybaldeci = beybaldeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        saldiriGucu = saldiriGucu;
    }
}
