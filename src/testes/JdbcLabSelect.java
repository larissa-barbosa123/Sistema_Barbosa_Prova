/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u07862281136
 */
public class JdbcLabSelect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
           
            url = "jdbc:mysql://10.7.0.51:33062/db_larissa_barbosa";
            user = "larissa_barbosa";
            password = "larissa_barbosa";
           
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            Statement stm = cnt.createStatement();
           
            PreparedStatement pst = cnt.prepareStatement("select * from lab_usuarios");
           
            ResultSet rs = pst.executeQuery();
           
            while (rs.next() == true) {
                System.out.println("nome: " + rs.getString("lab_nome"));
                System.out.println("cpf: " + rs.getString("lab_cpf"));
            }
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcLabSelect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcLabSelect.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Executou");
    }
}

