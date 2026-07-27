public class Carello {
    public String nomeProdottoCarello;
    public int prezzo;
    public int quantita;

    public Carello (String nomeProdottoCarello, int prezzo, int quantita) {
        this.nomeProdottoCarello = nomeProdottoCarello;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public int calcolaTotale() {
        return prezzo * quantita;
    }
}
