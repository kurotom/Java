package com.bankingProject.application.Interfaces;

import com.bankingProject.application.Utilidades.Autenticacion;


public interface SistemaInterno {
	
    public static final Autenticacion auth = new Autenticacion();

    /**
     * Implementacion para establecer contraseña  
     * @param clave String 
     */
    public boolean setClave(String var1);

    /**
     * Implementacion para hacer login  
     * @param clave String 
     */
    public boolean login(String var1);
    
}