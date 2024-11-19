package stampante.immagini;

public interface Stampabile {

    void stampa();
    double getInkRed();
    double getInkGreen();
    double getInkBlue();
    double[] getAllInk();
}
