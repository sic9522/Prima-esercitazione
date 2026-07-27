public class Articolo {
    public String codiceArticolo;
    public String descrizione;
    public int prezzo;
    public int disponibili;

    public Articolo(String codiceArticolo, String descrizione, int prezzo, int disponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.disponibili = disponibili;

    }
    public void stampaArticolo () {
        System.out.println("Articolo con codice: " + codiceArticolo + "." + "Descrizione: " + " " + descrizione + "," + " al costo di: " + prezzo + " " + "con disponibilità di: " + " " + disponibili + " " + "pezzi");
    }
}
