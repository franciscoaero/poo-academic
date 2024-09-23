/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicleregistration;

/**
 *
 * @author Usuário
 */
public class CargoVehicle extends Vehicle {
    private double capacidadeMaximaCarga;

    public CargoVehicle(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String chassi,
                          String renavam, String procedencia, double capacidadeCargaKg, double altura, double largura,
                          double profundidade, double capacidadeMaximaCarga) {
        super(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, capacidadeCargaKg, altura,
              largura, profundidade);
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    // Getter e Setter para capacidadeMaximaCarga
    public double getCapacidadeMaximaCarga() {
        return capacidadeMaximaCarga;
    }

    public void setCapacidadeMaximaCarga(double capacidadeMaximaCarga) {
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }
}

