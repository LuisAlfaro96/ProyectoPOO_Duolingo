/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author keilor
 */
public class Leccion {

    private String Nombre;
    private ArrayList<Object> listaEjercicios;

    public Leccion(String Nombre, ArrayList<Object> listaEjercicios) {
        this.Nombre = Nombre;
        this.listaEjercicios = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Object> getListaEjercicios() {
        return listaEjercicios;
    }

    public void setListaEjercicios(ArrayList<Object> listaEjercicios) {
        this.listaEjercicios = listaEjercicios;
    }

    public void agregarEjercicio(Object e) {
        this.listaEjercicios.add(e);
    }

    /*
    public boolean borrarEjercicio(Object e) {
        for (int i = 0; i < this.listaEjercicios.size(); i++) {
            if (this.listaEjercicios.get(i).equals(e)) {
                this.listaEjercicios.remove(listaEjercicios.get(i));
                return true;
            }
        }
        return false;
    }
     */
    public boolean borrarEjercicio(Object e) {
        Iterator<Object> iterador = this.listaEjercicios.iterator();
        while (iterador.hasNext()) {
            if (iterador.equals(e)) {
                this.listaEjercicios.remove(iterador);
                return true;
            }
        }
        return false;
    }

}
