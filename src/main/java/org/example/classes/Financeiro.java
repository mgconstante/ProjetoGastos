package org.example.classes;

import java.time.LocalDate;

public class Financeiro {
    private int id_financeiro;
    private String ds_financeiro;
    private int id_tipo;
    private int id_dinheiro;
    private int id_grupo;
    private Double valor;
    private LocalDate data;

    public Financeiro(String ds_financeiro, int id_tipo, int id_dinheiro,  Double valor, int id_grupo, LocalDate data) {
        this.ds_financeiro = ds_financeiro;
        this.id_tipo = id_tipo;
        this.id_dinheiro = id_dinheiro;
        this.id_grupo = id_grupo;
        this.valor = valor;
        this.data = data;
    }

    public int getId_financeiro() {
        return id_financeiro;
    }

    public void setId_financeiro(int id_financeiro) {
        this.id_financeiro = id_financeiro;
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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
