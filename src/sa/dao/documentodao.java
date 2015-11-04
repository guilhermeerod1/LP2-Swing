/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.dao;

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
        
    }
    
}
