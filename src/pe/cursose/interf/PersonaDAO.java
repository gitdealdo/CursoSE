/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.cursose.interf;

import cursose.Persona;
import java.util.List;

/**
 *
 * @author hikaru
 */
public interface PersonaDAO {

    public void registrar(Persona per) throws Exception;
    public void actualizar(Persona per) throws Exception;
    public void eliminar(Persona per) throws Exception;
    public List<Persona> listar() throws Exception;
    
}
