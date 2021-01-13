package ec.edu.epn.Project;

import java.util.Arrays;
public class NeuronalRed {
    private final String[] CATEGORIAS  = {"A","B", "C", "D", "E", "F", "G","H", "I" ,"J"} ;
    private int kernel;
    public int EntrenarModelo() {
        System.out.println("Cargando Datos para el entrenamiento.......");
        System.out.println("Entrenando Modelo.........................");
        System.out.println("Modelo Entrenado");
        System.out.println("Modelo Guardado");
        return 1;
    }
    public int TestearModelo(int banderatrain) {
        int a= 0;
        if (banderatrain==1) {
            System.out.println("Cargando Datos para la Prueba.......");
            System.out.println("Ecargando Modelo.........................");
            System.out.println("Modelo Cargado");
            System.out.println("Modelo Testeado");
            a = 1;
        }else{
            a=0;
        }
        return a;
    }

    public int crearKernel() {
        return 9;
    }

    public int [] convertirToArray(Image imagen ){
        System.out.println("Convirtiendo a Arreglo...");
        int frame [] = (int[]) imagen.getValores();
        return frame;
    }

    public int mostrarArreglo(double arreglo []){
        System.out.println("Datos Normalizados =" + Arrays.toString(arreglo));
        return 1;
    }

    public double [] normalizar(int frame[]){
        double[] dataNormalizada = new double[10];
        for (int i = 0; i < 10; i++) {
            dataNormalizada[i] = (double) frame[i]/255;
        }
        return dataNormalizada;
    }


    public double sumaValoresDatos(double frame []){
        double suma = 0 ;

        for (int i = 0; i < 10; i++) {
            suma+= frame[i];

        }
        System.out.println("La suma es "+ suma);
        return suma;
    }

    public String determinarGesto(double suma, int banderatest){
        String predic = null;
        if (banderatest==1){
            System.out.println("Determinando Gesto...");
            int prediccion = (int) Math.floor(suma);
            System.out.println("El gesto es: " + CATEGORIAS[prediccion] );
            predic= CATEGORIAS[prediccion];
        }else{
            System.out.println("No se pudo predecir");
            predic= "Null";
        }
        return predic;
    }

}
