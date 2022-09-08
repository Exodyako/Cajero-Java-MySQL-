
package cajero;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Conexion {
    
    public static String hostDB = "localhost";
    public static String puertoDB = "3306";
    public static String userDB = "root";
    public static String passDB = "";
    public static String sqlDB = "cajero";
    public static String driverDB = "com.mysql.jdbc.Driver";
    public static String gestorDB = "mysql";
    
    private java.sql.Connection conn;
    private String DRIVER = driverDB;
    private String DBURL = "jdbc:"+gestorDB+"://"+hostDB+":"+puertoDB+"/"+sqlDB;
    private String USER = userDB;
    private String PASS = passDB;
    private boolean mantenerConexion;    
    
    public Conexion(){
    
        this.mantenerConexion = mantenerConexion;
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(DBURL, USER, PASS);
            //System.out.println("Conexion Establecida\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public java.sql.Connection ComprobarConexion(){
        java.sql.Connection cn = null;
        try {
            Class.forName(DRIVER);
            cn = DriverManager.getConnection(DBURL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar con el servidor...\n("+e.getMessage()+")");
        }
        return cn;
    }
}
