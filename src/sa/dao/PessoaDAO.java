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
import sa.entidade.Pessoa;

/**
 *
 * @author Standard
 */
public class PessoaDAO {
    
    public Pessoa inserirPessoa(Pessoa p) throws SQLException {
        
        int chaveGerada = 0;
        
        final String sql = "INSERT INTO pessoa "
                + "(id, nome, sobrenome, datanascimento, sexo, estadocivil, "
                + "nacionalidade, graudeinstrucao, email, rg, cpf, endereco, "
                + "numero, bairro, cep, cidade, uf, telefonecelular, "
                + "telefoneresidencial, telefonecomercial) "
                + "VALUES(seq_pessoa.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        PreparedStatement ps = BD.getConnection().prepareStatement(sql);
        
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
        
        ps.execute(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = ps.getGeneratedKeys();
        
        while(rs.next()) {
            chaveGerada = rs.getInt(1);
        }
        
        p.setId(chaveGerada);
        
        return p;
        
    }
    
}
