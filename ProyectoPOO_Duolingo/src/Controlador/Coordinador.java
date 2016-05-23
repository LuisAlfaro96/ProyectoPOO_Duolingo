/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Plataforma;
import Modelo.Usuario;
import Vista.VentanaInicio;
import Vista.VentanaPrincipal;

public class Coordinador {
    
    public static Coordinador CORE;
    private VentanaPrincipal miVentanaPrincipal;
    private Plataforma miLogica;
    
    
    
    public static Coordinador getInstance() { // Patron de diseño Singleton
        if (CORE == null) {
            CORE = new Coordinador();
        }
        return CORE;
    }
    private VentanaInicio miVentanaInicio;

    void setVentanaPrincipal(VentanaPrincipal VP) {
        this.miVentanaPrincipal = VP;
    }

    void setLogica(Plataforma miLogica) {
        this.miLogica = miLogica;
    }

    public String crearUsuario(String nom, char gen,String user,String contra, char mant) {
        
        return miLogica.crearUsuario(nom,gen,user,contra, mant);
    }

    void setVentanaInicio(VentanaInicio inicio) {
        this.miVentanaInicio = inicio;
    }

    public Usuario getUsuarioActual() {
        return miLogica.getUsuarioActual();
    }

    public String cifrarPass(char[] pass) {
            return this.miLogica.cifrarPass(pass);
    }

    public String desCifrarPass(String contra) {
        return this.miLogica.desCifrarPass(contra);
    }

    public boolean verificarPass(char[] confPass, char[] pass) {
        return this.miLogica.verificarPass(confPass,pass);
    }

    
    
}
