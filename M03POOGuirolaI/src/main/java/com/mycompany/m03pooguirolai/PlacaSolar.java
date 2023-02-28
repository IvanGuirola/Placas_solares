/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m03pooguirolai;

/**
 *
 * @author Admin
 */
public class PlacaSolar {
    private int superficiePlacasSolares;
    private float precio;
    private int energiaProporcionada;
    
    public PlacaSolar(Casa nif, int superficiePlacasSolares, int precio, int energiaProporcionada){
        this.superficiePlacasSolares = superficiePlacasSolares;
        this.precio = precio;
        this.energiaProporcionada = energiaProporcionada;
    }
    
    public int getSPS() {
        return this.superficiePlacasSolares;
    }
    
    public float getPrecio() {
        return this.precio;
    }
    
    public int getEP() {
        return this.energiaProporcionada;
    }
}
