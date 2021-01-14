package ec.edu.epn.Project;

import java.util.Arrays;

public class Image {
    private int [] valores = new int [10];
    private int ancho;
    private int largo;
    private int color;
    private int ruidointerno;
    private int ruidoexterno;
    private int blur;
    private int threshold;

    public Image() {
        this.ancho = 500;
        this.largo = 500;
        this.color = 1;
        this.ruidointerno = 1;
        this.ruidoexterno = 1;
        this.blur =0;
        this.threshold = 0;
        for (int i = 0; i < 10; i++) {
            this.valores[i]=(int) (Math.random()*256);
        }

    }

    @Override
    public String toString() {
        return "Imagen{" + "valores=" + Arrays.toString(valores) + ", ancho=" + ancho + ", largo=" + largo + ", color=" + color + '}';
    }

    public void redimensionar(int ancho, int largo){
        this.ancho=ancho;
        this.largo=largo;
    }


    public int getAncho() {
        return ancho;
    }

    public int setAncho(int ancho) {
        this.ancho = ancho;
        return ancho;
    }

    public int getLargo() {
        return largo;
    }

    public int setLargo(int largo) {
        this.largo = largo;
        return largo;
    }

    public int getColor() {
        return color;
    }

    public void convertirABlancoYNegro() {
        this.color = 0;
    }


    public int quitarRuidoInterno(int kernel) {
        System.out.println("Eliminando Ruido Interno...");
        this.ruidointerno = kernel;
        return kernel;
    }


    public int quitarRuidoExterno(int kernel) {
        System.out.println("Eliminando Ruido Externo...");
        this.ruidoexterno = kernel;
        return kernel;
    }



    public int aplicarBlur(int bandera) {
        int r=0;
        if (bandera==1) {
            System.out.println("Aplicando Blur...");
            this.blur = 1;
            r=1;
        }else{
            r=0;
        }
        return r;
    }


    public int aplicarThreshold(int bandera) {
        int S=0;
        if (bandera==1) {
            System.out.println("Aplicando Threshold...");
            this.threshold = 1;
            S=1;
        }
        return S;
    }

    public int[] getValores() {
        return valores;
    }

    public void setValores(int[] valores) {
        this.valores = valores;
    }
}
