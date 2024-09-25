/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Usuário
 */
public abstract class FiguraGeometrica {
    protected double base;
    protected double altura;

    public FiguraGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract double calcularArea(); // Método abstrato
}
