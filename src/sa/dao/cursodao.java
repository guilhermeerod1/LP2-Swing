/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sa.db.BD;
import sa.entidade.Curso;

/**
 *
 * @author Felipe
 */
public class CursoDAO {
    
    public Curso inserirCurso(Curso c){
        
        int chaveGerada = 0;
        
        final String sql = "INSERT INTO curso"
         "(idCurso, nomeDoCurso, tipo, cargaHoraria, cargaHorariaAC, "
         "idCoordenador) "
         "VALUE(seq_curso.NEXTVAL, ?, ?, ?, ?, ?)
        return c;

      try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {

                 ps.setInt(1,c.getIdCurso());\n" +
               ps.setString(2,c.getnomeDoCurso());
                 ps.sES (seq_curso.NEXTVAL, ?, ?, ?, ?, ?)";
        
        return c;
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
            
                 ps.setInt(1,c.getIdCurso());
                 ps.setString(2,c.getnomeDoCurso());
                 ps.setInt(3,c.getTipo());
                 ps.setInt(4,c.getCargaHoraria());
                 ps.setInt(5,c.getCargaHorariaAC());
                 
                 ps.execute(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                 
                 try (ResultSet rs = ps.getGeneratedKeys()){
                     while(rs.next()){
                         chaveGerada=rs.getInt(1);
                     }
                 }
 
        }
        
        c.setId(chaveGerada);
        
        return c;
    }
    
    public void atualizarCurso(int idCurso) throws SQLException{
        final String sql="UPDATE curso SET idCurso=?, nomedoCurso=?, tipo=?, cargaHoraria=?, cargaHorariaAC=?"
         
    try(PreparedStatement ps = BD.getConnection().prepareStatement(sql))
        ps.setInt(1,c.getIdCurso());
        ps.setString(2,c.getnomeDoCurso());
        ps.setInt(3,c.getTipo());
        ps.setInt(4,c.getCargaHoraria());
        ps.setInt(5,c.getCargaHorariaAC());
        
        ps.execute();
                 
    }
  }
    
    public void deletarCurso(Curso c) throws SQLException{
        final String sql="DELETE FROM curso WHERE idCurso=?;";
        
        try(PreparedStatement ps=BD.getConnection().prepareStatement(sql)){
            ps.setInt(,);
            ps.execute();
        }
    }
    
    public Curso listarCursoPeloID(int idCuso) throws SQLException{
        
        Curso c = new Curso();
        int idCurso=0;
        
        final String sql="SELECT*FROM curso WHERE idCurso=?;";
        
        try(PreparedStatement ps=BD.getConnection().prepareStatement(sql)){
            
            ps.setInt(1, idCuso);
            
        try(ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                c.setIdCurso(rs.getInt(1));
                c.setNome(rs.getString(2));
                c.setTipo(rs.getInt(3));
                c.setCargaHoraria(rs.getInt(4));
                c.setCargaHorariaAC(rs.getInt(5));
                
                CursoDAO c = new CursoDAO();
                
                c.setCurso(c.selecionarCursoPeloID(idCurso));
            }
        }
        }
        
        return c;
        
        public ArrayList<Curso>listarCurso throws SQLException{
           
            ArrayList<Curso> = new ArrayList<>();
            
            final String sql="SELECT idCurso, Nome, Tipo, cargaHoraria, "
                    + "cargahorariaAC;"
                    + "FROM c_curso WHERE idCurso=?;";
            
            try(PreparedStatement ps=BD.getConnection().prepareStatement(, PreparedStatement.RETURN_GENERATED_KEYS){
                
                ps.setInt(1, idCurso);
                
                try(ResultSet rs=ps.executeQuery()){
                    while(rs.next()){
                        Curso c = new Curso();
                        
                        c.setIdCurso(rs.getInt(1));
                        c.setNome(rs.getInt(2));
                        c.getTipo(rs.getInt(3));
                        c.getCargaHoraria(rs.getInt(4));
                        c.getCargaHorariaAC(rs.getInt(5));
                    }
                }
                ps.executeUpdate();
            }
    
}
}      
}
