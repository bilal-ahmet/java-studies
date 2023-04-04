public class Dragon extends Beyblade{

    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybaldeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybaldeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void KutsalCanavarOrtayaCikar() {

        System.out.println(getBeybaldeci() + " " + kutsalCanavar + " ortaya çıkarıyor");
        System.out.println(getBeybaldeci() + "'nin saldırısı: hayalet kasırgası");
    }

    @Override
    public void BilgileriGoster() {
        System.out.println("kutsal canavar ismi: " + kutsalCanavar);
        System.out.println("gizli yetenek ismi: " + gizliYetenek);
    }
}
