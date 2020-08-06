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
public class detallesugerencia {
    private int iddetallesugerencia;
    private String area;
    private String tipo;
    private String descripcion;
    private int fecha;
    private String estado;
    public detallesugerencia(){
        
    }

    public detallesugerencia(int iddetallesugerencia, String area, String tipo, String descripcion, int fecha, String estado) {
        this.iddetallesugerencia = iddetallesugerencia;
        this.area = area;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getIddetallesugerencia() {
        return iddetallesugerencia;
    }

    public String getArea() {
        return area;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setIddetallesugerencia(int iddetallesugerencia) {
        this.iddetallesugerencia = iddetallesugerencia;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}