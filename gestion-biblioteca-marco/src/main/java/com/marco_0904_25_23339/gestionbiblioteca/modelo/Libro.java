/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marco_0904_25_23339.gestionbiblioteca.modelo;

/**
 *
 * @author umg
 */
public class Libro {
    private String titulo;
    private String autor;
    private int yearPublicacion;

    public Libro(String titulo, String autor, int yearPublicacion) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("El título no puede ser nulo ni vacío.");
        }
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("El autor no puede ser nulo ni vacío.");
        }
        if (yearPublicacion <= 0) {
            throw new IllegalArgumentException("El año de publicación debe ser mayor que 0.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.yearPublicacion = yearPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public boolean esAntiguo() {
        return yearPublicacion < 2000;
    }
}
