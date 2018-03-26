/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author student
 */
//Zadanie 2
public class Ksiazka {

    private String tytuł;
    private String autor;
    private int liczba;
    private int strony;
    private int rok_wydania;
    private double cena;

    public Ksiazka(String tytuł, String autor, int strony, int rok_wydania, double cena) {
        this.tytuł = tytuł;
        this.autor = autor;
        this.strony = strony;
        this.rok_wydania = rok_wydania;
        this.cena = cena;
    }

    public String getTytuł() {
        return tytuł;
    }

    public String getAutor() {
        return autor;
    }

    public int getStrony() {
        return strony;
    }

    public int getRok_wydania() {
        return rok_wydania;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
