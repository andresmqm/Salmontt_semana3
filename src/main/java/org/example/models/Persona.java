package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    /**
     * En esta clase podemos observar en que parte de la empresa se encuentra ubicada la persoma
     * Contiene ademas un nombre, una direccion y una lista de empleado
     */

    private String nombre;
    private Direccion direccion;
    private List<Empleado> empleados = new ArrayList<Empleado>();


    public Persona(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }

    public void listarEmpleados(){
        System.out.println("Area: "+ nombre+ " " + direccion +" ");

        for(Empleado e : empleados){
            System.out.println(" - " + e.getDescripcion());

        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }


    // no coloque el metodo "set" ya que en la parte de arriba utilizo agregarEmpleados y ListarEmpleados que es una manera mas segura...



    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                ", empleados=" + empleados +
                '}';
    }
}



