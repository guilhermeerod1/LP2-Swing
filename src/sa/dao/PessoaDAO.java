/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.dao;

import java.sql.PreparedStatement;
import sa.entidade.Pessoa;

/**
 *
 * @author Standard
 */
public class PessoaDAO {
    
    public Pessoa inserirPessoa(Pessoa p) {
        
        int chaveGerada = 0;
        
        final String sql = "INSERT INTO pessoa "
                + "(id, nome, sobrenome, datanascimento, sexo, estadocivil, "
                + "nacionalidade, graudeinstrucao, email, rg, cpf, endereco, "
                + "numero, bairro, cep, cidade, uf, telefonecelular, "
                + "telefoneresidencial, telefonecomercial) "
                + "VALUES(seq_pessoa.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        PreparedStatement ps = 
        
        return p;
        
    }
    
}
