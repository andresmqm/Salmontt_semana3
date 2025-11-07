package org.example.models;

public class Direccion {


    /**
     * En esta clase representa la direccion exacta de cada empleado
     */



    private String ciudad;
    private String calle;
    private String region;
    private String pais;

    public Direccion(String ciudad, String calle, String region, String pais) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.region = region;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "ciudad='" + ciudad + '\'' +
                ", calle='" + calle + '\'' +
                ", region='" + region + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }



    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
}

