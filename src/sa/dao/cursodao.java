/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.dao;

import sa.entidade.Curso;

/**
 *
 * @author Felipe
 */
public class CursoDAO {
    
    public Curso inserirCurso(Curso c){
        
        int chaveGerada = 0;
        
        final String sql = "INSERT INTO curso"
        +"(idCurso, nomeDoCurso, tipo, cargaHoraria, cargaHorariaAC, "
        + "idCoordenador) "
        + "VALUES (seq_curso.NEXTVAL, ?, ?, ?, ?, ?, ?)";
        
        return c;
         
    }
    
}
