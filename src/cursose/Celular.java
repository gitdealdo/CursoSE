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
public class Celular extends mobil{
    private String nombre;
    private String color;
    private String serie;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerie() {
        if (serie==null) {
            serie = "Sin serie";
        }
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void Mostrar(){
        System.out.println(getNombre()+" "+getColor()+" " + getSerie());
    } 
    
}