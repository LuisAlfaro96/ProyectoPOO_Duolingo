/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Coordinador;

/**
 *
 * @author keilor
 */
public class Perfil {
    private String Nombre;
    private int PuntosExperiencia;
    private int NivelUsuario;
    private int MetaDiaria;
    private Coordinador Coordinador;

    public Perfil(String Nombre, int PuntosExperiencia, int NivelUsuario, int MetaDiaria) {
        this.Nombre = Nombre;
        this.PuntosExperiencia = PuntosExperiencia;
        this.NivelUsuario = NivelUsuario;
        this.MetaDiaria = MetaDiaria;
    }
    
    public void setCoordinador(Coordinador miCoordinador){ // asigna coordn
        this.Coordinador=miCoordinador;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPuntosExperiencia() {
        return PuntosExperiencia;
    }

    public void setPuntosExperiencia(int PuntosExperiencia) {
        this.PuntosExperiencia = PuntosExperiencia;
    }

    public int getNivelUsuario() {
        return NivelUsuario;
    }

    public void setNivelUsuario(int NivelUsuario) {
        this.NivelUsuario = NivelUsuario;
    }

    public int getMetaDiaria() {
        return MetaDiaria;
    }

    public void setMetaDiaria(int MetaDiaria) {
        this.MetaDiaria = MetaDiaria;
    }
    
    
    
    
    
    
}
