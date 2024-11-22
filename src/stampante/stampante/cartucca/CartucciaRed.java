package stampante.stampante.cartucca;

import stampante.stampante.cartucca.exception.EndInkException;

public class CartucciaRed extends Cartuccia{

    public CartucciaRed() {
        super();
    }

    @Override
    public void utilizo(double quantita) throws EndInkException {
        if(quantita>valor){
            throw new EndInkException("");
        }
        valor-=quantita;
    }
}
