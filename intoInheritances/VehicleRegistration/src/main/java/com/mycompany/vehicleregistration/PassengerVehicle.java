/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicleregistration;

/**
 *
 * @author Usuário
 */
public class PassengerVehicle extends Vehicle {
    private int numeroPassageiros;

    public PassengerVehicle(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String chassi,
                               String renavam, String procedencia, double capacidadeCargaKg, double altura, double largura,
                               double profundidade, int numeroPassageiros) {
        super(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, capacidadeCargaKg, altura,
              largura, profundidade);
        this.numeroPassageiros = numeroPassageiros;
    }

    // Getter e Setter para numeroPassageiros
    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
}
