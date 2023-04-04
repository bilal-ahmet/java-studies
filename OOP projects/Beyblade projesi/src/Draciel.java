public class Draciel extends Beyblade{
    private String kutsalCanavar;

    public Draciel(String beybaldeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybaldeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void KutsalCanavarOrtayaCikar() {

        System.out.println(getBeybaldeci() + " " + kutsalCanavar + " ortaya çıkarıyor");
        System.out.println(getBeybaldeci() + "'nin saldırısı: Kale savunması");
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();

        System.out.println("kutsal canavar ismi: " + kutsalCanavar);
    }
}
