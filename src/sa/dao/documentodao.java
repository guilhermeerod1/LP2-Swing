/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Felipe
 */
public class documentodao {
    
    public Documentos inserirCurso(Documentos d){
        
        int chaveGerada = 0;
        
        final String sql = "INSERT INTO documento"
        +("id, nome, tipo, cargaHoraria, cargahorariaAC")
        + "VALUES (seq_curso.NEXTVAL, ?, ?, ?, ?, ?)";
        
    }
    
}
