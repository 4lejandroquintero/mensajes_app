package org.example.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author ohmyfi
 */
public class mensajesService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("tu nombre");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensajes(){

    }
    public static void borrarMensaje(){

    }

    public static void editarMensaje(){

    }

}
