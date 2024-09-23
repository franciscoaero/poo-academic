/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.association;

/**
 *
 * @author Usuário
 */
public class Association {
    public static void main(String[] args) {
        // Criando um associado
        Associate associado = new Associate(1, "João da Silva", "Rua A", 123, "12345-678", "Centro", 
                "Cidade", "UF", "1234-5678", "123.456.789-00", 101, "Ativo");

        // Criando um colaborador
        Contributor colaborador = new Contributor(2, "Maria de Souza", "Rua B", 456, "23456-789", 
                "Bairro", "Cidade", "UF", "2345-6789", "234.567.890-11", "Farmacêutica");

        // Criando um fornecedor
        Supplier fornecedor = new Supplier(3, "Farmaco S.A.", "Avenida C", 789, "34567-890", 
                "Industrial", "Cidade", "UF", "3456-7890", "345.678.901-22", "Farmaco Ltda", 
                "www.farmaco.com.br");

        // Exibindo as informações
        System.out.println("Associado:");
        System.out.println("Nome: " + associado.getNome());
        System.out.println("Número de Associado: " + associado.getNumeroAssociado());

        System.out.println("\nColaborador:");
        System.out.println("Nome: " + colaborador.getNome());
        System.out.println("Cargo: " + colaborador.getCargo());

        System.out.println("\nFornecedor:");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Nome Fantasia: " + fornecedor.getNomeFantasia());
        System.out.println("Website: " + fornecedor.getWebsite());
    }
}

