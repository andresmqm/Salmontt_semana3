package org.example.models;

public class Empleado {

    /**
     * En esta clase representa los datos personales de cada empleado de la empresa
     */

    private String nombre;
    private String apellido;
    private int edad;
    private String numero;

    public Empleado(String nombre, String apellido, int edad, String numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        if (numero != null && numero.matches("\\d{7,8}-[\\dkK]")) {
            this.numero = numero;
        } else {
            this.numero = "RUT inválido";
        }
    }

    public String getDescripcion() {
        return " Nombre: " + nombre + " " + apellido + ", " + edad + " años, " + " Rut: " + numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return numero;
    }

    public void setRut(String rut) {
        this.numero = numero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", rut=" + numero +
                '}';
    }
}
