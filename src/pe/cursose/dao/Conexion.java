package pe.cursose.dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author hikaru
 */
public class Conexion {
    protected Connection conexion = null;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
    private final String DB_URL = "jdbc:mysql://localhost/gperfildb";

    private final String USER = "root";
    private final String PASS = "123456";
    
    public void conectar() throws Exception{
        try {
            conexion = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);  
        } catch (Exception e) {
            throw e;
        }
    }
    public void cerrar() throws SQLException{
        if (conexion != null) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
    }

}
