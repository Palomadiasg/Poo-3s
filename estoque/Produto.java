/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estoque1;

/**
 *
 * @author palomadias
 */
public class Produto {
    
    private String nome;
    private double preco;
    private int quantEmEstoque;
    
    public Produto(String nome, double preco, int quant) {
    this.nome = nome;
    this.preco = preco;
    this.quantEmEstoque = quant;
    }
    
    public void exibirInfo(){
        
        System.out.println("nome do produto:" + nome);
        System.out.println("preco do produto:" + preco);
        System.out.println("Quantidade do produto:" + quantEmEstoque);

    }
    
    public void adicionarAoEstoque (int quant) {
     quantEmEstoque += quant;    
    }
    
    public void removerDoEstoque (int quant) {
        quantEmEstoque -= quant;
        
    }
}
