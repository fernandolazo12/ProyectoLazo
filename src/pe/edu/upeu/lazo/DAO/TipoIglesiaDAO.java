/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.lazo.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.upeu.lazo.config.Conexion;
import pe.edu.upeu.lazo.modelo.TipoIglesia;

/**
 *
 * @author alum.fial7
 */
public class TipoIglesiaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    
    
    ArrayList<TipoIglesia> lista = null;
    
    public ArrayList<TipoIglesia> listarTipoIglesia(){
        lista = new ArrayList();
        sql = "select *from Tipo_Iglesia";
        try {
            cx = Conexion.GetConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                TipoIglesia ti = new TipoIglesia();
                ti.setIdti(rs.getInt("idtipo_Iglesia"));
                ti.setNomTipo(rs.getInt("tipo_iglesia"));
                
                lista.add(ti);
            }
        } catch (SQLException ex) {
            
        }
        return lista;
    }
}
