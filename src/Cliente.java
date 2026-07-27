public class Cliente {
    public int codiceCliente;
    public String nomeCognome;
    public String email;
    public String dataIscrizione;

    public Cliente (int codiceCliente, String nomeCognome, String email, String dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public void stampaCliente() {
        System.out.println("Cliente con id: " + codiceCliente + " " + "con nome: " + nomeCognome + "," + email + " " + "iscritto il: " + dataIscrizione);
    }
}
