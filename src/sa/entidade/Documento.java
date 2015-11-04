/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.entidade;

/**
 *
 * @author Felipe
 */
public class Documento {
    
    private int idDocumento;
    private int idAluno;
    private char comprovanteEM; 
    private char comprovanteResidencia;
    private char copiaAlistamentoMilitar;
    private char copiaRG;
    private char copiaCertidaoCasamento;
    private char historicoEscolar;

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public char getComprovanteEM() {
        return comprovanteEM;
    }

    public void setComprovanteEM(char comprovanteEM) {
        this.comprovanteEM = comprovanteEM;
    }

    public char getComprovanteResidencia() {
        return comprovanteResidencia;
    }

    public void setComprovanteResidencia(char comprovanteResidencia) {
        this.comprovanteResidencia = comprovanteResidencia;
    }

    public char getCopiaAlistamentoMilitar() {
        return copiaAlistamentoMilitar;
    }

    public void setCopiaAlistamentoMilitar(char copiaAlistamentoMilitar) {
        this.copiaAlistamentoMilitar = copiaAlistamentoMilitar;
    }

    public char getCopiaRG() {
        return copiaRG;
    }

    public void setCopiaRG(char copiaRG) {
        this.copiaRG = copiaRG;
    }

    public char getCopiaCertidaoCasamento() {
        return copiaCertidaoCasamento;
    }

    public void setCopiaCertidaoCasamento(char copiaCertidaoCasamento) {
        this.copiaCertidaoCasamento = copiaCertidaoCasamento;
    }

    public char getHistoricoEscolar() {
        return historicoEscolar;
    }

    public void setHistoricoEscolar(char historicoEscolar) {
        this.historicoEscolar = historicoEscolar;
    }
    
    
}
