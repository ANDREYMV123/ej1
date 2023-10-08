/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Ruta {
    private int id;
    private String origen;
    private String destino;
    private List<Vuelo> vuelos;

    public Ruta(int id, String origen, String destino) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.vuelos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }
    
    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }
}