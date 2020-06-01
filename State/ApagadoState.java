/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author KATHERINE
 */
public class ApagadoState implements AutoState{

    @Override
    public void action(Auto a) {
        a.encender();
    }
    
    
}
