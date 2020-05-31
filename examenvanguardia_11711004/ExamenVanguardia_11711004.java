/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenvanguardia_11711004;

import Factory.Computer;
import Factory.ComputerFactory;
import Factory.ComputerType;
import Observer.Alumno;
import Observer.Maestro;
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
        System.out.println("---------------SINGLETON----------------");
        singleton();
        System.out.println("----------------------------------------");
        System.out.println("---------------FACTORY------------------");
        factory();
        System.out.println("----------------------------------------");
        System.out.println("---------------OBSERVER-----------------");
        observer();
        
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
        ComputerFactory factory=new ComputerFactory();
        Computer c1=factory.buildComputer(ComputerType.ASUS);
        System.out.println(c1.getModel()+" computadora creada exitosamente");
        Computer c2=factory.buildComputer(ComputerType.DELL);
        System.out.println(c2.getModel()+" computadora creada exitosamente");
        Computer c3=factory.buildComputer(ComputerType.HP);
        System.out.println(c3.getModel()+" computadora creada exitosamente");
    }

    private static void observer() {
       Maestro maestro=new Maestro();
       Alumno a1=new Alumno("Juan");
       Alumno a2=new Alumno("Maria");
       Alumno a3=new Alumno("Luisa");
       Alumno a4=new Alumno("Pedro");
       
      maestro.registerObserver(a1);
      maestro.registerObserver(a2);
      maestro.registerObserver(a3);
      maestro.registerObserver(a4);
      
      maestro.removeObserver(a3);
      System.out.println("Asigancion 1, notificar a:");
      maestro.addTareas("Tarea de patrones de diseño");
      System.out.println("Asigancion 2, notificar a:");
      maestro.addTareas("Proyecto");
      System.out.println("Asigancion 3, notificar a:");
      maestro.addTareas("examen");
    }
    
}
