package ec.edu.epn.Project;

public class DeteccionExecute {
    public static void main (String[] args){
        System.out.println("Inicio de Sistema - Ejecucion");
        //Obtenemos la imagen desde la cámara
        Image imagen = new Image();
        //Mostramos los valores de la imagen capturada
        System.out.println(imagen.toString());
        imagen.convertirABlancoYNegro();
        System.out.println(imagen.toString());
        //Iniciamos la Red Neuronal con la que se va a trabajar
        NeuronalRed red = new NeuronalRed();
        //Creamos un kernel de procesamiento de imagenes
        int kernel = red.crearKernel();
        //Realizamos el procesamiento de imagen
        imagen.quitarRuidoInterno(kernel);
        imagen.quitarRuidoExterno(kernel);
        imagen.aplicarThreshold(1);
        imagen.aplicarBlur(1);
        //Definimos ancho y largo con el que se va a trabajar para la predicción
        int largo=50;
        int ancho=50;
        imagen.redimensionar(largo,ancho);
        System.out.println(imagen.toString());
        int datosImagen [] = red.convertirToArray(imagen);
        double datosNormalizados [] = red.normalizar(datosImagen);
        red.mostrarArreglo(datosNormalizados);
        System.out.println("Realizando Deteccion");
         red.determinarGesto(red.sumaValoresDatos(datosNormalizados),1);
    }
}
