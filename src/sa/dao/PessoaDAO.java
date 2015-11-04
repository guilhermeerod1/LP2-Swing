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
import sa.entidade.Pessoa;

/**
 *
 * @author Standard
 */
public class PessoaDAO {
    
    public Pessoa inserirPessoa(Pessoa p) throws SQLException {
        
        int chaveGerada = 0;
        
        final String sql = "INSERT INTO pessoa " 
                + " (idPessoa, nome, sobrenome, dataNascimento, sexo, estadoCivil, "
                + " nacionalidade, grauDeInstrucao, email, rg, cpf, endereco, "
                + " numero, bairro, cep, cidade, uf, telefoneCelular, "
                + " telefoneResidencial, telefoneComercial) "
                + " VALUES(seq_pessoa.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql, new String[] {"idPessoa"})) {
            
            ps.setString(1, p.getNome());
            ps.setString(2, p.getSobrenome());
            ps.setDate(3, p.getDataNascimento());
            ps.setString(4, String.valueOf(p.getSexo()));
            ps.setInt(5, p.getEstadoCivil());
            ps.setString(6, p.getNacionalidade());
            ps.setInt(7, p.getGrauDeInstrucao());
            ps.setString(8, p.getEmail());
            ps.setString(9, p.getRg());
            ps.setString(10, p.getCpf());
            ps.setString(11, p.getEndereco());
            ps.setInt(12, p.getNumero());
            ps.setString(13, p.getBairro());
            ps.setString(14, p.getCep());
            ps.setString(15, p.getCidade());
            ps.setString(16, p.getUf());
            ps.setString(17, p.getTelefoneCelular());
            ps.setString(18, p.getTelefoneResidencial());
            ps.setString(19, p.getTelefoneComercial());
            
            ps.executeUpdate();
            
            try (ResultSet rs = ps.getGeneratedKeys()) {
                
                while(rs.next()) {
                
                    chaveGerada = rs.getInt(1);
                    
                }
                
                p.setId(chaveGerada);
                
            }
            
        }
        
        return p;
        
    }
    
    public void atualizarPessoa(Pessoa p) throws SQLException {  
        
        final String sql = "UPDATE pessoa SET"
                + " nome = ?, sobrenome = ?, datanascimento = ?,"
                + " sexo = ?, estadocivil = ?, nacionalidade = ?,"
                + " graudeinstrucao = ?, email = ?, rg = ?, cpf = ?,"
                + " endereco = ?, numero = ?, bairro = ?, cep = ?, cidade = ?,"
                + " uf = ?, telefonecelular = ?,telefoneresidencial = ?,"
                + " telefonecomercial = ? WHERE idpessoa = ?";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
            
            ps.setString(1, p.getNome());
            ps.setString(2, p.getSobrenome());
            ps.setDate(3, p.getDataNascimento());
            ps.setString(4, Character.toString(p.getSexo()));
            ps.setInt(5, p.getEstadoCivil());
            ps.setString(6, p.getNacionalidade());
            ps.setInt(7, p.getGrauDeInstrucao());
            ps.setString(8, p.getEmail());
            ps.setString(9, p.getRg());
            ps.setString(10, p.getCpf());
            ps.setString(11, p.getEndereco());
            ps.setInt(12, p.getNumero());
            ps.setString(13, p.getBairro());
            ps.setString(14, p.getCep());
            ps.setString(15, p.getCidade());
            ps.setString(16, p.getUf());
            ps.setString(17, p.getTelefoneCelular());
            ps.setString(18, p.getTelefoneResidencial());
            ps.setString(19, p.getTelefoneComercial());
            ps.setInt(20, p.getId());
            
            ps.execute();
            
        }
        
    }
    
    public void deletarPessoa(Pessoa p) throws SQLException {
        
        final String sql = "DELETE FROM pessoa WHERE idpessoa = ?";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
            ps.setInt(1, p.getId());
            
            ps.execute();
        }
        
    }
    
    public Pessoa selecionarPessoaPeloID(int id) throws SQLException {
        
        Pessoa temp = new Pessoa();
        
        final String sql = "SELECT * FROM pessoa WHERE idpessoa = ?";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
            
            ps.setInt(1, id);
            
            try (ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    
                    temp.setId(rs.getInt(1));
                    temp.setNome(rs.getString(2));
                    temp.setSobrenome(rs.getString(3));
                    temp.setDataNascimento(rs.getDate(4));
                    temp.setSexo(rs.getString(5).charAt(0));
                    temp.setEstadoCivil(rs.getInt(6));
                    temp.setNacionalidade(rs.getString(7));
                    temp.setGrauDeInstrucao(rs.getInt(8));
                    temp.setEmail(rs.getString(9));
                    temp.setRg(rs.getString(10));
                    temp.setCpf(rs.getString(11));
                    temp.setEndereco(rs.getString(12));
                    temp.setNumero(rs.getInt(13));
                    temp.setBairro(rs.getString(14));
                    temp.setCep(rs.getString(15));
                    temp.setCidade(rs.getString(16));
                    temp.setUf(rs.getString(17));
                    temp.setTelefoneCelular(rs.getString(18));
                    temp.setTelefoneResidencial(rs.getString(19));
                    temp.setTelefoneComercial(rs.getString(20));
                    
                }
            }
            
        }
        
        return temp;
        
    }
    
    public ArrayList<Pessoa> listarPessoasPeloNome(String nome) throws SQLException {
        
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        
        final String sql = "SELECT * FROM pessoa WHERE nome LIKE(?)";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
            
            ps.setString(1, nome);
            
            try (ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {        
                    
                    Pessoa temp = new Pessoa();
                    
                    temp.setId(rs.getInt(1));
                    temp.setNome(rs.getString(2));
                    temp.setSobrenome(rs.getString(3));
                    temp.setDataNascimento(rs.getDate(4));
                    temp.setSexo(rs.getString(5).charAt(0));
                    temp.setEstadoCivil(rs.getInt(6));
                    temp.setNacionalidade(rs.getString(7));
                    temp.setGrauDeInstrucao(rs.getInt(8));
                    temp.setEmail(rs.getString(9));
                    temp.setRg(rs.getString(10));
                    temp.setCpf(rs.getString(11));
                    temp.setEndereco(rs.getString(12));
                    temp.setNumero(rs.getInt(13));
                    temp.setBairro(rs.getString(14));
                    temp.setCep(rs.getString(15));
                    temp.setCidade(rs.getString(16));
                    temp.setUf(rs.getString(17));
                    temp.setTelefoneCelular(rs.getString(18));
                    temp.setTelefoneResidencial(rs.getString(19));
                    temp.setTelefoneComercial(rs.getString(20));
                    
                    listaDePessoas.add(temp);
                    
                }
            }
            
        }
        
        return listaDePessoas;
        
    }
    
    public ArrayList<Pessoa> listarPessoas() throws SQLException {
        
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        
        final String sql = "SELECT * FROM pessoa";
        
        try (PreparedStatement ps = BD.getConnection().prepareStatement(sql)) {
            
            try (ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {        
                    
                    Pessoa temp = new Pessoa();
                    
                    temp.setId(rs.getInt(1));
                    temp.setNome(rs.getString(2));
                    temp.setSobrenome(rs.getString(3));
                    temp.setDataNascimento(rs.getDate(4));
                    temp.setSexo(rs.getString(5).charAt(0));
                    temp.setEstadoCivil(rs.getInt(6));
                    temp.setNacionalidade(rs.getString(7));
                    temp.setGrauDeInstrucao(rs.getInt(8));
                    temp.setEmail(rs.getString(9));
                    temp.setRg(rs.getString(10));
                    temp.setCpf(rs.getString(11));
                    temp.setEndereco(rs.getString(12));
                    temp.setNumero(rs.getInt(13));
                    temp.setBairro(rs.getString(14));
                    temp.setCep(rs.getString(15));
                    temp.setCidade(rs.getString(16));
                    temp.setUf(rs.getString(17));
                    temp.setTelefoneCelular(rs.getString(18));
                    temp.setTelefoneResidencial(rs.getString(19));
                    temp.setTelefoneComercial(rs.getString(20));
                    
                    listaDePessoas.add(temp);
                    
                }
            }
            
        }
        
        return listaDePessoas;
        
    }
    
}
