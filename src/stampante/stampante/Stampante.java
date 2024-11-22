package stampante.stampante;

import stampante.immagini.Stampabile;
import stampante.stampante.cartucca.exception.EndInkException;
import stampante.stampante.cartucca.*;

public class Stampante {
    private CartucciaBlue blue;
    private CartucciaGreen green;
    private CartucciaRed red;

    public Stampante() {
        this.blue = new CartucciaBlue();
        this.green = new CartucciaGreen();
        this.red = new CartucciaRed();
    }

    public int stampa(Stampabile img){
        try {
            blue.utilizo(img.getInkBlue());
            green.utilizo(img.getInkGreen());
            red.utilizo(img.getInkRed());
        }catch (EndInkException e){
            System.out.println(e.getMessage()+ "per utilizare ricaricare");
            return 0;
        }
        img.stampa();
        return 1;
    }

    public void ricaricaAll(){
        blue.ricarica();
        green.ricarica();
        red.ricarica();
    }

    //TODO ricariche singole cartucce
    //TODO visualizazione livello ink rimanente
}
