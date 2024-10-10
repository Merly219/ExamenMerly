package edu.pe.cibertec.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cuenta {
    
    private List<Usuario> usuarios;
   
    
    public Cuenta() {
    }

    
    public List<Usuario> getUsuario() {
        return usuarios;
    }
@XmlElement (name = "usuario")
    public void setUsuario(List<Usuario> usuario) {
        this.usuarios = usuario;
    }

}


