package sa.ui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sa.dao.AlunoDAO;
import sa.dao.CursoDAO;
import sa.entidade.Aluno;
import sa.entidade.Curso;

public class FrmVisualizarAlunos extends javax.swing.JFrame {
    
    /**
     * Construtor do Frame FrmVisualizarAlunos
     * @param frmInicial Frame que será bloqueado
     */
    public FrmVisualizarAlunos(FrmInicial frmInicial) {
        
        // Colunas a serem mostradas na tabela
        String[] colunas = new String[] {
            
            "ID",
            "RA",
            "Ativo",
            "Nome",
            "Sobrenome",
            "Data de Nascimento",
            "Sexo",
            "Estado Cívil",
            "Nacionalidade",
            "Grau de Instrução",
            "Email",
            "RG",
            "CPF",
            "Endereço",
            "Número",
            "Bairro",
            "CEP",
            "Cidade",
            "UF",
            "Telefone Celular",
            "Telefone Residencial",
            "Telefone Comercial"
                
        };
        
        // Inicializa alguns atributos
        this.alunosModel = new DefaultTableModel(new Object[][]{}, colunas);
        this.cursoModel = new DefaultComboBoxModel<>();
        this.frameInicial = frmInicial;
        
        initComponents();
        
        // Preenche o combo de cursos
        preencherCursos();
        
        // Adiciona listener que bloqueará e desbloqueará o frame recebido como 
        // parametro no construtor em certos eventos 
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
        
        // Adiciona um listener para o combo de cursos que quando for alterado
        // chamará o método preencherAlunos
        cboCurso.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                
                preencherAlunos();
                
            }
            
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAlunos = new javax.swing.JPanel();
        lblCurso = new javax.swing.JLabel();
        cboCurso = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDadosAlunos = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar Alunos por Curso");
        setMinimumSize(new java.awt.Dimension(675, 460));

        pnlAlunos.setBorder(javax.swing.BorderFactory.createTitledBorder("Alunos"));

        lblCurso.setText("Curso:");

        cboCurso.setModel(cursoModel);

        tblDadosAlunos.setModel(alunosModel);
        jScrollPane2.setViewportView(tblDadosAlunos);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAlunosLayout = new javax.swing.GroupLayout(pnlAlunos);
        pnlAlunos.setLayout(pnlAlunosLayout);
        pnlAlunosLayout.setHorizontalGroup(
            pnlAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(pnlAlunosLayout.createSequentialGroup()
                        .addComponent(lblCurso)
                        .addGap(18, 18, 18)
                        .addComponent(cboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );
        pnlAlunosLayout.setVerticalGroup(
            pnlAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso)
                    .addComponent(cboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método chamado quando clicar no botão voltar
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
       // O Frame envia um evento para fechá-lo
       this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        
    }//GEN-LAST:event_btnVoltarActionPerformed
    
    // Método utilizado para preencher a tabela com os alunos
    private void preencherAlunos() {
        
        // Cria um novo alunoDAO para acessar o Banco de Dados
        AlunoDAO alunoDAO = new AlunoDAO();
        
        // Remove os alunos já existentes da lista
        for(int i = 0; i < listaDeAlunos.size(); ++i)
            listaDeAlunos.remove(i);
        
        // Remove as linhas do model da tebela
        for(int i = 0; i < alunosModel.getRowCount(); ++i)
            alunosModel.removeRow(i);
        
        try {
            
            // listaDeAlunos recebe a lista retornada pelo alunoDAO
            listaDeAlunos = alunoDAO.listarAlunosNoCurso(((Curso) cboCurso.getSelectedItem()).getIdCurso());
            
            // Para cada aluno na lista cria um array de strings, 
            // passa seus atributos para este array e usa o array
            // como linha para a tabela e adiciona a linha no model
            for(Aluno a : listaDeAlunos) {
                
                String[] linha = new String[] {
                  
                    Integer.toString(a.getId()),
                    a.getRa(),
                    a.isAtivo() ? "Sim" : "Não",
                    a.getPessoa().getNome(),
                    a.getPessoa().getSobrenome(),
                    a.getPessoa().getDataNascimento().toString(),
                    a.getPessoa().getSexo() == 'M' ? "Masculino" : "Feminino",
                    converterEstadoCivil(a.getPessoa().getEstadoCivil()),
                    a.getPessoa().getNacionalidade(),
                    converterGrauDeInstrucao(a.getPessoa().getGrauDeInstrucao()),
                    a.getPessoa().getEmail(),
                    a.getPessoa().getRg(),
                    a.getPessoa().getCpf(),
                    a.getPessoa().getEndereco(),
                    Integer.toString(a.getPessoa().getNumero()),
                    a.getPessoa().getBairro(),
                    a.getPessoa().getCep(),
                    a.getPessoa().getCidade(),
                    a.getPessoa().getUf(),
                    a.getPessoa().getTelefoneCelular(),
                    a.getPessoa().getTelefoneResidencial(),
                    a.getPessoa().getTelefoneComercial()
                    
                };
                
                alunosModel.addRow(linha);
                
            }
            
        } catch(SQLException sqle) {
            
            // Se ocorrer alguma exceção relacionada ao Banco de Dados avisa o usuário
            JOptionPane.showMessageDialog(this, "Erro relacionado ao Banco de Dados!\n" + sqle.getMessage());
            
        }
        
        // Atualiza a tabela
        tblDadosAlunos.updateUI();
        
    }
    
    // Método utilizado para preencher o combo de cursos
    private void preencherCursos() {
        
        // Cria um novo cursoDAO para acesso ao Banco de Dados
        CursoDAO cursoDAO = new CursoDAO();
        
        try {
            
            // listaDeCursos recebe a lista retornada pelo cursoDAO
            listaDeCursos = cursoDAO.listarCursos();
            
            // Para cada curso na listaDeCursos adiciona o curso no model do
            // combo de cursos, que só recebe tipos de dados do tipo Curso
            for(Curso c : listaDeCursos)
                cursoModel.addElement(c);
       
        } catch(SQLException sqle) {
            
            // Se ocorrer alguma exceção relacionada ao Banco de Dados avisa o usuário
            JOptionPane.showMessageDialog(this, "Erro relacionado ao Banco de Dados!\n" + sqle.getMessage());
            
        }
        
        // Atualiza o combo de cursos
        cboCurso.updateUI();
        
    }
    
    private String converterEstadoCivil(int valor) {
        
        switch(valor) {
            
            case 1:
                return "Solteiro(a)";
                
            case 2:
                return "Casado(a)";
            
            case 3:
                return "Divorciado(a)";
                
            case 4:
                return "Viúvo(a)";
                
            default:
                return "";
        }
        
    }
    
    private String converterGrauDeInstrucao(int valor) {
        
        switch(valor) {
            
            case 1:
                return "Ensino Fundamental";
                
            case 2:
                return "Ensino Médio";
            
            case 3:
                return "Ensino Superior";
                
            default:
                return "";
        }
        
    }
    
    // Armazena o endereco do Frame a ser bloqueado
    private FrmInicial frameInicial;
    
    // Models, um para o combo de cursos e o outro para a tabela de alunos
    private DefaultComboBoxModel<Curso> cursoModel;
    private DefaultTableModel alunosModel;
    
    // ArrayLists para armazenar os cursos e alunos buscados no BD
    private ArrayList<Aluno> listaDeAlunos;
    private ArrayList<Curso> listaDeCursos;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cboCurso;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JPanel pnlAlunos;
    private javax.swing.JTable tblDadosAlunos;
    // End of variables declaration//GEN-END:variables
}
