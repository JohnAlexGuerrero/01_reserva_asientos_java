/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservedeasientos;

import java.util.Scanner;

/**
 *
 * @author JOHN
 */
public class ReserveDeAsientos {

    static void mostrarAsientos(char[][] asientos){
        System.out.println("    A  B  C  D  E  F  G  H  I  J\n");
        for(int i=0; i<10; i++){
            System.out.print(i+1 + "  ");
            for(int j=0; j<10; j++){
                System.out.print(" "+asientos[i][j]+" ");        
            }
            System.out.println();
        }
    }
    
    static boolean validarAsientoNumero(String asiento){
        boolean bandera = false;
        int puestoNumero = 0;

        if(asiento.length() == 2){
            puestoNumero = Integer.parseInt("" + asiento.charAt(1));
        }else if(asiento.length() == 3){
            String numeroTypeString = "" + asiento.charAt(1) + asiento.charAt(2);
            puestoNumero = Integer.parseInt(numeroTypeString);
        }
        
        if(puestoNumero > 0 && puestoNumero < 11){
            bandera = true;
        }
        
        return bandera;
    }
    
    static boolean validarAsientoLetra(char letra){
        boolean bandera = false;
        enum Letra {
            A,B,C,D,E,F,G,H,I,J
        }
        
        try {
            for(Letra l: Letra.values()){
                if(l.name().equals(""+letra) ){
                    bandera = true;
                }else{
                    continue;
                }
                
            }
            
        } catch (Exception e) {
            return false;
        }
        
        return bandera;
    }
    
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        char asientos[][] = new char[10][10];
        String asiento;
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                asientos[i][j] = 'L';
            }
        }
        
        //mostrar asientos
        mostrarAsientos(asientos);
        
        System.out.print("\ningresa un asiento: ");
        asiento = enter.nextLine();
        
        if(validarAsientoLetra(asiento.charAt(0)) && validarAsientoNumero(asiento)){
            System.out.println("asiento asignado.");
        }else{
            System.err.println("Error al asignar un asiento");
        }
    }
    
}
