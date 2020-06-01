/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenvanguardia_11711004;

import Adapter.Bombillo;
import Adapter.Linterna;
import Adapter.Vela;
import Adapter.VelaAdapter;
import Builder.Casa;
import Builder.CasaBuilder;
import Builder.CasaCampoBuilder;
import Builder.CasaCiudadBuilder;
import Builder.CasaDirector;
import Factory.Computer;
import Factory.ComputerFactory;
import Factory.ComputerType;
import Observer.Alumno;
import Observer.Maestro;
import Singleton.UsuarioUnico;
import State.ApagadoState;
import State.AutoContext;
import State.detenidoState;
import State.enMarchaSate;

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
        System.out.println("----------------------------------------");
        System.out.println("---------------BUILDER------------------");
        Builder();
        System.out.println("----------------------------------------");
        System.out.println("---------------ADAPTER------------------");
        Adapter();
        System.out.println("----------------------------------------");
        System.out.println("---------------STATE--------------------");
        state();
        
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
      System.out.println("Asiganción 1, notificar a:");
      maestro.addTareas("Tarea de patrones de diseño");
      System.out.println("Asiganción 2, notificar a:");
      maestro.addTareas("Proyecto");
      System.out.println("Asiganción 3, notificar a:");
      maestro.addTareas("examen");
    }

    private static void Builder() {
        CasaDirector director=new CasaDirector();
        
        CasaBuilder casaCampo=new CasaCampoBuilder();
        CasaBuilder casaCiudad=new CasaCiudadBuilder();
        
        director.setCasaBuilder(casaCampo);
        director.buildCasa();
        Casa casa1=director.getCasaBuilder();
        System.out.println("Casa Campo");
        System.out.println(casa1.toString());
        
        director.setCasaBuilder(casaCiudad);
        director.buildCasa();
        Casa casa2=director.getCasaBuilder();
        System.out.println("Casa Ciudad");
        System.out.println(casa2.toString());
        
        
        
     }

    private static void Adapter() {
        Bombillo b=new Bombillo("bombillo");
        b.encender("bombillo");
        b.apagar("bombillo");
        Linterna l=new Linterna("linterna");
        l.encender("linterna");
        l.apagar("linterna");
        
        VelaAdapter adapter= new VelaAdapter(new Vela("vela"),"vela");
        adapter.encender("vela");
        adapter.apagar("vela");
    }

    private static void state() {
        AutoContext a=new AutoContext();
        System.out.println("Estado del auto apagado, estas son sus opciones: ");
        a.setState(new ApagadoState());
        a.action();
        
        System.out.println("Estado del auto en marcha, estas son sus opciones: ");
        a.setState(new enMarchaSate());
        a.action();
        
        System.out.println("Estado del auto detenido, estas son sus opciones: ");
        a.setState(new detenidoState());
        a.action();
    
    }
    
}
