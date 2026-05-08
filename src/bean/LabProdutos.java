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
public class LabProdutos {
    private int labIdProduto;
    private String labNomeProduto;
    private String labDescricao;
    private String labTipoProduto;
    private String labTamanho;
    private BigDecimal labPreco;
    private String labAtivo;

    /**
     * @return the labIdProduto
     */
    public int getLabIdProduto() {
        return labIdProduto;
    }

    /**
     * @param labIdProduto the labIdProduto to set
     */
    public void setLabIdProduto(int labIdProduto) {
        this.labIdProduto = labIdProduto;
    }

    /**
     * @return the labNomeProduto
     */
    public String getLabNomeProduto() {
        return labNomeProduto;
    }

    /**
     * @param labNomeProduto the labNomeProduto to set
     */
    public void setLabNomeProduto(String labNomeProduto) {
        this.labNomeProduto = labNomeProduto;
    }

    /**
     * @return the labdescricao
     */
    public String getLabDescricao() {
        return labDescricao;
    }

    /**
     * @param labDescricao the labdescricao to set
     */
    public void setLabdescricao(String labDescricao) {
        this.labDescricao = labDescricao;
    }

    /**
     * @return the labTipoProduto
     */
    public String getLabTipoProduto() {
        return labTipoProduto;
    }

    /**
     * @param labTipoProduto the labTipoProduto to set
     */
    public void setLabTipoProduto(String labTipoProduto) {
        this.labTipoProduto = labTipoProduto;
    }

    /**
     * @return the labTamanho
     */
    public String getLabTamanho() {
        return labTamanho;
    }

    /**
     * @param labTamanho the labTamanho to set
     */
    public void setLabTamanho(String labTamanho) {
        this.labTamanho = labTamanho;
    }

    /**
     * @return the labPreco
     */
    public BigDecimal getLabPreco() {
        return labPreco;
    }

    /**
     * @param labPreco the labPreco to set
     */
    public void setLabPreco(BigDecimal labPreco) {
        this.labPreco = labPreco;
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
}
