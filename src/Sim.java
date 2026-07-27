public class Sim {
    //attributi
    public long numeroTelefono;
    public int creditoDisponibile;
    public Chiamata ultimaChiamataEffettuata;

    //metodi
    public Sim (long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        creditoDisponibile = 0;
        ultimaChiamataEffettuata = null;
    }

    public void registraChiamata(Chiamata chiamata) {
        ultimaChiamataEffettuata = chiamata;
    }

    public void stampaDati() {
        System.out.println("Il numero di telefono è: " + numeroTelefono + " " + "e il credito è: " + creditoDisponibile);
        if (ultimaChiamataEffettuata != null) {
            System.out.println("L'ultima chiamata ricevuta è: " + ultimaChiamataEffettuata.numeroChiamato + " " + "ed è durata: " + ultimaChiamataEffettuata.durataMinuti + "min");
        } else {
            System.out.println("Nessuna chiamata registrata");
        }
    }
}
