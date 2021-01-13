package ec.edu.epn.Project;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImageTest {
    private Image image;

    @Before
    public void  setUpImage() {
        System.out.println("Creación de Objeto Imagen");
        image= new Image();
    }

    @Test
    public void applied_quitarRuidoInterno_then_ok(){
        assertEquals(9,image.quitarRuidoInterno(9));
    }



    @Test
    public void applied_quitarRuidoExterno_then_ok(){
        assertEquals(9,image.quitarRuidoExterno(9));
    }

    @Test
    public void applied_aplicarBlur_then_ok(){
        assertEquals(1,image.aplicarBlur(1));
    }

    @Test
    public void applied_aplicarThreshold_then_ok(){

        assertEquals(1,image.aplicarThreshold(1));
    }

}