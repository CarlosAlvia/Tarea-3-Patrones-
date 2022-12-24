package objetos;

/**
 *
 * @author Jorge Daniel
 */
public class FactoryDisparos implements InterfazPajaro{
    public PajaroEnemigo crearPajaroEnemigo(){
        
        return null;
        
    }
    
    public PajaroMio crearPajaroMio(){

        return null;
        
    }

    @Override
    public PajaroEnemigo CrearPajaroEnemigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PajaroMio CrearPajaroMio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}