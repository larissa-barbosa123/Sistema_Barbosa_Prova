/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.LabUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcLabCrud;


/**
 *
 * @author u07862281136
 */
public class DaoLabUsuarios extends DaoLabAbstract {
    
   @Override
    public void insert(Object object) {
        LabUsuarios labUsuarios = (LabUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://10.7.0.51:33062/db_larissa_barbosa";
            String user = "larissa_barbosa";
            String password = "larissa_barbosa";
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "insert into lab_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, labUsuarios.getLabIdUsuario());
            pst.setString(2, labUsuarios.getLabNome());
            pst.setString(3, labUsuarios.getLabApelido());
            pst.setString(4, labUsuarios.getLabCpf());
            pst.setDate(5, null);
            pst.setInt(6, labUsuarios.getLabNivel());
            pst.setString(7, labUsuarios.getLabSenha());
            pst.setString(8, labUsuarios.getLabAtivo());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcLabCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcLabCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
    }

    @Override
    public void delete(Object object) {
    }

    @Override
    public Object list(int id) {

        return null;
    }

    @Override
    public Object listAll() {

        return null;
    }

}
