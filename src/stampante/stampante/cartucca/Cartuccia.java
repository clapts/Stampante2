package stampante.stampante.cartucca;

import stampante.stampante.cartucca.exception.EndInkException;

public abstract class Cartuccia {

    protected double valor;

    public Cartuccia() {
        valor = 0;
    }

    public boolean ricarica(){
        valor=10000;
        return true;
    }

    public abstract void utilizo(double quantita) throws EndInkException;
}
