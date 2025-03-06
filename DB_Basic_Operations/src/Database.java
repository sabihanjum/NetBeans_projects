
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drsab
 */
public class Database {
    String jdbcdriver = "";
    String dbURL = "";
    String username = "";
    String password = "";
    Connection connection;
    private String statement;
     
     public Database() throws ClassNotFoundException, SQLException
     {
        jdbcdriver = "com.mysql.jdbc.Driver";
        dbURL ="jdbc:mysql://localhost:3306/student";
        username ="root";
        password="Root";
        //1.JDBC Driver
        Class.forName(jdbcdriver);
        //2. connecion with database
        connection = DriverManager.getConnection(dbURL,username,password);
     }
     //3.Prepare a statements or query
        public ResultSet executeQuery(String query) throws SQLException
        {
            PreparedStatement st = connection.prepareStatement(query);
            return st.executeQuery();
        }
        public int executeUpdate(String statement) throws SQLException
        {
            PreparedStatement st = connection.prepareStatement(statement);
            return st.executeUpdate();
        }
        //4.close connection
        public void close()
        {
            try{
                connection.close();
            }catch (SQLException ex){
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
}
   

