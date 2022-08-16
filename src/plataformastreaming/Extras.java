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
public class Extras extends SeleccionarContenido {
    
    @Override
    public void seleccionContenido(){
        Scanner consola = new Scanner(System.in);
        int extra;
        int aux=0; 
        int capfranco = 0, caliFranco; 
        int capAnimalPlanet = 0, caliAnimalPlanet, capHc = 0, caliHc;

        do {
            do {
                System.out.println("Ingrese el Extra que desea ver:");
                System.out.println("1. Franco Escamilla StandUp");
                System.out.println("2. Animal Planet");
                System.out.println("3. History Channel");
                System.out.println("4. Salir");
                extra= consola.nextInt();

                if (extra>= 1 && extra<= 4) {
                    aux = 1;
                } else {
                    System.out.println("\nNumeros solo del 1 al 4");
                }
            } while (aux == 0);

            if (extra == 1) {
                ++capfranco;
                System.out.println("Por favor califique la serie del 1 al 5: ");
                caliFranco = consola.nextInt();
                while (caliFranco > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliFranco = consola.nextInt();
                }
                System.out.println("La calificacion del episodio: " + caliFranco + " Capitulo visto: " + capfranco);

            } else if (extra == 2) {
                ++capAnimalPlanet;
                System.out.println("Por favor califique la serie del 1 al 5: ");
                caliAnimalPlanet = consola.nextInt();
                while (capAnimalPlanet > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    capAnimalPlanet = consola.nextInt();
                }
                System.out.println("La calificacion del episodio: " + caliAnimalPlanet + " Capitulo visto: " + capAnimalPlanet);
              
            } else if (extra== 3) {
                ++capHc;
                System.out.println("Por favor califique la serie del 1 al 5: ");
                caliHc = consola.nextInt();
                while (caliHc > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliHc = consola.nextInt();
                }
                System.out.println("La calificacion del episodio: " + caliHc + " Capitulo visto: " + capHc);
                
            } else if (extra == 4) {
                aux = 2;
            }
        } while (aux != 2);

        
    }

}
    

