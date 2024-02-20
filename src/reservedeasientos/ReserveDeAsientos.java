/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservedeasientos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import reservedeasientos.plantillas.Ticket;

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
                System.out.print("["+asientos[i][j]+"]");        
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
    
    static void asignarAsiento(String asiento, char asientos[][]){
        int puesto = Integer.parseInt(asiento.substring(1));
        
        switch (asiento.charAt(0)) {
            case 'A':
                if(asientos[puesto - 1][0] == 'L'){
                    asientos[puesto - 1][0] = 'X';
                }
                break;
            case 'B':
                if(asientos[puesto - 1][1] == 'L'){
                    asientos[puesto - 1][1] = 'X';
                }
                break;
            case 'C':
                if(asientos[puesto - 1][2] == 'L'){
                    asientos[puesto - 1][2] = 'X';
                }
                break;
            case 'D':
                if(asientos[puesto - 1][3] == 'L'){
                    asientos[puesto - 1][3] = 'X';
                }
                break;
            case 'E':
                if(asientos[puesto - 1][4] == 'L'){
                    asientos[puesto - 1][4] = 'X';
                }
                break;
            case 'F':
                if(asientos[puesto - 1][5] == 'L'){
                    asientos[puesto - 1][5] = 'X';
                }
                break;
            case 'G':
                if(asientos[puesto - 1][6] == 'L'){
                    asientos[puesto - 1][6] = 'X';
                }
                break;
            case 'H':
                if(asientos[puesto - 1][7] == 'L'){
                    asientos[puesto - 1][7] = 'X';
                }
                break;
            case 'I':
                if(asientos[puesto - 1][8] == 'L'){
                    asientos[puesto - 1][8] = 'X';
                }
                break;
            case 'J':
                if(asientos[puesto - 1][9] == 'L'){
                    asientos[puesto - 1][9] = 'X';
                }
                break;
            default:
                throw new AssertionError();    
        }
        
    }
    
    static void asientosReservados(List<Ticket> listTickets, char asientos[][]){
        for(Ticket ticket: listTickets){
            String asiento = ticket.getAsiento();
            asignarAsiento(asiento, asientos);
        }
    }
    
    static Double asignarPrecio(String asiento){
        int puesto = Integer.parseInt(asiento.substring(1));
        Double valuePuesto = 0.0;
        
        if(puesto > 3 && puesto < 8){
            valuePuesto = 15000.00;
        }else if(puesto >= 8){
            valuePuesto = 10000.0;
        }else{
            valuePuesto = 9000.0;
        }
        
        return valuePuesto;
    }
    
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        char asientos[][] = new char[10][10];
        String asiento;
        Double totalTickets = 0.0;
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                asientos[i][j] = 'L';
            }
        }
        
        List listTickets = new ArrayList<Ticket>();
        Ticket ticket = new Ticket("A1", 15000, new Date(), new Date());
        Ticket ticketDos = new Ticket("B1", 15000, new Date(), new Date());
        Ticket ticketTres = new Ticket("C4", 15000, new Date(), new Date());
        listTickets.add(ticket);
        listTickets.add(ticketDos);
        listTickets.add(ticketTres);
        
        do {  

            System.out.println("Sistema de Reservas de Asientos. RA");
            asientosReservados(listTickets, asientos); 
            
            //mostrar asientos
            mostrarAsientos(asientos);

            System.out.print("\ningresa un asiento o exit para terminar: ");
            asiento = enter.nextLine().toUpperCase();

            if(validarAsientoLetra(asiento.charAt(0)) && validarAsientoNumero(asiento)){
                
                Ticket t = new Ticket(asiento, 0, new Date(), new Date());
                Double precio = asignarPrecio(asiento);
                t.setPrecio(precio);
                totalTickets = precio + totalTickets;
                listTickets.add(t);
                System.out.println("asiento asignado.");
                System.out.println("Total $"+ totalTickets);
                
            }else{
                System.err.println("Error al asignar un asiento");
            }
        } while (!asiento.equals("EXIT"));
        
    }
    
}
