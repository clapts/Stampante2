import stampante.immagini.ImgRaster;
import stampante.stampante.Stampante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stampante stampante = new Stampante();

        ImgRaster r=new ImgRaster(10,10);

        stampante.stampa(r);

        stampante.ricaricaAll();

        stampante.stampa(r);
    }
}