package ec.edu.epn.Project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NeuronalRedTest {

    private NeuronalRed neuronalRed;

    @Before
    public void SetUpNeuronalRed() {
        System.out.println("Set up Red Neuronal");
        neuronalRed = new NeuronalRed();
    }

    @Test
    public void Trained_model_when_system_on_then_ok (){
        assertEquals(1, neuronalRed.EntrenarModelo());
    }



    @Test
    public void Tested_model_when_system_on_then_ok (){
        assertEquals(1, neuronalRed.TestearModelo(1));
    }


    @Test
    public void Created_model_when_system_on_then_ok  (){
        assertEquals(9, neuronalRed.crearKernel());
    }


    @Test
    public void Detected_gesture_when_system_on_then_ok (){
        assertEquals("G", neuronalRed.determinarGesto(6.25,1));
    }
}