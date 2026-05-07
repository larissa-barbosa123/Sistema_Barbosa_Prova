/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;
import java.math.BigDecimal;


/**
 *
 * @author tizzy
 */
public class LabVendedores {
    private int labIdVendedor;
    private String labNome;
    private String labCelular;
    private String labEmail;   
    private String labUsuarioSistema;
    private int labSenhaSistema;
    private BigDecimal labMetaVendas;
    private String labAtivo;
    private Date labDataCadastro;

    /**
     * @return the labIdVendedor
     */
    public int getLabIdVendedor() {
        return labIdVendedor;
    }

    /**
     * @param labIdVendedor the labIdVendedor to set
     */
    public void setLabIdVendedor(int labIdVendedor) {
        this.labIdVendedor = labIdVendedor;
    }

    /**
     * @return the labNome
     */
    public String getLabNome() {
        return labNome;
    }

    /**
     * @param labNome the labNome to set
     */
    public void setLabNome(String labNome) {
        this.labNome = labNome;
    }

    /**
     * @return the labCelular
     */
    public String getLabCelular() {
        return labCelular;
    }

    /**
     * @param labCelular the labCelular to set
     */
    public void setLabCelular(String labCelular) {
        this.labCelular = labCelular;
    }

    /**
     * @return the labEmail
     */
    public String getLabEmail() {
        return labEmail;
    }

    /**
     * @param labEmail the labEmail to set
     */
    public void setLabEmail(String labEmail) {
        this.labEmail = labEmail;
    }

    /**
     * @return the labUsuarioSistema
     */
    public String getLabUsuarioSistema() {
        return labUsuarioSistema;
    }

    /**
     * @param labUsuarioSistema the labUsuarioSistema to set
     */
    public void setLabUsuarioSistema(String labUsuarioSistema) {
        this.labUsuarioSistema = labUsuarioSistema;
    }

    /**
     * @return the labSenhaSistema
     */
    public int getLabSenhaSistema() {
        return labSenhaSistema;
    }

    /**
     * @param labSenhaSistema the labSenhaSistema to set
     */
    public void setLabSenhaSistema(int labSenhaSistema) {
        this.labSenhaSistema = labSenhaSistema;
    }

    /**
     * @return the labAtivo
     */
    public String getLabAtivo() {
        return labAtivo;
    }

    /**
     * @param labAtivo the labAtivo to set
     */
    public void setLabAtivo(String labAtivo) {
        this.labAtivo = labAtivo;
    }

    /**
     * @return the labDataCadastro
     */
    public Date getLabDataCadastro() {
        return labDataCadastro;
    }

    /**
     * @param labDataCadastro the labDataCadastro to set
     */
    public void setLabDataCadastro(Date labDataCadastro) {
        this.labDataCadastro = labDataCadastro;
    }
}
