/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.LabVendedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcLabCrud;

/**
 *
 * @author tizzy
 */
public class DaoLabVendedores extends DaoLabAbstract{
     @Override
    public void insert(Object object) {
        LabVendedores labVendedores = (LabVendedores) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://10.7.0.51:33062/db_larissa_barbosa";
            String user = "larissa_barbosa";
            String password = "larissa_barbosa";
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "insert into lab_Vendedores values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, labVendedores.getLabIdVendedor());
            pst.setString(2, labVendedores.getLabCelular());
            pst.setString(3, labVendedores.getLabEmail());
            pst.setString(4, labVendedores.getLabUsuarioSistema());
            pst.setInt(5, labVendedores.getLabSenhaSistema());
            pst.setDouble(6, labVendedores.getLabMetaVendas());
            pst.setString(7, labVendedores.getLabAtivo());
             pst.setDate(8, null);
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
