/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursose;

/**
 *
 * @author hikaru
 */
public class Banco {
    
    Persona per1;
    Persona per2;
    Persona per3;

    public Banco() {
        per1 = new Persona();
        per1.setNombre("Mito");
        
        per2 = new Persona();
        per2.setNombre("Code");
        
        per3 = new Persona();
        per3.setNombre("Jaime");
    }

    public Persona getPer1() {
        return per1;
    }

    public void setPer1(Persona per1) {
        this.per1 = per1;
    }

    public Persona getPer2() {
        return per2;
    }

    public void setPer2(Persona per2) {
        this.per2 = per2;
    }

    public Persona getPer3() {
        return per3;
    }

    public void setPer3(Persona per3) {
        this.per3 = per3;
    }
    
    
}
