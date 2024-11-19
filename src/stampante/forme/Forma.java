package stampante.forme;
import stampante.colore.Colore;

public abstract class Forma {
    protected Colore colore;

    public Forma(Colore colore) {
        this.colore = colore;
    }

    public Colore getColore() {
        return colore;
    }
    public void setColore(Colore colore) {
        this.colore = colore;
    }


    public double getColAreRed(){
        return colore.getRed()/255*getArea();
    }
    public double getColAreBlue(){
        return colore.getBlue()/255*getArea();
    }
    public double getColAreGrean(){
        return colore.getGreen()/255*getArea();
    }

    public abstract double getArea();
    public abstract double getPerimetro();

    public boolean equalsColor(Colore colore) {
        return this.colore.equals(colore);
    }
}