/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jorge Daniel
 */
public class Estrategias {
    private BusquedaInterface BI;
    
    public Estrategias(BusquedaInterface BI){
        this.BI = BI;
    }
    
    public String executeStrategy(int[][] grafo, int ni, int nf) {
        return BI.buscar(grafo, ni, nf);
    }
    
    public void executeStrategy2(){
        BI.imprimirCaminos();
    }
}
