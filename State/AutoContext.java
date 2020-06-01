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
public class AutoContext {
    private AutoState autostate;
    private Auto auto;

    public AutoContext() {
        autostate=null;
        auto=new Auto();
    }
    public void setState(AutoState a){
        this.autostate=a;
    }
    public void action(){
        autostate.action(auto);
    }
    
    
}
