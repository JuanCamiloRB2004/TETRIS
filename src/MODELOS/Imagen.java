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
public class Imagen  {
    private String ruta;
    private int ancho;
    private int alto;
    int x;
    int y;

    public Imagen() {
    }

    public Imagen(String ruta, int ancho, int alto, int x, int y) {
        this.ruta = ruta;
        this.ancho = ancho;
        this.alto = alto;
        this.x = x;
        this.y = y;
    }    

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
