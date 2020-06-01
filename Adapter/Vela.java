/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author KATHERINE
 */
public class Vela {
    String tipo;

    public Vela(String tipo) {
        this.tipo = tipo;
    }
    
    
    public void prenderFuego(String p){
        System.out.println("Prender fuego "+p);
    }
    public void soplarApagar(String s){
        System.out.println("Soplar para apagar "+s);
    }
    
}
