/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import javax.print.attribute.standard.JobState;

/**
 *
 * @author KATHERINE
 */
public class Maestro implements Subject{
   private ArrayList<Observer> alumnos=new ArrayList();
   private ArrayList<String> tareas=new ArrayList();

    public Maestro() {
    }
   

    
    public void registerObserver(Observer ob) {
        
        alumnos.add(ob);
        
    }

    
    public void removeObserver(Observer ob) {
       alumnos.remove(ob);
        
    }

    @Override
    public void notifyAllObservers() {
        for (int i = 0; i < alumnos.size(); i++) {
            alumnos.get(i).update(this);
            
        }
    }
    public void addTareas(String t){
        this.tareas.add(t);
        notifyAllObservers();
        
    }
    public ArrayList<String> getTareas(){
        return tareas;
    }

    @Override
    public String toString() {
        return "Maestro{" + "alumnos=" + alumnos + ", tareas=" + tareas + '}';
    }
}
