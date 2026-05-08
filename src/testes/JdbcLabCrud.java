/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u07862281136
 */
public class JdbcLabCrud {
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
            
            // stm.executeUpdate("insert into lab_usuarios(lab_idusuarios, lab_nome, lab_apelido, lab_cpf) values(508, 'larissa', 'lab', '998954')");
            
//            PreparedStatment pst = cnt.prepareStatement("insert into mpv_usuarios"
//                    + "(lab_idusuarios, lab_nome, lab_apelido, lab_cpf) values(?,?,?,?)");
//            
//            pst.setInt(1, 508);
//            pst.setString(2, "larissa");
//            pst.setString(3, "larecaa");
//            pst.setString(4, "8765467");
//            pst.executeUpdate();
            
//            PreparedStatement pst = cnt.prepareStatement("update lab_usuarios set lab_nome=?, lab_apelido=? where lab_idusuarios=?");
//            
//            pst.setString(1, "lareca");
//            pst.setString(2, "careca");
//            pst.setInt(3, 508);
//            pst.executeUpdate();
            
            PreparedStatement pst = cnt.prepareStatement("delete from lab_usuarios where lab_idusuarios=?");
            
            pst.setInt(1, 508);
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcLabCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcLabCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Executou");
    }
}

