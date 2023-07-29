package org.example.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ohmyfi
 */
public class Conexion {

    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","Alejandro1996nal");
            if(conection != null){
                System.out.println("conexion exitosa");
            }

        }catch(SQLException e) {
            System.out.println(e);
        }
        return conection;

    }

}