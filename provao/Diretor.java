/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provao;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca{
    private double premio =0.3;

    public Diretor(Bonificacao bonificacao) {
        super(bonificacao);
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Diretor{" + "premio=" + premio + '}';
    }

   
   

  
    
    
}
