/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marco_0904_25_23339.gestionbiblioteca.app;

import com.marco_0904_25_23339.gestionbiblioteca.modelo.Libro;
import com.marco_0904_25_23339.gestionbiblioteca.servicio.Biblioteca;

/**
 *
 * @author umg
 */
public class Main {
      public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 1967));
        biblioteca.agregarLibro(new Libro("El Principito", "Antoine de Saint-Exupery", 1943));
        biblioteca.agregarLibro(new Libro("Clean Code", "Robert C. Martin", 2008));

      
        try {
            biblioteca.agregarLibro(new Libro("", "", -1));
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar libro invalido: " + e.getMessage());
        }

     
        System.out.println("\n=== Libros en la Biblioteca ===");
        for (Libro libro : biblioteca.obtenerLibros()) {
            System.out.println("Titulo: " + libro.getTitulo()
                    + " | Autor: " + libro.getAutor()
                    + " | Año: " + libro.getYearPublicacion()
                    + " | ¿Antiguo?: " + (libro.esAntiguo() ? "Si" : "No"));
        }

        
        String tituloBusqueda = "Clean Code";
        System.out.println("\n=== Búsqueda: \"" + tituloBusqueda + "\" ===");
        Libro encontrado = biblioteca.buscarPorTitulo(tituloBusqueda);
        if (encontrado != null) {
            System.out.println("Libro encontrado: " + encontrado.getTitulo()
                    + " de " + encontrado.getAutor()
                    + " (" + encontrado.getYearPublicacion() + ")");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}
