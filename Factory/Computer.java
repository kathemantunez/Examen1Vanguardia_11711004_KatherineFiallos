/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author KATHERINE
 */
public class Computer {
    ComputerType model;
    
    public Computer(){
        
    }

    public Computer(ComputerType model) {
        this.model = model;
    }
    

    public ComputerType getModel() {
        return model;
    }

    public void setModel(ComputerType model) {
        this.model = model;
    }
    
    
}
