/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.LabVendas;
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
public class DaoLabVendas extends DaoLabAbstract{
     @Override
    public void insert(Object object) {
        LabVendas labVendas = (LabVendas) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://10.7.0.51:33062/db_larissa_barbosa";
            String user = "larissa_barbosa";
            String password = "larissa_barbosa";
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "insert into lab_Vendas values (?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, labVendas.getLabIdVendas());
            pst.setDate(2, null);
            pst.setInt(3, labVendas.getLabCliente());
            pst.setInt(4, labVendas.getLabUsuario());
            pst.setDouble(5, labVendas.getLabTotal());
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
