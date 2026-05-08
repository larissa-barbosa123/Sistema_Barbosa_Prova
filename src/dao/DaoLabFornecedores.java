
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.LabFornecedores;
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
public class DaoLabFornecedores extends DaoLabAbstract {
      @Override
    public void insert(Object object) {
        LabFornecedores labFornecedores = (LabFornecedores) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://10.7.0.51:33062/db_larissa_barbosa";
            String user = "larissa_barbosa";
            String password = "larissa_barbosa";
            Connection cnt = DriverManager.getConnection(url, user, password);
            
            String sql = "insert into lab_Fornecedores values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            
            pst.setInt(1, labFornecedores.getLabIdFornecedor());
            pst.setString(2, labFornecedores.getLabNomeEmpresa());
            pst.setString(3, labFornecedores.getLabResponsavel());
            pst.setString(4, labFornecedores.getLabCnpj());
            pst.setString(5, labFornecedores.getLabTelefoneContato());
            pst.setString(6, labFornecedores.getLabEmail());
            pst.setString(7, labFornecedores.getLabEndereco());
            pst.setString(8, labFornecedores.getLabNumero());
            pst.setString(9, labFornecedores.getLabBairro());
            pst.setString(10, labFornecedores.getLabCidade());
            pst.setString(11, labFornecedores.getLabEstado());
            pst.setString(12, labFornecedores.getLabCep());
            pst.setString(13, labFornecedores.getLabTiposProdutos());
            pst.setString(14, labFornecedores.getLabEntrega());
            pst.setString(15, labFornecedores.getLabFormasPagamento());
            pst.setString(16, labFornecedores.getLabAtivo());
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
