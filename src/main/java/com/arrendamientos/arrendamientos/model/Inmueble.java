package com.arrendamientos.arrendamientos.model;

public class Inmueble {
    private int idInmueble;
    private String tipo;
    private String descripcion;
    private double area;
    private double precio;
    private String direccion;
    private int habitaciones;
    private int banos;
    private String fotoURL;

    public Inmueble() {
    }

    public Inmueble(String tipo, String descripcion, double area, double precio, String direccion, int habitaciones, int banos, String fotoURL) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.area = area;
        this.precio = precio;
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.fotoURL = fotoURL;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public String getFotoURL() {
        return fotoURL;
    }

    public void setFotoURL(String fotoURL) {
        this.fotoURL = fotoURL;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "idInmueble=" + idInmueble +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", area=" + area +
                ", precio=" + precio +
                ", direccion='" + direccion + '\'' +
                ", habitaciones=" + habitaciones +
                ", banos=" + banos +
                ", fotoURL='" + fotoURL + '\'' +
                '}';
    }
}
