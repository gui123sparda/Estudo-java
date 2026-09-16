package com.estudojava.gui.carro;

public class Carro {
    String marca;
    String modelo;
    int ano;
    String cor;
    String placa;

    public Carro(String marca, String modelo, int ano, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    public void ligar() {
        System.out.println("Ligando");
    }
    public void desligar() {
        System.out.println("Desligando");
    }

    void teste(){
        System.out.println("Teste");
    }
}
