/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

import java.util.Random;

/**
 *
 * @author USER
 */
    public class Juego {
    private Jugador jugador;
    private Enemigo enemigo;
    private Random random;

    public Juego() {
        jugador = new Jugador();
        enemigo = new Enemigo();
        random = new Random();
    }

    public void iniciarJuego() {
        System.out.println("¡Bienvenido al juego!");

        while (jugador.getVida() > 0 && enemigo.getVida() > 0) {
            // Turno del jugador
            int opcionJugador = seleccionarOpcion();
            int dañoJugador = jugador.atacar(opcionJugador);
            enemigo.recibirDaño(dañoJugador);
            System.out.println("El jugador ataca al enemigo y causa " + dañoJugador + " de daño.");

            // Turno del enemigo
            int opcionEnemigo = seleccionarOpcion();
            int dañoEnemigo = enemigo.atacar(opcionEnemigo);
            jugador.recibirDaño(dañoEnemigo);
            System.out.println("El enemigo ataca al jugador y causa " + dañoEnemigo + " de daño.");

            System.out.println("Vida del jugador: " + jugador.getVida());
            System.out.println("Vida del enemigo: " + enemigo.getVida());
            System.out.println();
        }

        if (jugador.getVida() <= 0) {
            System.out.println("¡Has perdido el juego!");
        } else {
            System.out.println("¡Has ganado el juego!");
        }
    }

    private int seleccionarOpcion() {
        System.out.println("Selecciona una opción:");
        System.out.println("1. Ataque básico");
        System.out.println("2. Habilidad especial");
        int opcion = random.nextInt(2) + 1;
        System.out.println("Opción seleccionada: " + opcion);
        System.out.println();
        return opcion;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego juego = new Juego();
        juego.iniciarJuego();
    }
    
}
