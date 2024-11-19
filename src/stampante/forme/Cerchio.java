package stampante.forme;
import stampante.colore.Colore;

public class Cerchio extends Forma{
    //attiributi
    private double raggio;


    //costruttori
    public Cerchio(double raggio, Colore colore) {
        super(colore);
        this.raggio = raggio;
    }

    //metodi
    public double getArea(){
        return Math.pow(raggio, 2) *Math.PI;
    }
    public double getPerimetro(){
        return 2*Math.PI*raggio;
    }
    //crea un quadrato inscrito nel cerchio
    public Quadrato getQuadInscritto(){
        return new Quadrato(raggio*Math.sqrt(2), this.colore);
    }
    //crea un quadrato circoscritto al cerchio
    public Quadrato getQuadCircoscritto(){
        return new Quadrato(raggio*2, this.colore);
    }

    //get e set
    public double getRaggio() {
        return raggio;
    }
    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }
}
