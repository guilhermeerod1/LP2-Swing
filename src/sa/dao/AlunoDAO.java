/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sa.db.BD;
import sa.entidade.Aluno;

/**
 *
 * @author Standard
 */
public class AlunoDAO {
    
    public Aluno inserirAluno(Aluno a, int idPessoa) throws SQLException {
        
        int chaveGerada = 0;
        
        final String sql = "INSERT INTO aluno (idaluno, ra, ativo, idpessoa) "
                + "VALUES(seq_aluno.NEXTVAL, ?, ?, ?);";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {

            ps.setString(1, a.getRa());
            ps.setInt(2, (a.isAtivo() ? 1 : 0));
            ps.setInt(3, idPessoa);
            
            ps.execute(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            try (ResultSet rs = ps.getGeneratedKeys()) {
                while(rs.next()) {
                    
                    chaveGerada = rs.getInt(1);
                    
                }
            }
            
        }
        
        a.setId(chaveGerada);
        
        return  a;
        
    }
    
}
