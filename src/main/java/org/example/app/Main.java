package org.example.app;

import org.example.models.Direccion;
import org.example.models.Persona;
import org.example.models.Empleado;

public class Main {
    public static void main(String[] args) {

        /**
         * Aqui representamos la sistema principal
         * Ademas creamos y probamos los ibjetos de cada clase del models, como persona, empleado y direccion
         * Y finalmente verificamos su
         * +funcionamiento
         */

        Direccion dirPersona = new Direccion(
                "Santiago",
                "Irarrazaval",
                "Metropolitana",
                "Chile");

        Direccion dirPersona2 = new Direccion(
                "Santiago",
                "Manuel Montt",
                "Metropolitana",
                "Chile"
        );
        Direccion dirPersona3 = new Direccion(
                "Chicago",
                "Polk St",
                "Illinois",
                "United States"
        );

        /**
         * Creacion de las distintas areas de la empresa
         */

        Persona employee = new Persona("RRSS", dirPersona);
        Persona employee2 = new Persona("Gerencia", dirPersona2);
        Persona employee3 = new Persona("Presidencia", dirPersona3);


        Empleado persona = new Empleado(
                "Pedro",
                "Rodriguez",
                44,
                "20256358-1"
        );
        Empleado persona2 = new Empleado(
                "Carlos",
                "Arismendi",
                31,
                "26879541-0"
        );
        Empleado persona3 = new Empleado(
                "Daniela",
                "Klosee",
                47,
                "21369546-1"
        );
        Empleado persona4 = new Empleado(
                "Xavier",
                "Mackenni",
                53,
                "19123741-K"
        );

        /**
         * Imprimimos los datos recoletados e imprimimos en consola
         */
        employee.agregarEmpleado(persona);
        employee.agregarEmpleado(persona2);
        employee2.agregarEmpleado(persona3);
        employee3.agregarEmpleado(persona4);
        employee.listarEmpleados();
        employee2.listarEmpleados();
        employee3.listarEmpleados();


    }
}
