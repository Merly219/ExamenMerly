package edu.pe.cibertec;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.pe.cibertec.model.Cuenta;
import edu.pe.cibertec.model.Direccion;
import edu.pe.cibertec.model.Usuario;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class Principal {
    
    public static void main(String[] args) {
        crearJSON();
        
    }
        
    public static void crearXML (){
        
        try{
            
            List<Direccion> direcciones = new ArrayList<>();
            
            Direccion dr = new Direccion ();
            dr.setDepartamento("La Libertad");
            dr.setProvincia("Trujillo");
            dr.setDistrito("Esperanza");
            direcciones.add(dr);
            
            dr = new Direccion ();
            dr.setDepartamento("Lima");
            dr.setProvincia("Lima");
            dr.setDistrito("San Luis");
            direcciones.add(dr);
            
            
            List<Usuario> usuarios = new ArrayList<>();
           
            Usuario us = new Usuario();
            us.setCodUsuario(100);
            us.setNomUsuario("Roberto");
            us.setApeUsuario("Rodriguez");
            us.setDirecciones(direcciones);
            usuarios.add(us);
         
            us = new Usuario();
            us.setCodUsuario(200);
            us.setNomUsuario("Carlos ");
            us.setApeUsuario("Sanchez");
            us.setDirecciones(direcciones);
            usuarios.add(us);
                       
            Cuenta ct = new Cuenta();
            ct.setUsuario(usuarios);
                                
            JAXBContext ctx = JAXBContext.newInstance(Cuenta.class);
            Marshaller ms = ctx.createMarshaller();

            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ms.marshal(ct, new File ("D:\\ExamenMerlyServicios\\Project-XML_202030113\\resources\\Cuenta.xml"));     
        } catch (JAXBException ex){
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,ex);
        }
   
    }
    public static void crearJSON(){

            FileWriter archivo = null;
        try {
            List<Direccion> direcciones = new ArrayList<>();
            
            Direccion dr = new Direccion ();
            dr.setDepartamento("La Libertad");
            dr.setProvincia("Trujillo");
            dr.setDistrito("Esperanza");
            direcciones.add(dr);
            
            dr = new Direccion ();
            dr.setDepartamento("Lima");
            dr.setProvincia("Lima");
            dr.setDistrito("San Luis");
            direcciones.add(dr);
            
            
            List<Usuario> usuarios = new ArrayList<>();
           
            Usuario us = new Usuario();
            us.setCodUsuario(100);
            us.setNomUsuario("Roberto");
            us.setApeUsuario("Rodriguez");
            us.setDirecciones(direcciones);
            usuarios.add(us);
         
            us = new Usuario();
            us.setCodUsuario(200);
            us.setNomUsuario("Carlos ");
            us.setApeUsuario("Sanchez");
            us.setDirecciones(direcciones);
            usuarios.add(us);
                       
            Cuenta ct = new Cuenta();
            ct.setUsuario(usuarios);
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonString = gson.toJson(ct);
            System.out.println(jsonString);
            
            archivo = new FileWriter("D:\\ExamenMerlyServicios\\Project-XML_202030113\\resources\\cuenta3.json");
            PrintWriter print = new PrintWriter(archivo);//si te sale en rojo le agregas el block tri cach
            print.print(jsonString);
            print.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
