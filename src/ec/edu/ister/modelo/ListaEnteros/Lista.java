/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo.ListaEnteros;

/**
 *
 * @author MARIA LOYA
 */
//Escribir un método, en la clase Lista, que devuelva cierto si la lista está vacía
public class Lista {
    protected Nodo primero;
    public Lista(){
        primero=null;
    }
    public Lista insertarCabezaLista(int entrada){
        Nodo nuevo;
        nuevo=new Nodo(entrada);
        nuevo.enlace=primero;
        primero=nuevo;
        return this;   
    }
    public boolean vacio(){
        return(primero==null)?true:false;
        
    }
    public void visualizar(){
        Nodo n;
        int k=0;
        n=primero;
        while(n!=null){
            System.out.print(n.dato+" ");
            n=n.enlace;
            k++;
            System.out.print((k%15!=0?" ":"\n"));
        }
    }
    
}
