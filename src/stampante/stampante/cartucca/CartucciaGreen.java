package stampante.stampante.cartucca;

import stampante.stampante.cartucca.exception.EndInkException;

public class CartucciaGreen extends Cartuccia {

    public CartucciaGreen() {
        super();
    }

    @Override
    public void utilizo(double quantita) throws EndInkException {
        if(quantita>valor){
            throw new EndInkException("L'inchiostro verde e terminato");
        }
        valor-=quantita;
    }

}
