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
public  abstract class CasaBuilder {
    protected Casa casa;
    
    public void crearCasa(){
        casa=new Casa();
    }
    
    public Casa getCasa(){
        return casa;
    }
    
    //metodos abstractos
    public abstract void buildPuertas();
    public abstract void buildParedes();
    public abstract void buildTecho();
    public abstract void buildVentanas();
    
    
}
