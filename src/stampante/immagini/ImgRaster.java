package stampante.immagini;
import stampante.colore.*;
import stampante.forme.Forma;

public class ImgRaster implements Stampabile {


    private Colore[][] pixMatrix;

    public ImgRaster(int a, int b){
        pixMatrix = new Colore[a][b];

        //just for testing
        randPix();
    }

    @Override
    public void stampa() {
        double r=getInkRed();
        double g=getInkGreen();
        double b=getInkBlue();
        double tot=r+g+b;

        r=r/tot*100;
        g=g/tot*100;
        b=b/tot*100;

        System.out.println("img raster");
        System.out.println("R:" +r+" G:" +g+" B:" +b);

    }

    @Override
    public double getInkRed() {
        double ink=0;
        for (Colore[] matrix : pixMatrix) {
            for (Colore colore : matrix) {
                ink += (double) colore.getRed() / 255;
            }
        }
        return ink;
    }

    @Override
    public double getInkGreen() {
        double ink=0;
        for (Colore[] matrix : pixMatrix) {
            for (Colore colore : matrix) {
                ink += (double) colore.getGreen() / 255;
            }
        }
        return ink;
    }

    @Override
    public double getInkBlue() {
        double ink=0;
        for (Colore[] matrix : pixMatrix) {
            for (Colore colore : matrix) {
                ink += (double) colore.getBlue() / 255;
            }
        }
        return ink;
    }

    @Override
    public double[] getAllInk() {
        double[] ink= new double[3];
        ink[0] = getInkRed();
        ink[1] = getInkGreen();
        ink[2] = getInkBlue();
        return ink;
    }

    //TESTING
    private void randPix(){
        for(int i=0; i<pixMatrix.length; i++){
            for(int j=0; j<pixMatrix[i].length; j++){
                pixMatrix[i][j]=new Colore((byte) (255*Math.random()), (byte) (255*Math.random()), (byte) (255*Math.random()));
            }
        }
    }

}
