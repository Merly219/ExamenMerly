
package edu.pe.cibertec.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"codUsuario","nomUsuario","apeUsuario","direcciones",})
public class Usuario {
    
    private int codUsuario ;
    private String nomUsuario;
    private String apeUsuario;
    private List<Direccion> direcciones = new ArrayList<>();

    public Usuario() {
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getApeUsuario() {
        return apeUsuario;
    }

    public void setApeUsuario(String apeUsuario) {
        this.apeUsuario = apeUsuario;
    }
    public List<Direccion> getDirecciones() {
        return direcciones;
    }
@XmlElement (name = "direccion")
    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }
    

}
