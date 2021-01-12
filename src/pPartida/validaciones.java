package pPartida;

import java.util.Scanner;

/**
 *
 * @author Julio
 */
public class validaciones {
    Scanner entrada = new Scanner(System.in);
    public int validarElementoJ1(){
        int elementoJ1 = entrada.nextInt();
        return elementoJ1;
    }
    
    public int validarElementoJ2(){
        int elementoJ2 = entrada.nextInt();
        return elementoJ2;
    }
    
    public int validarOponente(){
         int rival = entrada.nextInt();
         return rival;
    }
    
    public int validadInicio(){
        System.out.println("");
        System.out.println("BIENVENIDO AL JUEGO ¡¡JAKENPOP!!");
        System.out.println("----------------------------------");
        System.out.println("1. Iniciar Juego");
        System.out.println("2. Recuperar Juego");
        System.out.print("Seleeciona una acción: ");
        int juego = entrada.nextInt();
        return juego;
    }
}
