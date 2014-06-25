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
public class TipoIglesia {
    private int idti;
    private int nomTipo;

    public TipoIglesia() {
    }

    public TipoIglesia(int nomTipo) {
        this.nomTipo = nomTipo;
    }

    public int getIdti() {
        return idti;
    }

    public void setIdti(int idti) {
        this.idti = idti;
    }

    public int getNomTipo() {
        return nomTipo;
    }

    public void setNomTipo(int nomTipo) {
        this.nomTipo = nomTipo;
    }
}
