/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creadorreproductormusica;
import CupYFlex.parser;
import CupYFlex.AnalizadorLexico;
import Frontend.Principal;
import java.io.StringReader;

/**
 *
 * @author astridmc
 */
public class CreadorReproductorMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String entrada = "g33r f * 's' \"dd\"";
            AnalizadorLexico lexico = new AnalizadorLexico(new StringReader(entrada));
            parser parser1 = new parser(lexico);
        try {
            parser1.parse();
        } catch (Exception ex) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println("Causa: "+ex);
        } */
        Principal principal = new Principal();
        principal.setVisible(true);
    }
}
