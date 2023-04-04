public class BeybladeFabrikasi {
    public Beyblade beyblade_uret(String beyblade_turu){

        if(beyblade_turu.equals("Dragon")){
            return new Dragon("takao", 800, 300, "mavi ejderha", "kutsal canavarla konuşma");
        }
        else if(beyblade_turu.equals("Dranza")){
            return new Dranza("kai", 600, 400, "kırmızı anka kuşu");
        }
        else if(beyblade_turu.equals("Drayga")) {
            return new Dranza("rei", 800, 250, "beyaz kaplan");
        }
        else if(beyblade_turu.equals("Draciel")) {
            return new Dranza("max", 300, 1000, "kara kaplumbağa");
        }
        else{
            return null;
        }
    }
}
