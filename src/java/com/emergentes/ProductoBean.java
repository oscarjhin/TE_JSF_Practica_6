
package com.emergentes;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "productoBean")
@RequestScoped
public class ProductoBean {

    private String producto;
    private String categoria;
    private Integer existencia;
    private Double precio;
    
    public ProductoBean() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    
    
}
