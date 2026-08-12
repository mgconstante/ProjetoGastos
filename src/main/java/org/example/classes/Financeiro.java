package org.example.classes;

public class Financeiro {
    private int id_financeiro;
    private String ds_financeiro;
    private int id_tipo;
    private int id_dinheiro;
    private Double valor;

    public Financeiro(String ds_financeiro, int id_tipo, int id_dinheiro, Double valor) {
        this.ds_financeiro = ds_financeiro;
        this.id_tipo = id_tipo;
        this.id_dinheiro = id_dinheiro;
        this.valor = valor;
    }

    public String getDs_financeiro() {
        return ds_financeiro;
    }

    public void setDs_financeiro(String ds_financeiro) {
        this.ds_financeiro = ds_financeiro;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getId_dinheiro() {
        return id_dinheiro;
    }

    public void setId_dinheiro(int id_dinheiro) {
        this.id_dinheiro = id_dinheiro;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
