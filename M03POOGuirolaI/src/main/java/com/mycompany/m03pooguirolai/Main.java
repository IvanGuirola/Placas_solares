package com.mycompany.m03pooguirolai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main {
    
    static ArrayList<Casa> casas = new ArrayList();
    static ArrayList<PlacaSolar> placasSolares = new ArrayList();
    static ArrayList<Aparatos> aparato = new ArrayList();
    
    public static Casa buscarCasa(String buscarCasa) {
        for (int i = 0; i < casas.size(); i++) {
            Casa laCasa = casas.get(i);
            if (laCasa.getNif().equals(buscarCasa))
                return laCasa;
        }
        return null;
    }
    
    

    public static void main(String[] args) throws IOException {
        BufferedReader terminal = new BufferedReader(new InputStreamReader(System.in));
        boolean quit = false;
        do {
            System.out.println("> ");
            String segmento = terminal.readLine();
            String[] dades = segmento.split(" ");
            if (dades[0].equals("addCasa")) {
                String nif = dades[1];
                String nom = dades[2];
                int superficie = Integer.parseInt(dades[3]);
                boolean interruptor = false;
                if (superficie > 10) {
                    Casa unaCasa = new Casa(nif, nom, superficie, interruptor);
                    casas.add(unaCasa);
                    System.out.println("Vivienda añadida correctamente.");
                } else {
                    System.out.println("Error, superficie es menor a 10.");
                }
                
            } else if (dades[0].equals("list")) {
                if (casas.isEmpty()) {
                System.out.println("No hay casas registradas");
                } else {
                    for (int i = 0; i < casas.size(); i++) {
                        System.out.println(casas.get(i));
                    }
                }
            } else if  (dades[0].equals("addPlaca")) {
                String buscarNif = dades[1];
                Casa buscar = buscarCasa(buscarNif);
                int superficiePlaca = Integer.parseInt(dades[2]);
                int preu = Integer.parseInt(dades[3]);
                if (preu > 0) {
                    int potencia = Integer.parseInt(dades[4]);
                    if (potencia > 0) {
                        PlacaSolar nuevaPlaca = new PlacaSolar(buscar, superficiePlaca, preu, potencia);
                        placasSolares.add(nuevaPlaca);
                        System.out.println("Los datos de la placa se añadieron correctamente.");
                    } else {
                        System.out.println("El valor de potencia es menor a 0.");
                    }
                } else {
                    System.out.println("No se introdujo ningun valor en precio.");
                }
            } else if (dades[0].equals("addAparrell")) {
                String buscarNif = dades[1];
                Casa buscar = buscarCasa(buscarNif);
                String descripcio = dades[2];
                int potencia = Integer.parseInt(dades[3]);
                boolean interruptorAparato = false;
                if (potencia > 0) {
                    Aparatos nuevoAparato = new Aparatos(buscar, descripcio, potencia, interruptorAparato);
                    aparato.add(nuevoAparato);
                    System.out.println("Los datos del aparato se introdujeron correctamente.");
                } else {
                    System.out.println("El valor de potencia es menor a 0.");
                }
            } else if (dades[0].equals("onCasa")) {
                String buscarNif = dades[1];
                Casa buscar = buscarCasa(buscarNif);
                if (buscar.getInterruptor() == false) {
                    buscar.setInterruptor(true);
                } else if (buscar.getInterruptor() == true) {
                    System.out.println("La vivienda ya tiene las luces encendidas");
                }
            } else if (dades[0].equals("onAparell")) {
                String buscarNif = dades[1];
                Casa buscar = buscarCasa(buscarNif);
                if (buscar.getInterruptor() == true) {
                    
                }
            }
        } while (quit == false);
    }
}
    
