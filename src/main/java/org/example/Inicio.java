package org.example;

import org.example.mensajes_app.Conexion;

import java.sql.*;

import java.sql.Connection;

/**
 *
 * @author ohmyfi
 */
public class Inicio {

    public static void main(String[] args){

        Conexion conexion = new Conexion();

        try(Connection cnx = conexion.get_connection()){

        }catch(Exception e) {
            System.out.println(e);
        }
    }

}
