package sa.ui;

public class FrmInicial extends javax.swing.JFrame {

    public FrmInicial() {
        
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarAlunos = new javax.swing.JButton();
        btnCadastrarPessoas = new javax.swing.JButton();
        btnCadastrarCursos = new javax.swing.JButton();
        btnVisualizarAlunos = new javax.swing.JButton();
        lblBemVindo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);

        btnCadastrarAlunos.setText("Cadastrar Alunos");
        btnCadastrarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAlunosActionPerformed(evt);
            }
        });

        btnCadastrarPessoas.setText("Cadastrar Pessoas");
        btnCadastrarPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPessoasActionPerformed(evt);
            }
        });

        btnCadastrarCursos.setText("Cadastrar Cursos");
        btnCadastrarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCursosActionPerformed(evt);
            }
        });

        btnVisualizarAlunos.setText("Visualizar Alunos");
        btnVisualizarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarAlunosActionPerformed(evt);
            }
        });

        lblBemVindo.setText("Bem Vindo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblBemVindo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnCadastrarAlunos)
                            .addComponent(btnCadastrarPessoas)
                            .addComponent(btnCadastrarCursos)
                            .addComponent(btnVisualizarAlunos))))
                .addGap(45, 45, 45))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrarAlunos, btnCadastrarCursos, btnCadastrarPessoas, btnVisualizarAlunos});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarAlunos)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAlunosActionPerformed
        
        FrmCadastroDeAlunos frmCadastroDeAlunos = new FrmCadastroDeAlunos(this);
        
        frmCadastroDeAlunos.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarAlunosActionPerformed

    private void btnCadastrarPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPessoasActionPerformed
        
        FrmCadastroDePessoas frmCadastroDePessoas = new FrmCadastroDePessoas(this);
        
        frmCadastroDePessoas.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarPessoasActionPerformed

    private void btnCadastrarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCursosActionPerformed
        
        FrmCadastroDeCursos frmCadastroDeCursos = new FrmCadastroDeCursos(this);
        
        frmCadastroDeCursos.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarCursosActionPerformed

    private void btnVisualizarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarAlunosActionPerformed
        
        FrmVisualizarAlunos frmVisualizarAlunos = new FrmVisualizarAlunos(this);
        
        frmVisualizarAlunos.setVisible(true);
        
    }//GEN-LAST:event_btnVisualizarAlunosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAlunos;
    private javax.swing.JButton btnCadastrarCursos;
    private javax.swing.JButton btnCadastrarPessoas;
    private javax.swing.JButton btnVisualizarAlunos;
    private javax.swing.JLabel lblBemVindo;
    // End of variables declaration//GEN-END:variables
}
