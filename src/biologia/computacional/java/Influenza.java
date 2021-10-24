/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biologia.computacional.java;

/**
 * Modela a variante do virus influenza
 * @author Yago
 */
public class Influenza extends Virus {
    
    private boolean celula;

    public boolean isCelula() {
        return celula;
    }

    public void setCelula(boolean celula) {
        this.celula = celula;
    }
    
    public boolean estaNaCelula() {
        return true;
    }
}
