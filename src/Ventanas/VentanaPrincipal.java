package Ventanas;

//Clase Principal donde se ejecuta todo el programa.
public class VentanaPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());
   
    //Constructor el cual inicializa todos sus componentes.
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorioPrincipal = new javax.swing.JDesktopPane();
        lblBienvenida = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuRegistro = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        menuVista = new javax.swing.JMenu();
        menuPaciente = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 246, 247));
        setName("Sistema Gestión Veterinaria"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));

        escritorioPrincipal.setBackground(new java.awt.Color(30, 118, 130));

        lblBienvenida.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("Bienvenido Al sistema de Gestion Veterinaria");

        escritorioPrincipal.setLayer(lblBienvenida, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioPrincipalLayout = new javax.swing.GroupLayout(escritorioPrincipal);
        escritorioPrincipal.setLayout(escritorioPrincipalLayout);
        escritorioPrincipalLayout.setHorizontalGroup(
            escritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioPrincipalLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        escritorioPrincipalLayout.setVerticalGroup(
            escritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioPrincipalLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        getContentPane().add(escritorioPrincipal, java.awt.BorderLayout.CENTER);

        barraMenu.setBackground(new java.awt.Color(30, 52, 151));
        barraMenu.setForeground(new java.awt.Color(255, 255, 255));

        menuArchivo.setText("Archivo");

        menuRegistro.setText("Nuevo Registro");
        menuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistroActionPerformed(evt);
            }
        });
        menuArchivo.add(menuRegistro);

        menuSalir.setText("Salir...");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuSalir);

        barraMenu.add(menuArchivo);

        menuVista.setText("Vista");

        menuPaciente.setText("Pacientes");
        menuPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPacienteActionPerformed(evt);
            }
        });
        menuVista.add(menuPaciente);

        menuConsulta.setText("Consultas");
        menuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaActionPerformed(evt);
            }
        });
        menuVista.add(menuConsulta);

        barraMenu.add(menuVista);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //metodos de acciones que abren los diferentes jframes internos que tiene la ventana principal.
    private void menuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistroActionPerformed
        FormularioPaciente formulario = new FormularioPaciente();
        escritorioPrincipal.add(formulario);
        formulario.setVisible(true);
    }//GEN-LAST:event_menuRegistroActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPacienteActionPerformed
        ListaPropietario listaPropietario = new ListaPropietario();
        escritorioPrincipal.add(listaPropietario);
        listaPropietario.setVisible(true);
    }//GEN-LAST:event_menuPacienteActionPerformed

    private void menuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaActionPerformed
        // TODO add your handling code here:
        ArbolServicio servicio = new ArbolServicio();
        escritorioPrincipal.add(servicio);
        servicio.setVisible(true);
    }//GEN-LAST:event_menuConsultaActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JDesktopPane escritorioPrincipal;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuConsulta;
    private javax.swing.JMenuItem menuPaciente;
    private javax.swing.JMenuItem menuRegistro;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu menuVista;
    // End of variables declaration//GEN-END:variables
}
