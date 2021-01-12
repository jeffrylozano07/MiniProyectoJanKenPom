package pPartida;

import java.util.Random;

/**
 *
 * @author Julio
 */
public class Vpartida {
    private Mpartida mpartida;
    validaciones validacion = new validaciones();
    private int juego;

    public Vpartida(Mpartida mpartida) {
        this.mpartida = mpartida;
    }
    
    public void inicio(){
          this.setJuego(validacion.validadInicio());
    }
    
    public void iniciarJuego(){
        this.elegirRival();
    }
    
    public void elegirRival(){
        System.out.println("");
        System.out.println("¡¡A PUNTO DE EMPEZAR EL JUEGO!!");
        System.out.println("----------------------------------");
        System.out.println("RIVALES");
        System.out.println("----------------------------------");
        mpartida.mostrarRival();
        System.out.println("----------------------------------");
        System.out.print("Ingrese el número de su rival: ");
        mpartida.rivalAsignado(validacion.validarOponente());
        
    }
    
    public void contraJugador(){
        for (int i = 1; i <= 5; i++) {
          System.out.println("");
          System.out.println("EMPEZÓ EL JUEGO ");
          System.out.println("----------------------------------");
          mpartida.setNumRonda(i);
          this.MsjGanadorRonda(this.elementoJ1(), this.elementoJ2());
          mpartida.contVictorias(i);
          mpartida.guardarPartida(mpartida);
        }
        mpartida.GanadorPartidaJugador2(mpartida.getGanJ1(),mpartida.getGanJ2());
        this.MostrarResultadosRonda();
        System.out.println("Jugador 1 ha ganado: "+mpartida.getGanJ1()+" ronda(s)");
        System.out.println("Jugador 2 ha ganado: "+mpartida.getGanJ2()+" ronda(s)");
        this.MsjGanadorPartida();
    }
    
    public void contraMaquina(){
        Random r = new Random();
        for (int i = 1; i <= 5; i++) {
          int valorDado = r.nextInt(3)+1;
          System.out.println("");
          System.out.println("EMPEZÓ EL JUEGO ");
          System.out.println("----------------------------------");
          mpartida.setNumRonda(i);
          this.MsjGanadorRonda(this.elementoJ1(), valorDado);
          mpartida.contVictorias(i);
          mpartida.guardarPartida(mpartida);
        }
        mpartida.GanadorPartidaMaq(mpartida.getGanJ1(),mpartida.getGanMaq());
        this.MostrarResultadosRonda();
        System.out.println("Jugador 1 ha ganado: "+mpartida.getGanJ1()+" ronda(s)");
        System.out.println("Maquina ha ganado: "+mpartida.getGanMaq()+" ronda(s)");
        this.MsjGanadorPartida();
    }
    
    public int elementoJ1(){
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("ELEMENTOS DEL JUGADOR 1");
        System.out.println("----------------------------------");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.println("Ingrese el número de su elemento: ");
        System.out.println("----------------------------------");
        return validacion.validarElementoJ1();
    }
    
    public int elementoJ2(){
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("ELEMENTOS DEL JUGADOR 2");
        System.out.println("----------------------------------");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.println("Ingrese el número de su elemento: ");
        System.out.println("----------------------------------");
        return validacion.validarElementoJ2();
        
    }
    
    public int elementoMaquina(){
        Random r = new Random();
        int valorDado = r.nextInt(3)+1;
        return valorDado;
    }
    
    public void recuperarJuego(){
        
    }
    
    
    public void MsjGanadorRonda(int elementoJugador, int elementoRival){
        mpartida.calcularGanador(elementoJugador, elementoRival);
    }
    
    public void MsjGanadorPartida(){
        System.out.println("EL GANADOR DE LA PARTIDA ES: "+ mpartida.getGanadorPartida());
    }
    
    public void MostrarResultadosRonda(){
        System.out.println("******************************************************");
        System.out.println("RESULTADOS DE LA PARTIDA");
        System.out.println("-------------------------------------------------------");
        System.out.println("El ganador de  la ronda 1 es: "+mpartida.getGanadorR1());
        System.out.println("El ganador de  la ronda 2 es: "+mpartida.getGanadorR2());
        System.out.println("El ganador de  la ronda 3 es: "+mpartida.getGanadorR3());
        System.out.println("El ganador de  la ronda 4 es: "+mpartida.getGanadorR4());
        System.out.println("El ganador de  la ronda 5 es: "+mpartida.getGanadorR5());
        System.out.println("******************************************************");
    }

    public int getJuego() {
        return juego;
    }

    public void setJuego(int juego) {
        this.juego = juego;
    }
    
    
}
