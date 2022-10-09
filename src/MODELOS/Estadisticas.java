/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELOS;

/**
 *
 * @author CAMILO
 */
public class Estadisticas {
    int numeroPuntos;
    int numerosFichas;

    public Estadisticas() {
    }
    
    public Estadisticas(int numeroPuntos, int numerosFichas) {
        this.numeroPuntos = numeroPuntos;
        this.numerosFichas = numerosFichas;
    }

    public int getNumeroPuntos() {
        return numeroPuntos;
    }

    public void setNumeroPuntos(int numeroPuntos) {
        this.numeroPuntos = numeroPuntos;
    }

    public int getNumerosFichas() {
        return numerosFichas;
    }

    public void setNumerosFichas(int numerosFichas) {
        this.numerosFichas = numerosFichas;
    }
    
}
