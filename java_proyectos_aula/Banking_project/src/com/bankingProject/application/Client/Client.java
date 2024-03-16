/**
 * @author tomas
 * @version 1.0
 * 
 */


package com.bankingProject.application.Client;


import com.bankingProject.application.Interfaces.SistemaInterno;
import com.bankingProject.application.Utilidades.Autenticacion;
import java.util.UUID;
 

/**
 *  
 * Clase "Client", permite crear clientes, generar su propio UUID único, además de tener interface de SistemaInterno que
 * permite hacer establecer contraseña y hacer login.
 *
 */
public class Client implements SistemaInterno {
   private String nombre;
   private String telefono;
   private String numeroDocumento;
   private UUID uid;
   private Autenticacion auth = new Autenticacion();

   /**
    * Constructor Default
    */
   public Client() {
   }

   /**
    * Constructor Client
    * @param name String
    * @param telefono String
    * @param documento String
    */
   public Client(String name, String telefono, String documento) {
      this.setNombre(name);
      this.setNumeroDocumento(documento);
      this.setTelefono(telefono);
      this.uid = UUID.randomUUID();
   }
   
   public String toString() {
	   return new String("Nombre: " + this.nombre + " | Documento: " + this.numeroDocumento + " | Telefono: " + this.telefono);
   }

   /**
    * Obtiene uid del cliente
    * @return uid del cliente
    */
   public String getUID() {
      return this.uid.toString();
   }

   /**
    * Retorna el nombre
    * @return this.nombre
    */
   public String getNombre() {
      return this.nombre;
   }

   /**
    * Establece el nombre
    * @param nombre String
    */
   public void setNombre(String nombre) {
      if (nombre != "") {
         this.nombre = nombre;
      }

   }

   /**
    * Obtene el telefono del cliente
    * @return this.telefono
    */
   public String getTelefono() {
      return this.telefono;
   }

   /**
    * Establece el telefono del cliente
    * @param telefono String
    */
   public void setTelefono(String telefono) {
      if (telefono != "") {
         this.telefono = telefono;
      }
   }
   
   
   /**
    * Obtiene numero del documento del cliente
    * @return numeroDocumento
    */
   public String getNumeroDocumento() {
      return this.numeroDocumento;
   }

   /**
    * Establece numero documento
    * @param numeroDocumento String
    */
   public void setNumeroDocumento(String numeroDocumento) {
      if (numeroDocumento != "") {
         this.numeroDocumento = numeroDocumento;
      }

   }

   /**
    * método de interface SistemaInterno
    * Establece contraseña
    * @param clave String
    * @return boolean
    */
   public boolean setClave(String clave) {
      return this.auth.setPassword(clave);
   }

   /**
    * método de interface SistemaInterno
    * Permite hacer login contraseña  
    * @param clave String 
    * @return boolean
    */
   public boolean login(String clave) {
	   return this.auth.login(clave);
   }
}