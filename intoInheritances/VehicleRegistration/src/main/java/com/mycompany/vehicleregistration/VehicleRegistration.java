/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicleregistration;

/**
 *
 * @author Usuário
 */

public class VehicleRegistration {
    public static void main(String[] args) {
        // Criando um veículo de carga
        CargoVehicle caminhao = new CargoVehicle("ABC-1234", "Volvo", "FH16", 2021, 2020, "9BWZZZ377VT004251", 
                "123456789", "Nacional", 18000, 4.0, 2.5, 6.0, 20000);

        // Criando um veículo de passageiro
        PassengerVehicle carro = new PassengerVehicle("DEF-5678", "Toyota", "Corolla", 2022, 2021, "9BWZZZ377VT004252", 
                "987654321", "Importado", 500, 1.5, 1.8, 4.5, 5);

        // Exibindo informações dos veículos
        System.out.println("Veículo de Carga:");
        System.out.println("Marca: " + caminhao.getMarca());
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Capacidade Máxima de Carga: " + caminhao.getCapacidadeMaximaCarga() + " kg");

        System.out.println("\nVeículo de Passageiro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Número de Passageiros: " + carro.getNumeroPassageiros());
    }
}

