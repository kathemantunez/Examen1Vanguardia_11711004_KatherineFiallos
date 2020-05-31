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
public class ComputerFactory {
    
    public Computer buildComputer(ComputerType computer){
        if(computer.equals(ComputerType.DELL)){
            return new DELL();
        }else if(computer.equals(ComputerType.ASUS)){
            return new ASUS();
        }else if( computer.equals(ComputerType.HP)){
            return new HP();
        }
        return new Computer(computer);
    }
}
