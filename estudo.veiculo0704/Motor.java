/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudo.veiculo0704;

/**
 *
 * @author palomadias
 */
public class Motor {
    private String tipo;
    private double potencia;
    private double cilindrada;
    
    public Motor(String tipo, double potencia, double cilindrada){
        this.tipo = tipo;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }
    
    public void ligar(){
        System.out.println("Motor " + tipo + " ligando...");
    }
    public void desligar(){
        System.out.println("Motor " + tipo + " desligando...");
    }
}