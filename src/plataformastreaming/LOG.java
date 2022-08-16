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
public class LOG{
    Scanner sc = new Scanner(System.in);

    public boolean login() {
        Login login = new Login("Edgardo", "contra");
        System.out.println("Porfavor ingrese su user");
        String username = sc.nextLine();
        System.out.println("Porfavor ingrese su contrasena");
        String password = sc.nextLine();

        if (username.equals(login.getUsername()) && password.equals(login.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

     public void IniciarSesion() {
        
        LOG inicio = new LOG();

        if (inicio.login()) {
            System.out.println("Acceso correcto");
            SeleccionarContenido invocar=new Serie();
            invocar.seleccion();
        } else {
            System.out.println("Datos incorrectos, ingrese denuevo");
            inicio.IniciarSesion();
        }

    }

}
