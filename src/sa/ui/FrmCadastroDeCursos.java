package sa.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sa.dao.CursoDAO;
import sa.entidade.Curso;

public class FrmCadastroDeCursos extends javax.swing.JFrame {
    
    public FrmCadastroDeCursos(FrmInicial frmInicial) {
        
        this.frameInicial = frmInicial;
        
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
                
        this.curso = new Curso();

        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTipo = new javax.swing.ButtonGroup();
        pnlCurso = new javax.swing.JPanel();
        lblNomeDoCurso = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblCargaHoraria = new javax.swing.JLabel();
        lblQuantidadeDeHorasAC = new javax.swing.JLabel();
        txtNomeDoCurso = new javax.swing.JTextField();
        txtCargaHoraria = new javax.swing.JTextField();
        txtQuantidadeDeHorasAC = new javax.swing.JTextField();
        rbGraduacao = new javax.swing.JRadioButton();
        rbPosGraduacao = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cursos");
        setMinimumSize(new java.awt.Dimension(500, 230));

        pnlCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Curso"));

        lblNomeDoCurso.setText("Nome do Curso:");

        lblTipo.setText("Tipo:");

        lblCargaHoraria.setText("Carga Horária:");

        lblQuantidadeDeHorasAC.setText("Quantidade de Horas AC:");

        grpTipo.add(rbGraduacao);
        rbGraduacao.setText("Graduação");

        grpTipo.add(rbPosGraduacao);
        rbPosGraduacao.setText("Pós-Graduação");

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

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCursoLayout = new javax.swing.GroupLayout(pnlCurso);
        pnlCurso.setLayout(pnlCursoLayout);
        pnlCursoLayout.setHorizontalGroup(
            pnlCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCursoLayout.createSequentialGroup()
                        .addGroup(pnlCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeDoCurso)
                            .addComponent(lblCargaHoraria)
                            .addComponent(lblQuantidadeDeHorasAC)
                            .addComponent(lblTipo))
                        .addGap(33, 33, 33)
                        .addGroup(pnlCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeDoCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addGroup(pnlCursoLayout.createSequentialGroup()
                                .addGroup(pnlCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtQuantidadeDeHorasAC, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCargaHoraria, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbGraduacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbPosGraduacao))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCursoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        pnlCursoLayout.setVerticalGroup(
            pnlCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDoCurso)
                    .addComponent(txtNomeDoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(rbGraduacao)
                    .addComponent(rbPosGraduacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargaHoraria)
                    .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeDeHorasAC)
                    .addComponent(txtQuantidadeDeHorasAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pnlCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        limparComponentes();
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        
        confirmar();
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        limparComponentes();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void confirmar() {
        
        if(!checarComponentes()) {
            
            JOptionPane.showMessageDialog(this, "Preencha corretamente os dados!");
            
        }
        else {
            
            curso = new Curso();
            
            curso.setNome(txtNomeDoCurso.getText());
            curso.setTipo(rbGraduacao.isSelected() ? 1 : 2);
            curso.setCargaHoraria(Integer.parseInt(txtCargaHoraria.getText()));
            curso.setCargaHorariaAC(Integer.parseInt(txtQuantidadeDeHorasAC.getText()));
            
            CursoDAO cursoDAO = new CursoDAO();
            
            try {
                
                cursoDAO.inserirCurso(curso);
                
            } catch (SQLException sqle) {
                
                JOptionPane.showMessageDialog(this, "Erro relacionado ao Banco de Dados!\n" + sqle.getMessage());
                
            }
            
            limparComponentes();
            
        }
        
    }
    
    private boolean checarComponentes() {
        
        if(txtNomeDoCurso.getText() == null || txtNomeDoCurso.getText().equals(""))
            return false;
        
        if(txtCargaHoraria.getText() == null || txtCargaHoraria.getText().equals(""))
            return false;
        
        try {
        
            Integer.parseInt(txtCargaHoraria.getText());
            
        } catch(NumberFormatException nfe) {
            
            return false;
            
        }
        
        if(txtQuantidadeDeHorasAC.getText() == null || txtQuantidadeDeHorasAC.getText().equals(""))
            return false;
        
        try {
        
            Integer.parseInt(txtQuantidadeDeHorasAC.getText());
            
        } catch(NumberFormatException nfe) {
            
            return false;
            
        }
        
        return !(!rbGraduacao.isSelected() && !rbPosGraduacao.isSelected());
        
    }
    
    private void limparComponentes() {
        
        txtNomeDoCurso.setText(null);
        grpTipo.clearSelection();
        txtCargaHoraria.setText(null);
        txtQuantidadeDeHorasAC.setText(null);
        
    }
    
    private FrmInicial frameInicial;
    private Curso curso;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.ButtonGroup grpTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblCargaHoraria;
    private javax.swing.JLabel lblNomeDoCurso;
    private javax.swing.JLabel lblQuantidadeDeHorasAC;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlCurso;
    private javax.swing.JRadioButton rbGraduacao;
    private javax.swing.JRadioButton rbPosGraduacao;
    private javax.swing.JTextField txtCargaHoraria;
    private javax.swing.JTextField txtNomeDoCurso;
    private javax.swing.JTextField txtQuantidadeDeHorasAC;
    // End of variables declaration//GEN-END:variables
}
