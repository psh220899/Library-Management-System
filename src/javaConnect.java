/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author psh22
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaConnect {
    Connection conn;
    public static Connection  connectDB()
    {
        try
            {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/librarydbmgnt?useTimezone=true&serverTimezone=UTC","root","");
                    return conn;
            }
        catch(Exception e)
            {
                   JOptionPane.showMessageDialog(null, e);
                   return null;
            }
    }
}
