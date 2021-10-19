import java.io.*;
import java.util.*;
/**
 * @author: Ing. Noé Vásquez Godínez
 * @email: noe-vg@outlook.com
 * @about: Clase para implementar Dijkstra's algorithm
 */

class AlgoritmoDJ{
    /**
     * @about:
     * En este metodo se iniciara sel setup del algoritmo
     */
     int a[] = new int[10];
     int b[][] = new int[10][10];
    public void init(){
        this.start();
    }
    /**@about: 
     * En este metodo se incia el algoritmo
     */
    private void start(){
        System.out.println("[OK] starting . . .");
    
    } 
    public static void main(String[] args) {
        AlgoritmoDJ algoritmoDJ = new AlgoritmoDJ();
        algoritmoDJ.init();
        int nodos=0,or,i,j=0;
     int opc;
     System.out.println("DIJKSTRA ALGORITMO\n");
     Scanner in=new Scanner(System.in);
     System.out.println("Introduccir el numero de nodos que desea\n");
     nodos=in.nextInt();
     opc=nodos*nodos;

     Algoritmo d=new Algoritmo();
     System.out.println("Introduccir algunos valoes para la matriz\n Matriz "+opc+":\n");
     for(i=1; i<=nodos; i++){
         for(j=1; j<=nodos; j++){
             d.b[i][j]=in.nextInt();
             if(d.b[i][j]==0)
             d.b[i][j]=500;
         }
     }
     System.out.println("Cual es el vertice de origen :\n");
     or=in.nextInt();
     
     System.out.println("Vertice :"+or+"\t Destino :"+i+"\t costo minimo :"+d.a[i]+"\t");
 }
    }
}