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
public class LabVendas {
    private int labIdVendas;
    private Date labDataPedido;
    private int labCliente;
    private int labUsuario;
    private double labTotal;

    /**
     * @return the labIdVendas
     */
    public int getLabIdVendas() {
        return labIdVendas;
    }

    /**
     * @param labIdVendas the labIdVendas to set
     */
    public void setLabIdVendas(int labIdVendas) {
        this.labIdVendas = labIdVendas;
    }

    /**
     * @return the labDataPedido
     */
    public Date getLabDataPedido() {
        return labDataPedido;
    }

    /**
     * @param labDataPedido the labDataPedido to set
     */
    public void setLabDataPedido(Date labDataPedido) {
        this.labDataPedido = labDataPedido;
    }

    /**
     * @return the labCliente
     */
    public int getLabCliente() {
        return labCliente;
    }

    /**
     * @param labCliente the labCliente to set
     */
    public void setLabCliente(int labCliente) {
        this.labCliente = labCliente;
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
