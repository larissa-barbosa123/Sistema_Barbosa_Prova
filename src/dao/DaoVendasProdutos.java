/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.LabVendasProdutos;
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
public class DaoVendasProdutos extends DaoLabAbstract {
     @Override
    public void insert(Object object) {
        LabVendasProdutos labVendasProdutos = (LabVendasProdutos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://10.7.0.51:33062/db_larissa_barbosa";
            String user = "larissa_barbosa";
            String password = "larissa_barbosa";
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "insert into lab_VendasProdutos values (?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, labVendasProdutos.getLabIdVendasProdutos());
            pst.setInt(2, labVendasProdutos.getLabVendas());
            pst.setInt(3, labVendasProdutos.getLabProdutos());
            pst.setInt(4, labVendasProdutos.getLabQuantidade());          
            pst.setDouble(5, labVendasProdutos.getLabValorUnitario());                   
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
