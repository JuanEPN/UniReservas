package Vista;

import Modelo.TiempoSesion;
import Controlador.GestionBusqueda;
import Controlador.GestionEspacios;
import Controlador.GestionReservas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Juan Esteban Pereira
 * Alejandro Gonzalez
 * Miguel Ángel Pineda
 */

public final class Vista_Reservas extends javax.swing.JFrame {
    GestionEspacios ge = new GestionEspacios();
    GestionReservas gr = new GestionReservas();
    GestionBusqueda gb = new GestionBusqueda();
    
    DefaultTableModel dte = new DefaultTableModel();
    DefaultTableModel dtr = new DefaultTableModel();
    
    String nombre, nombreV, descripV, tipoV, estadoV;
    
    String nombreR, documentoRV, nombreRV, Hora1V, Hora2V, estadoRV, espacioRV;
    
    public Vista_Reservas() {
        initComponents();
        ContadorSesion();
        ge.EspaciosActivos(txtEspacioR);
        
        ActualizarE.setEnabled(false);
        ActualizarR.setEnabled(false);
        
        tablaE.setModel(dte);
        tablaR.setModel(dtr);
        
        //ge.setGestionEspacio(this);
        //gr.setGestionReserva(this);
        //gb.setVr(this);
        
        dte.addColumn("Nombre Espacio");
        dte.addColumn("Descripción");
        dte.addColumn("Tipo Espacio");
        dte.addColumn("Estado Espacio");
        ge.consultarEspacios();
        
        dtr.addColumn("Documento");
        dtr.addColumn("Encargado");
        dtr.addColumn("Fecha");
        dtr.addColumn("Hora Inicial");
        dtr.addColumn("Hora Final");
        dtr.addColumn("Estado Reserva");
        dtr.addColumn("Nombre Esp");
        gr.consultarReservas();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelEspacios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        txtTipoE = new javax.swing.JComboBox<>();
        txtEstadoE = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionE = new javax.swing.JTextArea();
        CrearE = new javax.swing.JButton();
        EditarE = new javax.swing.JButton();
        ActualizarE = new javax.swing.JButton();
        BorrarE = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaE = new javax.swing.JTable();
        PanelReservas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDocumentoR = new javax.swing.JTextField();
        txtNombreR = new javax.swing.JTextField();
        txtEspacioR = new javax.swing.JComboBox<>();
        CrearR = new javax.swing.JButton();
        EditarR = new javax.swing.JButton();
        ActualizarR = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtEstadoR = new javax.swing.JComboBox<>();
        BorrarR = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaR = new javax.swing.JTable();
        txtHoraIR1 = new javax.swing.JComboBox<>();
        txtHoraFR2 = new javax.swing.JComboBox<>();
        BuscarR = new javax.swing.JButton();
        VolverR = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Contador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        PanelEspacios.setBackground(new java.awt.Color(204, 255, 255));
        PanelEspacios.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Crear Espacio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("Nombre del Espacio:");

        txtNombreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEActionPerformed(evt);
            }
        });

        txtTipoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Aula", "Cancha", "Laboratorio", "Sala Sistemas" }));

        txtEstadoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Activo", "Inactivo" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("Tipo de Espacio:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Estado del Espacio:");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Descripción del Espacio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        txtDescripcionE.setColumns(20);
        txtDescripcionE.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        CrearE.setBackground(new java.awt.Color(0, 153, 153));
        CrearE.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        CrearE.setForeground(new java.awt.Color(255, 255, 255));
        CrearE.setText("Crear");
        CrearE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CrearE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEActionPerformed(evt);
            }
        });

        EditarE.setBackground(new java.awt.Color(0, 153, 153));
        EditarE.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        EditarE.setForeground(new java.awt.Color(255, 255, 255));
        EditarE.setText("Editar");
        EditarE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEActionPerformed(evt);
            }
        });

        ActualizarE.setBackground(new java.awt.Color(0, 153, 153));
        ActualizarE.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ActualizarE.setForeground(new java.awt.Color(255, 255, 255));
        ActualizarE.setText("Actualizar");
        ActualizarE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ActualizarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarEActionPerformed(evt);
            }
        });

        BorrarE.setBackground(new java.awt.Color(0, 153, 153));
        BorrarE.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        BorrarE.setForeground(new java.awt.Color(255, 255, 255));
        BorrarE.setText("Borrar");
        BorrarE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarEActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(229, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Espacios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        tablaE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaE.setGridColor(new java.awt.Color(255, 255, 255));
        tablaE.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tablaE);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelEspaciosLayout = new javax.swing.GroupLayout(PanelEspacios);
        PanelEspacios.setLayout(PanelEspaciosLayout);
        PanelEspaciosLayout.setHorizontalGroup(
            PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEspaciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEspaciosLayout.createSequentialGroup()
                        .addGroup(PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTipoE, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstadoE, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelEspaciosLayout.createSequentialGroup()
                                .addComponent(txtNombreE, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addGap(18, 18, 18))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActualizarE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrarE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EditarE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CrearE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelEspaciosLayout.setVerticalGroup(
            PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEspaciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelEspaciosLayout.createSequentialGroup()
                        .addGroup(PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CrearE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(EditarE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstadoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(ActualizarE))
                        .addGap(20, 20, 20)
                        .addGroup(PanelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BorrarE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelReservas.setBackground(new java.awt.Color(204, 204, 255));
        PanelReservas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Crear Reserva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Documento del Encargado:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("Nombre del Encargado:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setText("Fecha de la Reserva:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hora Inicio");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Hora Final");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setText("Espacio de la Reserva:");

        txtNombreR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRActionPerformed(evt);
            }
        });

        txtEspacioR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna" }));
        txtEspacioR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspacioRActionPerformed(evt);
            }
        });

        CrearR.setBackground(new java.awt.Color(102, 0, 102));
        CrearR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        CrearR.setForeground(new java.awt.Color(255, 255, 255));
        CrearR.setText("Crear");
        CrearR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CrearR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearRActionPerformed(evt);
            }
        });

        EditarR.setBackground(new java.awt.Color(102, 0, 102));
        EditarR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        EditarR.setForeground(new java.awt.Color(255, 255, 255));
        EditarR.setText("Editar");
        EditarR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarRActionPerformed(evt);
            }
        });

        ActualizarR.setBackground(new java.awt.Color(102, 0, 102));
        ActualizarR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ActualizarR.setForeground(new java.awt.Color(255, 255, 255));
        ActualizarR.setText("Actualizar");
        ActualizarR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ActualizarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarRActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel12.setText("Estado de la Reserva:");

        txtEstadoR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Activo", "Inactivo" }));

        BorrarR.setBackground(new java.awt.Color(102, 0, 102));
        BorrarR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        BorrarR.setForeground(new java.awt.Color(255, 255, 255));
        BorrarR.setText("Borrar");
        BorrarR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarRActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel13.setText("Horas:");

        jPanel4.setBackground(new java.awt.Color(218, 218, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        tablaR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tablaR.setGridColor(new java.awt.Color(255, 255, 255));
        tablaR.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tablaR);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );

        txtHoraIR1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "7:00 a.m", "7:30 a.m", "8:00 a.m", "8:30 a.m", "9:00 a.m", "9:30 a.m", "10:00 a.m", "10:30 a.m", "11:00 a.m", "11:30 p.m", "1:00 p.m", "1:30 p.m", "2:00 p.m", "2:30 p.m", "3:00 p.m", "3:30 p.m", "4:00 p.m", "5:00 p.m", "5:30 p.m", "6:00 p.m", "6:30 p.m", "7:00 p.m", "7:00 p.m", "8:00 p.m", "8:30 p.m", "9:00 p.m", "9:30 p.m" }));

        txtHoraFR2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "7:00 a.m", "7:30 a.m", "8:00 a.m", "8:30 a.m", "9:00 a.m", "9:30 a.m", "10:00 a.m", "10:30 a.m", "11:00 a.m", "11:30 p.m", "1:00 p.m", "1:30 p.m", "2:00 p.m", "2:30 p.m", "3:00 p.m", "3:30 p.m", "4:00 p.m", "5:00 p.m", "5:30 p.m", "6:00 p.m", "6:30 p.m", "7:00 p.m", "7:00 p.m", "8:00 p.m", "8:30 p.m", "9:00 p.m", "9:30 p.m" }));

        BuscarR.setBackground(new java.awt.Color(102, 0, 102));
        BuscarR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        BuscarR.setForeground(new java.awt.Color(255, 255, 255));
        BuscarR.setText("Buscar");
        BuscarR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BuscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarRActionPerformed(evt);
            }
        });

        VolverR.setBackground(new java.awt.Color(102, 0, 102));
        VolverR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        VolverR.setForeground(new java.awt.Color(255, 255, 255));
        VolverR.setText("Volver");
        VolverR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelReservasLayout = new javax.swing.GroupLayout(PanelReservas);
        PanelReservas.setLayout(PanelReservasLayout);
        PanelReservasLayout.setHorizontalGroup(
            PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReservasLayout.createSequentialGroup()
                .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelReservasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelReservasLayout.createSequentialGroup()
                        .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelReservasLayout.createSequentialGroup()
                                .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDocumentoR, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(txtEspacioR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreR))
                                .addGap(20, 20, 20)
                                .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BorrarR, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ActualizarR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EditarR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CrearR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(PanelReservasLayout.createSequentialGroup()
                                .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelReservasLayout.createSequentialGroup()
                                        .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHoraIR1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtHoraFR2, 0, 100, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(txtEstadoR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BuscarR, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(VolverR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelReservasLayout.setVerticalGroup(
            PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReservasLayout.createSequentialGroup()
                .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelReservasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtDocumentoR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addComponent(jLabel13))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelReservasLayout.createSequentialGroup()
                        .addComponent(CrearR)
                        .addGap(18, 18, 18)
                        .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditarR)
                            .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ActualizarR)
                            .addComponent(jLabel6))
                        .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelReservasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHoraIR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoraFR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelReservasLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(BuscarR)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtEstadoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(VolverR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtEspacioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BorrarR))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel14.setText("Tiempo en Sesion:");

        Contador.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Contador))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelEspacios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelReservas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEActionPerformed

    }//GEN-LAST:event_txtNombreEActionPerformed

    private void CrearEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEActionPerformed
        nombreV = txtNombreE.getText();
        descripV = txtDescripcionE.getText();
        tipoV = txtTipoE.getSelectedItem().toString();
        estadoV = txtEstadoE.getSelectedItem().toString();
        
        if ((!"".equals(nombreV)) && (!"".equals(descripV)) && (!"Ninguna".equals(tipoV)) && (!"Ninguna".equals(estadoV))){
            ge.registrarEspacios();
            txtEspacioR.removeAllItems();
            txtEspacioR.addItem("Ninguna");
            ge.EspaciosActivos(txtEspacioR);
            
            txtNombreE.setText("");
            txtDescripcionE.setText("");
            txtTipoE.setSelectedItem("Ninguna");
            txtEstadoE.setSelectedItem("Ninguna");          
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Por Favor complete los espacios");
        }
    }//GEN-LAST:event_CrearEActionPerformed

    private void txtNombreRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRActionPerformed

    }//GEN-LAST:event_txtNombreRActionPerformed

    private void CrearRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearRActionPerformed
        documentoRV = txtDocumentoR.getText();
        nombreRV = txtNombreR.getText();
        Hora1V = txtHoraIR1.getSelectedItem().toString();
        Hora2V = txtHoraFR2.getSelectedItem().toString();
        estadoRV = txtEstadoR.getSelectedItem().toString();
        espacioRV = txtEspacioR.getSelectedItem().toString();
        
        if ((!"".equals(documentoRV)) && (!"".equals(nombreRV)) && (!"Ninguna".equals(Hora1V)) && (!"Ninguna".equals(Hora2V)) && (!"Ninguna".equals(estadoRV)) && (!"Ninguna".equals(espacioRV))){
            gr.registrarReservas();
            
            txtDocumentoR.setText("");
            txtNombreR.setText("");
            txtHoraIR1.setSelectedItem("Ninguna");
            txtHoraFR2.setSelectedItem("Ninguna");
            txtEstadoR.setSelectedItem("Ninguna");
            txtEspacioR.setSelectedItem("Ninguna");
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Por Favor complete los espacios");
        }
    }//GEN-LAST:event_CrearRActionPerformed

    private void EditarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEActionPerformed
        int filaE = tablaE.getSelectedRow();
        
        nombre = tablaE.getValueAt(filaE, 0).toString();
        txtNombreE.setText(tablaE.getValueAt(filaE, 0).toString());
        txtDescripcionE.setText(tablaE.getValueAt(filaE, 1).toString());
        txtTipoE.setSelectedItem(tablaE.getValueAt(filaE, 2).toString());
        txtEstadoE.setSelectedItem(tablaE.getValueAt(filaE, 3).toString());
        
        CrearE.setEnabled(false);
        BorrarE.setEnabled(false);
        ActualizarE.setEnabled(true);
    }//GEN-LAST:event_EditarEActionPerformed

    private void ActualizarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarEActionPerformed
        nombreV = txtNombreE.getText();
        descripV = txtDescripcionE.getText();
        tipoV = txtTipoE.getSelectedItem().toString();
        estadoV = txtEstadoE.getSelectedItem().toString();
        
        if ((!"".equals(nombreV)) && (!"".equals(descripV)) && (!"Ninguna".equals(tipoV)) && (!"Ninguna".equals(estadoV))){
            ge.actualizarEspacios(this.nombre);
            txtEspacioR.removeAllItems();
            txtEspacioR.addItem("Ninguna");
            ge.EspaciosActivos(txtEspacioR);
            
            CrearE.setEnabled(true);
            BorrarE.setEnabled(true);
            ActualizarE.setEnabled(false);
            txtNombreE.setText("");
            txtDescripcionE.setText("");
            txtTipoE.setSelectedItem("Ninguna");
            txtEstadoE.setSelectedItem("Ninguna");
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Por Favor complete los espacios");
        }
    }//GEN-LAST:event_ActualizarEActionPerformed

    private void BorrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarEActionPerformed
        int filaE = tablaE.getSelectedRow();
        nombre = tablaE.getValueAt(filaE, 0).toString();
        ge.eliminarEspacios(nombre);
        txtEspacioR.removeAllItems();
        txtEspacioR.addItem("Ninguna");
        ge.EspaciosActivos(txtEspacioR);
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaE.getModel();
        modeloTabla.fireTableDataChanged();
    }//GEN-LAST:event_BorrarEActionPerformed

    private void EditarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarRActionPerformed
        int filaR = tablaR.getSelectedRow();
        
        nombreR = tablaR.getValueAt(filaR, 1).toString();
        txtDocumentoR.setText(tablaR.getValueAt(filaR, 0).toString());
        txtNombreR.setText(tablaR.getValueAt(filaR, 1).toString());
        String valorFecha = tablaR.getValueAt(filaR, 2).toString();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Date fechaParseada;
        try {
            fechaParseada = sdf.parse(valorFecha);
            //txtFechaR.setDate(fechaParseada);
        } catch (ParseException ex) {
            Logger.getLogger(Vista_Reservas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtHoraIR1.setSelectedItem(tablaR.getValueAt(filaR, 3).toString());
        txtHoraFR2.setSelectedItem(tablaR.getValueAt(filaR, 4).toString());
        txtEstadoE.setSelectedItem(tablaR.getValueAt(filaR, 5).toString());
        
        CrearR.setEnabled(false);
        BorrarR.setEnabled(false);
        ActualizarR.setEnabled(true);
    }//GEN-LAST:event_EditarRActionPerformed

    private void ActualizarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarRActionPerformed
        documentoRV = txtDocumentoR.getText();
        nombreRV = txtNombreR.getText();
        Hora1V = txtHoraIR1.getSelectedItem().toString();
        Hora2V = txtHoraFR2.getSelectedItem().toString();
        estadoRV = txtEstadoR.getSelectedItem().toString();
        espacioRV = txtEspacioR.getSelectedItem().toString();
        
        if ((!"".equals(documentoRV)) && (!"".equals(nombreRV)) && (!"Ninguna".equals(Hora1V)) && (!"Ninguna".equals(Hora2V)) && (!"Ninguna".equals(estadoRV)) && (!"Ninguna".equals(espacioRV))){
            gr.actualizarReservas(this.nombreR);
            
            CrearR.setEnabled(true);
            BorrarR.setEnabled(true);
            ActualizarR.setEnabled(false);
            txtDocumentoR.setText("");
            txtNombreR.setText("");
            txtHoraIR1.setSelectedItem("Ninguna");
            txtHoraFR2.setSelectedItem("Ninguna");
            txtEstadoR.setSelectedItem("Ninguna");
            txtEspacioR.setSelectedItem("Ninguna");
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Por Favor complete los espacios");
        }
    }//GEN-LAST:event_ActualizarRActionPerformed

    private void BorrarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarRActionPerformed
        int filaR = tablaR.getSelectedRow();
        nombreR = tablaR.getValueAt(filaR, 1).toString();
        gr.eliminarReservas(nombreR);
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaR.getModel();
        modeloTabla.fireTableDataChanged();
    }//GEN-LAST:event_BorrarRActionPerformed

    private void txtEspacioRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspacioRActionPerformed
        
    }//GEN-LAST:event_txtEspacioRActionPerformed

    private void BuscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarRActionPerformed
        gb.BuscarReservas();
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaR.getModel();
        modeloTabla.fireTableDataChanged();
    }//GEN-LAST:event_BuscarRActionPerformed

    private void VolverRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverRActionPerformed
        gr.consultarReservas();

        DefaultTableModel modeloTabla = (DefaultTableModel) tablaR.getModel();
        modeloTabla.fireTableDataChanged();        
    }//GEN-LAST:event_VolverRActionPerformed

    public void agregarFilaE(String datos[]){
        dte.addRow(datos);
    }
    
    public void limpiarTablaE(){
        dte.getDataVector().removeAllElements();
    }
    
    public void agregarFilaR(String datos[]){
         dtr.addRow(datos);
    }
    
    public void limpiarTablaR(){
        dtr.getDataVector().removeAllElements();
    }
    
    public void ContadorSesion (){
       TiempoSesion contador = new TiempoSesion(this);
       contador.start();
    }
    
    public void actualizarTiempo (int i){
        Contador.setText(i + " Seg");
    } 
    
    //Espacios
    public String getNombreE(){
        return txtNombreE.getText();
    }
    public String getDescripcionE(){
        return txtDescripcionE.getText();
    }
    public String getTipoE(){
        return txtTipoE.getSelectedItem().toString();
    }
    public String getEstadoE(){
        return txtEstadoE.getSelectedItem().toString();
    }
    
    //Reservas
    public String getDocumentoR(){
        return txtDocumentoR.getText();
    }
    public String getNombreR(){
        return txtNombreR.getText();
    }
    //public String getFechaR(){
        //Date fechaSeleccionada = txtFechaR.getDate();
        
        //SimpleDateFormat formato = new SimpleDateFormat(txtFechaR.getDateFormatString());
        //return formato.format(fechaSeleccionada);
    //}
    public String getHoraR1(){
        return txtHoraIR1.getSelectedItem().toString();
    }
    public String getHoraR2(){
        return txtHoraFR2.getSelectedItem().toString();
    }
    public String getEstadoR(){
        return txtEstadoR.getSelectedItem().toString();
    }
    public String getEspacioR(){
        return txtEspacioR.getSelectedItem().toString();
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarE;
    private javax.swing.JButton ActualizarR;
    private javax.swing.JButton BorrarE;
    private javax.swing.JButton BorrarR;
    private javax.swing.JButton BuscarR;
    private javax.swing.JLabel Contador;
    private javax.swing.JButton CrearE;
    private javax.swing.JButton CrearR;
    private javax.swing.JButton EditarE;
    private javax.swing.JButton EditarR;
    private javax.swing.JPanel PanelEspacios;
    private javax.swing.JPanel PanelReservas;
    private javax.swing.JButton VolverR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaE;
    private javax.swing.JTable tablaR;
    private javax.swing.JTextArea txtDescripcionE;
    private javax.swing.JTextField txtDocumentoR;
    private javax.swing.JComboBox<String> txtEspacioR;
    private javax.swing.JComboBox<String> txtEstadoE;
    private javax.swing.JComboBox<String> txtEstadoR;
    private javax.swing.JComboBox<String> txtHoraFR2;
    private javax.swing.JComboBox<String> txtHoraIR1;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreR;
    private javax.swing.JComboBox<String> txtTipoE;
    // End of variables declaration//GEN-END:variables
}