/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class conexion {
    
    Connection conectar = null; 
    String usuario ="admin";
    String password ="samuel123";
    String bd ="bdfinalapobreza";
    String ip ="crud.c920g66kq4od.us-east-1.rds.amazonaws.com";
    String puerto = "3306";

    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;

    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena, usuario, password);
            JOptionPane.showMessageDialog(null, "Se conectó a la base de datos");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conectó a la base de datos, error"+e.toString());
        }
     return conectar;
 }
}

