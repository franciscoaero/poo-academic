/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.association;

/**
 *
 * @author Usuário
 */
public class Supplier extends People {
    private String nomeFantasia;
    private String website;

    public Supplier(int id, String nome, String logradouro, int numero, String cep, String bairro, 
                      String cidade, String uf, String telefone, String cpfCnpj, String nomeFantasia, 
                      String website) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.nomeFantasia = nomeFantasia;
        this.website = website;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}

