/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.Administrativo.Consultas;

import beans.CategoriaCertificado;
import interfaces.Administrativo.Adicionar.AdicionarCategoriaCertificado;
import interfaces.Administrativo.Adicionar.AdicionarMunicipio;
import interfaces.Administrativo.PainelAdministrativo;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pedro
 */
public class ConsultaCategoriaCertificado extends javax.swing.JPanel {

    /**
     * Creates new form ConsultaCategoriaCertificado
     */
    PainelAdministrativo parent;
    
    public ConsultaCategoriaCertificado(PainelAdministrativo p) {
        parent = p;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addCategoria = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        addCategoria.setBackground(new java.awt.Color(0, 204, 255));
        addCategoria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        addCategoria.setForeground(new java.awt.Color(255, 255, 255));
        addCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addCategoria.setText("Adicionar Categoria de Certificado");
        addCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCategoria.setOpaque(true);
        addCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCategoriaMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Categoria de Certificado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(addCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void montaTabelaCertificado(List<CategoriaCertificado> listaCategoriaCertificado){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        for(CategoriaCertificado categoria : listaCategoriaCertificado){
            model.addRow(new Object [] {categoria.getId_tipo_certificado(),categoria.getDesc_categoria_certificado()});
            
        }
        jTable1.setRowSorter(new TableRowSorter(model));
        
    }
    private void addCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategoriaMouseClicked
        JPanel lastPanel = parent.getLastPanel();
        JPanel painelConsultas = parent.getPainelConsulta();
        if(lastPanel != null){
            lastPanel.setVisible(false);
            painelConsultas.revalidate();
        } else {
            painelConsultas.revalidate();
        }
        AdicionarCategoriaCertificado panelAdm = new AdicionarCategoriaCertificado(parent);
        JPanel content = panelAdm;
        content.setBounds(0, 0, painelConsultas.getSize().width, painelConsultas.getSize().height);
        content.setVisible(true);

        painelConsultas.add(content);
        parent.add(painelConsultas);
        parent.setLastPanel(content);
    }//GEN-LAST:event_addCategoriaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
