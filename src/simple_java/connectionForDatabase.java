/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Atharva
 */
/*For The connection purpose run this code once to crate database in postgresql*/
public class connectionForDatabase {
    
       public static void main(String[] args) throws SQLException{
           
           Connection conn = null;
                   try{
                   Class.forName("org.postgresql.Driver");
                   conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "MahatmaGandhi");
                   JOptionPane.showMessageDialog(null, "Welcome sir the database has been connected");
                   }
                   catch(Exception s)
                   {
                       System.out.println("SQLException"+s);
                   }
                    
                   Statement stmt = conn.createStatement();

          String sql="CREATE TABLE ICICI_BANK(account_number int primary key,accountholdername varchar (40),atm_pin int, account_balance float(4))";

            stmt.executeUpdate(sql);
            

    }

           
       }
    

    

