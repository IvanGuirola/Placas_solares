/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m03pooguirolai;

/**
 *
 * @author Admin
 */
public class Casa {

    private String nif;
    private String nom;
    private int superficieTejado;
    private boolean interruptor;
    private int numeroPlacas;
    
    public Casa(String nif, String nom, int superficieTejado, boolean interruptor) {
        this.nif = nif;
        this.nom = nom;
        this.superficieTejado = superficieTejado;
        this.interruptor = interruptor;
        //this.numeroPlacas = numeroPlacas;
    }
    
    public String getNif(){
        return this.nif;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public int getST() {
        return this.superficieTejado;
    }
    
    public boolean getInterruptor() {
        return this.interruptor;
    }
    
    public void setInterruptor(boolean interruptor){
        this.interruptor = interruptor;
    }
    
    public int getNP() {
        return this.numeroPlacas;
    }
    
}
