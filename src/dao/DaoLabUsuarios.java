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
import testes.JdbcCrud;


/**
 *
 * @author u07862281136
 */
public class DaoLabUsuarios extends DaoAbstract {
    
   @Override
    public void insert(Object object) {
        LabUsuarios mpvUsuarios = (LabUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_larissa_barbosa";
            user = "larissa_barbosa";
            password = "larissa_barbosa";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into lab_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, mpvUsuarios.getLabIdUsuarios());
            pst.setString(2, mpvUsuarios.getLabNome());
            pst.setString(3, mpvUsuarios.getLabApelido());
            pst.setString(4, mpvUsuarios.getLabCpf());
            pst.setDate(5, null);
            pst.setInt(6, mpvUsuarios.getLabNivel());
            pst.setString(7, mpvUsuarios.getLabSenha());
            pst.setString(8, mpvUsuarios.getLabAtivo());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
    }

    @Override
    public void delete(Object object) {
        LabUsuarios mpvUsuarios = (LabUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_marcos_vilhanueva";
            user = "marcos_vilhanueva";
            password = "marcos_vilhanueva";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(
                    "delete from  mpv_usuarios where id_mpvusuarios=?");
            pst.setInt(1, mpvUsuarios.getLabIdUsuarios());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
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
