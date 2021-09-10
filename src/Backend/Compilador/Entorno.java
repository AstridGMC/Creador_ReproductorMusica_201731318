/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Compilador;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author astridmc
 */
public class Entorno {
    
    private Entorno anterior;
    private ArrayList<Simbolo> tabla;

    public Entorno(Entorno anterior) {
        this.anterior = anterior;
    }
    
    private void Agregar(String id, Simbolo simbolo ){
        id= id.toLowerCase();
        simbolo.identificador = simbolo.identificador.toLowerCase();
        simbolo.idUnico = id;
        this.tabla.add(simbolo);
    }
    
    private boolean Eliminar(String id){
        id= id.toLowerCase();
        Entorno entorno = this;
        int i = BuscarPorId(entorno.tabla, id);
        while(entorno!=null){
            if(i>0){
                this.tabla.remove(i);
                return true;
            }
            entorno = entorno.anterior;
        }
        return false;
    }
    
    private boolean Existe(String id){
        id= id.toLowerCase();
        Entorno entorno = this;
        while(entorno!=null){
            if(BuscarPorId(entorno.tabla, id)>0){
                return true;
            }
            entorno = entorno.anterior;
        }
        return false;
    }
    
    private boolean ExisteEnActual(String id){
        if(BuscarPorId(this.tabla, id)>0){
            return true;
        }else{
            return false;
        }
    }  
    
    private Simbolo getSimbolo(String id){
        id= id.toLowerCase();
        Entorno entorno = this;
        int i = BuscarPorId(entorno.tabla, id);
        while(entorno!=null){
            if(i>0){
                return entorno.tabla.get(i);
            }
            entorno = entorno.anterior;
        }
        return null;
    }
    
    private void Reemplazar(String id, Simbolo nuevoSimbolo){
        id= id.toLowerCase();
        Entorno entorno = this;
        int i = BuscarPorId(entorno.tabla, id);
        while(entorno!=null){
            if(i>0){
                entorno.tabla.set(i, nuevoSimbolo);
            }
            entorno = entorno.anterior;
        }
    }
    
    private int BuscarPorId(ArrayList<Simbolo> simbolos, String id){
        for (int i = 0; i < simbolos.size(); i++) {
            if(simbolos.get(i).idUnico==id){
                return i;
            }else{
                return -100;
            }
        }
        return -100;
    }
    
}
