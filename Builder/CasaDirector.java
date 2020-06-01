/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author KATHERINE
 */
public class CasaDirector {
    private CasaBuilder casaBuilder;
    
    public Casa getCasaBuilder(){
        return casaBuilder.getCasa();
    }
    public void setCasaBuilder(CasaBuilder casa){
        casaBuilder=casa;
    }
    public void buildCasa(){
        casaBuilder.crearCasa();
        casaBuilder.buildParedes();
        casaBuilder.buildPuertas();
        casaBuilder.buildTecho();
        casaBuilder.buildVentanas();
    }
}
