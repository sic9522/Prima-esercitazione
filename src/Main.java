public class Main {
    public static void main(String[] args) {
        //esercizio 1
        Rettangolo r1 = new Rettangolo(15, 20);
        Rettangolo r2 = new Rettangolo(30, 13);

        //stampa
        System.out.println("Il perimetro del primo rettangolo è: " + r1.calcolaPerimetro());
        System.out.println("Il perimetro del secondo rettangolo è: " + r2.calcolaPerimetro());
        System.out.println("Il area del primo rettangolo è: " + r1.calcolaArea());
        System.out.println("Il area del secondo rettangolo è: " + r2.calcolaArea());


        r1.confrontaCon(r2);

        //esercizio 2
        Sim simoneSim = new Sim(3519592260L);

        //stampa
        simoneSim.registraChiamata(simoneSim.ultimaChiamataEffettuata);

        simoneSim.stampaDati();

        //stampa 2
        Chiamata chiamata = new Chiamata();
        chiamata.durataMinuti = 10;
        chiamata.numeroChiamato = 3396723133L;
        simoneSim.registraChiamata(chiamata);

        simoneSim.stampaDati();

    }
}
