/*
 * aqui ira la parte principal
 */
package Controlador;

import Modelo.Arista;
import Modelo.Grafo;
import Modelo.Respuesta;
import Modelo.Vertice;
import java.util.ArrayList;

/**
 *
 * @author max
 */
public class Main {

    public Main() {
    }
    
    public static void main(String[] arg)
    {  
        Vertice v1 = new Vertice("1");    
        Vertice v2 = new Vertice("2");
        Vertice v3 = new Vertice("3");
        Vertice v4 = new Vertice("4");
        Vertice v5 = new Vertice("5");
        Vertice v6 = new Vertice("6");
        Vertice v7 = new Vertice("7");
        Vertice v8 = new Vertice("8");

        
        v1.insertarVecino(new Arista(v1, v2));
        v1.insertarVecino(new Arista(v1, v3));
        v1.insertarVecino(new Arista(v1, v4));
        v1.insertarVecino(new Arista(v1, v5));
        v1.addVerticeVecino(v2);
        v1.addVerticeVecino(v3);
        v1.addVerticeVecino(v4);
        v1.addVerticeVecino(v5);
        //v2.insertarVecino(new Arista(v1, v2));
        v2.addVerticeVecino(v1);
        v3.insertarVecino(new Arista(v1, v3));
        v3.addVerticeVecino(v1);
        v3.addVerticeVecino(v8);
        v4.insertarVecino(new Arista(v4, v7));
        v4.addVerticeVecino(v1);
        v4.addVerticeVecino(v7);
        v5.insertarVecino(new Arista(v5, v6));
        v5.addVerticeVecino(v1);
        v5.addVerticeVecino(v6);
        //v6.insertarVecino(new Arista(v5, v6));
        v6.addVerticeVecino(v5);
        v7.insertarVecino(new Arista(v7, v8));
        v7.addVerticeVecino(v4);
        v7.addVerticeVecino(v8);
        //v8.insertarVecino(new Arista(v7, v8));
        v8.addVerticeVecino(v3);
        v8.addVerticeVecino(v7);
        
        Grafo grafo = new Grafo();
        // AQUI ES DONDE SE CAMBIAN EL NODO INICIO Y EL NODO FINAL, JUGAR CON ESTO..PRUEBEN
        Respuesta res = grafo.Buscar(v8, v1);
        System.out.print("Ruta Solucion: ");
       for (String imprime : res.getrutas()) {
            System.out.print(imprime + ". ");
       }
       System.out.println("");
       
       System.out.println("Nodos Visitados: "+ res.getNodosVisitados());
       System.out.println("tiempo Transcurrido: "+ res.getTiempoTrans()+ " ms.");
        
    
    }

}
