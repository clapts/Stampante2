package stampante.stampante.cartucca;

import stampante.stampante.cartucca.exception.EndInkException;

public class CartucciaBlue extends Cartuccia{

    public CartucciaBlue() {
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
