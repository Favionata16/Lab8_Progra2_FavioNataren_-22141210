/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_FavioNataren_22141210;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author favio
 */
public class Carros implements Serializable{
    String Nombre;
    Color col;
    int numero;
    int tipo;

    public Carros() {
    }

    public Carros(String Nombre, Color col, int numero,int tipo) {
        this.Nombre = Nombre;
        this.col = col;
        this.numero = numero;
        this.tipo=tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Color getCol() {
        return col;
    }

    public void setCol(Color col) {
        this.col = col;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
