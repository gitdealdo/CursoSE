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
public class Perro implements Animal, SerVivo{

    @Override
    public void tipoDeAnimal() {
        System.out.println("Pastor aleman");
    }

    @Override
    public String nombreAnimal() {
        return "Kayser";
    }

    @Override
    public void mostrarVida() {
        System.out.println("Estoy 100% vivo aprendiendo java");
    }
    
}
