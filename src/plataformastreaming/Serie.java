/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plataformastreaming;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class Serie extends SeleccionarContenido{
    int serie;
    int capFlash=0,capBB=0,capArrow=0;
    int calificacionFlash,calificacionBB,calificacionArrow;
    int aux=0;
    Scanner sc=new Scanner (System.in);

    @Override
    public void seleccionContenido() {
           do {
            do {
                System.out.println("ingrese la serie que desea ver");
                System.out.println("1) Flash");
                System.out.println("2) Breaking Bad");
                System.out.println("3) Arrow");
                System.out.println("4) Salir Series");
                serie=sc.nextInt();

                if (serie >= 1 && serie <= 4) {
                    aux = 1;
                } else {
                    System.out.println("Solo numeros del 1 al 4");
                }
            } while (aux == 0);

            if (serie == 1) {
                ++capFlash;
                System.out.println("Por favor califique la serie del 1 al 5: ");
                calificacionFlash = sc.nextInt();
                while (calificacionFlash > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    calificacionFlash = sc.nextInt();
                }
                System.out.println("La calificacion del episodio: " + calificacionFlash + " Capitulo visto: " + capFlash);

            } else if (serie == 2) {
                ++capBB;
                System.out.println("Por favor califique la serie del 1 al 5: ");
                calificacionBB = sc.nextInt();
                while (calificacionBB > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    calificacionBB = sc.nextInt();
                }
                System.out.println("La calificacion del episodio: " + calificacionBB + " Capitulo visto: " + capBB);
              
            } else if (serie == 3) {
                ++capArrow;
                System.out.println("Por favor califique la serie del 1 al 5: ");
                calificacionArrow = sc.nextInt();
                while (calificacionArrow > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    calificacionArrow = sc.nextInt();
                }
                System.out.println("La calificacion del episodio: " + calificacionArrow + " Capitulo visto: " + capArrow);
                
            } else if (serie == 4) {
                
                aux = 2;
            }
        } while (aux != 2);
        //capitulo=getCapitulo();
        //System.out.println();
    }
}
