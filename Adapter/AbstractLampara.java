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
public class AbstractLampara implements Lampara{
    private String tipo;

    public AbstractLampara(String tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public void encender(String e) {
        System.out.println("Encender "+ e);
    }

    @Override
    public void apagar(String a) {
        System.out.println("Apagar "+a);
    }
    
}
