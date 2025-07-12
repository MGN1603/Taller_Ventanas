package Ventanas;

import javax.swing.Timer;

public class ListaPropietario extends javax.swing.JInternalFrame {

    public ListaPropietario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPropietario = new javax.swing.JTable();
        barraCarga = new javax.swing.JProgressBar();

        setName("Lista Propietarios"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        tablaPropietario.setBackground(new java.awt.Color(40, 56, 149));
        tablaPropietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaPropietario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaPropietario.setForeground(new java.awt.Color(255, 255, 255));
        tablaPropietario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123", "twenty", "gato", "2 años"},
                {"321", "cloe", "gato", "7 años"},
                {"421", "roberta", "loro", "6 años"},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Especie", "Edad"
            }
        ));
        jScrollPane1.setViewportView(tablaPropietario);

        barraCarga.setBackground(new java.awt.Color(50, 0, 156));
        barraCarga.setStringPainted(true);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraCarga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraCarga, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //metodo que permite simula funcionalidad de un barra de carga.
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        barraCarga.setValue(0);
        Timer timer = new Timer(50, null);
        timer.addActionListener(e -> {
            int valor = barraCarga.getValue();
            if (valor < 100) {
                barraCarga.setValue(valor + 5);
            } else {
                timer.stop();
                tablaPropietario.setEnabled(true);
            }
        });
        timer.start();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraCarga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaPropietario;
    // End of variables declaration//GEN-END:variables
}
