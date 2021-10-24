/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biologia.computacional.java;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yago
 */
public class BiologiaComputacionalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cabeca cabeca = new Cabeca();
        
        while(true) {
            cabeca.criaMapa();
            cabeca.atualiza();
            cabeca.desenhaCabeca();
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(BiologiaComputacionalJava.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
