/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.dao;

import java.sql.PreparedStatement;
import sa.db.BD;
import sa.entidade.Documento;

/**
 *
 * @author Felipe
 */
public class DocumentoDAO {
    
    public Documento inserirDocumento(Documento d){
        
        int chaveGerada = 0;
        
        final String sql = "INSERT INTO documento"
        +("id, comprovanteEM, comprovanteRedidencia, cAlistMilitar, cRG, cCC, histEscolar, idAluno")
        + "VALUES (seq_documento.NEXTVAL, ?, ?, ?, ?, ?)";
        
        return d;
        
        try(PreparedStatement ps = BD.getConnection().prepareStatement(sql)){
            ps.setInt(1, ac.getIdDocumento());
        }
        
    }
    
    public void deletarDocumento() throws SQLException{
        final String sql = "DELETE FROM documento WHERE idDocumento=?";
        
        try(PreparedStatement ps=BD.getConnection().prepareStatement(sql)){
            
        ps.executeUpdate();
        }
    }
    
    public void atualizarDocumento() throws SQLException{
        final String sql="UPDATE documento SET";
        
        try(PreparedStatement ps=BD.getConnection().prepareStatement(sql)){
            
        ps.executeUpdate();
        }
    }
}
