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
public class Curso {
    
    private int idCurso;
    private int idCoordenador;
    private int idAluno;
    private String nome;
    private int tipo;
    private int cargaHoraria;
    private int cargaHorariaAC;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdCoordenador() {
        return idCoordenador;
    }

    public void setIdCoordenador(int idCoordenador) {
        this.idCoordenador = idCoordenador;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHorariaAC() {
        return cargaHorariaAC;
    }

    public void setCargaHorariaAC(int cargaHorariaAC) {
        this.cargaHorariaAC = cargaHorariaAC;
    }
    
    public String toString() {
        
        return getNome();
        
    }
    
}
