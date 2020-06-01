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
public class Casa {
    
   private String paredes;
   private String puertas;
   private String techo;
   private String ventanas;

    public Casa() {
    }

    public String getParedes() {
        return paredes;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public String getTecho() {
        return techo;
    }

    public void setTecho(String techo) {
        this.techo = techo;
    }

    public String getVentanas() {
        return ventanas;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }

    @Override
    public String toString() {
        return "Casa{" + "paredes=" + paredes + ", puertas=" + puertas + ", techo=" + techo + ", ventanas=" + ventanas + '}';
    }
   
   

   
   
}
