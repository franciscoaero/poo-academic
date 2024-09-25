/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Usuário
 */
public class Mavenproject1 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        TrianguloRetangulo triangulo = new TrianguloRetangulo(4, 6);

        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Triângulo Retângulo: " + triangulo.calcularArea());
    }
}

