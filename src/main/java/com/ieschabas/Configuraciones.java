package com.ieschabas;

import java.lang.module.Configuration;
import java.util.Objects;

public class Configuraciones implements Comparable<Configuraciones>{
        private String descripcion;
        private int codigo;

    public Configuraciones() {
    }

    public Configuraciones(String descripcion, int codigo) {
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Configuraciones coleccion = (Configuraciones) o;
        return codigo == coleccion.codigo && Objects.equals(descripcion, coleccion.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, codigo);
    }

    @Override
    public String toString() {
        return "Configuraciones{" +
                "descripcion='" + descripcion + '\'' +
                ", codigo=" + codigo +
                '}';
    }

    @Override
    public int compareTo(Configuration o) {
        return Integer.compare(this.codigo,o.codigo);
    }
}
