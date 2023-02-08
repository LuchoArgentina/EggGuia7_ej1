/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Libro {
        
        private String isbn;
        private String titulo;
        private String autor;
        private int paginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    
    public  Libro ingresarLibro(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        
        System.out.println("Ingrese el isbn: ");
        isbn = leer.next();
        
        System.out.println("Ingrese el titulo: ");
        titulo = leer.next();
        
        System.out.println("Ingrese el autor: ");
        autor = leer.next();
        
        System.out.println("Ingrese el la cantidad de paginas: ");
        paginas = leer.nextInt();
        
        Libro L1= new Libro(isbn, titulo, autor, paginas);
        
        return L1;
    }
    
    
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }

        
        
    
    
}
