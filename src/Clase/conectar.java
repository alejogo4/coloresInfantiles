package Clase;


import java.sql.Connection;
import java.sql.DriverManager;

public class conectar {
    Connection conectar=null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/coloresinfantiles","colores","admin123");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
    
}
