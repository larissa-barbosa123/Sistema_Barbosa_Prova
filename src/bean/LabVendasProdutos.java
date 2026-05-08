/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.math.BigDecimal;

/**
 *
 * @author tizzy
 */
public class LabVendasProdutos {
    private int labIdVendasProdutos;
    private int labVendas;
    private int labProdutos;
    private int labQuantidade;
    private BigDecimal labValorUnitario;

    /**
     * @return the labIdVendasProdutos
     */
    public int getLabIdVendasProdutos() {
        return labIdVendasProdutos;
    }

    /**
     * @param labIdVendasProdutos the labIdVendasProdutos to set
     */
    public void setLabIdVendasProdutos(int labIdVendasProdutos) {
        this.labIdVendasProdutos = labIdVendasProdutos;
    }

    /**
     * @return the labVendas
     */
    public int getLabVendas() {
        return labVendas;
    }

    /**
     * @param labVendas the labVendas to set
     */
    public void setLabVendas(int labVendas) {
        this.labVendas = labVendas;
    }

    /**
     * @return the labProdutos
     */
    public int getLabProdutos() {
        return labProdutos;
    }

    /**
     * @param labProdutos the labProdutos to set
     */
    public void setLabProdutos(int labProdutos) {
        this.labProdutos = labProdutos;
    }

    /**
     * @return the labQuantidade
     */
    public int getLabQuantidade() {
        return labQuantidade;
    }

    /**
     * @param labQuantidade the labQuantidade to set
     */
    public void setLabQuantidade(int labQuantidade) {
        this.labQuantidade = labQuantidade;
    }

    /**
     * @return the labValorUnitario
     */
    public BigDecimal getLabValorUnitario() {
        return labValorUnitario;
    }

    /**
     * @param labValorUnitario the labValorUnitario to set
     */
    public void setLabValorUnitario(BigDecimal labValorUnitario) {
        this.labValorUnitario = labValorUnitario;
    }
}
