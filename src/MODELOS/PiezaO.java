/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELOS;

import java.awt.Color;

/**
 *
 * @author CAMILO
 */
public class PiezaO extends Figura{

    public PiezaO() {
    }

    public PiezaO(int[] x, int[] y, Color colorBorde, Color colorRelleno, int direccion) {
        super(x, y, colorBorde, colorRelleno, direccion);
    }
    
    public void rotacion1(int pos){
        //esta va a ser la posicion 1 de la figura (por defecto)
    }
}
