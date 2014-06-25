/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.lazo.modelo;

/**
 *
 * @author alum.fial7
 */
public class Iglesia {
    private int idi;
    private int idd;
    private int idti;
    private String nombIglesia;
    private int cuenta;

    public Iglesia() {
    }

    public Iglesia(int idd, int idti, String nombIglesia, int cuenta) {
        this.idd = idd;
        this.idti = idti;
        this.nombIglesia = nombIglesia;
        this.cuenta = cuenta;
    }

    public int getIdi() {
        return idi;
    }

    public void setIdi(int idi) {
        this.idi = idi;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getIdti() {
        return idti;
    }

    public void setIdti(int idti) {
        this.idti = idti;
    }

    public String getNombIglesia() {
        return nombIglesia;
    }

    public void setNombIglesia(String nombIglesia) {
        this.nombIglesia = nombIglesia;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
