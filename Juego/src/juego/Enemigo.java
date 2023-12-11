/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author USER
 */
     public class Enemigo {
     private int vida;
     private int ataque;
     private int habilidadEspecial;

    public Enemigo() {
        vida = 80;
        ataque = 15;
        habilidadEspecial = 30;
    }

    public int getVida() {
        return vida;
    }

    public void recibirDaño(int daño) {
        vida -= daño;
    }

    public int atacar(int opcion) {
        switch (opcion) {
            case 1:
                return ataque;
            case 2:
                return habilidadEspecial;
            default:
                return 0;
        }
    }
}
