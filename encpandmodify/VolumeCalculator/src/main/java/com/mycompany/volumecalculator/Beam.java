/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.volumecalculator;

/**
 *
 * @author Usuário
 */
public class Beam {
    // Atributos privados
    private double base;
    private double altura;
    private double comprimento;

    // Método para definir a base da viga
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            throw new IllegalArgumentException("A base deve ser maior que zero.");
        }
    }

    // Método para definir a altura da viga
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
    }

    // Método para definir o comprimento da viga
    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        } else {
            throw new IllegalArgumentException("O comprimento deve ser maior que zero.");
        }
    }

    // Método para obter a base da viga
    public double getBase() {
        return this.base;
    }

    // Método para obter a altura da viga
    public double getAltura() {
        return this.altura;
    }

    // Método para obter o comprimento da viga
    public double getComprimento() {
        return this.comprimento;
    }

    // Método para calcular o volume da viga
    public double calcularVolume() {
        return this.base * this.altura * this.comprimento;
    }
}

