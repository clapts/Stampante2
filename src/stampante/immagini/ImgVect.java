package stampante.immagini;
import stampante.forme.*;
import stampante.colore.Colore;
import java.util.ArrayList;

public class  ImgVect implements Stampabile{

    private ArrayList<Forma> forme;
    private int contForme;
    private Forma lastForma;

    public ImgVect() {
        this.forme = new ArrayList<Forma>();
        contForme = 0;
    }

    public void addForme(Forma forma) {
            this.forme.add(forma);
            contForme++;
    }

    public double totArea(){
        double total = 0;
        for (int i = 0; i < contForme; i++) {
            total += forme.get(i).getArea();
        }
        return total;
    }

    public double totArea(Colore colore){
        double total = 0;
        for (int i = 0; i < contForme; i++) {
            if(this.forme.get(i).equalsColor(colore)){
                total += forme.get(i).getArea();
            }
        }
        return total;
    }

    public double[] getAllInk(){
        double[] ink= new double[3];
        for (Forma forma : forme) {
            ink[0] += forma.getColAreRed();
            ink[1] += forma.getColAreGrean();
            ink[2] += forma.getColAreBlue();
        }
        return ink;
    }

    public double getInkRed(){
        double ink=0;
        for (Forma forma : forme) {
            ink += forma.getColAreRed();
        }
        return ink;
    }

    public double getInkGreen(){
        double ink=0;
        for (Forma forma : forme) {
            ink += forma.getColAreGrean();
        }
        return ink;
    }

    public double getInkBlue(){
        double ink=0;
        for (Forma forma : forme) {
            ink += forma.getColAreBlue();
        }
        return ink;
    }

    @Override
    public void stampa() {
        System.out.println("imgVect");
        for(Forma forma : forme){
            System.out.println("R: "+forma.getColAreRed()+" G: "+forma.getColAreGrean()+ " B: "+forma.getColAreBlue());
        }
    }
}
