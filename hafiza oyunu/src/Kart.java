public class Kart {
    private char deger;
    private boolean tahmin = false;   // bütün kartların başlangıçta kapalı olması için false ile başlıadım.

    public Kart (char deger){
        this.setDeger(deger);

    }

    public char getDeger() {

        return deger;
    }

    public void setDeger(char deger) {

        this.deger = deger;
    }

    public boolean isTahmin() {

        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
}
