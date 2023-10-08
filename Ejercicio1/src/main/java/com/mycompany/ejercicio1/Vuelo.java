/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author andre
 */

public class Vuelo {
    private int id;
    private String fecha;
    private EstadoVuelo estado;

    public Vuelo(int id, String fecha, EstadoVuelo estado) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public EstadoVuelo getEstado() {
        return estado;
    }
}