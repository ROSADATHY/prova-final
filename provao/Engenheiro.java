/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provao;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends Fucionario{
    private String crea;

    public Engenheiro(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n crea=" + crea ;
    }
    
    
    
}
