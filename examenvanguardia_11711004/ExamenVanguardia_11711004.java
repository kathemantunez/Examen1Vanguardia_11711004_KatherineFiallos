/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenvanguardia_11711004;

import Singleton.UsuarioUnico;

/**
 *
 * @author KATHERINE
 */
public class ExamenVanguardia_11711004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("EXAMEN 1 VANGUARDIA, PATRONES DE DISEÑO");
        System.out.println("----------------------------------------");
        System.out.println("SINGLETON");
        singleton();
        System.out.println("----------------------------------------");
        System.out.println("FACTORY");
        factory();
        System.out.println("----------------------------------------");
        
    }
    public static void singleton(){
        // se crea la instancia de un usuario y se verificia que solo un usuario sea creado
        UsuarioUnico u1=UsuarioUnico.getInstance();
        UsuarioUnico u2=UsuarioUnico.getInstance();
        u1.setNombre("Katherine");
        u1.setApellido("Fiallos");
        System.out.println(u2.getNombre());
    }
    public static void factory(){
        
    }
    
}