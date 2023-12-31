
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Novo Usuario
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        painelDados.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        painelCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        enderecoCampo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailCampo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefoneCampo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        painelCursos = new javax.swing.JPanel();
        alemaoCampo = new javax.swing.JCheckBox();
        espanholCampo = new javax.swing.JCheckBox();
        francesCampo = new javax.swing.JCheckBox();
        inglesCampo = new javax.swing.JCheckBox();
        italianoCampo = new javax.swing.JCheckBox();
        japonesCampo = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        motivoCampo = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        femininoCampo = new javax.swing.JRadioButton();
        masculinoCampo = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        cidadeCampo = new javax.swing.JTextField();
        estadoCampo = new javax.swing.JComboBox<>();
        painelDados = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nomeCadastrado = new javax.swing.JLabel();
        enderecoCadastrado = new javax.swing.JLabel();
        emailCadastrado = new javax.swing.JLabel();
        telefoneCadastrado = new javax.swing.JLabel();
        cidadeCadastrada = new javax.swing.JLabel();
        ufCadastrada = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CADASTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("NOME:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("ENDEREÇO:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("E-MAIL:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("TELEFONE:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("CIDADE:");

        painelCursos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CURSOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        alemaoCampo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        alemaoCampo.setText("Alemão");

        espanholCampo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        espanholCampo.setText("Espanhol");

        francesCampo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        francesCampo.setText("Frances");

        inglesCampo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inglesCampo.setText("Inglês");
        inglesCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesCampoActionPerformed(evt);
            }
        });

        italianoCampo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        italianoCampo.setText("Italiano");

        japonesCampo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        japonesCampo.setText("Japones");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("SELECIONE O(S) CURSOS:");

        motivoCampo.setColumns(20);
        motivoCampo.setRows(5);
        jScrollPane1.setViewportView(motivoCampo);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("POR QUE SE INTERESSA NESSE(S) CURSO(S):");

        salvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salvar.setText("SALVAR");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCursosLayout = new javax.swing.GroupLayout(painelCursos);
        painelCursos.setLayout(painelCursosLayout);
        painelCursosLayout.setHorizontalGroup(
            painelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCursosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addGroup(painelCursosLayout.createSequentialGroup()
                        .addComponent(alemaoCampo)
                        .addGap(18, 18, 18)
                        .addComponent(espanholCampo)
                        .addGap(18, 18, 18)
                        .addComponent(francesCampo)
                        .addGap(18, 18, 18)
                        .addComponent(inglesCampo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(italianoCampo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(japonesCampo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCursosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvar)
                .addContainerGap())
        );
        painelCursosLayout.setVerticalGroup(
            painelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCursosLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alemaoCampo)
                    .addComponent(espanholCampo)
                    .addComponent(francesCampo)
                    .addComponent(inglesCampo)
                    .addComponent(italianoCampo)
                    .addComponent(japonesCampo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("UF:");

        buttonGroup1.add(femininoCampo);
        femininoCampo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        femininoCampo.setText("Feminino");

        buttonGroup1.add(masculinoCampo);
        masculinoCampo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        masculinoCampo.setText("Masculino");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("SEXO:");

        estadoCampo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        estadoCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AM", "BA", "CE", "DF", "MG", "RJ", "RS", "RN", "SE", "SC", "SP", " ", " " }));

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelCadastroLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelCadastroLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(emailCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefoneCampo)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(cidadeCampo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(estadoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(femininoCampo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(masculinoCampo)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(painelCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nomeCampo))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(telefoneCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enderecoCampo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cidadeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(femininoCampo)
                    .addComponent(masculinoCampo))
                .addGap(18, 18, 18)
                .addComponent(painelCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setText("NOME:");

        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("ENDEREÇO:");

        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("E-MAIL:");

        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("TELEFONE:");

        jLabel14.setForeground(new java.awt.Color(0, 51, 255));
        jLabel14.setText("CIDADE:");

        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("UF:");

        nomeCadastrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nomeCadastrado.setText("vazio");

        enderecoCadastrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        enderecoCadastrado.setText("vazio");

        emailCadastrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailCadastrado.setText("vazio");

        telefoneCadastrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        telefoneCadastrado.setText("vazio");

        cidadeCadastrada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cidadeCadastrada.setText("vazio");

        ufCadastrada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ufCadastrada.setText("vazio");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("DADOS CADASTRADOS");

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeCadastrado))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefoneCadastrado))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidadeCadastrada)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ufCadastrada))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(emailCadastrado))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoCadastrado))
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nomeCadastrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(enderecoCadastrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailCadastrado)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(telefoneCadastrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cidadeCadastrada)
                    .addComponent(jLabel15)
                    .addComponent(ufCadastrada))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(painelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inglesCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inglesCampoActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        Cadastro objCadastro = new Cadastro();
        objCadastro.setNome(nomeCampo.getText());
        objCadastro.setEndereco(enderecoCampo.getText());
        objCadastro.setEmail(emailCampo.getText());
        objCadastro.setTelefone(telefoneCampo.getText());
        objCadastro.setCidade(cidadeCampo.getText());
        objCadastro.setMotivo(motivoCampo.getText());
        if(alemaoCampo.isSelected())
        {
            objCadastro.setAlemao(true);
        }
        if(espanholCampo.isSelected())
        {
            objCadastro.setEspanhol(true);
        }
        if(francesCampo.isSelected())
        {
            objCadastro.setFrances(true);
        }
        if(inglesCampo.isSelected())
        {
            objCadastro.setIngles(true);
        }
        if(italianoCampo.isSelected())
        {
            objCadastro.setItaliano(true);
        }
        if(japonesCampo.isSelected())
        {
            objCadastro.setJapones(true);
        }
        if(masculinoCampo.isSelected())
        {
            objCadastro.setSexo("M");
        } 
        else
        {
            objCadastro.setSexo("F");
        }
        objCadastro.setEstado((String)estadoCampo.getSelectedItem());
        exibirCadastro();
        limpar();
    }//GEN-LAST:event_salvarActionPerformed
    public void limpar()
    {
        nomeCampo.setText("");
        enderecoCampo.setText("");
        emailCampo.setText("");
        telefoneCampo.setText("");
        cidadeCampo.setText("");
        motivoCampo.setText("");
        alemaoCampo.setSelected(false);
        espanholCampo.setSelected(false);
        francesCampo.setSelected(false);
        inglesCampo.setSelected(false);
        italianoCampo.setSelected(false);
        japonesCampo.setSelected(false);
        buttonGroup1.clearSelection();
        estadoCampo.setSelectedIndex(-1);
    }
    public void exibirCadastro()
    {
        painelCursos.setVisible(false);
        painelCadastro.setVisible(false);
        painelDados.setVisible(true);
        nomeCadastrado.setText(nomeCampo.getText());
        enderecoCadastrado.setText(enderecoCampo.getText());
        emailCadastrado.setText(emailCampo.getText());
        telefoneCadastrado.setText(telefoneCampo.getText());
        cidadeCadastrada.setText(cidadeCampo.getText());
        ufCadastrada.setText((String)estadoCampo.getSelectedItem());
        JOptionPane.showMessageDialog(null, "Cadastro Salvo");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alemaoCampo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cidadeCadastrada;
    private javax.swing.JTextField cidadeCampo;
    private javax.swing.JLabel emailCadastrado;
    private javax.swing.JTextField emailCampo;
    private javax.swing.JLabel enderecoCadastrado;
    private javax.swing.JTextField enderecoCampo;
    private javax.swing.JCheckBox espanholCampo;
    private javax.swing.JComboBox<String> estadoCampo;
    private javax.swing.JRadioButton femininoCampo;
    private javax.swing.JCheckBox francesCampo;
    private javax.swing.JCheckBox inglesCampo;
    private javax.swing.JCheckBox italianoCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox japonesCampo;
    private javax.swing.JRadioButton masculinoCampo;
    private javax.swing.JTextArea motivoCampo;
    private javax.swing.JLabel nomeCadastrado;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPanel painelCursos;
    private javax.swing.JPanel painelDados;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel telefoneCadastrado;
    private javax.swing.JTextField telefoneCampo;
    private javax.swing.JLabel ufCadastrada;
    // End of variables declaration//GEN-END:variables
}
