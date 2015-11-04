package sa.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import sa.dao.AlunoDAO;
import sa.dao.Aluno_CursoDAO;
import sa.dao.CursoDAO;
import sa.dao.DocumentoDAO;
import sa.dao.PessoaDAO;
import sa.entidade.Aluno;
import sa.entidade.Aluno_Curso;
import sa.entidade.Curso;
import sa.entidade.Documento;
import sa.entidade.Pessoa;

public class FrmCadastroDeAlunos extends javax.swing.JFrame {
    
    private FrmInicial frameInicial;
    
    public FrmCadastroDeAlunos(FrmInicial frameInicial) {
        
        this.frameInicial = frameInicial;
        
                addWindowListener(new WindowAdapter() {

            @Override
            public void windowActivated(WindowEvent we) {
                
               frameInicial.setEnabled(false);
                
            }

            @Override
            public void windowClosing(WindowEvent we) {
                
                frameInicial.setEnabled(true);
                
            }
            
        });

        
        String[] colunas = new String[] {
            "id",
            "nome",
            "sobrenome",
            "dataNascimento",
            "sexo",
            "estadoCivil",
            "nacionalidade",
            "grauDeInstrucao",
            "email",
            "rg",
            "cpf",
            "endereco",
            "numero",
            "bairro",
            "cep",
            "cidade",
            "uf",
            "telefoneCelular",
            "telefoneResidencial",
            "telefoneComercial"
        };
        
        aluno = new Aluno();
        documentos = new Documento();
        aluno_curso = new Aluno_Curso();
        listaDeCursos = new ArrayList<>();
        listaDePessoas = new ArrayList<>();                
        pessoaTableModel = new DefaultTableModel(new Object[][]{}, colunas) {
            
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }  
            
        };
        cursoComboBoxModel = new DefaultComboBoxModel();
        alunodao = new AlunoDAO();
        pessoadao = new PessoaDAO();
        documentodao = new DocumentoDAO();
        acdao = new Aluno_CursoDAO();
        cursodao = new CursoDAO();
        
        initComponents();
        
        tblDadosPessoa.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent lse) {
                
                if(tblDadosPessoa.getSelectedRowCount() > 1) {
                    
                    tblDadosPessoa.clearSelection();
                    JOptionPane.showConfirmDialog(null, "Selecione apenas uma pessoa!");
                    
                }
                else if (tblDadosPessoa.getSelectedRowCount() == 1) {
                    
                    lblPessoa.setText("Pessoa selecionada: " +
                            (String)tblDadosPessoa.getModel().getValueAt(tblDadosPessoa.getSelectedRow(), 0));
                    
                }
                
            }
        });
        
        listarCursos();
        atualizarCursoModel();
        cboCurso.updateUI();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpCEM = new javax.swing.ButtonGroup();
        grpCR = new javax.swing.ButtonGroup();
        grpCAM = new javax.swing.ButtonGroup();
        grpCRG = new javax.swing.ButtonGroup();
        grpCCC = new javax.swing.ButtonGroup();
        grpHE = new javax.swing.ButtonGroup();
        grpAtivo = new javax.swing.ButtonGroup();
        pnlPrincipal = new javax.swing.JPanel();
        pnlDocumentos = new javax.swing.JPanel();
        lblComprovanteEnsinoMedio = new javax.swing.JLabel();
        lblComprovanteDeResidencia = new javax.swing.JLabel();
        lblCopiaAlistamentoMilitar = new javax.swing.JLabel();
        lblCopiaRG = new javax.swing.JLabel();
        lblCopiaCertidaoDeCasamento = new javax.swing.JLabel();
        lblHistoricoEscolar = new javax.swing.JLabel();
        rbCEMEntregue = new javax.swing.JRadioButton();
        rbCEMPendente = new javax.swing.JRadioButton();
        rbCREntregue = new javax.swing.JRadioButton();
        rbCRPendente = new javax.swing.JRadioButton();
        rbCAMEntregue = new javax.swing.JRadioButton();
        rbCAMPendente = new javax.swing.JRadioButton();
        rbCRGEntregue = new javax.swing.JRadioButton();
        rbCRGPendente = new javax.swing.JRadioButton();
        rbCCCEntregue = new javax.swing.JRadioButton();
        rbCCCPendente = new javax.swing.JRadioButton();
        rbHEEntregue = new javax.swing.JRadioButton();
        rbHEPendente = new javax.swing.JRadioButton();
        pnlDadosPessoais = new javax.swing.JPanel();
        lblPessoa = new javax.swing.JLabel();
        txtPessoa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDadosPessoa = new javax.swing.JTable();
        lblPessoaSelecionada = new javax.swing.JLabel();
        pnlAluno = new javax.swing.JPanel();
        lblRa = new javax.swing.JLabel();
        txtRa = new javax.swing.JTextField();
        lblAtivo = new javax.swing.JLabel();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        lblCurso = new javax.swing.JLabel();
        cboCurso = new javax.swing.JComboBox();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Alunos");
        setMinimumSize(new java.awt.Dimension(710, 540));

        pnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pnlDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Documentos"));

        lblComprovanteEnsinoMedio.setText("Comprovante Ensino Médio:");

        lblComprovanteDeResidencia.setText("Comprovante de Residência:");

        lblCopiaAlistamentoMilitar.setText("Cópia Alistamento Militar:");

        lblCopiaRG.setText("Cópia RG:");

        lblCopiaCertidaoDeCasamento.setText("Cópia Certidão de Casamento:");

        lblHistoricoEscolar.setText("Histórico Escolar:");

        grpCEM.add(rbCEMEntregue);
        rbCEMEntregue.setText("Entregue");

        grpCEM.add(rbCEMPendente);
        rbCEMPendente.setText("Pendente");

        grpCR.add(rbCREntregue);
        rbCREntregue.setText("Entregue");

        grpCR.add(rbCRPendente);
        rbCRPendente.setText("Pendente");

        grpCAM.add(rbCAMEntregue);
        rbCAMEntregue.setText("Entregue");

        grpCAM.add(rbCAMPendente);
        rbCAMPendente.setText("Pendente");

        grpCRG.add(rbCRGEntregue);
        rbCRGEntregue.setText("Entregue");

        grpCRG.add(rbCRGPendente);
        rbCRGPendente.setText("Pendente");

        grpCCC.add(rbCCCEntregue);
        rbCCCEntregue.setText("Entregue");

        grpCCC.add(rbCCCPendente);
        rbCCCPendente.setText("Pendente");

        grpHE.add(rbHEEntregue);
        rbHEEntregue.setText("Entregue");

        grpHE.add(rbHEPendente);
        rbHEPendente.setText("Pendente");

        javax.swing.GroupLayout pnlDocumentosLayout = new javax.swing.GroupLayout(pnlDocumentos);
        pnlDocumentos.setLayout(pnlDocumentosLayout);
        pnlDocumentosLayout.setHorizontalGroup(
            pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDocumentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDocumentosLayout.createSequentialGroup()
                        .addComponent(lblHistoricoEscolar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbHEEntregue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbHEPendente))
                    .addGroup(pnlDocumentosLayout.createSequentialGroup()
                        .addComponent(lblCopiaCertidaoDeCasamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbCCCEntregue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCCCPendente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDocumentosLayout.createSequentialGroup()
                        .addComponent(lblCopiaRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbCRGEntregue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCRGPendente))
                    .addGroup(pnlDocumentosLayout.createSequentialGroup()
                        .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComprovanteEnsinoMedio)
                            .addComponent(lblComprovanteDeResidencia)
                            .addComponent(lblCopiaAlistamentoMilitar))
                        .addGap(42, 42, 42)
                        .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDocumentosLayout.createSequentialGroup()
                                .addComponent(rbCEMEntregue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbCEMPendente))
                            .addGroup(pnlDocumentosLayout.createSequentialGroup()
                                .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbCAMEntregue)
                                    .addComponent(rbCREntregue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbCRPendente)
                                    .addComponent(rbCAMPendente))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDocumentosLayout.setVerticalGroup(
            pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDocumentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComprovanteEnsinoMedio)
                    .addComponent(rbCEMEntregue)
                    .addComponent(rbCEMPendente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbCREntregue)
                        .addComponent(rbCRPendente))
                    .addComponent(lblComprovanteDeResidencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCopiaAlistamentoMilitar)
                    .addComponent(rbCAMEntregue)
                    .addComponent(rbCAMPendente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbCRGEntregue)
                        .addComponent(rbCRGPendente))
                    .addComponent(lblCopiaRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbCCCEntregue)
                        .addComponent(rbCCCPendente))
                    .addComponent(lblCopiaCertidaoDeCasamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbHEEntregue)
                        .addComponent(rbHEPendente))
                    .addComponent(lblHistoricoEscolar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        lblPessoa.setText("Pessoa:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblDadosPessoa.setModel(pessoaTableModel);
        jScrollPane1.setViewportView(tblDadosPessoa);

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(lblPessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar))
                            .addComponent(lblPessoaSelecionada))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDadosPessoaisLayout.setVerticalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPessoa)
                    .addComponent(txtPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPessoaSelecionada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAluno.setBorder(javax.swing.BorderFactory.createTitledBorder("Aluno"));

        lblRa.setText("RA:");

        lblAtivo.setText("Ativo:");

        grpAtivo.add(rbSim);
        rbSim.setText("Sim");

        grpAtivo.add(rbNao);
        rbNao.setText("Não");

        lblCurso.setText("Curso:");

        cboCurso.setModel(cursoComboBoxModel);

        javax.swing.GroupLayout pnlAlunoLayout = new javax.swing.GroupLayout(pnlAluno);
        pnlAluno.setLayout(pnlAlunoLayout);
        pnlAlunoLayout.setHorizontalGroup(
            pnlAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlunoLayout.createSequentialGroup()
                        .addComponent(lblRa)
                        .addGap(18, 18, 18)
                        .addComponent(txtRa, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAlunoLayout.createSequentialGroup()
                        .addComponent(lblAtivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNao))
                    .addGroup(pnlAlunoLayout.createSequentialGroup()
                        .addComponent(lblCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAlunoLayout.setVerticalGroup(
            pnlAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRa)
                    .addComponent(txtRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtivo)
                    .addComponent(rbSim)
                    .addComponent(rbNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(pnlAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso)
                    .addComponent(cboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDocumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        pesquisarPessoas();
        atualizarPessoaModel();
        tblDadosPessoa.updateUI();
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        limparCampos();
        dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        
        if(!checarCampos()) {
            
            JOptionPane.showMessageDialog(this, "Preencha corretamente os campos!");
            
        }
        else {
            
            confirmar();
            
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed
    
    private void preencherAluno() {
        
        Pessoa p = new Pessoa();
        String id = (String) tblDadosPessoa.getModel().getValueAt(tblDadosPessoa.getSelectedRow(), 0);
        
        p.setId(Integer.parseInt(id));
        
        aluno.setRa(txtRa.getText());
        aluno.setAtivo(rbSim.isSelected());
        aluno.setPessoa(p);
        
    }
    
    // Usar apos alunodao gerar o id do aluno
    private void preencherDocumentos() {
        
        documentos.setComprovanteEM(rbCEMEntregue.isSelected() ? 'V' : 'F');
        documentos.setComprovanteResidencia(rbCREntregue.isSelected() ? 'V' : 'F');
        documentos.setCopiaAlistamentoMilitar(rbCAMEntregue.isSelected() ? 'V' : 'F');
        documentos.setCopiaCertidaoCasamento(rbCCCEntregue.isSelected() ? 'V' : 'F');
        documentos.setCopiaRG(rbCRGEntregue.isSelected() ? 'V' : 'F');
        documentos.setHistoricoEscolar(rbHEEntregue.isSelected() ? 'V' : 'F');
        documentos.setIdAluno(aluno.getId());
        
    }
    
    // Usar apos alunodao gerar o id do aluno
    private void preencherAlunoCurso() {
        
        Curso c = (Curso) cboCurso.getModel().getElementAt(cboCurso.getSelectedIndex());
        
        aluno_curso.setIdAluno(aluno.getId());
        aluno_curso.setIdCurso(c.getIdCurso());
        
    }
    
    private void confirmar() {
        
        preencherAluno();
        
        try {
            
            aluno = alunodao.inserirAluno(aluno, aluno.getPessoa().getId());
            
        } catch (SQLException ex) {
            
            Logger.getLogger(FrmCadastroDeAlunos.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        preencherDocumentos();
        
        documentodao.inserirDocumento(documentos);
        
        preencherAlunoCurso();
        
        try {
            
            acdao.inserirAluno_Curso(aluno_curso);
            
        } catch (SQLException ex) {
            
            Logger.getLogger(FrmCadastroDeAlunos.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        limparCampos();
        
    }
    
    private void limparCampos() {
        
        txtRa.setText(null);        
        grpAtivo.clearSelection();
        cboCurso.setSelectedIndex(0);
        
        grpCAM.clearSelection();
        grpCCC.clearSelection();
        grpCEM.clearSelection();
        grpCR.clearSelection();
        grpCRG.clearSelection();
        grpHE.clearSelection();
        
        txtPessoa.setText(null);
        limparPessoaModel();    
        
    }
    
    private void pesquisarPessoas() {
        
        try {
            
            listaDePessoas = pessoadao.listarPessoasPeloNome("%" + txtPessoa.getText() + "%");
            
        } catch (SQLException ex) {
            
            Logger.getLogger(FrmCadastroDeAlunos.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    private void limparPessoaModel() {
        
        while(pessoaTableModel.getRowCount() > 0)
            pessoaTableModel.removeRow(pessoaTableModel.getRowCount() - 1);
        
    }
    
    private void atualizarPessoaModel() {
        
        limparPessoaModel();
        
        for(Pessoa p : listaDePessoas) {
            
            String ec = "", gdi = "";
            
            if(p.getEstadoCivil() == 1)
                ec = "Solteiro(a)";
            if(p.getEstadoCivil() == 2)
                ec = "Casado(a)";
            if(p.getEstadoCivil() == 3)
                ec = "Divorciado(a)";
            if(p.getEstadoCivil() == 4)
                ec = "Viúvo(a)";
            
            if(p.getGrauDeInstrucao() == 1)
                gdi = "Ensino Fundamental";
            if(p.getGrauDeInstrucao() == 2)
                gdi = "Ensino Médio";
            if(p.getGrauDeInstrucao() == 3)
                gdi = "Ensino Superior";
            
            Object[] linha = new Object[] {
                
                Integer.toString(p.getId()),
                p.getNome(),
                p.getSobrenome(),
                p.getDataNascimento().toString(),
                Character.toString(p.getSexo()),
                ec,
                p.getNacionalidade(),
                gdi,
                p.getEmail(),
                p.getRg(),
                p.getCpf(),
                p.getEndereco(),
                Integer.toString(p.getNumero()),
                p.getBairro(),
                p.getCep(),
                p.getCidade(),
                p.getUf(),
                p.getTelefoneCelular(),
                p.getTelefoneResidencial(),
                p.getTelefoneComercial()
                    
            };
            
            pessoaTableModel.addRow(linha);
            
        }
        
    }
    
    private void atualizarCursoModel() {
        
        for(Curso c : listaDeCursos)
            cursoComboBoxModel.addElement(c);
        
    }
    
    private void listarCursos() {
        
        //listaDeCursos = cursodao.listarCursos();
        
    }
    
    private boolean checarCampos() {
        
        if(txtRa.getText() == null || txtRa.getText().equals(""))
            return false;
        
        try{
        
            Long.parseLong(txtRa.getText());
        
        } catch(NumberFormatException nfe) {
            
            return false;
            
        }
        
        if(!rbSim.isSelected() && !rbNao.isSelected())
            return false;
        
        if(!rbCAMEntregue.isSelected() && !rbCAMPendente.isSelected())
            return false;
        
        if(!rbCCCEntregue.isSelected() && !rbCCCEntregue.isSelected())
            return false;
        
        if(!rbCEMEntregue.isSelected() && !rbCEMPendente.isSelected())
            return false;
        
        if(!rbCREntregue.isSelected() && !rbCRPendente.isSelected())
            return false;
        
        if(!rbCRGEntregue.isSelected() && !rbCRGPendente.isSelected())
            return false;
        
        if(!rbHEEntregue.isSelected() && !rbHEPendente.isSelected())
            return false;
        
        return !(lblPessoaSelecionada.getText().equals("") || lblPessoaSelecionada.getText() == null);
        
    }
    
    private Aluno aluno;
    private Documento documentos;
    private Aluno_Curso aluno_curso;
    private ArrayList<Pessoa> listaDePessoas;
    private ArrayList<Curso> listaDeCursos;
    private DefaultTableModel pessoaTableModel;
    private DefaultComboBoxModel cursoComboBoxModel;
    private AlunoDAO alunodao;
    private PessoaDAO pessoadao;
    private DocumentoDAO documentodao;
    private Aluno_CursoDAO acdao;
    private CursoDAO cursodao;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox cboCurso;
    private javax.swing.ButtonGroup grpAtivo;
    private javax.swing.ButtonGroup grpCAM;
    private javax.swing.ButtonGroup grpCCC;
    private javax.swing.ButtonGroup grpCEM;
    private javax.swing.ButtonGroup grpCR;
    private javax.swing.ButtonGroup grpCRG;
    private javax.swing.ButtonGroup grpHE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtivo;
    private javax.swing.JLabel lblComprovanteDeResidencia;
    private javax.swing.JLabel lblComprovanteEnsinoMedio;
    private javax.swing.JLabel lblCopiaAlistamentoMilitar;
    private javax.swing.JLabel lblCopiaCertidaoDeCasamento;
    private javax.swing.JLabel lblCopiaRG;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblHistoricoEscolar;
    private javax.swing.JLabel lblPessoa;
    private javax.swing.JLabel lblPessoaSelecionada;
    private javax.swing.JLabel lblRa;
    private javax.swing.JPanel pnlAluno;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JPanel pnlDocumentos;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JRadioButton rbCAMEntregue;
    private javax.swing.JRadioButton rbCAMPendente;
    private javax.swing.JRadioButton rbCCCEntregue;
    private javax.swing.JRadioButton rbCCCPendente;
    private javax.swing.JRadioButton rbCEMEntregue;
    private javax.swing.JRadioButton rbCEMPendente;
    private javax.swing.JRadioButton rbCREntregue;
    private javax.swing.JRadioButton rbCRGEntregue;
    private javax.swing.JRadioButton rbCRGPendente;
    private javax.swing.JRadioButton rbCRPendente;
    private javax.swing.JRadioButton rbHEEntregue;
    private javax.swing.JRadioButton rbHEPendente;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTable tblDadosPessoa;
    private javax.swing.JTextField txtPessoa;
    private javax.swing.JTextField txtRa;
    // End of variables declaration//GEN-END:variables
}
