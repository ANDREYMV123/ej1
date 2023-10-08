/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // Crear una lista de rutas
        List<Ruta> rutas = new ArrayList<>();

        while (true) {
            // Menú principal
            String[] opciones = {"Crear Ruta", "Agregar Vuelo", "Eliminar Vuelo", "Buscar Vuelo por ID", "Buscar Vuelos Retrasados", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Gestión de Rutas de Vuelo", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    // Crear una nueva ruta
                    crearRuta(rutas);
                    break;
                case 1:
                    // Agregar un vuelo a una ruta
                    agregarVuelo(rutas);
                    break;
                case 2:
                    // Eliminar un vuelo de una ruta
                    eliminarVuelo(rutas);
                    break;
                case 3:
                    // Buscar un vuelo por ID
                    buscarVueloPorId(rutas);
                    break;
                case 4:
                    // Buscar vuelos retrasados en una ruta
                    buscarVuelosRetrasados(rutas);
                    break;
                case 5:
                    // Salir del programa
                    System.exit(0);
            }
        }
    }
}