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
public class VelaAdapter extends AbstractLampara{
    private Vela vela;

    public VelaAdapter(Vela vela,String tipo) {
        super(tipo);
        this.vela=vela;
    }
    
    @Override
    public void encender(String e) {
        vela.prenderFuego(e);
    }
    @Override
    public void apagar(String a){
        vela.soplarApagar(a);
    }
    
}
