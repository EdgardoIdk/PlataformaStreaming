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
public abstract class SeleccionarContenido {
    Scanner sc=new Scanner(System.in);
    int opcion, capitulo;
    
    
    public void seleccion(){
        do{
        System.out.println("Seleccione que desea ver");
        
        
        System.out.println("1 Peliculas");
        System.out.println("2 Series");
        System.out.println("3 Extras");
            System.out.println("4 Salir");
        opcion=sc.nextInt();
        
        if (opcion == 1) {
            SeleccionarContenido traer=new Peliculas();
                traer.seleccionContenido();
            } else if (opcion == 2) {
                SeleccionarContenido traer=new Serie();
                traer.seleccionContenido();

            } else if (opcion == 3) {
                SeleccionarContenido traer=new Extras();
                traer.seleccionContenido();
            }
        
        }while(opcion!=4);     
}
    
    public void Peliculas(){
        
    }
    public void Series(){
        
        
    }
    public void Extras(){
        
    }
    
    public abstract void seleccionContenido();
    
    public int getCapitulo(){
        return capitulo;
    }
    public void setCapitulo(int capitulo2){
        this.capitulo=capitulo2;
    }
    }
