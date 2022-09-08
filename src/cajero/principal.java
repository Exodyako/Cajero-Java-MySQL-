
package cajero;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class principal extends javax.swing.JFrame {

    int numeroUsuarios = 2;
    int numeroElementos = 5;
    String[][] usuarios = new String[numeroUsuarios][numeroElementos];
    int id = 0, id2 = 0;
    int cartera = 0;
    
    int[] valorDeRetiro = new int[7];
    String[] msg1 = new String[3];
    String[] msg2 = new String[4];
    String[] msg3 = new String[5];
    
    Conexion conex = new Conexion();
    Conexion con = new Conexion();
    java.sql.Connection cn;
    Statement st;
    ResultSet rs;
    
    public principal() {
        super("Banco - Cajero Nacional");
        setResizable(false);
        initComponents();
        setLocationRelativeTo(this);
        
        vistas.setEnabled(false);
        
        ImageIcon ImagenBackground = new ImageIcon("src/imagenes/bancoLogo.png");
        Icon IconoBackground = new ImageIcon(ImagenBackground.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(IconoBackground);
        logo1.setIcon(IconoBackground);
        logo2.setIcon(IconoBackground);
        logo3.setIcon(IconoBackground);
        logo4.setIcon(IconoBackground);
        logo5.setIcon(IconoBackground);
        logo6.setIcon(IconoBackground);
        
        ImageIcon wallper = new ImageIcon("src/imagenes/fondo.jpg");
        Icon IconoWallpaper = new ImageIcon(wallper.getImage().getScaledInstance(wallpaper.getWidth(), wallpaper.getHeight(), Image.SCALE_DEFAULT));
        wallpaper.setIcon(IconoWallpaper);
        wallpaper1.setIcon(IconoWallpaper);
        wallpaper2.setIcon(IconoWallpaper);
        wallpaper3.setIcon(IconoWallpaper);
        wallpaper4.setIcon(IconoWallpaper);
        wallpaper5.setIcon(IconoWallpaper);
        wallpaper6.setIcon(IconoWallpaper);
        
        valorDeRetiro[0] = 10000;
        valorDeRetiro[1] = 20000;
        valorDeRetiro[2] = 30000;
        valorDeRetiro[3] = 50000;
        valorDeRetiro[4] = 100000;
        valorDeRetiro[5] = 200000;
        valorDeRetiro[6] = 1000000;
        
        msg1[0] = "usuario de la persona a la que le desea realizar el envio o transferencia";
        msg1[1] = "Cantidad de dinero que deseas enviar o transferir";
        msg1[2] = "Contraseña requerida para validar el envio o transaccion"; 
        
        msg2[0] = "Nombre de usuario con el que se desea registrar";
        msg2[1] = "Cantidad de saldo base destinada al nuevo usuario";
        msg2[2] = "Contraseña requerida para acceder con el nuevo usuario"; 
        msg2[3] = "Colocar la misma contraseña anterior para verificar que coinciden y conozca su contraseña"; 
        
        usuario.requestFocus();
        
        conex = new Conexion();
        conex.ComprobarConexion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        vistas = new javax.swing.JTabbedPane();
        v1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        t2 = new javax.swing.JLabel();
        passIcon = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        aceptar = new javax.swing.JButton();
        helpMinistrador = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();
        v2 = new javax.swing.JPanel();
        transferir = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        retirar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historialBancario = new javax.swing.JTextArea();
        movimientos = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        logo6 = new javax.swing.JLabel();
        wallpaper1 = new javax.swing.JLabel();
        v3 = new javax.swing.JPanel();
        textSaldo = new javax.swing.JLabel();
        saldo1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        destinario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        help3 = new javax.swing.JButton();
        help1 = new javax.swing.JButton();
        help2 = new javax.swing.JButton();
        aceptar2 = new javax.swing.JButton();
        cancelar1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        wallpaper2 = new javax.swing.JLabel();
        v4 = new javax.swing.JPanel();
        cancelar2 = new javax.swing.JButton();
        valorIngresado = new javax.swing.JButton();
        millon = new javax.swing.JButton();
        doscientos = new javax.swing.JButton();
        cincuenta = new javax.swing.JButton();
        veinte = new javax.swing.JButton();
        cien = new javax.swing.JButton();
        treinta = new javax.swing.JButton();
        diez = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logo5 = new javax.swing.JLabel();
        wallpaper3 = new javax.swing.JLabel();
        v5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        saldo3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cambiar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        cancelar3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        logo3 = new javax.swing.JLabel();
        wallpaper4 = new javax.swing.JLabel();
        v6 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        salir2 = new javax.swing.JButton();
        logo4 = new javax.swing.JLabel();
        wallpaper5 = new javax.swing.JLabel();
        v7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        usuario2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        saldo2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        password3 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        help4 = new javax.swing.JButton();
        help5 = new javax.swing.JButton();
        help6 = new javax.swing.JButton();
        help7 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        aceptar3 = new javax.swing.JButton();
        cancelar4 = new javax.swing.JButton();
        logo1 = new javax.swing.JLabel();
        wallpaper6 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        v1.setBackground(new java.awt.Color(255, 255, 255));
        v1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center>Bienvenid@ al cajero digital</center></html>");
        jLabel1.setOpaque(true);
        v1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        t1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t1.setText("Contraseña");
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        v1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 120, 30));

        userIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userIcon.png"))); // NOI18N
        v1.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 30, 30));

        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
        });
        v1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 290, 30));

        t2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t2.setText("Usuario");
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });
        v1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 90, 30));

        passIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/passwordIcon.png"))); // NOI18N
        v1.add(passIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 30, 30));

        password.setText("password");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        v1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 290, 30));

        aceptar.setBackground(new java.awt.Color(0, 204, 51));
        aceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("Entrar");
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        v1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 130, 40));

        helpMinistrador.setBackground(new java.awt.Color(0, 0, 0));
        helpMinistrador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        helpMinistrador.setForeground(new java.awt.Color(255, 255, 255));
        helpMinistrador.setText("?");
        helpMinistrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpMinistrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMinistradorActionPerformed(evt);
            }
        });
        v1.add(helpMinistrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 40, 30));

        registrar.setBackground(new java.awt.Color(0, 0, 0));
        registrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Registrarse");
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        v1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 120, 30));
        v1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 370, 340));

        wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 350));

        vistas.addTab("Login", v1);

        v2.setBackground(new java.awt.Color(255, 255, 255));
        v2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transferir.setBackground(new java.awt.Color(0, 0, 0));
        transferir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        transferir.setForeground(new java.awt.Color(255, 255, 255));
        transferir.setText("Transferir");
        transferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirActionPerformed(evt);
            }
        });
        v2.add(transferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 190, 50));

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        v2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 180, 50));

        retirar.setBackground(new java.awt.Color(0, 0, 0));
        retirar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        retirar.setForeground(new java.awt.Color(255, 255, 255));
        retirar.setText("Retirar");
        retirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarActionPerformed(evt);
            }
        });
        v2.add(retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 180, 50));

        jLabel5.setBackground(new java.awt.Color(153, 0, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html><center>Perfil de Usuario</center></html>");
        jLabel5.setOpaque(true);
        v2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        nombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreUsuario.setText("usuario");
        v2.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, 30));

        saldo.setEditable(false);
        saldo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        saldo.setText("0");
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        v2.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 180, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Saldo");
        v2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Usuario");
        v2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 190, -1));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money.png"))); // NOI18N
        v2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 92, 50, 30));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        v2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 50, 50));

        historialBancario.setEditable(false);
        historialBancario.setColumns(20);
        historialBancario.setRows(5);
        jScrollPane1.setViewportView(historialBancario);

        v2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 510, 160));

        movimientos.setBackground(new java.awt.Color(255, 255, 255));
        movimientos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movimientos Bancarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        movimientos.setOpaque(true);
        v2.add(movimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 530, 190));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setOpaque(true);
        v2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 140));
        v2.add(logo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 370, 340));

        wallpaper1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v2.add(wallpaper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 350));

        vistas.addTab("Perfil", v2);

        v3.setBackground(new java.awt.Color(255, 255, 255));
        v3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSaldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textSaldo.setText("Saldo");
        v3.add(textSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 170, -1));

        saldo1.setEditable(false);
        saldo1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        saldo1.setText("0");
        v3.add(saldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 170, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Destinario");
        v3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 270, -1));
        v3.add(destinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 270, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Saldo");
        v3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 270, -1));

        cantidad.setText("0");
        cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cantidadFocusLost(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        v3.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 270, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Mi Contraseña");
        v3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 270, -1));

        password1.setText("password");
        password1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password1FocusLost(evt);
            }
        });
        v3.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 270, 30));

        jLabel9.setBackground(new java.awt.Color(153, 0, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html><center>Transferir o enviar dinero</center></html>");
        jLabel9.setOpaque(true);
        v3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        help3.setBackground(new java.awt.Color(255, 255, 255));
        help3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        help3.setText("?");
        help3.setBorder(null);
        help3.setBorderPainted(false);
        help3.setContentAreaFilled(false);
        help3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help3ActionPerformed(evt);
            }
        });
        v3.add(help3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 40, 30));

        help1.setBackground(new java.awt.Color(255, 255, 255));
        help1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        help1.setText("?");
        help1.setBorder(null);
        help1.setBorderPainted(false);
        help1.setContentAreaFilled(false);
        help1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help1ActionPerformed(evt);
            }
        });
        v3.add(help1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 40, 30));

        help2.setBackground(new java.awt.Color(255, 255, 255));
        help2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        help2.setText("?");
        help2.setBorder(null);
        help2.setBorderPainted(false);
        help2.setContentAreaFilled(false);
        help2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help2ActionPerformed(evt);
            }
        });
        v3.add(help2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 40, 30));

        aceptar2.setBackground(new java.awt.Color(0, 204, 51));
        aceptar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aceptar2.setForeground(new java.awt.Color(255, 255, 255));
        aceptar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check2.png"))); // NOI18N
        aceptar2.setText("Aceptar");
        aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar2ActionPerformed(evt);
            }
        });
        v3.add(aceptar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 270, 40));

        cancelar1.setBackground(new java.awt.Color(204, 0, 0));
        cancelar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelar1.setForeground(new java.awt.Color(255, 255, 255));
        cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete2.png"))); // NOI18N
        cancelar1.setText("Cancelar");
        cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar1ActionPerformed(evt);
            }
        });
        v3.add(cancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 230, 40));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money.png"))); // NOI18N
        v3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 50, 30));
        v3.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 370, 340));

        wallpaper2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v3.add(wallpaper2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 350));

        vistas.addTab("Enviar", v3);

        v4.setBackground(new java.awt.Color(255, 255, 255));
        v4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelar2.setBackground(new java.awt.Color(204, 0, 0));
        cancelar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelar2.setForeground(new java.awt.Color(255, 255, 255));
        cancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete2.png"))); // NOI18N
        cancelar2.setText("Cancelar");
        cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar2ActionPerformed(evt);
            }
        });
        v4.add(cancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 250, 40));

        valorIngresado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valorIngresado.setText("Valor Diferente");
        valorIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorIngresadoActionPerformed(evt);
            }
        });
        v4.add(valorIngresado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 210, 40));

        millon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        millon.setText("$ 1.000.000");
        millon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                millonActionPerformed(evt);
            }
        });
        v4.add(millon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 210, 40));

        doscientos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        doscientos.setText("$ 200.000");
        doscientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doscientosActionPerformed(evt);
            }
        });
        v4.add(doscientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 210, 40));

        cincuenta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cincuenta.setText("$ 50.000");
        cincuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincuentaActionPerformed(evt);
            }
        });
        v4.add(cincuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 210, 40));

        veinte.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        veinte.setText("$20.000");
        veinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veinteActionPerformed(evt);
            }
        });
        v4.add(veinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 40));

        cien.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cien.setText("$ 100.000");
        cien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cienActionPerformed(evt);
            }
        });
        v4.add(cien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 40));

        treinta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        treinta.setText("$30.000");
        treinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treintaActionPerformed(evt);
            }
        });
        v4.add(treinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 210, 40));

        diez.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        diez.setText("$ 10.000");
        diez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diezActionPerformed(evt);
            }
        });
        v4.add(diez, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 210, 40));

        jLabel4.setBackground(new java.awt.Color(153, 0, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><center>Proceso de Retiro</center></html>");
        jLabel4.setOpaque(true);
        v4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));
        v4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 334, 550, 20));
        v4.add(logo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 370, 340));

        wallpaper3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v4.add(wallpaper3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 350));

        vistas.addTab("Retirar", v4);

        v5.setBackground(new java.awt.Color(255, 255, 255));
        v5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        v5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Saldo");
        v5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 180, -1));

        saldo3.setEditable(false);
        saldo3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        saldo3.setText("0");
        saldo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldo3ActionPerformed(evt);
            }
        });
        v5.add(saldo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 180, 30));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money.png"))); // NOI18N
        v5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 50, 30));

        cambiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cambiar.setText("Cambiar Valor");
        cambiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });
        v5.add(cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 340, 40));

        jLabel12.setBackground(new java.awt.Color(153, 0, 153));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<html><center>Verificar el Valor de Retiro</center></html>");
        jLabel12.setOpaque(true);
        v5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        confirmar.setBackground(new java.awt.Color(0, 204, 51));
        confirmar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmar.setForeground(new java.awt.Color(255, 255, 255));
        confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check2.png"))); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        v5.add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 160, 40));

        cancelar3.setBackground(new java.awt.Color(204, 0, 0));
        cancelar3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelar3.setForeground(new java.awt.Color(255, 255, 255));
        cancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete2.png"))); // NOI18N
        cancelar3.setText("Cancelar");
        cancelar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar3ActionPerformed(evt);
            }
        });
        v5.add(cancelar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 150, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 52)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("$");
        v5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 40, 80));

        valor.setEditable(false);
        valor.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        valor.setText("0");
        valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorKeyTyped(evt);
            }
        });
        v5.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 340, 80));
        v5.add(logo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 370, 340));

        wallpaper4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v5.add(wallpaper4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 350));

        vistas.addTab("Validar", v5);

        v6.setBackground(new java.awt.Color(255, 255, 255));
        v6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        impresion.setEditable(false);
        impresion.setColumns(20);
        impresion.setRows(5);
        scroll.setViewportView(impresion);

        v6.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 470, 210));

        jLabel14.setBackground(new java.awt.Color(153, 0, 153));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("<html><center>Estado de la trasaccion</center></html>");
        jLabel14.setOpaque(true);
        v6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        estado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado de la trasaccion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        v6.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 510, 250));

        volver.setBackground(new java.awt.Color(255, 102, 0));
        volver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous2.png"))); // NOI18N
        volver.setText("Regresar");
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        v6.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 260, 40));

        salir2.setBackground(new java.awt.Color(204, 0, 0));
        salir2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salir2.setForeground(new java.awt.Color(255, 255, 255));
        salir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/off2.png"))); // NOI18N
        salir2.setText("Salir");
        salir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir2ActionPerformed(evt);
            }
        });
        v6.add(salir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 240, 40));
        v6.add(logo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 370, 340));

        wallpaper5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v6.add(wallpaper5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 350));

        vistas.addTab("Estado", v6);

        v7.setBackground(new java.awt.Color(255, 255, 255));
        v7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Usuario");
        v7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 280, -1));
        v7.add(usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 280, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Saldo");
        v7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 280, -1));

        saldo2.setText("0");
        saldo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                saldo2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                saldo2FocusLost(evt);
            }
        });
        saldo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                saldo2KeyTyped(evt);
            }
        });
        v7.add(saldo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 280, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Confirmar contraseña");
        v7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 280, -1));

        password3.setText("password");
        password3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password3FocusLost(evt);
            }
        });
        v7.add(password3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 280, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Contraseña");
        v7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 280, -1));

        password2.setText("password");
        password2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password2FocusLost(evt);
            }
        });
        v7.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 280, 30));

        help4.setBackground(new java.awt.Color(255, 255, 255));
        help4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        help4.setText("?");
        help4.setBorder(null);
        help4.setBorderPainted(false);
        help4.setContentAreaFilled(false);
        help4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help4ActionPerformed(evt);
            }
        });
        v7.add(help4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 30, 30));

        help5.setBackground(new java.awt.Color(255, 255, 255));
        help5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        help5.setText("?");
        help5.setBorder(null);
        help5.setBorderPainted(false);
        help5.setContentAreaFilled(false);
        help5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help5ActionPerformed(evt);
            }
        });
        v7.add(help5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 30, 30));

        help6.setBackground(new java.awt.Color(255, 255, 255));
        help6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        help6.setText("?");
        help6.setBorder(null);
        help6.setBorderPainted(false);
        help6.setContentAreaFilled(false);
        help6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help6ActionPerformed(evt);
            }
        });
        v7.add(help6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 30, 30));

        help7.setBackground(new java.awt.Color(255, 255, 255));
        help7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        help7.setText("?");
        help7.setBorder(null);
        help7.setBorderPainted(false);
        help7.setContentAreaFilled(false);
        help7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help7ActionPerformed(evt);
            }
        });
        v7.add(help7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 30, 30));

        jLabel18.setBackground(new java.awt.Color(153, 0, 153));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("<html><center>Registro de Usuarios</center></html>");
        jLabel18.setOpaque(true);
        v7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        aceptar3.setBackground(new java.awt.Color(0, 204, 51));
        aceptar3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aceptar3.setForeground(new java.awt.Color(255, 255, 255));
        aceptar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check2.png"))); // NOI18N
        aceptar3.setText("Aceptar");
        aceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar3ActionPerformed(evt);
            }
        });
        v7.add(aceptar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 250, 40));

        cancelar4.setBackground(new java.awt.Color(255, 102, 0));
        cancelar4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelar4.setForeground(new java.awt.Color(255, 255, 255));
        cancelar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous2.png"))); // NOI18N
        cancelar4.setText("Regresar");
        cancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar4ActionPerformed(evt);
            }
        });
        v7.add(cancelar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 250, 40));
        v7.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 370, 340));

        wallpaper6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v7.add(wallpaper6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 350));

        vistas.addTab("Registro", v7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void millonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_millonActionPerformed
        valor.setText(""+valorDeRetiro[6]);
        saldo3.setText(""+cartera);
        vistas.setSelectedIndex(4);
    }//GEN-LAST:event_millonActionPerformed

    private void cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar1ActionPerformed
        
        destinario.setText("");
        cantidad.setText("");
        password1.setText("password");
        
        vistas.setSelectedIndex(1);
        
    }//GEN-LAST:event_cancelar1ActionPerformed

    private void transferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirActionPerformed
        saldo1.setText(""+cartera);
        vistas.setSelectedIndex(2);
    }//GEN-LAST:event_transferirActionPerformed

    private void retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarActionPerformed
        vistas.setSelectedIndex(3);
    }//GEN-LAST:event_retirarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int valor = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesion?","Peticion de Salida", JOptionPane.YES_NO_OPTION);
        
        if (valor == JOptionPane.YES_OPTION) {
            historialBancario.setText("");
            nombreUsuario.setText("Usuario");
            saldo.setText("0");
            historialBancario.setText("");
            vistas.setSelectedIndex(0);
        }
    }//GEN-LAST:event_salirActionPerformed

    private void cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar2ActionPerformed
        vistas.setSelectedIndex(1);
    }//GEN-LAST:event_cancelar2ActionPerformed

    private void cancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar3ActionPerformed
        valor.setText("0");
        valor.setEditable(false);
        vistas.setSelectedIndex(1);
    }//GEN-LAST:event_cancelar3ActionPerformed

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
        valor.setText("0");
        valor.setEditable(false);
        vistas.setSelectedIndex(3);
    }//GEN-LAST:event_cambiarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        RetirarDinero();
    }//GEN-LAST:event_confirmarActionPerformed

    
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        ValidarUsuario();
    }//GEN-LAST:event_aceptarActionPerformed

    private void llenarTabla(){
        Administrador admin = new Administrador();
        //String[][] informacion= this.conex;
        String []cabeceras = {"Nombre","Apellido","Genero","Fecha","Correo","Contraseña"};
        //admin.getTabla().setModel(new DefaultTableModel(informacion,cabeceras));
  
    }
    
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        EstadoTransaccion();
    }//GEN-LAST:event_volverActionPerformed

    private void salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir2ActionPerformed
        int valor = JOptionPane.showConfirmDialog(null, "Tu proceso de transaccion ya ha terminado\n¿Deseas cerrar sesion","Peticion de Salida", JOptionPane.YES_NO_OPTION);
        
        if (valor == JOptionPane.YES_OPTION) {
            historialBancario.setText("");
            nombreUsuario.setText("usuario");
            saldo.setText("0");
            vistas.setSelectedIndex(0);
        }
    }//GEN-LAST:event_salir2ActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if (password.getText().equalsIgnoreCase("password")) {
            password.setText("");
        }
    }//GEN-LAST:event_passwordFocusGained

    private void password1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1FocusGained
        if (password1.getText().equalsIgnoreCase("password")) {
            password1.setText("");
        }
    }//GEN-LAST:event_password1FocusGained

    private void password1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1FocusLost
        if (password1.getText().equalsIgnoreCase("")) {
            password1.setText("password");
        }
    }//GEN-LAST:event_password1FocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if (password.getText().equalsIgnoreCase("")) {
            password.setText("password");
        }
    }//GEN-LAST:event_passwordFocusLost

    private void cantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadFocusGained
        if (cantidad.getText().equalsIgnoreCase("0")) {
            cantidad.setText("");
        }
    }//GEN-LAST:event_cantidadFocusGained

    private void cantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadFocusLost
        if (cantidad.getText().equalsIgnoreCase("")) {
            cantidad.setText("0");
        }
    }//GEN-LAST:event_cantidadFocusLost

    private void diezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diezActionPerformed
        valor.setText(""+valorDeRetiro[0]);
        saldo3.setText(""+cartera);
        vistas.setSelectedIndex(4);
    }//GEN-LAST:event_diezActionPerformed

    private void veinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veinteActionPerformed
        valor.setText(""+valorDeRetiro[1]);
        saldo3.setText(""+cartera);
        vistas.setSelectedIndex(4);
    }//GEN-LAST:event_veinteActionPerformed

    private void treintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treintaActionPerformed
        valor.setText(""+valorDeRetiro[2]);
        saldo3.setText(""+cartera);
        vistas.setSelectedIndex(4);
    }//GEN-LAST:event_treintaActionPerformed

    private void cincuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincuentaActionPerformed
        valor.setText(""+valorDeRetiro[3]);
        saldo3.setText(""+cartera);
        vistas.setSelectedIndex(4);
    }//GEN-LAST:event_cincuentaActionPerformed

    private void cienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cienActionPerformed
        valor.setText(""+valorDeRetiro[4]);
        saldo3.setText(""+cartera);
        vistas.setSelectedIndex(4);
    }//GEN-LAST:event_cienActionPerformed

    private void doscientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doscientosActionPerformed
        valor.setText(""+valorDeRetiro[5]);
        saldo3.setText(""+cartera);
        vistas.setSelectedIndex(4);
    }//GEN-LAST:event_doscientosActionPerformed

    private void valorIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorIngresadoActionPerformed
        saldo3.setText(""+cartera);
        valor.setText("");
        valor.setEditable(true);
        vistas.setSelectedIndex(4);
        valor.requestFocus();
    }//GEN-LAST:event_valorIngresadoActionPerformed

    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed
        Enterazo(evt);
    }//GEN-LAST:event_usuarioKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        Enterazo(evt);
    }//GEN-LAST:event_passwordKeyPressed

    private void aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar2ActionPerformed
        TransferirDinero();
    }//GEN-LAST:event_aceptar2ActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        BloquearLetras(evt);
    }//GEN-LAST:event_cantidadKeyTyped

    private void valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorKeyTyped
        BloquearLetras(evt);
    }//GEN-LAST:event_valorKeyTyped

    private void saldo2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_saldo2FocusGained
        if (saldo2.getText().equalsIgnoreCase("0")) {
            saldo2.setText("");
        }
    }//GEN-LAST:event_saldo2FocusGained

    private void saldo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_saldo2FocusLost
        if (saldo2.getText().equalsIgnoreCase("")) {
            saldo2.setText("0");
        }
    }//GEN-LAST:event_saldo2FocusLost

    private void saldo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldo2KeyTyped
        BloquearLetras(evt);
    }//GEN-LAST:event_saldo2KeyTyped

    private void password2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password2FocusGained
        if (password2.getText().equalsIgnoreCase("password")) {
            password2.setText("");
        }
    }//GEN-LAST:event_password2FocusGained

    private void password2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password2FocusLost
        if (password2.getText().equalsIgnoreCase("")) {
            password2.setText("password");
        }
    }//GEN-LAST:event_password2FocusLost

    private void aceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar3ActionPerformed
        int extraido = usuarios.length;
        
        if (usuario2.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios");
        } else if (saldo2.getText().equalsIgnoreCase("0")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios");
        } else if (password2.getText().equalsIgnoreCase("password")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios");
        } else if (password3.getText().equalsIgnoreCase("password")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios");
        }else{
            if (usuario2.getText().equalsIgnoreCase("debug") || password2.getText().equalsIgnoreCase("debug") || password3.getText().equalsIgnoreCase("debug")) {
                JOptionPane.showMessageDialog(null, "debug es una palabra reservada para este sistema", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if (usuario2.getText().equalsIgnoreCase("administrador") || password2.getText().equalsIgnoreCase("administrador") || password3.getText().equalsIgnoreCase("debug")) {
                JOptionPane.showMessageDialog(null, "administrador es una palabra reservada para este sistema", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                if (password2.getText().equals(password3.getText())) {
                    validarRegistrarUsuario();
                    
                    usuario2.setText("");
                    saldo2.setText("0");
                    password2.setText("password");
                    password3.setText("password");
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_aceptar3ActionPerformed

    private void cancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar4ActionPerformed
        int valor = JOptionPane.showConfirmDialog(null, "Actualmente estas llenando un formulario\n¿Deseas aun asi regresar al Login?","Interrupcion de proceso", JOptionPane.YES_NO_OPTION);
        
        if (valor == JOptionPane.YES_OPTION) {
            usuario2.setText("");
            saldo2.setText("0");
            password2.setText("password");
            password3.setText("password");
            vistas.setSelectedIndex(0);
        }
    }//GEN-LAST:event_cancelar4ActionPerformed

    private void password3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password3FocusGained
        if (password3.getText().equalsIgnoreCase("password")) {
            password3.setText("");
        }
    }//GEN-LAST:event_password3FocusGained

    private void password3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password3FocusLost
        if (password3.getText().equalsIgnoreCase("")) {
            password3.setText("password");
        }
    }//GEN-LAST:event_password3FocusLost

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        vistas.setSelectedIndex(6);
    }//GEN-LAST:event_registrarActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoActionPerformed

    private void help6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help6ActionPerformed
        String mensa = msg2[0];
        JOptionPane.showMessageDialog(this, mensa);
    }//GEN-LAST:event_help6ActionPerformed

    private void help5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help5ActionPerformed
        String mensa = msg2[1];
        JOptionPane.showMessageDialog(this, mensa);
    }//GEN-LAST:event_help5ActionPerformed

    private void help7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help7ActionPerformed
        String mensa = msg2[2];
        JOptionPane.showMessageDialog(this, mensa);
    }//GEN-LAST:event_help7ActionPerformed

    private void help4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help4ActionPerformed
        String mensa = msg2[3];
        JOptionPane.showMessageDialog(this, mensa);
    }//GEN-LAST:event_help4ActionPerformed

    private void help1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help1ActionPerformed
        String mensa = msg1[0];
        JOptionPane.showMessageDialog(this, mensa);
    }//GEN-LAST:event_help1ActionPerformed

    private void help2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help2ActionPerformed
        String mensa = msg1[1];
        JOptionPane.showMessageDialog(this, mensa);
    }//GEN-LAST:event_help2ActionPerformed

    private void help3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help3ActionPerformed
        String mensa = msg1[2];
        JOptionPane.showMessageDialog(this, mensa);
    }//GEN-LAST:event_help3ActionPerformed

    private void saldo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldo3ActionPerformed

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        password.requestFocus();
        if (password.getText().equalsIgnoreCase("password")) {
            password.setText("");
        }else if (password.getText().equalsIgnoreCase("")) {
            password.setText("password");
        }
    }//GEN-LAST:event_t1MouseClicked

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        usuario.requestFocus();
    }//GEN-LAST:event_t2MouseClicked

    private void helpMinistradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMinistradorActionPerformed
        JOptionPane.showMessageDialog(null, "[Usuario Administrador]\n\nUsuario: administrador\nContraseña: administrador");
    }//GEN-LAST:event_helpMinistradorActionPerformed
    
    public void Enterazo(KeyEvent evt){

        char Entrar = evt.getKeyChar();
    
        if(evt.getKeyCode() == evt.VK_ENTER){
            
            aceptar.doClick();
        
        }
    
    }
    
    public void BloquearLetras(KeyEvent evt){
        
        char Numeros = evt.getKeyChar();
        char Entrar = evt.getKeyChar();
    
        if(!Character.isDigit(Numeros)&& Numeros != KeyEvent.VK_BACK_SPACE && Numeros != KeyEvent.VK_SPACE && Numeros != KeyEvent.VK_DELETE && Entrar != KeyEvent.VK_ENTER){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar Numeros.", "ERROR DE DIGITACION", JOptionPane.ERROR_MESSAGE);
            
        }
    
    }
    
    public void ValidarUsuario(){
        String user = usuario.getText();
        String pass = password.getText();
        int verificado = 0;
        
        Object[] persona = new Object[5];
        
        if (usuario.getText().equalsIgnoreCase("debug") && password.getText().equalsIgnoreCase("debug")) {
            verificado = 2;
        } else if (usuario.getText().equalsIgnoreCase("administrador") && password.getText().equalsIgnoreCase("administrador")) {
            verificado = 3;
        } else {

            String sql = "select * from registros where usuario='" + user + "' and password='" + pass + "'";

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
                    id = rs.getInt("id");
                    cartera = rs.getInt("saldo");
                    verificado = 1;
                    
                }

            } catch (Exception e) {
            }
        }
        
        if (verificado == 1) {
            JOptionPane.showMessageDialog(null, "SESION INICIADA", "Bienvenid@ " + persona[1], JOptionPane.INFORMATION_MESSAGE);
            nombreUsuario.setText("" + persona[1]);
            saldo.setText("" + persona[2]);
            vistas.setSelectedIndex(1);
            usuario.setText("");
            password.setText("password");
            String historial = (String) persona[4];
            if (persona[4] == null || persona[4] == "") {
                historial = "Sin movimientos aun";
                historialBancario.setText("" + historial);
            } else {
                String movi = (String) persona[4];
                String[] cadena = movi.split("-");
                movi = "";
                historialBancario.setText("");

                for (int i = 0; i < cadena.length; i++) {
                    if (cadena[i].isEmpty() || cadena[i] == null) {
                        historialBancario.setText("");
                    } else {
                        movi = cadena[i];
                        if (i==1) {
                            historialBancario.setText(historialBancario.getText() + "--------------------------------------------\n" + movi);
                        }else{
                            historialBancario.setText(historialBancario.getText() + "\n--------------------------------------------\n" + movi);
                        }
                    }
                }
            }
        } else if (verificado == 2) {
            String sql = "select * from registros";

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
                    System.out.println("usuario: " + persona[1].toString() + ", Contraseña: " + persona[3].toString());
                }

            } catch (Exception e) {
            }
            
            System.out.println("");
            JOptionPane.showMessageDialog(null, "Acceso a la base de datos concedido.", "Llave utilizada", JOptionPane.INFORMATION_MESSAGE);
            usuario.setText("");
            password.setText("password");
            usuario.requestFocus();
        } else if (verificado == 3) {
            new Administrador().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario NO valido", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void validarRegistrarUsuario(){
        String d1 = usuario2.getText();
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
            RegistrarUsuario();
        }else if(comprobar==false){
            JOptionPane.showMessageDialog(null, "Este usuario ya ha sido registrado en el sistema\n\nPor favor, ingrese un usuario nuevo");
        }
    }
    
    public void RegistrarUsuario() {
        String d1 = usuario2.getText();
        String d2 = saldo2.getText();
        String d3 = password2.getText();
        String d4 = "";

        String sql = "insert into registros(usuario,saldo,password,historialBancario) values('" + d1 + "','" + d2 + "','" + d3 + "','" + d4 + "')";
        try {
            cn = con.ComprobarConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Tu usuario ha sido registrado con exito");
        } catch (Exception e) {
        }
        vistas.setSelectedIndex(0);
    } 
    
    public void RetirarDinero(){
        int sueldo = 0; 
        String histoRecord = "";
        
        Object[] persona = new Object[5];

        String sql = "select * from registros where id=" + id;

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
            }

        } catch (Exception e) {
        }
        
        String extraido = (String) persona[2].toString();
        int convertido = Integer.parseInt(extraido);
        int sustraido = Integer.parseInt(valor.getText());
        
        msg3[0]= "Trasaccion Rechazada\n\nPara que su Retiro sea valido debe entre valores de 5000 a 5000 asi sucesivamente";
        msg3[1]= "Trasaccion Exitosa\n\nEl estado de su Retiro fue aceptado\n\nCantidad de Retiro: "+sustraido+"\nSaldo Disponible: ";
        msg3[4]= "Trasaccion Rechazada\n\nUd no posee el saldo suficiente para esta transaccion\n\nCantidad a Retirar: "+sustraido+"\nSaldo Disponible: ";
    
        
        if (sustraido == 0) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa un valor valido para retirar");
        }else if (sustraido < 5000) {
            JOptionPane.showMessageDialog(null, "El valor minimo para retirar son de $ 5000");
        }else if (sustraido >5000 && sustraido < 10000) {
            impresion.setText(""+msg3[0]);
            vistas.setSelectedIndex(5);
        }else{
            valor.setEditable(false);
            if (convertido > sustraido) {
                int resultado = convertido - sustraido;
                sueldo = resultado;

                String record = (String) persona[4];
                String mensa = "Retiro de " + sustraido + " por cajero";
                if (persona[4] == null) {
                    record = "";
                }
                String historial = record + "-" + mensa;
                histoRecord = historial;

                String d2 = String.valueOf(sueldo);
                String d4 = histoRecord;

                String sql2 = "update registros set saldo='" + d2 + "', historialBancario='" + d4 + "' where id=" + id;

                try {
                    cn = con.ComprobarConexion();
                    st = cn.createStatement();
                    st.executeUpdate(sql2);
                } catch (Exception e) {
                }

                cartera = sueldo;
                impresion.setText("" + msg3[1] + sueldo);
                vistas.setSelectedIndex(5);
            }else if (convertido < sustraido) {
                cartera = Integer.parseInt((String) persona[2].toString());
                impresion.setText(""+msg3[4]+persona[2].toString());
                vistas.setSelectedIndex(5);
            }
        }
    }
    
    public void EstadoTransaccion(){
        Object[] persona = new Object[5];

        String sql = "select * from registros where id=" + id;

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
            }

        } catch (Exception e) {
        }
        
        nombreUsuario.setText(""+persona[1].toString());
        saldo.setText(""+persona[2].toString());
        String historial = persona[4].toString();
        if (persona[4] == null || persona[4].toString() == "") {
            historial = "Sin movimientos aun";
            historialBancario.setText("" + historial);
        } else {
            String movi = persona[4].toString();
            String[] cadena = movi.split("-");
            movi = "";
            historialBancario.setText("");

            for (int i = 0; i < cadena.length; i++) {
                if (cadena[i].isEmpty() || cadena[i] == null) {
                    historialBancario.setText("");
                } else {
                    movi = cadena[i];
                    historialBancario.setText(historialBancario.getText() + "\n--------------------------------------------\n" + movi);
                }
            }
        }
        vistas.setSelectedIndex(1);
    }
    
    public void TransferirDinero(){
        int s1=0,s2=0;
        String h1="", h2="";
        
        Object[] persona = new Object[5];
        Object[] persona2 = new Object[5];

        try {
            String sql = "select * from registros where id=" + id;
            cn = con.ComprobarConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                persona[0] = rs.getInt("id");
                persona[1] = rs.getString("usuario");
                persona[2] = rs.getInt("saldo");
                persona[3] = rs.getString("password");
                persona[4] = rs.getString("historialBancario");
            }

        } catch (Exception e) {
        }
        
        String extraido = persona[2].toString();
        int convertido = Integer.parseInt(extraido);
        int sustraido = Integer.parseInt(cantidad.getText());
        boolean validado = false;

        String user = destinario.getText();
        String pass = password1.getText();

        msg3[2] = "Trasaccion Exitosa\n\nEl estado de su Trasaccion fue aceptado\n\nCantidad Transferido: " + sustraido + "\nSaldo Disponible: ";
        msg3[3] = "Trasaccion Rechazada\n\nUd no posee el saldo suficiente para esta transaccion\n\nCantidad a Transferir: " + sustraido + "\nSaldo Disponible: ";

        if (destinario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios");
        } else if (cantidad.getText().equalsIgnoreCase("0") || cantidad.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios");
        } else if (password1.getText().equalsIgnoreCase("password") || password1.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios");
        } else {
            try {
                String sql = "select * from registros";
                cn = con.ComprobarConexion();
                st = cn.createStatement();
                rs = st.executeQuery(sql);

                while (rs.next()) {
                    persona2[0] = rs.getInt("id");
                    persona2[1] = rs.getString("usuario");
                    persona2[2] = rs.getInt("saldo");
                    persona2[3] = rs.getString("password");
                    persona2[4] = rs.getString("historialBancario");
                    
                    if (user.equalsIgnoreCase((String) persona2[1].toString()) && password1.getText().equals((String) persona[3].toString())) {
                        id2 = Integer.parseInt((String) persona2[0].toString());
                        validado = true;
                        break;
                    }
                }

            } catch (Exception e) {
            }

            if (validado == true) {
                if (convertido > sustraido) {
                    int resultado = convertido - sustraido;
                    s1=resultado;
                    
                    String record = persona[4].toString();
                    String mensa = "Envio de " + sustraido + " para "+persona2[1].toString();
                    if (persona[4] == null || persona[4].toString() == "") {
                        record = "";
                    }
                    String historial = record + "-" + mensa;
                    h1 = historial;
                    
                    String d1 = String.valueOf(s1);
                    String d2 = h1;

                    String sql2 = "update registros set saldo='" + d1 + "', historialBancario='" + d2 + "' where id=" + id;

                    try {
                        cn = con.ComprobarConexion();
                        st = cn.createStatement();
                        st.executeUpdate(sql2);
                    } catch (Exception e) {
                    }
                    
                    String ext2 = persona2[2].toString();
                    int conv2 = Integer.parseInt(ext2);
                    int result2 = conv2+resultado;
                    s2=result2;
                    
                    String record2 = persona2[4].toString();
                    String mensa2 = "Entrega de " + sustraido + " por parte de "+persona[1].toString();
                    if (persona2[4] == null || persona2[4].toString() == "") {
                        record2 = "";
                    }
                    String historial2 = record2 + "-" + mensa2;
                    h2 = historial2;

                    String d3 = String.valueOf(s2);
                    String d4 = h2;

                    String sql3 = "update registros set saldo='" + d3 + "', historialBancario='" + d4 + "' where id=" + id2;

                    try {
                        cn = con.ComprobarConexion();
                        st = cn.createStatement();
                        st.executeUpdate(sql3);
                    } catch (Exception e) {
                    }
                    
                    impresion.setText("" + msg3[2] + s1);
                    impresion.setText("" + impresion.getText() + "\nUsuario de destino: " + persona2[1].toString());
                    cartera=s1;
                    
                    vistas.setSelectedIndex(5);
                    destinario.setText("");
                    cantidad.setText("0");
                    password1.setText("password");
                } else if (convertido < sustraido) {
                    impresion.setText("" + msg3[3] + persona[2].toString());
                    impresion.setText("" + impresion.getText() + "\nUsuario de destino: " + persona2[1].toString());
                    cartera=Integer.parseInt((String) persona[2].toString());
                    
                    vistas.setSelectedIndex(5);
                    destinario.setText("");
                    cantidad.setText("0");
                    password1.setText("password");
                }
            } else if (validado == false) {
                JOptionPane.showMessageDialog(null, "Usuario de destino no encontrado o contraseña incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton aceptar2;
    private javax.swing.JButton aceptar3;
    private javax.swing.JButton cambiar;
    private javax.swing.JButton cancelar1;
    private javax.swing.JButton cancelar2;
    private javax.swing.JButton cancelar3;
    private javax.swing.JButton cancelar4;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton cien;
    private javax.swing.JButton cincuenta;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField destinario;
    private javax.swing.JButton diez;
    private javax.swing.JButton doscientos;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton help1;
    private javax.swing.JButton help2;
    private javax.swing.JButton help3;
    private javax.swing.JButton help4;
    private javax.swing.JButton help5;
    private javax.swing.JButton help6;
    private javax.swing.JButton help7;
    private javax.swing.JButton helpMinistrador;
    private javax.swing.JTextArea historialBancario;
    private javax.swing.JTextArea impresion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logo3;
    private javax.swing.JLabel logo4;
    private javax.swing.JLabel logo5;
    private javax.swing.JLabel logo6;
    private javax.swing.JButton millon;
    private javax.swing.JLabel movimientos;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JLabel passIcon;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JPasswordField password3;
    private javax.swing.JButton registrar;
    private javax.swing.JButton retirar;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextField saldo1;
    private javax.swing.JTextField saldo2;
    private javax.swing.JTextField saldo3;
    private javax.swing.JButton salir;
    private javax.swing.JButton salir2;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel textSaldo;
    private javax.swing.JButton transferir;
    private javax.swing.JButton treinta;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuario2;
    private javax.swing.JPanel v1;
    private javax.swing.JPanel v2;
    private javax.swing.JPanel v3;
    private javax.swing.JPanel v4;
    private javax.swing.JPanel v5;
    private javax.swing.JPanel v6;
    private javax.swing.JPanel v7;
    private javax.swing.JTextField valor;
    private javax.swing.JButton valorIngresado;
    private javax.swing.JButton veinte;
    private javax.swing.JTabbedPane vistas;
    private javax.swing.JButton volver;
    private javax.swing.JLabel wallpaper;
    private javax.swing.JLabel wallpaper1;
    private javax.swing.JLabel wallpaper2;
    private javax.swing.JLabel wallpaper3;
    private javax.swing.JLabel wallpaper4;
    private javax.swing.JLabel wallpaper5;
    private javax.swing.JLabel wallpaper6;
    // End of variables declaration//GEN-END:variables
}
