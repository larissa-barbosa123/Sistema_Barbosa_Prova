/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;


import java.util.Date;

/**
 *
 * @author tizzy
 */
public class LabCompras {
    private int labIdCompras;
    private Date labDataCompra;
    private int labFornecedor;
    private int labUsuario;
    private String labNumeroNota;
    private double labTotal;

    /**
     * @return the labIdCompras
     */
    public int getLabIdCompras() {
        return labIdCompras;
    }

    /**
     * @param labIdCompras the labIdCompras to set
     */
    public void setLabIdCompras(int labIdCompras) {
        this.labIdCompras = labIdCompras;
    }

    /**
     * @return the labDataCompra
     */
    public Date getLabDataCompra() {
        return labDataCompra;
    }

    /**
     * @param labDataCompra the labDataCompra to set
     */
    public void setLabDataCompra(Date labDataCompra) {
        this.labDataCompra = labDataCompra;
    }

    /**
     * @return the labFornecedor
     */
    public int getLabFornecedor() {
        return labFornecedor;
    }

    /**
     * @param labFornecedor the labFornecedor to set
     */
    public void setLabFornecedor(int labFornecedor) {
        this.labFornecedor = labFornecedor;
    }

    /**
     * @return the labUsuario
     */
    public int getLabUsuario() {
        return labUsuario;
    }

    /**
     * @param labUsuario the labUsuario to set
     */
    public void setLabUsuario(int labUsuario) {
        this.labUsuario = labUsuario;
    }

    /**
     * @return the labNumeroNota
     */
    public String getLabNumeroNota() {
        return labNumeroNota;
    }

    /**
     * @param labNumeroNota the labNumeroNota to set
     */
    public void setLabNumeroNota(String labNumeroNota) {
        this.labNumeroNota = labNumeroNota;
    }

    /**
     * @return the labTotal
     */
    public double getLabTotal() {
        return labTotal;
    }

    /**
     * @param labTotal the labTotal to set
     */
    public void setLabTotal(double labTotal) {
        this.labTotal = labTotal;
    }
}
