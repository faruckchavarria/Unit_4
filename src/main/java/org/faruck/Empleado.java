package org.faruck;

public class Empleado {

    float calculaSalarioBruto(String Empleado, float ventasMes, float hExtras)
    {


        if(Empleado == "vendedor")
        {
            float salariomensual = 1000;
            float Salariototal = 0 ;
            float horas;
            float vendedor;

            if(ventasMes >= 1000)
            {
                Salariototal= salariomensual + 100;
            }
            if(ventasMes >= 1500)
            {
                Salariototal = salariomensual + 200;
            }

            horas = hExtras * 20;
            vendedor = Salariototal + horas;
            return vendedor;

        }
        else if(Empleado ==("Encargado"))
        {
            float salariomensual = 1500;
            float Salariototal = 0 ;
            float horas;
            float encargado;

            if(ventasMes < 1000)
            {

                horas = hExtras * 20;
                return salariomensual + horas;
            }
            if(ventasMes >= 1000)
            {
                Salariototal= salariomensual + 100;
            }
            if(ventasMes >= 1500)
            {
                Salariototal = salariomensual + 200;
            }


            horas = hExtras * 20;
            encargado = Salariototal + horas;
            return encargado;
        }

        return 0;
    }
    public double calcularsalarioNeto(float salariobruto)
    {


        if(salariobruto < 1000)
        {
            return salariobruto;
        }
        if(salariobruto >=1000 && salariobruto <1500)
        {
           return salariobruto - (salariobruto * 0.16);
        }
        if(salariobruto>1500)
        {
            return salariobruto - (salariobruto * 0.18);
        }

        return 0;
    }



}
