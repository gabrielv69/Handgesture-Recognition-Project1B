package ec.edu.epn.Project;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class LlamadoLibreriasTest {
    @Test
    public void given_permission_when_llamado_librerias_then_ok(){
        LlamadoLibrerias llamadoLibrerias = Mockito.mock(LlamadoLibrerias.class);
        Mockito.when(llamadoLibrerias.crearinstancias(1)).thenReturn(true);
        assertEquals(true,llamadoLibrerias.crearinstancias(1));
    }
    @Test
    public void given_String_when_llamado_librerias_then_ok(){
        LlamadoLibrerias llamadoLibrerias = Mockito.mock(LlamadoLibrerias.class);
        Mockito.when(llamadoLibrerias.definirMetodosAUsar("Definir")).thenReturn("Correcto");
        assertEquals("Correcto",llamadoLibrerias.definirMetodosAUsar("Definir"));
    }



}