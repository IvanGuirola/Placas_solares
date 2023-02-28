/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m03pooguirolai;

/**
 *
 * @author Admin
 */
public class Aparatos {
    private String descripcion;
    private int consumo;
    private boolean interruptorAparato;
    
    public Aparatos(Casa nif, String descripcion, int consumo, boolean interruptorAparato) {
        this.descripcion = descripcion;
        this.consumo = consumo;
        this.interruptorAparato = interruptorAparato;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public int getConsumo() {
        return this.consumo;
    }
    
    public boolean getIA() {
        return this.interruptorAparato;
    }
    
    public void setIA(boolean interruptorAparato) {
        this.interruptorAparato = interruptorAparato;
    }
}
