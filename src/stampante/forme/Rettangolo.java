package stampante.forme;
import stampante.colore.Colore;

public class Rettangolo extends Forma{

    //attrubuti
    private double base;
    private double altezza;

    //costruttore
    public Rettangolo(double base, double altezza, Colore colore) {
        super(colore);
        this.base = base;
        this.altezza = altezza;
    }

    public Rettangolo(Rettangolo rettangolo){
        super(rettangolo.colore);
        this.base = rettangolo.base;
        this.altezza = rettangolo.altezza;
    }


    //metodi

    //inverte base e altezza
    public void switchVal(){
        double bubble;
        bubble = altezza;
        this.altezza = base;
        this.base = bubble;
    }
    //crea un quadrato utilizando la base o l'altezza del retangolo
    public Quadrato createQuadFromRect(Rettangolo rettangolo, boolean bol) {
        if (bol) return new Quadrato(rettangolo.altezza, this.colore);
        return new Quadrato(rettangolo.base, this.colore);
    }
    //crea un retangolo con base e altezza invertita
    public Rettangolo createRectSwitchFromRect(){
        Rettangolo rectTemp =new Rettangolo(this);
        rectTemp.switchVal();
        return rectTemp;
    }

    public double getArea(){
        return this.base * this.altezza;
    }
    public double getPerimetro(){
        return (this.base + this.altezza)*2;
    }

    //set e get
    public double getBase() {
        return base;
    }
    public double getAltezza() {
        return altezza;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

}
