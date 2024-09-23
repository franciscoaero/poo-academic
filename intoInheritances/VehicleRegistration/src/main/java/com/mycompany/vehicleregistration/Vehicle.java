/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicleregistration;

/**
 *
 * @author Usuário
 */

public class Vehicle {
    // Atributos comuns a todos os veículos
    private String placa;
    private String marca;
    private String modelo;
    private int anoModelo;
    private int anoFabricacao;
    private String chassi;
    private String renavam;
    private String procedencia; // Nacional ou Importado
    private double capacidadeCargaKg;
    private double altura;
    private double largura;
    private double profundidade;

    // Construtor da classe
    public Vehicle(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String chassi,
                   String renavam, String procedencia, double capacidadeCargaKg, double altura, double largura,
                   double profundidade) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.chassi = chassi;
        this.renavam = renavam;
        this.procedencia = procedencia;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    // Getters e Setters para cada atributo
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public double getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }

    public void setCapacidadeCargaKg(double capacidadeCargaKg) {
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
}

