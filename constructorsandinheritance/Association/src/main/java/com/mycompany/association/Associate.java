/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.association;

/**
 *
 * @author Usuário
 */
public class Associate extends People {
    private String situacao;
    private int numeroAssociado;

    public Associate(int id, String nome, String logradouro, int numero, String cep, String bairro, 
                     String cidade, String uf, String telefone, String cpfCnpj, int numeroAssociado, 
                     String situacao) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.numeroAssociado = numeroAssociado;
        this.situacao = situacao;
    }

    public int getNumeroAssociado() {
        return numeroAssociado;
    }

    public void setNumeroAssociado(int numeroAssociado) {
        this.numeroAssociado = numeroAssociado;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}

