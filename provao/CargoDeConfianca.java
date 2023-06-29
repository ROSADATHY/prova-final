/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provao;

/**
 *
 * @author Aluno
 */
public abstract class CargoDeConfianca {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

   
    
    
    
}
