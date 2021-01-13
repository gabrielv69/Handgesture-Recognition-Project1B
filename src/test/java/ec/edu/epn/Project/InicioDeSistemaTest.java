package ec.edu.epn.Project;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class InicioDeSistemaTest {
    @Test
    public void get_comandos_when_permiso_then_ok(){
        InicioDeSistema i = Mockito.mock(InicioDeSistema.class);
        Mockito.when(i.permiso(1)).thenReturn(true);
        assertEquals(true,i.permiso(1));
    }
    @Test
    public void get_comandos_when_inicio_then_ok(){
        InicioDeSistema i = Mockito.mock(InicioDeSistema.class);
        Mockito.when(i.SistemaIniciado(true)).thenReturn("G");
        assertEquals("G",i.SistemaIniciado(true));
    }



}