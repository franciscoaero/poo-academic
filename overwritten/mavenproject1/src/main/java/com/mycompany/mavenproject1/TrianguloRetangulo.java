/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Usuário
 */
public class TrianguloRetangulo extends FiguraGeometrica {

    public TrianguloRetangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

