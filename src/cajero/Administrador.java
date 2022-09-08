
package cajero;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Administrador extends javax.swing.JFrame {

    private TableRowSorter trsFiltro;
    int move;
    int modo = 0;
    int id = 0;
    String u1 = "",u2 = "",u3 = "",u4 = "";
    
    Conexion con = new Conexion();
    java.sql.Connection cn;
    Statement st;
    ResultSet rs;
    
    DefaultTableModel modelo;
    int fila;
    int filaSelecionada;
    
    public Administrador() {
        setResizable(false);
        initComponents();
        setLocationRelativeTo(this);
        
        ImageIcon ImagenBackground = new ImageIcon("src/imagenes/bancoLogo.png");
        Icon IconoBackground = new ImageIcon(ImagenBackground.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(IconoBackground);
        
        ImageIcon wallper = new ImageIcon("src/imagenes/fondo.jpg");
        Icon IconoWallpaper = new ImageIcon(wallper.getImage().getScaledInstance(wallpaper.getWidth(), wallpaper.getHeight(), Image.SCALE_DEFAULT));
        wallpaper.setIcon(IconoWallpaper);
        
        edicion.setVisible(false);
        
        llenarTabla();
    }

    public TableRowSorter getTrsFiltro() {
        return trsFiltro;
    }

    public void setTrsFiltro(TableRowSorter trsFiltro) {
        this.trsFiltro = trsFiltro;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public JTextField getBuscador() {
        return Buscador;
    }

    public void setBuscador(JTextField Buscador) {
        this.Buscador = Buscador;
    }

    public JComboBox<String> getTipoDeBusqueda() {
        return TipoDeBusqueda;
    }

    public void setTipoDeBusqueda(JComboBox<String> TipoDeBusqueda) {
        this.TipoDeBusqueda = TipoDeBusqueda;
    }

    public JButton getBuscar() {
        return buscar;
    }

    public void setBuscar(JButton buscar) {
        this.buscar = buscar;
    }

    public JButton getCrear() {
        return crear;
    }

    public void setCrear(JButton crear) {
        this.crear = crear;
    }

    public JButton getEditar() {
        return editar;
    }

    public void setEditar(JButton editar) {
        this.editar = editar;
    }

    public JButton getEliminar() {
        return eliminar;
    }

    public void setEliminar(JButton eliminar) {
        this.eliminar = eliminar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public void setjLabel22(JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return lista;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.lista = jScrollPane1;
    }

    public JLabel getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(JLabel nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public JTextField getSaldo() {
        return saldo;
    }

    public void setSaldo(JTextField saldo) {
        this.saldo = saldo;
    }

    public JButton getSalir() {
        return salir;
    }

    public void setSalir(JButton salir) {
        this.salir = salir;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        edicion = new javax.swing.JPanel();
        usTitulo = new javax.swing.JLabel();
        usuarioSeleccionado = new javax.swing.JTextField();
        idTitulo = new javax.swing.JLabel();
        idSeleccionado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passVisibleEdit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usuarioEdit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        saldoEdit = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        passOcultaEdit = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        historialEdit = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        refrescar = new javax.swing.JButton();
        lista = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        crear = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        Buscador = new javax.swing.JTextField();
        TipoDeBusqueda = new javax.swing.JComboBox<>();
        msg = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edicion.setBackground(new java.awt.Color(255, 255, 255));
        edicion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edicion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usTitulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usTitulo.setText("Usuario:   ");
        edicion.add(usTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        usuarioSeleccionado.setEditable(false);
        edicion.add(usuarioSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 150, 20));

        idTitulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idTitulo.setText("Id:   ");
        edicion.add(idTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 100, 20));

        idSeleccionado.setEditable(false);
        edicion.add(idSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 150, 20));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Saldo:   ");
        edicion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 100, 20));

        passVisibleEdit.setEditable(false);
        edicion.add(passVisibleEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 150, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre de Usuario:   ");
        edicion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 20));
        edicion.add(usuarioEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 150, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Contraseña:   ");
        edicion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 100, 20));

        saldoEdit.setText("0");
        saldoEdit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                saldoEditFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                saldoEditFocusLost(evt);
            }
        });
        saldoEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                saldoEditKeyTyped(evt);
            }
        });
        edicion.add(saldoEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 150, -1));

        cancelar.setBackground(new java.awt.Color(255, 0, 0));
        cancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        edicion.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 120, 40));

        aceptar.setBackground(new java.awt.Color(0, 204, 51));
        aceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("Aceptar");
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        edicion.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, 40));

        passOcultaEdit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passOcultaEditFocusLost(evt);
            }
        });
        passOcultaEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passOcultaEditKeyPressed(evt);
            }
        });
        edicion.add(passOcultaEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 150, 20));

        historialEdit.setColumns(20);
        historialEdit.setRows(5);
        jScrollPane1.setViewportView(historialEdit);

        edicion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 70));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Historial Bancario:"));
        edicion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 100));

        jPanel1.add(edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 560, 180));

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center>Administrador</center></html>");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 50));

        buscar.setBackground(new java.awt.Color(0, 0, 0));
        buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 110, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 550, 20));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 50, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Usuario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 190, -1));

        nombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreUsuario.setText("Administrador");
        jPanel1.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, 30));

        saldo.setEditable(false);
        saldo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        saldo.setText("-");
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        jPanel1.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 180, 30));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 50, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Saldo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 180, -1));

        salir.setBackground(new java.awt.Color(204, 0, 0));
        salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 180, 50));

        refrescar.setBackground(new java.awt.Color(0, 0, 0));
        refrescar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refrescar.setForeground(new java.awt.Color(255, 255, 255));
        refrescar.setText("Refrescar");
        refrescar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarActionPerformed(evt);
            }
        });
        jPanel1.add(refrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "usuario", "saldo", "password", "historialBancario"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        lista.setViewportView(tabla);

        jPanel1.add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 560, 180));

        crear.setBackground(new java.awt.Color(0, 0, 0));
        crear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        crear.setForeground(new java.awt.Color(255, 255, 255));
        crear.setText("Crear");
        crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        jPanel1.add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 110, 30));

        editar.setBackground(new java.awt.Color(0, 0, 0));
        editar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editar.setForeground(new java.awt.Color(255, 255, 255));
        editar.setText("Editar");
        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPanel1.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 110, 30));

        eliminar.setBackground(new java.awt.Color(0, 0, 0));
        eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 110, 30));

        Buscador.setText("Buscar...");
        Buscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscadorFocusLost(evt);
            }
        });
        Buscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscadorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscadorMouseExited(evt);
            }
        });
        Buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuscadorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscadorKeyTyped(evt);
            }
        });
        jPanel1.add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 390, 30));

        TipoDeBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "usuario", "saldo", "password", "historialBancario" }));
        TipoDeBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TipoDeBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDeBusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(TipoDeBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 140, 30));

        msg.setBackground(new java.awt.Color(255, 255, 255));
        msg.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        msg.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 540, 20));
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 370, 330));

        wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 560, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        edicion.setVisible(false);
        tabla.setVisible(true);
        lista.setVisible(true);
        Buscador.requestFocus();
    }//GEN-LAST:event_buscarActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int valor = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesion?","Peticion de Salida", JOptionPane.YES_NO_OPTION);

        if (valor == JOptionPane.YES_OPTION) {
            new principal().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_salirActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        modo = 1; 
        
        edicion.setVisible(true);
        tabla.setVisible(false);
        lista.setVisible(false);
        
        usTitulo.setVisible(false);
        usuarioSeleccionado.setVisible(false);
        idTitulo.setVisible(false);
        idSeleccionado.setVisible(false);
        
        LimpiarDatos();
        tabla.clearSelection();
    }//GEN-LAST:event_crearActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        fila=tabla.getSelectedRow();
        
        if (fila == -1) {
            int opcion = JOptionPane.showConfirmDialog(null, "Debes de seleccionar primero un usuario para poder modificar sus datos\n\n¿Deseas ir a seleccionar un usuario en la tabla?", "Accion en proceso", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {

                edicion.setVisible(false);
                tabla.setVisible(true);
                lista.setVisible(true);
            }
                    
        } else {
            modo = 2;

            edicion.setVisible(true);
            tabla.setVisible(false);
            lista.setVisible(false);

            usTitulo.setVisible(false);
            usuarioSeleccionado.setVisible(false);
            idTitulo.setVisible(true);
            idSeleccionado.setVisible(true);
            
            usuarioSeleccionado.setText(""+u1);
            idSeleccionado.setText(""+id);
            usuarioEdit.setText(""+u1);
            saldoEdit.setText(""+u2);
            passOcultaEdit.setText(""+u3);
            passVisibleEdit.setText(""+u3);
            
            String movi = String.valueOf(u4);
            String[] cadena = movi.split("-");
            movi="";
            historialEdit.setText("");
            
            for (int i = 0; i < cadena.length; i++) {
                if (cadena[i].isEmpty() || cadena[i] == null) {
                    historialEdit.setText("");
                } else {
                    movi = cadena[i];
                    if (i==1) {
                        historialEdit.setText(historialEdit.getText() + "--------------------------------------------\n" + movi);
                    }else{
                        historialEdit.setText(historialEdit.getText() + "\n--------------------------------------------\n" + movi);
                    }
                }
            }
        }
    }//GEN-LAST:event_editarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        EliminarUsuario();
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void BuscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscadorFocusGained
        Buscador.requestFocus();
        msg.setText("Recuerda que debes tener en cuenta mayusculas y minusculas en las busquedas");
        if (Buscador.getText().equalsIgnoreCase("Buscar...")) {
            Buscador.setText("");
            msg.setOpaque(true);
        }
    }//GEN-LAST:event_BuscadorFocusGained

    private void BuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscadorMouseClicked

    }//GEN-LAST:event_BuscadorMouseClicked

    private void BuscadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscadorMouseExited

    }//GEN-LAST:event_BuscadorMouseExited

    private void BuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorKeyPressed
        char Entrar = evt.getKeyChar();
        char Cambiar = evt.getKeyChar();

        if (evt.getKeyCode() == evt.VK_DOWN) {

            move++;

            //System.out.println("sumar move: "+move);
            if (move > 4) {

                move = 4;

            } else {

                TipoDeBusqueda.setSelectedIndex(move);

            }

        }

        if (evt.getKeyCode() == evt.VK_UP) {

            move--;
            //System.out.println("restar move: "+move);

            if (move < 0) {

                move = 0;

            } else {

                TipoDeBusqueda.setSelectedIndex(move);

            }

        }

    }//GEN-LAST:event_BuscadorKeyPressed

    private void BuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorKeyTyped
        Buscador.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (Buscador.getText());
                Buscador.setText(cadena);
                repaint();
                filtro1();
            }

        });

        trsFiltro = new TableRowSorter(tabla.getModel());
        tabla.setRowSorter(trsFiltro);
    }//GEN-LAST:event_BuscadorKeyTyped

    private void TipoDeBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDeBusquedaActionPerformed

        if (TipoDeBusqueda.getSelectedItem().toString() == "id") {

            repaint();
            filtro1();
        }
        if (TipoDeBusqueda.getSelectedItem().toString() == "usuario") {

            repaint();
            filtro1();
        }
        if (TipoDeBusqueda.getSelectedItem() == "saldo") {

            repaint();
            filtro1();
        }
        if (TipoDeBusqueda.getSelectedItem() == "password") {

            repaint();
            filtro1();
        }
        if (TipoDeBusqueda.getSelectedItem() == "historialBancario") {

            repaint();
            filtro1();
        }

    }//GEN-LAST:event_TipoDeBusquedaActionPerformed

    private void BuscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscadorFocusLost
        msg.setText("");
        if (Buscador.getText().equalsIgnoreCase("")) {
            Buscador.setText("Buscar...");
            msg.setOpaque(false);
        }
    }//GEN-LAST:event_BuscadorFocusLost

    private void refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarActionPerformed
        edicion.setVisible(false);
        tabla.setVisible(true);
        lista.setVisible(true);
        LimpiarTabla();
        llenarTabla();
    }//GEN-LAST:event_refrescarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        edicion.setVisible(false);
        tabla.setVisible(true);
        lista.setVisible(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        if (modo==1) {
            
            if (usuarioEdit.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios");
            } else if (saldoEdit.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios");
            } else if (passOcultaEdit.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios");
            }else{
                validarAgregarUsuario();
                LimpiarDatos();
            }
            
        }else if (modo==2) {
            
            if (usuarioEdit.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No puedes dejar un usuario vacio");
            } else if (saldoEdit.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios");
            } else if (passOcultaEdit.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No puedes dejar una contraseña vacia");
            } else {

                int opcion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de modificar este usuario y todos sus datos?", "Modificacion en proceso", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    
                    ModificarUsuario();

                    LimpiarDatos();
                }

            }

        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void passOcultaEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passOcultaEditKeyPressed
        passVisibleEdit.setText(""+passOcultaEdit.getText());
    }//GEN-LAST:event_passOcultaEditKeyPressed

    private void passOcultaEditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passOcultaEditFocusLost
        passVisibleEdit.setText(""+passOcultaEdit.getText());
    }//GEN-LAST:event_passOcultaEditFocusLost

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        fila=tabla.getSelectedRow();
        
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debes de seleccionar primero un usuario para poder modificar sus datos");
        } else {
            id=Integer.parseInt((String)tabla.getValueAt(fila,0).toString());
            u1 =(String) tabla.getValueAt(fila, 1).toString();
            u2 =(String) tabla.getValueAt(fila, 2).toString();
            u3 =(String) tabla.getValueAt(fila, 3).toString();
            u4 =(String) tabla.getValueAt(fila, 4).toString();
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void saldoEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldoEditKeyTyped
        BloquearLetras(evt);
    }//GEN-LAST:event_saldoEditKeyTyped

    private void saldoEditFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_saldoEditFocusGained
        if (saldoEdit.getText().equals("0")) {
            saldoEdit.setText("");
        }
    }//GEN-LAST:event_saldoEditFocusGained

    private void saldoEditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_saldoEditFocusLost
        if (saldoEdit.getText().equals("")) {
            saldoEdit.setText("0");
        }
    }//GEN-LAST:event_saldoEditFocusLost

    public void BloquearLetras(KeyEvent evt){
        
        char Numeros = evt.getKeyChar();
        char Entrar = evt.getKeyChar();
    
        if(!Character.isDigit(Numeros)&& Numeros != KeyEvent.VK_BACK_SPACE && Numeros != KeyEvent.VK_SPACE && Numeros != KeyEvent.VK_DELETE && Entrar != KeyEvent.VK_ENTER){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar Numeros.", "ERROR DE DIGITACION", JOptionPane.ERROR_MESSAGE);
            
        }
    
    }
    
    private void filtro1() {

        int columnaBuscar = 0;

        if (TipoDeBusqueda.getSelectedItem().toString() == "id") {

            columnaBuscar = 0;
        }
        if (TipoDeBusqueda.getSelectedItem().toString() == "usuario") {

            columnaBuscar = 1;
        }
        if (TipoDeBusqueda.getSelectedItem().toString() == "saldo") {

            columnaBuscar = 2;
        }
        if (TipoDeBusqueda.getSelectedItem() == "password") {

            columnaBuscar = 3;
        }
        if (TipoDeBusqueda.getSelectedItem() == "historialBancario") {

            columnaBuscar = 4;
        }
        
        trsFiltro.setRowFilter(RowFilter.regexFilter(Buscador.getText(), columnaBuscar));

    }
    
    private void llenarTabla(){
        String sql = "select * from registros";
        try {
            cn=con.ComprobarConexion();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object[] persona = new Object[5];
            modelo=(DefaultTableModel)tabla.getModel();
            while (rs.next()) {                
                persona[0]=rs.getInt("id");
                persona[1]=rs.getString("usuario");
                persona[2]=rs.getInt("saldo");
                persona[3]=rs.getString("password");
                persona[4]=rs.getString("historialBancario");
                modelo.addRow(persona);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
        }
    }
    
    public void LimpiarTabla(){
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
    }
    
    public void LimpiarDatos(){
        usuarioSeleccionado.setText("");
        idSeleccionado.setText("");
        usuarioEdit.setText("");
        saldoEdit.setText("0");
        passOcultaEdit.setText("");
        passVisibleEdit.setText("");
        historialEdit.setText("");
    }
    
    public void validarAgregarUsuario(){
        String d1 = usuarioEdit.getText();
        boolean comprobar = true;
        
        Object[] persona = new Object[5];

        String sql = "select * from registros where usuario='" + d1 + "'";

        try {

            cn = con.ComprobarConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                persona[0] = rs.getInt("id");
                persona[1] = rs.getString("usuario");
                persona[2] = rs.getInt("saldo");
                persona[3] = rs.getString("password");
                persona[4] = rs.getString("historialBancario");
                comprobar=false;
            }

        } catch (Exception e) {
        }
        
        if (comprobar==true) {
            AgegarUsuario();
        }else if(comprobar==false){
            JOptionPane.showMessageDialog(null, "Este usuario ya ha sido registrado en el sistema\n\nPor favor, ingrese un usuario nuevo");
        }
    }
    
    public void AgegarUsuario(){
        String d1 = usuarioEdit.getText();
        String d2 = saldoEdit.getText();
        String d3 = passOcultaEdit.getText();
        String d4 = historialEdit.getText();
        String sql = "insert into registros(usuario,saldo,password,historialBancario) values('" + d1 + "','" + d2 + "','" + d3 + "','" + d4 + "')";
        try {
            cn = con.ComprobarConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Tu usuario ha sido agregado con exito");
            LimpiarTabla();
            llenarTabla();
            edicion.setVisible(false);
            tabla.setVisible(true);
            lista.setVisible(true);
        } catch (Exception e) {
        }
    } 
    
    public void ModificarUsuario() {
        String d1 = usuarioEdit.getText();
        String d2 = saldoEdit.getText();
        String d3 = passOcultaEdit.getText();
        String d4 = historialEdit.getText();

        String sql = "update registros set usuario='" + d1 + "', saldo='" + d2 + "', password='" + d3 + "', historialBancario='" + d4 + "' where id=" + id;

        try {
            cn = con.ComprobarConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Tu usuario ha sido modificado con exito");
            LimpiarTabla();
            llenarTabla();
            edicion.setVisible(false);
            tabla.setVisible(true);
            lista.setVisible(true);
        } catch (Exception e) {
        }
    }
    
    public void EliminarUsuario(){
        filaSelecionada=tabla.getSelectedRow();
        
        if (filaSelecionada==-1) {
            
            int opcion = JOptionPane.showConfirmDialog(null, "Debes de seleccionar primero un usuario para poder eliminarlo del sistema\n\n¿Deseas ir a seleccionar un usuario en la tabla?", "Accion en proceso", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {

                edicion.setVisible(false);
                tabla.setVisible(true);
                lista.setVisible(true);
            }
        }else{
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar este usuario y todos sus datos?", "Eliminacion en proceso", JOptionPane.YES_NO_OPTION);
            
            String sql = "delete from registros where id="+id;
            
            if (opcion == JOptionPane.YES_OPTION) {
                try {
                    cn = con.ComprobarConexion();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    LimpiarTabla();
                    llenarTabla();
                } catch (Exception e) {
                }
            }
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscador;
    private javax.swing.JComboBox<String> TipoDeBusqueda;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton crear;
    private javax.swing.JPanel edicion;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextArea historialEdit;
    private javax.swing.JTextField idSeleccionado;
    private javax.swing.JLabel idTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane lista;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JPasswordField passOcultaEdit;
    private javax.swing.JTextField passVisibleEdit;
    private javax.swing.JButton refrescar;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextField saldoEdit;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel usTitulo;
    private javax.swing.JTextField usuarioEdit;
    private javax.swing.JTextField usuarioSeleccionado;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
