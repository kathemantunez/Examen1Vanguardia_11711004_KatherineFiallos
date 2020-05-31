/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author KATHERINE
 */
public class Alumno implements Observer{
    private String name;
    
    public void update(Subject sub) {
        System.out.println(name+" Asignacion pendiente de Vanguardia");
    }

    public Alumno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
