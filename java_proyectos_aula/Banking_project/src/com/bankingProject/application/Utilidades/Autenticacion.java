package com.bankingProject.application.Utilidades;

public class Autenticacion {
	
    private String clave;
    
    /**
     * Establece contraseña
     * @param clave String
     * @return boolean
     */
    public boolean setPassword(String clave) {
        if (clave != "") {
            this.clave = clave;
            return true;
        }
        return false;
    }
    
    /**
     * Permite Login
     * @param clave String
     * @return boolean
     */
    public boolean login(String clave) {
        if (clave != "") {
            return this.clave == clave;
        }
        return false;
    }
}