/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Usuario {
    private String NombreCompleto;
    private char genero;
    private String User;
    private String Pass;
    private Perfil perfil;
    private char mantenerSesion;

    public Usuario(String Nombre_Completo,char genero, String User, String Pass, char mantener) {

        this.NombreCompleto = Nombre_Completo;
        this.genero = genero;
        this.User = User;
        this.Pass = Pass;
        this.perfil = null;
        this.mantenerSesion = mantener;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public char getMantenerSesion() {
        return mantenerSesion;
    }

    public void setMantenerSesion(char mantenerSesion) {
        this.mantenerSesion = mantenerSesion;
    }



    @Override
    public String toString() {
        return "Usuario{" + "NombreCompleto=" + NombreCompleto + ", genero=" + genero + ", User=" + User + ", Pass=" + Pass + ", mantenerSesion=" + mantenerSesion + '}';
    }
    
    
    
   
    
    
}
