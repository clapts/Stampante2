package stampante.forme;
import stampante.colore.Colore;

public class Quadrato extends Forma{

    //attributo
    private double lato;

    //costruttori
    public Quadrato(double lato, Colore colore) {
        super(colore);
        this.lato = lato;
    }
    public Quadrato(){
        super(null);
        this.lato = 0;
    }

    //creo quadrato da base o altezza
    public Quadrato(Rettangolo rettangolo, boolean bol) {
        super(rettangolo.getColore());
        if (bol) this.lato = rettangolo.getAltezza();
        this.lato = rettangolo.getBase();
    }
    //metodi
    public double getArea(){
        return this.lato * this.lato;
    }
    public double getPerimetro(){
        return this.lato * 4;
    }
    public double getDiagonal(){
        return this.lato / Math.sqrt(2);
    }
    //crea un cerchio iscritto nel quadrato
    public Cerchio getCerchioInscritto(){
        return new Cerchio(lato/2, this.colore);
    }

    //crea un cerchio circoscritto nel quadrato
    public Cerchio getCerchioCircoscritto(){
        return new Cerchio(getDiagonal()/2, this.colore);
    }

    //get e set
    public double getLato() {
        return lato;
    }
    public void setLato(double lato) {
        this.lato = lato;
    }
}
