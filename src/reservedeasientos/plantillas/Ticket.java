/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservedeasientos.plantillas;

import java.util.Date;

/**
 *
 * @author JOHN
 */
public class Ticket {
    
    private String asiento;
    private double precio;
    private Date fechaCompra;
    private Date fechaValidez;

    public Ticket() {
    }

    public Ticket(String asiento, double precio, Date fechaCompra, Date fechaValidez) {
        this.asiento = asiento;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaValidez() {
        return fechaValidez;
    }

    public void setFechaValidez(Date fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    
    
}
