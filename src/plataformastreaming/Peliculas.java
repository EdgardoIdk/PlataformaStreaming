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
public class Peliculas extends SeleccionarContenido{

    @Override
    public void seleccionContenido() {
        Scanner consola = new Scanner(System.in);
        int pelicula;
        int aux=0; 
        int calidbz; 
        String capthor, capAvenger, capdbz;
        int calithor, caliAvenger;;

        do {
            do {
                System.out.println("Ingrese la saga de peliculas que desea ver:");
                System.out.println("1. Dragon Ball Z");
                System.out.println("2. Avenger");
                System.out.println("3. Thor");
                System.out.println("4. Salir");
                pelicula = consola.nextInt();

                if (pelicula >= 1 && pelicula <= 4) {
                    aux = 1;
                } else {
                    System.out.println("Solo numeros del 1 al 4");
                }
            } while (aux == 0);

            if (pelicula == 1) {
                capdbz="Visto!!!";
                System.out.println("Por favor califique la pelicula del 1 al 5: ");
                calidbz = consola.nextInt();
                while (calidbz > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    calidbz = consola.nextInt();
                }
                System.out.println("La calificacion de la pelicula: " + calidbz + " Pelicula vista: " + capdbz);

            } else if (pelicula == 2) {
                capAvenger="Visto!!!";
                System.out.println("Por favor califique la pelicula del 1 al 5: ");
                caliAvenger = consola.nextInt();
                while (caliAvenger > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliAvenger = consola.nextInt();
                }
                System.out.println("La calificacion de la pelicula: " + caliAvenger + " Pelicula vista: " + capAvenger);
              
            } else if (pelicula == 3) {
                capthor="Visto!!!";
                System.out.println("Por favor califique la pelicula del 1 al 5: ");
                calithor = consola.nextInt();
                while (calithor > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    calithor = consola.nextInt();
                }
                System.out.println("La calificacion de la pelicula: " + calithor + " Pelicula vista: " + capthor);
                
            } else if (pelicula == 4) {
                aux= 2;
            }
        } while (aux!= 2);

        
    }

}
