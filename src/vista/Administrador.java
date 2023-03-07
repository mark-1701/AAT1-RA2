package vista;

import javax.swing.*;
import javax.swing.table.*;
import modelo.Vendedor;
import modeloDAO.ClienteDAO;
import modeloDAO.ProductoDAO;
import modeloDAO.SucursalDAO;
import modeloDAO.VendedorDAO;

public class Administrador extends javax.swing.JFrame {

    VendedorDAO dao = new VendedorDAO();
    SucursalDAO daoS = new SucursalDAO();
    ProductoDAO daoP = new ProductoDAO();
    ClienteDAO daoC = new ClienteDAO();
    int fila = -1;

    public Administrador() {
        initComponents();
        setResizable(false);
        setTitle("Administrador");
        setLocationRelativeTo(null);
        cargarVendedores();
        cargarSucursales();
        cargarProductos();
        cargarCliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPSucursales = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSucursales = new javax.swing.JTable();
        crearS = new javax.swing.JButton();
        cargaMasivaS = new javax.swing.JButton();
        actualizarS = new javax.swing.JButton();
        eliminarS = new javax.swing.JButton();
        pdfS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPProductos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        crearP = new javax.swing.JButton();
        cargamasivaP = new javax.swing.JButton();
        actualizarP = new javax.swing.JButton();
        eliminarP = new javax.swing.JButton();
        pdfP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPClientes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        crearC = new javax.swing.JButton();
        actualizarC = new javax.swing.JButton();
        cargamasivaC = new javax.swing.JButton();
        eliminarC = new javax.swing.JButton();
        pdfC = new javax.swing.JButton();
        jPVendedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendedores = new javax.swing.JTable();
        crearV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        actualizarV = new javax.swing.JButton();
        eliminarV = new javax.swing.JButton();
        pdfV = new javax.swing.JButton();
        cargamasivaV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cerrar Cesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTabbedPane2.setName(""); // NOI18N

        jTableSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Correo", "Telefono"
            }
        ));
        jTableSucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTableSucursales);

        crearS.setText("Crear");
        crearS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearSActionPerformed(evt);
            }
        });

        cargaMasivaS.setText("Carga Masiva");

        actualizarS.setText("Actualizar");
        actualizarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarSActionPerformed(evt);
            }
        });

        eliminarS.setText("Eliminar");
        eliminarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarSActionPerformed(evt);
            }
        });

        pdfS.setText("Exportar lista a PDF");

        jLabel2.setText("logo");

        javax.swing.GroupLayout jPSucursalesLayout = new javax.swing.GroupLayout(jPSucursales);
        jPSucursales.setLayout(jPSucursalesLayout);
        jPSucursalesLayout.setHorizontalGroup(
            jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSucursalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPSucursalesLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPSucursalesLayout.createSequentialGroup()
                                .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actualizarS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargaMasivaS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pdfS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPSucursalesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPSucursalesLayout.setVerticalGroup(
            jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSucursalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPSucursalesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargaMasivaS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizarS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(pdfS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Sucursales", jPSucursales);

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Cantidad", "Precios"
            }
        ));
        jTableProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jTableProductos);

        crearP.setText("Crear");
        crearP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPActionPerformed(evt);
            }
        });

        cargamasivaP.setText("Carga Masiva");

        actualizarP.setText("Actualizar");
        actualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarPActionPerformed(evt);
            }
        });

        eliminarP.setText("Eliminar");
        eliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPActionPerformed(evt);
            }
        });

        pdfP.setText("Exportar lista a PDF");

        jLabel3.setText("logo");

        javax.swing.GroupLayout jPProductosLayout = new javax.swing.GroupLayout(jPProductos);
        jPProductos.setLayout(jPProductosLayout);
        jPProductosLayout.setHorizontalGroup(
            jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPProductosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPProductosLayout.createSequentialGroup()
                                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargamasivaP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pdfP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPProductosLayout.setVerticalGroup(
            jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPProductosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargamasivaP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(pdfP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Productos", jPProductos);

        jLabel4.setText("logo");

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Caja", "Ventas", "Genero"
            }
        ));
        jTableClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(jTableClientes);

        crearC.setText("Crear");
        crearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCActionPerformed(evt);
            }
        });

        actualizarC.setText("Actualizar");
        actualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarCActionPerformed(evt);
            }
        });

        cargamasivaC.setText("Carga Masiva");

        eliminarC.setText("Eliminar");
        eliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCActionPerformed(evt);
            }
        });

        pdfC.setText("Exportar lista a PDF");

        javax.swing.GroupLayout jPClientesLayout = new javax.swing.GroupLayout(jPClientes);
        jPClientes.setLayout(jPClientesLayout);
        jPClientesLayout.setHorizontalGroup(
            jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPClientesLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPClientesLayout.createSequentialGroup()
                                .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargamasivaC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pdfC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPClientesLayout.setVerticalGroup(
            jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPClientesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargamasivaC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(pdfC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Clientes", jPClientes);

        jTableVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Caja", "Ventas", "Genero"
            }
        ));
        jTableVendedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTableVendedores);

        crearV.setText("Crear");
        crearV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearVActionPerformed(evt);
            }
        });

        jLabel1.setText("logo");

        actualizarV.setText("Actualizar");
        actualizarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarVActionPerformed(evt);
            }
        });

        eliminarV.setText("Eliminar");
        eliminarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarVActionPerformed(evt);
            }
        });

        pdfV.setText("Exportar lista a PDF");

        cargamasivaV.setText("Carga Masiva");

        javax.swing.GroupLayout jPVendedoresLayout = new javax.swing.GroupLayout(jPVendedores);
        jPVendedores.setLayout(jPVendedoresLayout);
        jPVendedoresLayout.setHorizontalGroup(
            jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVendedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPVendedoresLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPVendedoresLayout.createSequentialGroup()
                                .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actualizarV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargamasivaV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pdfV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPVendedoresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPVendedoresLayout.setVerticalGroup(
            jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVendedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPVendedoresLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargamasivaV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizarV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(pdfV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Vendedores", jPVendedores);

        jTabbedPane2.setSelectedComponent(jPVendedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eliminarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarVActionPerformed
        fila = jTableVendedores.getSelectedRow();
        if (jTableVendedores.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para eliminar", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else {
            int codigo = Integer.parseInt(jTableVendedores.getValueAt(fila, 0).toString());
            dao.delete(codigo);
            this.dispose();
            new Administrador().setVisible(true);
        }
    }//GEN-LAST:event_eliminarVActionPerformed

    private void actualizarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarVActionPerformed
        fila = jTableVendedores.getSelectedRow();
        if (jTableVendedores.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para actualizar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(jTableVendedores.getValueAt(fila, 0).toString());
            this.dispose();
            new ActualizarVendedor(dao.serch(codigo)).setVisible(true);
        }
    }//GEN-LAST:event_actualizarVActionPerformed

    private void crearVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearVActionPerformed
        this.dispose();
        new AgregarVendedor().setVisible(true);
    }//GEN-LAST:event_crearVActionPerformed

    private void eliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPActionPerformed
        fila = jTableProductos.getSelectedRow();
        if (jTableProductos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para eliminar", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else {
            int codigo = Integer.parseInt(jTableProductos.getValueAt(fila, 0).toString());
            daoP.delete(codigo);
            this.dispose();
            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            administrador.jTabbedPane2.setSelectedIndex(1);
        }
    }//GEN-LAST:event_eliminarPActionPerformed

    private void actualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarPActionPerformed
        fila = jTableProductos.getSelectedRow();
        if (jTableProductos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para actualizar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(jTableProductos.getValueAt(fila, 0).toString());
            this.dispose();
            new ActualizarProducto(daoP.serch(codigo)).setVisible(true);
        }
    }//GEN-LAST:event_actualizarPActionPerformed

    private void crearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPActionPerformed
        this.dispose();
        new AgregarProducto().setVisible(true);
    }//GEN-LAST:event_crearPActionPerformed

    private void eliminarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarSActionPerformed
        fila = jTableSucursales.getSelectedRow();
        if (jTableSucursales.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para eliminar", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else {
            int codigo = Integer.parseInt(jTableSucursales.getValueAt(fila, 0).toString());
            daoS.delete(codigo);
            this.dispose();
            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            administrador.jTabbedPane2.setSelectedIndex(0);
        }
    }//GEN-LAST:event_eliminarSActionPerformed

    private void actualizarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarSActionPerformed
        fila = jTableSucursales.getSelectedRow();
        if (jTableSucursales.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para actualizar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(jTableSucursales.getValueAt(fila, 0).toString());
            this.dispose();
            new ActualizarSucursal(daoS.serch(codigo)).setVisible(true);
        }
    }//GEN-LAST:event_actualizarSActionPerformed

    private void crearSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearSActionPerformed
        this.dispose();
        new AgregarSucursal().setVisible(true);
    }//GEN-LAST:event_crearSActionPerformed

    private void crearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCActionPerformed
        this.dispose();
        new AgregarCliente().setVisible(true);
    }//GEN-LAST:event_crearCActionPerformed

    private void actualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarCActionPerformed
        fila = jTableClientes.getSelectedRow();
        if (jTableClientes.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para actualizar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(jTableClientes.getValueAt(fila, 0).toString());
            this.dispose();
            new ActualizarCliente(daoC.serch(codigo)).setVisible(true);
        }
    }//GEN-LAST:event_actualizarCActionPerformed

    private void eliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCActionPerformed
        fila = jTableClientes.getSelectedRow();
        if (jTableClientes.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para eliminar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(jTableClientes.getValueAt(fila, 0).toString());
            daoC.delete(codigo);
            this.dispose();
            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            administrador.jTabbedPane2.setSelectedIndex(2);
        }
    }//GEN-LAST:event_eliminarCActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarC;
    private javax.swing.JButton actualizarP;
    private javax.swing.JButton actualizarS;
    private javax.swing.JButton actualizarV;
    private javax.swing.JButton cargaMasivaS;
    private javax.swing.JButton cargamasivaC;
    private javax.swing.JButton cargamasivaP;
    private javax.swing.JButton cargamasivaV;
    private javax.swing.JButton crearC;
    private javax.swing.JButton crearP;
    private javax.swing.JButton crearS;
    private javax.swing.JButton crearV;
    private javax.swing.JButton eliminarC;
    private javax.swing.JButton eliminarP;
    private javax.swing.JButton eliminarS;
    private javax.swing.JButton eliminarV;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPClientes;
    private javax.swing.JPanel jPProductos;
    private javax.swing.JPanel jPSucursales;
    private javax.swing.JPanel jPVendedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTable jTableSucursales;
    private javax.swing.JTable jTableVendedores;
    private javax.swing.JButton pdfC;
    private javax.swing.JButton pdfP;
    private javax.swing.JButton pdfS;
    private javax.swing.JButton pdfV;
    // End of variables declaration//GEN-END:variables

    public void cargarVendedores() {
        jTableVendedores.setModel(dao.listar());
        jScrollPane1.setViewportView(jTableVendedores);

        /*
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        TableCellRenderer rendererFromHeader = jTableVendedores.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < 5; i++) {
            jTableVendedores.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }*/
    }

    public void cargarSucursales() {
        jTableSucursales.setModel(daoS.listar());
        jScrollPane2.setViewportView(jTableSucursales);
    }
    
    public void cargarProductos() {
        jTableProductos.setModel(daoP.listar());
        jScrollPane3.setViewportView(jTableProductos);
    }
    
    public void cargarCliente() {
        jTableClientes.setModel(daoC.listar());
        jScrollPane4.setViewportView(jTableClientes);
    }
}
