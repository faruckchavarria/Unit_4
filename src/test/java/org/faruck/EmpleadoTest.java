package org.faruck;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest

{
    @Test
    public void probarempleado()
    {
        Empleado ar = new Empleado();
        Assert.assertEquals(1360.0, ar.calculaSalarioBruto("vendedor", 2000,8), 0.001);
        Assert.assertEquals(1260.0, ar.calculaSalarioBruto("vendedor", 1500,3), 0.001);
        Assert.assertEquals(1100.0, ar.calculaSalarioBruto("vendedor",(float) 1499.99f,0), 0.001);
    }

    @Test
    public void probarEncargado()
    {
        Empleado rm = new Empleado();
        Assert.assertEquals(1760.0, rm.calculaSalarioBruto("Encargado", 1250,8), 0.001);
    }
}
