
package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL ="jdbc:mysql://localhost:3306/biblioteca";
    
    private final String USER = "root";
    private final String PASS = "na12ta34";
    
    public void conectar() throws ClassNotFoundException{
        try {
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        } catch (SQLException ex) {
            System.getLogger(Database.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
    public void Cerrar() throws SQLException{
        if (conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
}
