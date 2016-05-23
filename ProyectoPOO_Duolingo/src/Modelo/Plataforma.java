/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Coordinador;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Plataforma {

    private boolean Sesion;
    private Usuario usuarioActual;
    private ArrayList<Curso> listaCursos;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Perfil> listaPerfiles;
    public static Plataforma PTM;
    private Coordinador miCoordinador;

    public Plataforma() {
        this.Sesion = Sesion;
        this.usuarioActual = null; /// No de debe ser nulo, falta sicronizar con login.
        this.listaCursos = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
        this.listaPerfiles = new ArrayList<>();
    }

    public static Plataforma getInstance() { // Patron de diseño Singleton
        if (PTM == null) {
            PTM = new Plataforma();
        }
        return PTM;
    }

    public void setCoordinador(Coordinador CORE) {
        this.miCoordinador = CORE;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    //  ##########################  Trabajos con usuarios  ##########################
    public Usuario buscarUsuario(String username) {
        int k;
        for (k = 0; k < listaUsuarios.size(); k++) {
            if (listaUsuarios.get(k).getUser().equals(username)) { // verificamos el username que es nuestro valor unico
                return listaUsuarios.get(k);
            }
        }
        return null; // retorna la posicion del objeto eliminar
    }

    public boolean cargarUsuarios() { // Se llama por defecto al iniciar la aplicacion.
        String outputFile = "Usuarios.csv";
        boolean existeArchivo = new File(outputFile).exists();
        if (!existeArchivo) {
            return false;
        }
        try {
            CsvReader usuarios = new CsvReader(outputFile);
            usuarios.readHeaders();
            this.listaUsuarios = new ArrayList();
            System.out.println("Usuarios Cargados(Nombre : Genero : Username : Contrasena): "); // Linea de comprobacion a consola

            while (usuarios.readRecord()) {
                String linea = usuarios.get(0);
                String nombre = linea.split("#")[0];
                char gen = linea.split("#")[1].charAt(0); // castin a char
                String user = linea.split("#")[2];
                String pass = linea.split("#")[3];
                char mant = linea.split("#")[4].charAt(0);
                char c = pass.charAt(0);
                char[] contra = pass.toCharArray();
                Usuario u = new Usuario(nombre, gen, user, contra, mant);
                this.listaUsuarios.add(u);
                System.out.println("\t" + nombre + " : " + linea.split("#")[1] + " : " + user + " : " + String.valueOf(contra)); // Linea de comprobacion a consola

            }
            usuarios.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void GuardarUsuarios() {
        String outputFile = "Usuarios.csv";
        boolean existeArchivo = new File(outputFile).exists();

        try {
            if (existeArchivo) { // Verifica si el archivo Erchivo existe
                File fichero = new File(outputFile);
                fichero.delete(); // Lo borramos para crear uno nuevo y actualizado
            }
            CsvWriter usuarios = new CsvWriter(new FileWriter(outputFile, true), '#'); //Creamos un nuevo archivo
            usuarios.write("Nombre"); // cabeceras de las columnas.
            usuarios.write("Genero");
            usuarios.write("Username");
            usuarios.write("Pasword");
            usuarios.write("InicioDefault");
            usuarios.endRecord();
            for (int k = 0; k < listaUsuarios.size(); k++) { // Recorremos la listaUsuarios actualizada, y la escribimos en el archivo.
                usuarios.write(listaUsuarios.get(k).getNombreCompleto());
                usuarios.write(String.valueOf(listaUsuarios.get(k).getGenero()));
                usuarios.write(listaUsuarios.get(k).getUser());
                usuarios.write(listaUsuarios.get(k).getPass().toString());
                usuarios.write(String.valueOf(listaUsuarios.get(k).getMantenerSesion()));
                usuarios.endRecord();
            }
            usuarios.close(); // cerramos el archivo
            //this.listaUsuarios = new ArrayList();
            //cargarUsuarios();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String eliminarUsuario(String user) {

        boolean result = listaUsuarios.remove(buscarUsuario(user)); // boramos el objeto usuario
        if (result == true) { // verifica si se pudo eliminar el usuario
            GuardarUsuarios();
            return "Usuario Eliminado";
        }
        return "No se pudo eliminar el usuario";  
    }

    public void guardarNuevoUsuario(Usuario u) {
        String outputFile = "Usuarios.csv";
        boolean existeArchivo = new File(outputFile).exists();
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), '#');
            if (!existeArchivo) {
                //String Codigo, String Nombre_Completo, String User, char[] Pass

                csvOutput.write("Nombre");
                csvOutput.write("Genero");
                csvOutput.write("Username");
                csvOutput.write("Pasword");
                csvOutput.write("InicioDefault");
                csvOutput.endRecord();
            }
            csvOutput.write(u.getNombreCompleto());
            csvOutput.write(String.valueOf(u.getGenero()));
            csvOutput.write(u.getUser());
            csvOutput.write(String.valueOf(u.getPass()));
            csvOutput.write(String.valueOf(u.getMantenerSesion()));
            
            csvOutput.endRecord();

            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String crearUsuario(String nom, char gen, String user, char[] contra, char mant) {// Necesitamos agregar el objeto perfil asociado por parametro
        Usuario u = new Usuario(nom, gen, user, contra, mant);
        Iterator<Usuario> iterador = this.listaUsuarios.iterator();
        while (iterador.hasNext()) {
            if (iterador.equals(u)) {
                return "Usuario repetido";
            }
            iterador.next();
        }
        this.listaUsuarios.add(u);
        guardarNuevoUsuario(u);
        //System.out.println(usuariosPorGenero('M'));

        return "Registro exitoso";
    }

    public String usuariosPorGenero(char gen) {
        String cadena = "";
        for (int k = 0; k < listaUsuarios.size(); k++) {
            if (listaUsuarios.get(k).getGenero() == gen) {
                cadena += listaUsuarios.get(k).toString();
            }
        }
        return cadena;
    }

    // ###############################################
}
