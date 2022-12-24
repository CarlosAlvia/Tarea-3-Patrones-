 */
package objetos;

/**
 *
 * @author Jorge Daniel
 */
public class DañoDisparo implements Disparo{

    private int vidaQuita;

    private void Envoltorio() {

    }

    private void dañoDisparo() {
        int tipoDisparo = 0;
        switch (tipoDisparo) {
            case 1:
                this.vidaQuita = 10;
                break;
            case 2:
                this.vidaQuita = 20;
                break;
            case 3:
                this.vidaQuita = 30;
                break;
        }
        this.setnImg(0);
    }

    private void setnImg(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void disparo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}