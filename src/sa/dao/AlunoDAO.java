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
import java.util.HashMap;
import java.util.Map;
import sa.db.BD;
import sa.entidade.Aluno;
import sa.entidade.Pessoa;

/**
 *
 * @author Standard
 */
public class AlunoDAO {
    
    public Aluno inserirAluno(Aluno a, int idPessoa) throws SQLException {
        
        int chaveGerada = 0;
        
        final String sql = "INSERT INTO aluno (idaluno, ra, ativo, idpessoa) "
                + "VALUES(seq_aluno.NEXTVAL, ?, ?, ?);";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql, new String[] {"idAluno"})) {

            ps.setString(1, a.getRa());
            ps.setInt(2, (a.isAtivo() ? 1 : 0));
            ps.setInt(3, idPessoa);
            
            ps.executeUpdate();
            
            try (ResultSet rs = ps.getGeneratedKeys()) {
                while(rs.next()) {
                    
                    chaveGerada = rs.getInt(1);
                    
                }
            }
            
        }
        
        a.setId(chaveGerada);
        
        return  a;
        
    }
    
    public void atualizarAluno(Aluno a, int idPessoa) throws SQLException {
        
        final String sql = "UPDATE aluno SET ra = ?, ativo = ?, idpessoa = ? "
                + "WHERE idaluno = ?";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
            
            ps.setString(1, a.getRa());
            ps.setInt(2, (a.isAtivo() ? 1 : 0));
            ps.setInt(3, idPessoa);
            ps.setInt(4, a.getId());
            
            ps.execute();
            
        }
        
    }
    
    public void deletarAluno(Aluno a) throws SQLException {
        
        final String sql = "DELETE FROM aluno WHERE idaluno = ?;";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
            
            ps.setInt(1, a.getId());
            
            ps.execute();
            
        }
        
    }
    
    public Aluno listarAlunoPeloID(int idAluno) throws SQLException {
        
        Aluno a = new Aluno();
        int idPessoa = 0;
        
        final String sql = "SELECT * FROM aluno WHERE idaluno = ?;";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
         
            ps.setInt(1, idAluno);
            
            try (ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    
                    a.setId(rs.getInt(1));
                    a.setRa(rs.getString(2));
                    a.setAtivo(rs.getInt(3) == 1);
                    idPessoa = rs.getInt(4);
                    
                    PessoaDAO p = new PessoaDAO();
                    
                    a.setPessoa(p.selecionarPessoaPeloID(idPessoa));
                }
            }
            
        }
        
        return a;
        
    }
    
    public ArrayList<Aluno> listarAlunosNoCurso(int idCurso) throws SQLException {
        
        ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
        
        final String sql = "SELECT idAluno, ra, ativo, idPessoa, "
                + "nome, sobrenome, dataNascimento, sexo, "
                + "estadoCivil, nacionalidade, grauDeInstrucao,"
                + "email, rg, cpf, endereco, numero, bairro, cep"
                + "cidade, uf, telefoneCelular, telefoneResidencial"
                + "telefoneComercial "
                + "FROM v_aluno_curso WHERE idCurso = ?;";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
            
            ps.setInt(1, idCurso);
            
            try (ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                            
                    Aluno a = new Aluno();
                    Pessoa p = new Pessoa();
                    
                    a.setId(rs.getInt(1));
                    a.setRa(rs.getString(2));
                    a.setAtivo(rs.getInt(3) == 1);
                    p.setId(rs.getInt(4));
                    p.setNome(rs.getString(5));
                    p.setSobrenome(rs.getString(6));
                    p.setDataNascimento(rs.getDate(7));
                    p.setSexo(rs.getString(8).charAt(0));
                    p.setEstadoCivil(rs.getInt(9));
                    p.setNacionalidade(rs.getString(10));
                    p.setGrauDeInstrucao(rs.getInt(11));
                    p.setEmail(rs.getString(12));
                    p.setRg(rs.getString(13));
                    p.setCpf(rs.getString(14));
                    p.setEndereco(rs.getString(15));
                    p.setNumero(rs.getInt(16));
                    p.setBairro(rs.getString(17));
                    p.setCep(rs.getString(18));
                    p.setCidade(rs.getString(19));
                    p.setUf(rs.getString(20));
                    p.setTelefoneCelular(rs.getString(21));
                    p.setTelefoneResidencial(rs.getString(22));
                    p.setTelefoneComercial(rs.getString(23));
                    a.setPessoa(p);
                    
                    listaDeAlunos.add(a);
                    
                }
            }
            
        }
        
        return listaDeAlunos;
        
    }
    
}
