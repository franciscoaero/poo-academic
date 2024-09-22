/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.volumecalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class VolumeCalculator {
    public static void main(String[] args) {
        // Criação de um objeto Viga
        Beam beam = new Beam();

        try {
            // Solicita a base ao usuário e define no objeto Viga
            double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base da viga (em metros):"));
            beam.setBase(base);
            
            // Solicita a altura ao usuário e define no objeto Viga
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da viga (em metros):"));
            beam.setAltura(altura);

            // Solicita o comprimento ao usuário e define no objeto Viga
            double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento da viga (em metros):"));
            beam.setComprimento(comprimento);

            // Calcula o volume da viga e exibe o resultado
            double volume = beam.calcularVolume();
            JOptionPane.showMessageDialog(null, "O volume de concreto necessário é: " + volume + " metros cúbicos.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
