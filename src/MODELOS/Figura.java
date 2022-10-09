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
public abstract class Figura {
    private int x[] ;
    private int y[] ;
    private Color colorBorde;
    private Color colorRelleno;
    private int direccion;

    public Figura() {
    }

    public Figura(int[] x, int[] y, Color colorBorde, Color colorRelleno, int direccion) {
        this.x = x;
        this.y = y;
        this.colorBorde = colorBorde;
        this.colorRelleno = colorRelleno;
        this.direccion = direccion;
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }

    public Color getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(Color colorBorde) {
        this.colorBorde = colorBorde;
    }

    public Color getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
    
    public void movimientoAbajo(){
        for(int i = 0; i < this.y.length; i++){
            // aca se indica cuantos pixeles va a bajar la ficha cada cierto tiempo
        }
    }
}
