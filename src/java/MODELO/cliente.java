/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author gisselle
 */
public class cliente {
    private int idcliente;
    private String nombre;
    private int DNI;
    private String correo;
    private int telefono;
    private String estado;
    public cliente(){
        
    }

    public cliente(int idcliente, String nombre, int DNI, String correo, int telefono, String estado) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.DNI = DNI;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}