package com.mycompany.heranca;

public class Automoveis {
    
    protected String modelo;
    protected double preco;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void printModelo() {
        System.out.println("Modelo: " + this.modelo);
    }
    public void printPreco() {
        System.out.println("Preço: " + this.preco);
    }
    public void calcPreco() {
        this.preco = 10000.00;
    }
    
}