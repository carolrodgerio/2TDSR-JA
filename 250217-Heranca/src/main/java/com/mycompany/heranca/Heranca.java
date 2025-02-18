package com.mycompany.heranca;

public class Heranca {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo("Sandero");
        carro.printModelo();
        carro.calcPreco();
        carro.printPreco();
        
        Moto moto = new Moto();
        moto.setModelo("Yamaha");
        moto.printModelo();
        moto.calcPreco();
        moto.printPreco();
        
        Caminhao caminhao = new Caminhao();
        caminhao.setModelo("Mercedes");
        caminhao.printModelo();
        caminhao.calcPreco();
        caminhao.printPreco();
   
    }
}