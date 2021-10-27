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
    }
}
