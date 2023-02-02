package com.example.despesa;

public class Despesa {
    private int id;
    private String nome;
    private double valor;
    private boolean isPago;

    public Despesa(String nome, double valor, boolean isPago){
        this.nome = nome;
        this.valor = valor;
        this.isPago = isPago;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPago(boolean pago) {
        this.isPago = pago;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValor() {
        return this.valor;
    }

    public boolean isPago() {
        return this.isPago;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
