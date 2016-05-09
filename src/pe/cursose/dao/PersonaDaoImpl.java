/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.cursose.dao;

import com.mysql.jdbc.PreparedStatement;
import cursose.Persona;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.cursose.interf.PersonaDAO;

/**
 *
 * @author hikaru
 */
public class PersonaDaoImpl extends Conexion implements PersonaDAO{

    @Override
    public void registrar(Persona per) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = (PreparedStatement) this.conexion.prepareStatement("INSERT INTO persona(nombre) VALUES (?)");
            st.setString(1, per.getNombre());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void actualizar(Persona per) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = (PreparedStatement) this.conexion.prepareStatement("UPDATE persona set nombre = ? where id = ?");
            st.setString(1, per.getNombre());
            st.setInt(2, per.getId());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Persona per) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = (PreparedStatement) this.conexion.prepareStatement("delete from persona where id = ?");
            st.setInt(1, per.getId());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public List<Persona> listar() throws Exception {
        List<Persona> lista = null;
        try {
            this.conectar();
            PreparedStatement st = (PreparedStatement) this.conexion.prepareStatement("SELECT * FROM persona");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                Persona per = new Persona();
                per.setId(rs.getInt("id"));
                per.setNombre(rs.getString("nombre"));
                lista.add(per);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        }finally{
            this.cerrar();
        }
        return lista;
    }
    
}
