/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Expresiones;

import Backend.Compilador.AST;
import Backend.Compilador.Entorno;
import Backend.Compilador.Simbolo;
import Backend.Compilador.Simbolo.Tipo;
import Backend.Interfaces.Expresion;
import java.util.ArrayList;

/**
 *
 * @author astridmc
 */
public class Arreglo implements Expresion{

    @Override
    public Simbolo.Tipo getTipo(Entorno entorno, AST arbol) {
        return Tipo.ARRAY;
    }

    @Override
    public Object getValorImplicito(Entorno entorno, AST arbol) {
        return expresiones;
    }
    
    String identificador;
    int dimension;
    ArrayList<Expresion> expresiones;

    public Arreglo(String identificador, int dimension, ArrayList<Expresion> expresiones) {
        this.identificador = identificador;
        this.dimension = dimension;
        this.expresiones = expresiones;
    }

    public Arreglo(String identificador, int dimension) {
        this.identificador = identificador;
        this.dimension = dimension;
    }

    @Override
    public Object setValorImplicito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
