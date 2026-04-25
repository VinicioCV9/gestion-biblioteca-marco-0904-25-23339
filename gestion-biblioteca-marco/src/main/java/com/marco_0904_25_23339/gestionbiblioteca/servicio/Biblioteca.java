/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marco_0904_25_23339.gestionbiblioteca.servicio;

import com.marco_0904_25_23339.gestionbiblioteca.modelo.Libro;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author umg
 */
public class Biblioteca {
    
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libro == null) {
            throw new IllegalArgumentException("El libro no puede ser nulo.");
        }
        libros.add(libro);
    }

    public List<Libro> obtenerLibros() {
        return new ArrayList<>(libros);
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
