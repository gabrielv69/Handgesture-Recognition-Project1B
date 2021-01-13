package ec.edu.epn.Project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class ImageParametersTest {
    private int ancho;
    private int largo;
    private int expected ;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List <Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{50, 50, 50});
        objects.add(new Object[]{50, 45, 500});
        objects.add(new Object[]{500, 300, 50});
        return objects;
    }

    public ImageParametersTest(int ancho, int largo, int expected) {
        this.ancho = ancho;
        this.largo = largo;
        this.expected = expected;
    }

    @Test
    public void give_int_when_changeancho_then_ok (){
        Image i = new Image();
        int actual= i.setAncho(ancho);
        assertEquals(expected, actual);
    }

    @Test
    public void give_int_when_changelargo_then_ok (){
        Image i = new Image();
        int actual= i.setLargo(largo);
        assertEquals(expected, actual);
    }

}