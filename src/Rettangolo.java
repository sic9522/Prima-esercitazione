
public class Rettangolo {
    //attributi
    public int h;
    public int b;
;
    //metodi
    public Rettangolo (int h, int b) {
        this.h = h;
        this.b = b;
    }

    public int calcolaPerimetro() {
        return 2 * (h + b);
    }

    public int calcolaArea() {
        return h * b;
    }

    public void confrontaCon(Rettangolo r2) {
        System.out.println("La somma dei perimetri è: " + (r2.calcolaPerimetro() + this.calcolaPerimetro()));
        System.out.println("L'area dei rettangoli è: " + (r2.calcolaArea() + this.calcolaArea()));
    }
}
