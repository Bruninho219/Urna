package urnaeletronica;
import java.sql.*;
import BD.ConexaoBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ResultadoGeral extends javax.swing.JFrame
{
    Connection conecta = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ResultadoGeral() throws ClassNotFoundException
    {
        initComponents();
        conecta = ConexaoBD.conecta();
        ListarTabela();
        this.setResizable(false);
    }
    
    public void ListarTabela2(int limiteSQL, String x)
    {
        String sql;
        sql=null;
        sql ="Select * from Produtos order by nome " + x + " limit " + limiteSQL;
        
        try
        {
            pst=conecta.prepareStatement(sql);
            rs = pst.executeQuery();
            this.Tabela.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException error)
        {
            JOptionPane.showMessageDialog(null, error);
        }
    }
    
    public void ListarTabela()
    {
        String sql;
        sql = null;
        sql = "Select idproduto as ID, nome as Nome, quant as Quandidade";
        
        try
        {
            pst=conecta.prepareStatement(sql);
            rs = pst.executeQuery();
            this.Tabela.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException error)
        {
            JOptionPane.showMessageDialog(null, error);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Voltar = new java.awt.Button();
        Atualiza1 = new java.awt.Button();
        label1 = new java.awt.Label();
        Limite = new java.awt.TextField();
        Historico = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela);

        Voltar.setLabel("<<");
        Voltar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                VoltarActionPerformed(evt);
            }
        });

        Atualiza1.setLabel("Atualiza");
        Atualiza1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Atualiza1ActionPerformed(evt);
            }
        });

        label1.setText("Ordem:");

        Limite.setText("1000");

        Historico.setLabel("Historico");
        Historico.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                HistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Limite, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(523, 523, 523)
                        .addComponent(Historico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Atualiza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Historico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Limite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Atualiza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        Geral g;
        try
        {
            g = new Geral();
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(ResultadoGeral.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void Atualiza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atualiza1ActionPerformed
        if(Limite.getText()=="" || Limite.getText()==null)
        {
            ListarTabela();
        }
        else
        {
            String limite=Limite.getText();
            int limiteSQL=0;
            boolean condNum=false;
            for(int i=-1000000; i<1000000; i++)
            {
                String j = Integer.toString(i);

                if(limite.equals(j))
                {
                    condNum=true;
                    limiteSQL = Integer.parseInt(limite);
                }
                else
                {
                    if(condNum==true)
                    {
                        condNum=true;
                    }
                    else
                    {
                        condNum=false;
                    }
                }
            }
            if(condNum==false)
            {
                JOptionPane.showMessageDialog(null, "Informe um número válido!");
                Limite.setText("");
            }
            else
            {
                String x;
                if(limiteSQL>0)
                {
                    x="desc";
                    ListarTabela2(limiteSQL, x);
                }
                if(limiteSQL<0)
                {
                    x="asc";
                    limiteSQL=limiteSQL*-1;
                    ListarTabela2(limiteSQL, x);
                }
                if(limiteSQL==0)
                {
                    ListarTabela();
                }
            }
        }
    }//GEN-LAST:event_Atualiza1ActionPerformed

    private void HistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricoActionPerformed
        Historico h;
        try
        {
            h = new Historico();
            h.show();
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(ResultadoGeral.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_HistoricoActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    new ResultadoGeral().setVisible(true);
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(ResultadoGeral.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Atualiza1;
    private java.awt.Button Historico;
    private java.awt.TextField Limite;
    private javax.swing.JTable Tabela;
    private java.awt.Button Voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
