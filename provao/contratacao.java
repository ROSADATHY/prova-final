/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.provao;

/**
 *
 * @author Aluno
 */
public interface contratacao {

    /**
     *
     * @param fucionario
     */
    public void admitir (Fucionario fucionario){
        System.out.println("admitir");
    }
   public void demitir(Fucionario fucionario){
       System.out.println("demitir");
   }
}
