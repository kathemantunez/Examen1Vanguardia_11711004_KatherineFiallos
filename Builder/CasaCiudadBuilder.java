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
public class CasaCiudadBuilder extends CasaBuilder{

    @Override
    public void buildPuertas() {
        casa.setPuertas("Puertas de vidrio");
    }

    @Override
    public void buildParedes() {
        casa.setParedes("paredes de cemento");
    }

    @Override
    public void buildTecho() {
        casa.setTecho("techo de aluzinc");
    }

    @Override
    public void buildVentanas() {
        casa.setVentanas("ventanas de vidrio");
    }
    
}
