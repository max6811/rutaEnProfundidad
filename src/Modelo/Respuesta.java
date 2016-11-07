/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author relos
 */
public class Respuesta {
   private int nodosVisitados;
   private long tiempoTrans; 
   private ArrayList<String> ruta;

   public Respuesta() {
        this.nodosVisitados = 0;
        this.tiempoTrans = 0;
        this.ruta = new ArrayList<>();
    }
    public void nodosVisitados(){
     nodosVisitados+=1;
    }
    public void addRuta(String dato){
     ruta.add(dato);
     nodosVisitados+=1;
    }
    public void setTiempoTrans(long tiempoTrans) {
        this.tiempoTrans = tiempoTrans;
    }

    public int getNodosVisitados() {
        return nodosVisitados;
    }

    public long getTiempoTrans() {
        return tiempoTrans;
    }   
    public ArrayList<String> getrutas() {
        return this.ruta;
    }  
}
