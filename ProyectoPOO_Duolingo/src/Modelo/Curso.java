/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author keilor
 */
public class Curso {
    private String Codigo;
    private String Idioma;
    private int Dificultad;
    private int Nivel;
    private Examen Examen;

    public Curso(String Codigo, String Idioma, int Dificultad, int Nivel) {
        this.Codigo = Codigo;
        this.Idioma = Idioma;
        this.Dificultad = Dificultad;
        this.Nivel = Nivel;
        
        
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public int getDificultad() {
        return Dificultad;
    }

    public void setDificultad(int Dificultad) {
        this.Dificultad = Dificultad;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public Examen getExamen() {
        return Examen;
    }

    public void setExamen(Examen Examen) {
        this.Examen = Examen;
    }
    
    
}
