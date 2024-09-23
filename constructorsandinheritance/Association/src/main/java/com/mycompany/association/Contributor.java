/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.association;

/**
 *
 * @author Usuário
 */
public class Contributor extends People {
    private String cargo;

    public Contributor(int id, String nome, String logradouro, int numero, String cep, String bairro, 
                       String cidade, String uf, String telefone, String cpfCnpj, String cargo) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
