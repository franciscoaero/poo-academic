/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */


public class AvaliaAluno implements Conceito {

    public static void main(String[] args) {
        // Solicita a nota do aluno através de um input dialog
        String inputNota = JOptionPane.showInputDialog("Digite a nota do aluno (0.0 a 10.0):");
        
        try {
            // Converte o valor inserido para um número decimal
            double nota = Double.parseDouble(inputNota);
            
            // Estrutura de decisão para verificar o conceito baseado na nota
            if (nota >= 8.5) {
                JOptionPane.showMessageDialog(null, EXCELENTE);
            } else if (nota >= 6.0) {
                JOptionPane.showMessageDialog(null, SATISFATORIO);
            } else {
                JOptionPane.showMessageDialog(null, INSUFICIENTE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.");
        }
    }
}
