/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Plataforma;
import Vista.VentanaInicio;
import Vista.VentanaPrincipal;
import Vista.VentanaRegistro; // BORRAR LUEGO, SOLO PARA PRUEBAS, ESTO VA EN LA VENTANA PRINCIPAL

public class Principal {

    public static void main(String[] args) {
        // Instanciaciones objetos unicos mediante Singleton.
        Plataforma logica = Plataforma.getInstance(); // Entiendase logica = Plataforma, debido a que en esa clase se genera toda la logica de la aplicacion.
        Coordinador CORE = Coordinador.getInstance();
        VentanaPrincipal VP = VentanaPrincipal.getInstance();
        VP.setLocationRelativeTo(null);
        VentanaInicio VI = VentanaInicio.getInstance();
        VI.setLocationRelativeTo(null);
        VP.setVisible(true);
        //Relaciones MVC
        CORE.setVentanaPrincipal(VP);
        CORE.setVentanaInicio(VI);
        CORE.setLogica(logica);
        
        VP.setCoordinador(CORE);
        VI.setCoordinador(CORE);
        logica.setCoordinador(CORE);
        
        //Cargar datos de usuarios.
        logica.cargarUsuarios();
        //logica.eliminarUsuario("a");
       
       
        
        
        
        
        
        
        
        
        
        
    }
    
}
