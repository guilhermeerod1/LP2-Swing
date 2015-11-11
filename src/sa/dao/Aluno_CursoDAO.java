package sa.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import sa.db.BD;
import sa.entidade.Aluno_Curso;

public class Aluno_CursoDAO {

    public void inserirAluno_Curso(Aluno_Curso ac) throws SQLException {
        
        final String sql = "INSERT INTO aluno_curso(idAluno, idCurso) "
                + "VALUES (?, ?)";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
            
            ps.setInt(1, ac.getIdAluno());
            ps.setInt(2, ac.getIdCurso());
            
            ps.execute();
            
        }
        
    }
    
    public void deletarAlunoCurso(Aluno_Curso ac) throws SQLException {
        
        final String sql = "DELETE FROM aluno_curso WHERE idAluno = ? AND"
                + " idCurso = ?";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {

            ps.setInt(1, ac.getIdAluno());
            ps.setInt(2, ac.getIdCurso());
            
            ps.execute();
            
        }
        
    }
    
    public void atualizarAlunoCurso(Aluno_Curso ac, Aluno_Curso ac_antigo) throws SQLException {
        
        final String sql = "UPDATE aluno_curso SET idAluno = ?, idCurso = ? "
                + "WHERE idAluno = ? AND idCurso = ?";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
            
            ps.setInt(1, ac.getIdAluno());
            ps.setInt(2, ac.getIdCurso());
            ps.setInt(3, ac_antigo.getIdAluno());
            ps.setInt(4, ac_antigo.getIdCurso());
            
            ps.execute();
            
        }
        
    }
   
}
