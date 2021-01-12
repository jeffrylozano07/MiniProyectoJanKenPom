package pPartida;

/**
 *
 * @author Julio
 */
public class Cpartida {
    
    private Mpartida mpartida;
    private Vpartida vpartida;

    public Cpartida() {
        mpartida = new Mpartida();
        vpartida = new Vpartida(mpartida);
    }
    
    public void controla(){
        vpartida.inicio();
        this.inicioJuego();
        this.rivalEleg();
    }
    
    public void inicioJuego(){
        int juego = vpartida.getJuego();
        if (juego == 1) {
            vpartida.elegirRival();
        } else if (juego == 2) {
            vpartida.recuperarJuego();
        }
    }
    
    public void rivalEleg(){
        if (mpartida.getRivalAsignado()=="jugador2") {
            vpartida.contraJugador();
        }else if (mpartida.getRivalAsignado()=="maquina") {
            vpartida.contraMaquina();
        }
    }
    
    public static void main(String[] args) {
        
        Cpartida cpartida = new Cpartida();
        cpartida.controla();
    }
    
}
