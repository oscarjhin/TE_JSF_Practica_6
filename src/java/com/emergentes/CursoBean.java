
package com.emergentes;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "cursoBean")
@RequestScoped
public class CursoBean {

    private String nombre;
    private String apellidos;
    private String curso;
    
    public CursoBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
