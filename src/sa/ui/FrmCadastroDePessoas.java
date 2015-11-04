package sa.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sa.dao.PessoaDAO;
import sa.entidade.Pessoa;

public class FrmCadastroDePessoas extends javax.swing.JFrame {

    private final FrmInicial frameInicial;
    
    public FrmCadastroDePessoas(FrmInicial frameInicial) {
        
        pessoa = new Pessoa();
        this.frameInicial = frameInicial;
        
        initComponents();
        
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
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSexo = new javax.swing.ButtonGroup();
        pnlDadosPessoais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        lblDataDeNascimento = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblNacionalidade = new javax.swing.JLabel();
        lblGrauDeInstrucao = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        lblTelefoneCelular = new javax.swing.JLabel();
        lblTelefoneResidencial = new javax.swing.JLabel();
        lblTelefoneComercial = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        cboEstadoCivil = new javax.swing.JComboBox();
        txtNacionalidade = new javax.swing.JTextField();
        cboGrauDeInstrucao = new javax.swing.JComboBox();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        cboUf = new javax.swing.JComboBox();
        btnLimpar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        ftxtDataDeNascimento = new javax.swing.JFormattedTextField();
        ftxtRG = new javax.swing.JFormattedTextField();
        ftxtCPF = new javax.swing.JFormattedTextField();
        ftxtCEP = new javax.swing.JFormattedTextField();
        ftxtTelefoneCelular = new javax.swing.JFormattedTextField();
        ftxtTelefoneResidencial = new javax.swing.JFormattedTextField();
        ftxtTelefoneComercial = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pessoas");
        setMinimumSize(new java.awt.Dimension(590, 660));

        pnlDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNome.setText("Nome:");

        lblSobrenome.setText("Sobrenome:");

        lblDataDeNascimento.setText("Data de nascimento:");

        lblSexo.setText("Sexo:");

        lblEstadoCivil.setText("Estado cívil:");

        lblNacionalidade.setText("Nacionalidade:");

        lblGrauDeInstrucao.setText("Grau de instrução:");

        lblEmail.setText("Email:");

        lblRg.setText("RG:");

        lblCpf.setText("CPF:");

        lblEndereco.setText("Endereço:");

        lblNumero.setText("Número:");

        lblBairro.setText("Bairro:");

        lblCep.setText("CEP:");

        lblCidade.setText("Cidade:");

        lblUf.setText("UF:");

        lblTelefoneCelular.setText("Telefone Celular");

        lblTelefoneResidencial.setText("Telefone Residencial:");

        lblTelefoneComercial.setText("Telefone Comercial:");

        grpSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        grpSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)" }));

        cboGrauDeInstrucao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ensino Fundamental", "Ensino Médio", "Ensino Superior" }));

        cboUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        ftxtDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        try {
            ftxtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftxtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftxtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftxtTelefoneCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftxtTelefoneResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftxtTelefoneComercial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblSobrenome)
                    .addComponent(lblDataDeNascimento)
                    .addComponent(lblSexo)
                    .addComponent(lblEstadoCivil)
                    .addComponent(lblNacionalidade)
                    .addComponent(lblGrauDeInstrucao)
                    .addComponent(lblEmail)
                    .addComponent(lblRg)
                    .addComponent(lblCpf)
                    .addComponent(lblEndereco)
                    .addComponent(lblNumero)
                    .addComponent(lblBairro)
                    .addComponent(lblCep)
                    .addComponent(lblCidade)
                    .addComponent(lblUf)
                    .addComponent(lblTelefoneCelular)
                    .addComponent(lblTelefoneResidencial)
                    .addComponent(lblTelefoneComercial))
                .addGap(64, 64, 64)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGrauDeInstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ftxtDataDeNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosPessoaisLayout.createSequentialGroup()
                                    .addComponent(rbMasculino)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbFeminino)))))
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(ftxtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ftxtRG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        pnlDadosPessoaisLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboEstadoCivil, cboGrauDeInstrucao, txtBairro, txtCidade, txtEmail, txtEndereco, txtNacionalidade, txtNome, txtSobrenome});

        pnlDadosPessoaisLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ftxtTelefoneCelular, ftxtTelefoneComercial, ftxtTelefoneResidencial});

        pnlDadosPessoaisLayout.setVerticalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSobrenome)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataDeNascimento)
                    .addComponent(ftxtDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoCivil)
                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNacionalidade)
                    .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrauDeInstrucao)
                    .addComponent(cboGrauDeInstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRg)
                    .addComponent(ftxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCpf)
                    .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(ftxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUf)
                    .addComponent(cboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneCelular)
                    .addComponent(ftxtTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneResidencial)
                    .addComponent(ftxtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneComercial)
                    .addComponent(ftxtTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        limparCampos();
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        limparCampos();
        dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        
        if(!checarCampos()) {
            
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!");
            
        }
        else {
            
            preencherPessoa();
            PessoaDAO pessoaDAO = new PessoaDAO();
            
            try {
                
                pessoaDAO.inserirPessoa(pessoa);
                
            } catch (SQLException ex) {
                
                ex.printStackTrace();
//                JOptionPane.showMessageDialog(this, "Erro de comunicação com o Banco de Dados. Finalizar.");
//                return;
                
            }
            
            JOptionPane.showConfirmDialog(this, "Nova pessoa adicionada com sucesso!");
            
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed
    
    private boolean checarCampos() {
        
        if(ftxtCEP.getText() == null || ftxtCEP.getText().equals(""))
            return false;
        
        if(ftxtCPF.getText() == null || ftxtCPF.getText().equals(""))
            return false;
        
        if(ftxtDataDeNascimento.getText() == null || ftxtDataDeNascimento.getText().equals(""))
            return false;
        
        if(ftxtRG.getText() == null || ftxtRG.getText().equals(""))
            return false;
        
        if(ftxtTelefoneCelular.getText() == null || ftxtTelefoneCelular.getText().equals(""))
            return false;
        
        if(ftxtTelefoneComercial.getText() == null || ftxtTelefoneComercial.getText().equals(""))
            return false;
        
        if(ftxtTelefoneResidencial.getText() == null || ftxtTelefoneResidencial.getText().equals(""))
            return false;
        
        if(!rbMasculino.isSelected() && !rbFeminino.isSelected())
            return false;
        
        if(txtBairro.getText() == null || txtBairro.getText().equals(""))
            return false;
        
        if(txtCidade.getText() == null || txtCidade.getText().equals(""))
            return false;
        
        if(txtEmail.getText() == null || txtEmail.getText().equals(""))
            return false;
        
        if(txtEndereco.getText() == null || txtEndereco.getText().equals(""))
            return false;
        
        if(txtNacionalidade.getText() == null || txtNacionalidade.getText().equals(""))
            return false;
        
        if(txtNome.getText() == null || txtNome.getText().equals(""))
            return false;
        
        if(txtNumero.getText() == null || txtNumero.getText().equals(""))
            return false;
        
        try {
        
            Integer.parseInt(txtNumero.getText());
        
        } catch(NumberFormatException nfe) {
            
            return false;
            
        }
        
        return !(txtSobrenome.getText() == null || txtSobrenome.getText().equals(""));
        
    }
    
    private void limparCampos() {
        
            cboEstadoCivil.setSelectedIndex(0);
            cboGrauDeInstrucao.setSelectedIndex(0);
            cboUf.setSelectedIndex(0);
            ftxtCEP.setText(null);
            ftxtCPF.setText(null);
            ftxtDataDeNascimento.setText(null);
            ftxtRG.setText(null);
            ftxtTelefoneCelular.setText(null);
            ftxtTelefoneComercial.setText(null);
            ftxtTelefoneResidencial.setText(null);
            rbFeminino.setSelected(false);
            rbMasculino.setSelected(false);
            txtBairro.setText(null);
            txtCidade.setText(null);
            txtEmail.setText(null);
            txtEndereco.setText(null);
            txtNacionalidade.setText(null);
            txtNome.setText(null);
            txtNumero.setText(null);
            txtSobrenome.setText(null);
        
    }
    
    private void preencherPessoa() {
        
        String ec = ((String) cboEstadoCivil.getItemAt(cboEstadoCivil.getSelectedIndex()));
        int ecn = 1;
        
        if(ec.equals("Solteiro(a)"))
            ecn = 1;
        if(ec.equals("Casado(a)"))
            ecn = 2;
        if(ec.equals("Divorciado(a)"))
            ecn = 3;
        if(ec.equals("Viúvo(a)"))
            ecn = 4;
        
        String gdi = ((String) cboGrauDeInstrucao.getItemAt(cboGrauDeInstrucao.getSelectedIndex()));
        int gdin = 1;
        char s;
        
        if(rbMasculino.isSelected())
            s = 'M';
        else
            s = 'F';             

        if(gdi.equals("Ensino Fundamental"))
            gdin = 1;
        if(gdi.equals("Ensino Médio"))
            gdin = 2;
        if(gdi.equals("Ensino Superior"))
            gdin = 3;
        
        Date data = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
        
        try {  
            data = new Date(format.parse(ftxtDataDeNascimento.getText()).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(FrmCadastroDePessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        pessoa.setNome(txtNome.getText());
        pessoa.setSobrenome(txtSobrenome.getText());
        pessoa.setDataNascimento(data);
        pessoa.setSexo(s);
        pessoa.setEstadoCivil(ecn);
        pessoa.setGrauDeInstrucao(gdin);
        pessoa.setNacionalidade(txtNacionalidade.getText());
        pessoa.setEmail(txtEmail.getText());
        pessoa.setRg(ftxtRG.getText());
        pessoa.setCpf(ftxtCPF.getText());
        pessoa.setEndereco(txtEndereco.getText());
        pessoa.setNumero(Integer.parseInt(txtNumero.getText()));
        pessoa.setBairro(txtBairro.getText());
        pessoa.setCep(ftxtCEP.getText());
        pessoa.setCidade(txtCidade.getText());
        pessoa.setUf((String)cboUf.getItemAt(cboUf.getSelectedIndex()));
        pessoa.setTelefoneCelular(ftxtTelefoneCelular.getText());
        pessoa.setTelefoneResidencial(ftxtTelefoneResidencial.getText());
        pessoa.setTelefoneComercial(ftxtTelefoneComercial.getText());
        
    }
    
    private Pessoa pessoa;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox cboEstadoCivil;
    private javax.swing.JComboBox cboGrauDeInstrucao;
    private javax.swing.JComboBox cboUf;
    private javax.swing.JFormattedTextField ftxtCEP;
    private javax.swing.JFormattedTextField ftxtCPF;
    private javax.swing.JFormattedTextField ftxtDataDeNascimento;
    private javax.swing.JFormattedTextField ftxtRG;
    private javax.swing.JFormattedTextField ftxtTelefoneCelular;
    private javax.swing.JFormattedTextField ftxtTelefoneComercial;
    private javax.swing.JFormattedTextField ftxtTelefoneResidencial;
    private javax.swing.ButtonGroup grpSexo;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataDeNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblGrauDeInstrucao;
    private javax.swing.JLabel lblNacionalidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JLabel lblTelefoneCelular;
    private javax.swing.JLabel lblTelefoneComercial;
    private javax.swing.JLabel lblTelefoneResidencial;
    private javax.swing.JLabel lblUf;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
