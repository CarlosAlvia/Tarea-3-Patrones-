/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jorge Daniel
 */
public abstract class Busqueda {
    public abstract boolean verificarVisitado(int x);
    public abstract String buscar(int [][] grafo, int ni, int nf);
    public abstract void imprimirCaminos();
    public abstract Busqueda CrearBusqueda();
}
