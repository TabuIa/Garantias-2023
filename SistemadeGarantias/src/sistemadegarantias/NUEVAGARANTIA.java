
package sistemadegarantias;

 
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import static sistemadegarantias.Configuracionserver.IPSUCURSAL;
import static sistemadegarantias.Configuracionserver.NOMBRESUCURSAL;
import static sistemadegarantias.Configuracionserver.SUCURSAL;
import static sistemadegarantias.Configuracionserver.TELEFONOSUCURSAL;
 
public class NUEVAGARANTIA extends javax.swing.JFrame {

    Statement st;
    ResultSet rs;
    DefaultTableModel md;
    PreparedStatement ps = null;

    GregorianCalendar gg = new GregorianCalendar();
    SimpleDateFormat dd = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat ddd = new SimpleDateFormat("HH:mm");

    public NUEVAGARANTIA() {

        initComponents();
         tblCH.getTableHeader().setReorderingAllowed(false);
        
        setIconImage(new ImageIcon(getClass().getResource("/RECURSOS/logo.png")).getImage());
        String data[][] = {};
        String cabeza[] = {"CAJA", "FOLIO", "CODIGO", "PRECIO", "ARTICULO", "NOMBRE CAJERO"};

        md = new DefaultTableModel(data, cabeza) {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column != 6) {
                    return false;
                } else {
                    return true;
                }
            }
        };
        tblCH.setModel(md);
        JTableHeader th;
        th = tblCH.getTableHeader();
        th.setFont(new java.awt.Font("Italic", 0, 14));

        //Centrar el encabezado de la tabla
        TableCellRenderer rendererFromHeader = tblCH.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);

        tblCH.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        tblCH.getColumnModel().getColumn(0).setPreferredWidth(50); //CAJA
        tblCH.getColumnModel().getColumn(0).setMaxWidth(140);
        tblCH.getColumnModel().getColumn(0).setMinWidth(50);

        tblCH.getColumnModel().getColumn(1).setPreferredWidth(60); //FOLIO
        tblCH.getColumnModel().getColumn(1).setMaxWidth(100);
        tblCH.getColumnModel().getColumn(1).setMinWidth(60);

        tblCH.getColumnModel().getColumn(2).setPreferredWidth(120); //COD
        tblCH.getColumnModel().getColumn(2).setMaxWidth(250);
        tblCH.getColumnModel().getColumn(2).setMinWidth(120);

        tblCH.getColumnModel().getColumn(3).setPreferredWidth(80); //PRECIO
        tblCH.getColumnModel().getColumn(3).setMaxWidth(250);
        tblCH.getColumnModel().getColumn(3).setMinWidth(80);

        tblCH.getColumnModel().getColumn(4).setPreferredWidth(300); //ARTIVULO
        tblCH.getColumnModel().getColumn(4).setMaxWidth(500);
        tblCH.getColumnModel().getColumn(4).setMinWidth(300);

        tblCH.getColumnModel().getColumn(5).setPreferredWidth(220); //NOMNBRE DE CAJE
        tblCH.getColumnModel().getColumn(5).setMaxWidth(250);
        tblCH.getColumnModel().getColumn(5).setMinWidth(220);

        BTNGENERAR.setEnabled(false);
        ///************ESCALABLIDAD DE ICONO DE IMAGEN EN BOGTONO O LABEL
        /*
       /*ImageIcon imgIcon = new ImageIcon(getClass().getResource("/RECURSOS/Left.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(BTNATRAS.getWidth(),
        BTNATRAS.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        BTNATRAS.setIcon(iconoEscalado);*/
        ///************ESCALABLIDAD DE ICONO DE IMAGEN EN BOGTONO O LABEL ---AQUI TERMINA

        GregorianCalendar gg = new GregorianCalendar();
        SimpleDateFormat dd = new SimpleDateFormat("yyyy/MM/dd");
        String fechadisplay = dd.format(gg.getTime());
        LBLFECHA.setText(fechadisplay);   
        
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JTCORREO = new javax.swing.JTextField();
        LBLFECHA = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BTNGENERAR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTNOMBRE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCH = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        JTFOLIO = new com.toedter.components.JSpinField();
        jLabel8 = new javax.swing.JLabel();
        CBCAJA = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        JCEL = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        FONDOPANEL = new javax.swing.JLabel();
        BTNATRAS = new javax.swing.JButton();
        IMAGENFONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GENERAR GARANTIA - SOUNDS");
        setBackground(new java.awt.Color(51, 102, 255));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GENERAR GARANTIA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 530, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTCORREO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTCORREOKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTCORREOKeyTyped(evt);
            }
        });
        jPanel1.add(JTCORREO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 300, 30));

        LBLFECHA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBLFECHA.setForeground(new java.awt.Color(255, 255, 255));
        LBLFECHA.setText("SIN OBTENER");
        jPanel1.add(LBLFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 90, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CORREO ELECTRONICO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 170, 30));

        BTNGENERAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNGENERAR.setForeground(new java.awt.Color(0, 153, 0));
        BTNGENERAR.setText("GENERAR");
        BTNGENERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGENERARActionPerformed(evt);
            }
        });
        jPanel1.add(BTNGENERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 170, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CAJA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 50, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 20, 30));

        JTNOMBRE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTNOMBREKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTNOMBREKeyTyped(evt);
            }
        });
        jPanel1.add(JTNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 300, 30));

        tblCH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ERROR", "ERROR", "ERROR", "ERROR", "ERROR"
            }
        ));
        tblCH.setRowHeight(50);
        jScrollPane1.setViewportView(tblCH);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 810, 170));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOMBRE DE CLIENTE:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 20, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 20, 40));

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton1.setText("BUSCAR");
        jToggleButton1.setBorder(null);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCAR(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 110, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FECHA:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 50, 40));
        jPanel1.add(JTFOLIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FOLIO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        CBCAJA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        CBCAJA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCAJAActionPerformed(evt);
            }
        });
        jPanel1.add(CBCAJA, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 110, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TELEFONO/CEL:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 110, 30));

        JCEL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JCELKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JCELKeyTyped(evt);
            }
        });
        jPanel1.add(JCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 300, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 20, 30));

        FONDOPANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/TP3.jpg"))); // NOI18N
        FONDOPANEL.setText("jLabel2");
        jPanel1.add(FONDOPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 840, 400));

        BTNATRAS.setForeground(new java.awt.Color(240, 240, 240));
        BTNATRAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/Left.png"))); // NOI18N
        BTNATRAS.setOpaque(false);
        BTNATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNATRASActionPerformed(evt);
            }
        });
        getContentPane().add(BTNATRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 60));

        IMAGENFONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/TP3.jpg"))); // NOI18N
        IMAGENFONDO.setText("jLabel2");
        getContentPane().add(IMAGENFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTCORREOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTCORREOKeyTyped
  if (JTCORREO.getText().length() == 50) {
            JOptionPane.showMessageDialog(null, "Solo se admiten 50 caracteres para el correo del cliente", "Alerta", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_JTCORREOKeyTyped

    private void JTNOMBREKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTNOMBREKeyTyped
  if (JTNOMBRE.getText().length() == 35) {
            JOptionPane.showMessageDialog(null, "Solo se admiten 35 caracteres para el nombre del cliente ", "Alerta", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }      
  
   
  
  
  
  
    }//GEN-LAST:event_JTNOMBREKeyTyped

    private void BTNGENERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGENERARActionPerformed
        int filaseleccionada = tblCH.getSelectedRow();
        ///////////////////////////////////////////////////////////////////
        if (filaseleccionada >= 0) {
            Object itemcodigo = (tblCH.getValueAt(filaseleccionada, 2));//caja
            String vcodigo = "";
            vcodigo = itemcodigo.toString();
            if (vcodigo.contains("(LIQ_APAR)")) {
                imprimegarantiaporliquidacion();
            } else {
                imprimegarantia();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna fila o la tabla está vacía");
        }
    }//GEN-LAST:event_BTNGENERARActionPerformed
    private void BTNATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNATRASActionPerformed
        MENU M = new MENU();
        M.setVisible(true);
       
        this.dispose();
    }//GEN-LAST:event_BTNATRASActionPerformed

    private void BTNBUSCAR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCAR
        int folio = JTFOLIO.getValue();
        String caja = CBCAJA.getSelectedItem().toString();
        String pruebafecha = LBLFECHA.getText();

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://" + IPSUCURSAL + "", "usounds", "madljda");
            st = conexion.createStatement();
            st.executeUpdate("use CML");
            //  JOptionPane.showMessageDialog(rootPane, "PRUEBA FECHA"+pruebafecha);
            //Seleccionar datos      rs = st.executeQuery("select caja,folio,codigo,precioventaneto ,(select descripcion from codigos where codigo=ventas.codigo)as descrip,(select nombrec from empleados where empleado=ventas.cajero)as cajero from ventas where fecha='"+pruebafecha+"' and sucursal='"+SUCURSAL+"' and folio='" + folio + "' and caja='" + caja + "'; ");

            rs = st.executeQuery("select caja,folio,codigo,precioventaneto ,(select descripcion from codigos where codigo=ventas.codigo)as descrip,(select nombrec from empleados where empleado=ventas.cajero)as cajero from ventas where fecha='"+pruebafecha+"' and sucursal='" + SUCURSAL + "' and folio='" + folio + "' and caja='" + caja + "'; ");
            md = (DefaultTableModel) tblCH.getModel();
            md.setRowCount(0);
            try {

                while (rs.next()) {
                    Object[] fila = {rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6)};
                    md.addRow(fila);
                }
                int CONT = md.getRowCount();
                if (CONT == 0) {
                    JOptionPane.showMessageDialog(null, "No se encontraron elementos");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NUEVAGARANTIA.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BTNBUSCAR

    private void CBCAJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCAJAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCAJAActionPerformed

    private void JTNOMBREKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTNOMBREKeyReleased
       String jc = JTCORREO.getText();
        BTNGENERAR.setEnabled(
                jc.length() != 0
        );
    }//GEN-LAST:event_JTNOMBREKeyReleased

    private void JTCORREOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTCORREOKeyReleased
       String jn = JTNOMBRE.getText().toUpperCase();
        BTNGENERAR.setEnabled(
                jn.length() != 0
        );
    }//GEN-LAST:event_JTCORREOKeyReleased

    private void JCELKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCELKeyReleased
        String jc = JCEL.getText();
        BTNGENERAR.setEnabled(
                jc.length() != 0
        );
    }//GEN-LAST:event_JCELKeyReleased

    private void JCELKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JCELKeyTyped
       if (JCEL.getText().length() == 30) {
            JOptionPane.showMessageDialog(null, "Solo se admiten 30 caracteres para el campo de celular verifique que no tengas espacios", "Alerta", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
            char car = evt.getKeyChar();
        if((car<'0' || car>'9') ) evt.consume();
        
    }//GEN-LAST:event_JCELKeyTyped

    public void imprimegarantiaporliquidacion() {

        int filaseleccionada = tblCH.getSelectedRow();

        //APARTADOS CONDICION
        //System.out.println("Tiene coicidencias "+vcodigo);
        //String vcodigolimpio = vcodigo.replaceAll("[^0-1-2-3-4-5-6-7-8-9]", "");
        // System.out.println("FINAL  "+vcodigolimpio); 
        ////////*********************************************************************************
        ////////////////////////////////FUNCION COMPARACION DE RESULTSET RS2 QUERY BUSQUEDSA POR APARTADO         
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://" + IPSUCURSAL + "", "usounds", "madljda");
            st = conexion.createStatement();
            st.executeUpdate("use CML");
            Object itemcajero = "";
            String vcaja = "";
            String vfolio = "";
            String pruebafecha = LBLFECHA.getText();
            Object itemcaja = (tblCH.getValueAt(filaseleccionada, 0));//caja
            vcaja = itemcaja.toString();
            Object itemfolio = (tblCH.getValueAt(filaseleccionada, 1));//caja
            vfolio = itemfolio.toString();
            itemcajero = (tblCH.getValueAt(filaseleccionada, 5));//codigo

            rs = st.executeQuery("select apa.codigo,(select descripcion from codigos where codigo=apa.codigo)as descgenero,\n"
                    + "                  cg.garantia,cg.dias,apa.cantidad,apa.precioventa,cg.genero\n"
                    + " from ventas v, apartadosdetalle apa,codigosgarantias cg\n"
                    + " where  SubString(v.Codigo, 1,10)=apa.apartado and apa.codigo=cg.codigo and v.fecha ='" + pruebafecha + "' "
                    + "and v.codigo not in (select codigo from codigos) and v.ClaveVenta in ('LB','LI','LN')\n"
                    + "                  and V.caja='" + vcaja + "' and V.folio='" + vfolio + "' and V.sucursal='" + SUCURSAL + "'");

            /*          rs = st.executeQuery("select v.codigo,(select descripcion from codigos where codigo=cg.codigo)as descgenero, cg.garantia,cg.dias, v.cantidad,left(sum(cantidad*precioventaneto),6)as precio\n" +
             " from ventas v, codigosgarantias cg where v.codigo=cg.codigo and v.fecha='"+pruebafecha+"' and v.caja='"+vcaja+"' and v.folio='"+vfolio+"' and v.sucursal='"+SUCURSAL+"'\n" +
                 " group by v.codigo,cg.codigo,cg.garantia,v.cantidad,cg.dias");
                 */
                md = (DefaultTableModel) tblCH.getModel();
                md.setRowCount(0);
                try {

                   
                    String Header = "***************************************\n;"
                            + "***************GARANTIAS**************\n;"
                            + "******SUCURSAL: " + NOMBRESUCURSAL + "***************\n;"
                            + "*********TEL: " + TELEFONOSUCURSAL + "***********\n;"
                            + "                                        \n;"
                            + "Fecha:" + dd.format(gg.getTime()) + "      Hora:" + ddd.format(gg.getTime()) + "\n;"
                            + "Folio: " + vfolio + "             Caja: " + vcaja + "    \n;"
                            + "                                         \n;"
                            + "Pzas " + "Codigo" + "      Garantia " + "Precio" + "\n;"
                            + "     Descripcion     Dias        " + "\n;"
                            + "--------------------------------------\n;";

                    String a = "";
                    String b = "";
                    while (rs.next()) {
                        /// a += rs.getString(1) + "" + rs.getString(4) + "" + rs.getInt(5) +" " + rs.getString(3)+ "\n;";
                        a += rs.getString(5).trim() + "    " + rs.getString(1).trim() + "          " + rs.getString(4).trim() + " $" + rs.getString(6).trim() + "\n;"
                            + "     " + rs.getString(2).trim() + "\n;";
                             b += rs.getString(7).trim()+"";
                   ///     System.out.println( rs.getString(7) + " "+ rs.getString(1) + " "  + rs.getString(4) +" $" + rs.getString(6));
                    }
                    String capricho="";
                        if (b.contains("154")){
                          //  System.out.println("lleva bafle");
                             capricho
                                    = "2 Meses de Garantia solo por defectos\n;"
                                    + "de fabrica,15 dias de garantia en los \n;"
                                    + "accesorios que contiene (tripie sin \n;"
                                    + "garantia) \n;"
                                    + "Si requiere asistencia tecnica o\n;"
                                    + "garantias debe acudir directamente\n;"
                                    + "a nuestro taller de servicio ubicado \n;"
                                    + "en Av. Antonio J.Bermudez #1550 entre\n;"
                                    + "Av.Tomas Fernandez calle ohm,Parque\n;"
                                    + "industrial Antonio J.Bermudez,horario\n;"
                                    + "de Lunes a Viernes de 9:00 am a 1:30 pm \n;"
                                    + "de 3:00 a 5:00 pm,Sabados de 9:00 am \n:"
                                    + "a 12:30 pm, hacer previa cita al;"
                                    + "telefono 616-1194, extension 0 \n;"
                                   ;
                        } else {
                         ////   System.out.println(" NO LLEVA BAFLE");
                    }
                  //  System.out.println(capricho + "" + b + "<><><><>");

                    String h = Header + a;
                    String amt
                            = "\n;-----------------------------------\n;"
                            + "--------------------------------------\n;"
                            + "NOTA;EL CLIENTE ESTA DE ACUERDO EN QUE\n;"
                            + "LA MERCANCIA SE LE ENTREGO CON SUS\n;"
                            + "EMPAQUES ORIGINALES, PROTECTORES  \n;"
                            + "INSTRUCTIVOS Y ACCESORIOS QUE     \n;"
                            + "CONTIENE DE FABRICA AL HACER SU   \n;"
                            + "COMPRA, SE ACEPTA QUE LOS EQUIPOS \n;"
                            + "FUERON PROBADOS EN PRESENCIA DEL  \n;"
                            + "CLIENTE SU TICKET ES SU GARANTIA  \n;"
                            + "**********************************\n;"
                            + "Esta Garantia aplica Solamente    \n;"
                            + "en productos comprados en Sounds  \n;"
                            + "Quien garantiza el funcionamiento \n;"
                            + "del equipo por el periodo señalado\n;"
                            + "y bajo las condiciones que estipula\n;"
                            + "el manual o instructivo del equipo\n;"
                            + "de los accesorios adquiridos      \n;"
                            + "--------------------------------------\n;"
                            + "           CONDICIONES            \n;"
                            + "--------------------------------------\n;"
                            + "1.-En todo caso el cliente debe   \n;"
                            + "presentar la mercancia con el ticket\n;"
                            + "de compra y empaques en buen estado \n;"
                            + "2.-En caso de que el articulo tenga\n;"
                            + "poliza de proveedor,Casa de musica \n;"
                            + "solo dara el servicio intermediario\n;"
                            + "entre cliente y el taller autorizado\n;"
                            + "3.-En cualquier caso,al cliente se le\n;"
                            + "dara respuesta tanto del diagnostico\n;"
                            + "como de la reparacion en un lapso \n;"
                            + "no mayor a 30 dias                \n;"
                            + "4.-La garantia no aplica en los   \n;"
                            + "articulos dañados por mal manejo  \n;"
                            + "del cliente,negligencia en el uso del \n;"
                            + "articulo,mala instalacion electrica\n;"
                            + "contingencias climaticas golpes,caidas\n;"
                            + "polvo, agua y plagas                \n;"
                            + "5.-Si requiere asistencia técnica o \n;"
                            + "garantías de aparatos con garantía \n;"
                            + "Sounds y para una respuesta más \n;"
                            + "rápida, debe acudir directamente \n;"
                            + "a nuestro taller de servicio \n;"
                            + "ubicado en Av. Antonio J. Bermúdez \n;"
                            + "1550 entre Av. Tomás Fernández \n;"
                            + "y calle Ohm, Parque industrial \n;"
                            + "Antonio J. Bermúdez, en un horario \n;"
                            + "de Lunes a Viernes de 9am a 1:30pm \n;"
                            + "y de 3:00pm a 5:00pm, Sábados y \n;"
                            + "Domingos cerrado, hacer cita \n;"
                            + "previa al Tel 6161194 ext. 0, \n;"
                            + "también puede acudir directamente \n;"
                            + "a la sucursal donde le darán un \n;"
                            + "tiempo de respuesta no mayor a 15 \n;"
                            + "días hábiles. \n;"
                            + "--------------------------------------\n;"
                            /*+ "5.-En el caso de este producto        \n;"
                             + "Casa de Musica  de Luxe S.A. de C.V.  \n;"
                             + "le enviara a su correo electronico    \n;"
                             + "un manual de recomendaciones  para el \n;"
                             + "manejo de su equipo           \n;"
                             + "es importante que lo lea a detalle    \n;"
                             + "ya que es causa de anulacion          \n;"
                             + "de la garantia, el no seguir con estas\n;"
                             + "recomendaciones     \n;"*/
                            + "ATENDIDO POR:" + itemcajero.toString().toUpperCase() + "\n;"
                            + "NOMBRE DE CLIENTE:" + JTNOMBRE.getText().toUpperCase() + "\n;"
                            + "EMAIL:" + JTCORREO.getText() + "\n;"
                            + "FIRMA:______________________________  \n;"
                            + "Recuerde que puede consultar nuestro  \n;"
                            + "aviso de privacidad en WWW.SOUNDS.MX  \n;"
                            + "--------------------------------------\n;"
                            + "15 DIAS DE GARANTIA EN ACCESORIOS, \n;"
                            + "PRESENTANDO TICKET Y EMPAQUES \n;"
                            + "EN BUEN ESTADO”, para conocer \n;"
                            + "políticas de garantías de todos \n;"
                            + "nuestros productos visite \n;"
                            + "sounds.mx/garantías-y-devoluciones.\n;";
                    String zbill = h + amt + capricho;
                    FORMATOCELDAS p = new FORMATOCELDAS();
                    FORMATOCELDAS.printCard(zbill);//impresion #1 
                    FORMATOCELDAS.printCard(zbill);//impresion #2

                    ///******FUNCION INGRESAR DATOS A BD
                        try {
                            //Conexión a la BD   
                            Class.forName("net.sourceforge.jtds.jdbc.Driver");
                            Statement st = conexion.createStatement();
                            st.executeUpdate("USE CML;");

                            ps = conexion.prepareStatement("update top (1) ventaspagos set nombrecliente='" + JTNOMBRE.getText().toUpperCase() + "',telefonocliente='" + JCEL.getText() + "',correocliente='" + JTCORREO.getText() + "'\n"
                                    + "where fecha='" + pruebafecha + "' and sucursal='" + SUCURSAL + "' and caja='" + vcaja + "' and folio='" + vfolio + "' and clavepago<>99");
                            int n = ps.executeUpdate();///RPEUBAFECHAWEEE

                            if (n > 0) {
                                JOptionPane.showMessageDialog(null, "SE HA GENERADO CORRECTAMENTE LA GARANTIA CON NOMBRE DE:  " + JTNOMBRE.getText().toUpperCase());
                                JTCORREO.setText("");
                                JCEL.setText("");
                                JTNOMBRE.setText("");
                            }

                        } catch (HeadlessException | SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, "Error en la base de datos,guarde el folio y en caso de ser necesario reportar a sistemas ext:235");
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(NUEVAGARANTIA.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        ////////////*****         
                        ////////////*****         
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                        JOptionPane.showMessageDialog(this, "Falla al conectar internet/Base de datos, anote el numero de folio y reportelo a la extension #235 con SISTEMAS ");
                    }
                } catch (HeadlessException | NumberFormatException | SQLException e) {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
                    JOptionPane.showMessageDialog(null, "Error revise su conexion de base de datos");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NUEVAGARANTIA.class.getName()).log(Level.SEVERE, null, ex);
                }
           
    }
    
    public void imprimegarantia(){
      ////////////////////////////////FUNCION COMPARACION DE RESULTSET RS2 QUERY BUSQUEDSA POR APARTADO      
          int filaseleccionada = tblCH.getSelectedRow();

                try {
                    Class.forName("net.sourceforge.jtds.jdbc.Driver");
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://" + IPSUCURSAL + "", "usounds", "madljda");
                    st = conexion.createStatement();
                    st.executeUpdate("use CML");
                    Object itemcajero = "";
                    String vcaja = "";
                    String vfolio = "";
                    String pruebafecha = LBLFECHA.getText();
                    Object itemcaja = (tblCH.getValueAt(filaseleccionada, 0));//caja
                    vcaja = itemcaja.toString();
                    Object itemfolio = (tblCH.getValueAt(filaseleccionada, 1));//caja
                    vfolio = itemfolio.toString();
                    itemcajero = (tblCH.getValueAt(filaseleccionada, 5));//codigo
                    rs = st.executeQuery("select v.codigo,(select descripcion from codigos where codigo=cg.codigo)as descgenero, cg.garantia,cg.dias, v.cantidad,left(sum(cantidad*precioventaneto),6)as precio, (select genero from codigos where codigo=cg.codigo)as  genero \n"
                            + " from ventas v, codigosgarantias cg where v.codigo=cg.codigo and v.fecha='" + pruebafecha + "' and v.caja='" + vcaja + "' and v.folio='" + vfolio + "' and v.sucursal='" + SUCURSAL + "'\n"
                            + " group by v.codigo,cg.codigo,cg.garantia,v.cantidad,cg.dias");

                    md = (DefaultTableModel) tblCH.getModel();
                    md.setRowCount(0);
                    try {
                        String Header = "**************************************\n;"
                                + "***************GARANTIAS*************\n;"
                                + "******SUCURSAL: " + NOMBRESUCURSAL + "**************\n;"
                                + "*********TEL: " + TELEFONOSUCURSAL + "***********\n;"
                                + "                                        \n;"
                                + "Fecha:" + dd.format(gg.getTime()) + "      Hora:" + ddd.format(gg.getTime()) + "\n;"
                                + "Folio: " + vfolio + "              Caja: " + vcaja + "    \n;"
                                + "                                         \n;"
                                + "Pzas " + "Codigo" + "      Garantia " + "Precio" + "\n;"
                                + "     Descripcion     Dias        " + "\n;"
                                + "--------------------------------------\n;";

                        String a = "";
                        String b = "";
                
                        while (rs.next()) {
                          //  System.out.println(rs.getString(6)+"-"+rs.getString(1)+rs.getString(6)+""+rs.getString(7)+"");
                            a += rs.getString(5).trim() + "    " + rs.getString(1).trim() + "          " + rs.getString(4).trim() + " $" + rs.getString(6).trim() + "\n;"
                            + "     " + rs.getString(2).trim() + "\n;";
                            b += rs.getString(7).trim()+"";

                       
                          ///  System.out.println( rs.getString(7) + " "+ rs.getString(1) + " "  + rs.getString(4) +" $" + rs.getString(6));
                        }
                         String capricho="";
                        if (b.contains("154")){
                          ///  System.out.println("lleva bafle");
                              capricho
                                    = "2 Meses de Garantia solo por defectos\n;"
                                    + "de fabrica,15 dias de garantia en los \n;"
                                    + "accesorios que contiene (tripie sin \n;"
                                    + "garantia) \n;"
                                    + "Si requiere asistencia tecnica o\n;"
                                    + "garantias debe acudir directamente\n;"
                                    + "a nuestro taller de servicio ubicado \n;"
                                    + "en Av. Antonio J.Bermudez #1550 entre\n;"
                                    + "Av.Tomas Fernandez calle ohm,Parque\n;"
                                    + "industrial Antonio J.Bermudez,horario\n;"
                                    + "de Lunes a Viernes de 9:00 am a 1:30 pm \n;"
                                    + "de 3:00 a 5:00 pm,Sabados de 9:00 am \n:"
                                    + "a 12:30 pm, hacer previa cita al;"
                                    + "telefono 616-1194, extension 0 \n;";
                        } else {
                        ///    System.out.println(" NO LLEVA BAFLE");
                        }
                           ///  System.out.println(capricho+""+b+"<><><><>");
                            
                        String h = Header + a;
                        String amt
                                = "\n;----------------------------------------\n;"
                                + "--------------------------------------\n;"
                                + "NOTA;EL CLIENTE ESTA DE ACUERDO EN QUE\n;"
                                + "LA MERCANCIA SE LE ENTREGO CON SUS\n;"
                                + "EMPAQUES ORIGINALES, PROTECTORES  \n;"
                                + "INSTRUCTIVOS Y ACCESORIOS QUE     \n;"
                                + "CONTIENE DE FABRICA AL HACER SU   \n;"
                                + "COMPRA, SE ACEPTA QUE LOS EQUIPOS \n;"
                                + "FUERON PROBADOS EN PRESENCIA DEL  \n;"
                                + "CLIENTE SU TICKET ES SU GARANTIA  \n;"
                                + "**********************************\n;"
                                + "Esta Garantia aplica Solamente    \n;"
                                + "en productos comprados en Sounds  \n;"
                                + "Quien garantiza el funcionamiento \n;"
                                + "del equipo por el periodo señalado\n;"
                                + "y bajo las condiciones que estipula\n;"
                                + "el manual o instructivo del equipo\n;"
                                + "de los accesorios adquiridos      \n;"
                                + "--------------------------------------\n;"
                                + "           CONDICIONES            \n;"
                                + "--------------------------------------\n;"
                                + "1.-En todo caso el cliente debe   \n;"
                                + "presentar la mercancia con el ticket\n;"
                                + "de compra y empaques en buen estado \n;"
                                + "2.-En caso de que el articulo tenga\n;"
                                + "poliza de proveedor,Casa de musica \n;"
                                + "solo dara el servicio intermediario\n;"
                                + "entre cliente y el taller autorizado\n;"
                                + "3.-En cualquier caso,al cliente se le\n;"
                                + "dara respuesta tanto del diagnostico\n;"
                                + "como de la reparacion en un lapso \n;"
                                + "no mayor a 30 dias                \n;"
                                + "4.-La garantia no aplica en los   \n;"
                                + "articulos dañados por mal manejo  \n;"
                                + "del cliente,negligencia en el uso del \n;"
                                + "articulo,mala instalacion electrica\n;"
                                + "contingencias climaticas golpes,caidas\n;"
                                + "polvo, agua y plagas                \n;"
                                + "5.-Si requiere asistencia técnica o \n;"
                                + "garantías de aparatos con garantía \n;"
                                + "Sounds y para una respuesta más \n;"
                                + "rápida, debe acudir directamente \n;"
                                + "a nuestro taller de servicio \n;"
                                + "ubicado en Av. Antonio J. Bermúdez \n;"
                                + "1550 entre Av. Tomás Fernández \n;"
                                + "y calle Ohm, Parque industrial \n;"
                                + "Antonio J. Bermúdez, en un horario \n;"
                                + "de Lunes a Viernes de 9am a 1:30pm \n;"
                                + "y de 3:00pm a 5:00pm, Sábados y \n;"
                                + "Domingos cerrado, hacer cita \n;"
                                + "previa al Tel 6161194 ext. 0, \n;"
                                + "también puede acudir directamente \n;"
                                + "a la sucursal donde le darán un \n;"
                                + "tiempo de respuesta no mayor a 15 \n;"
                                + "días hábiles. \n;"
                                + "--------------------------------------\n;"
                                /*+ "5.-En el caso de este producto        \n;"
                                 + "Casa de Musica  de Luxe S.A. de C.V.  \n;"
                                 + "le enviara a su correo electronico    \n;"
                                 + "un manual de recomendaciones  para el \n;"
                                 + "manejo de su equipo           \n;"
                                 + "es importante que lo lea a detalle    \n;"
                                 + "ya que es causa de anulacion          \n;"
                                 + "de la garantia, el no seguir con estas\n;"
                                 + "recomendaciones     \n;"*/
                                + "ATENDIDO POR:" + itemcajero.toString().toUpperCase() + "\n;"
                                + "NOMBRE DE CLIENTE:" + JTNOMBRE.getText().toUpperCase() + "\n;"
                                + "EMAIL:" + JTCORREO.getText() + "\n;"
                                + "FIRMA:______________________________  \n;"
                                + "Recuerde que puede consultar nuestro  \n;"
                                + "aviso de privacidad en WWW.SOUNDS.MX  \n;"
                                + "--------------------------------------\n;"
                                + "15 DIAS DE GARANTIA EN ACCESORIOS, \n;"
                                + "PRESENTANDO TICKET Y EMPAQUES \n;"
                                + "EN BUEN ESTADO”, para conocer \n;"
                                + "políticas de garantías de todos \n;"
                                + "nuestros productos visite \n;"
                                + "sounds.mx/garantías-y-devoluciones.\n;";
                        String zbill = h + amt+ capricho;
                        FORMATOCELDAS p = new FORMATOCELDAS();
                        FORMATOCELDAS.printCard(zbill);//impresion #1 
                        FORMATOCELDAS.printCard(zbill);//impresion #2
                        ///******FUNCION INGRESAR DATOS A BD
                        try {
                            //Conexión a la BD   
                            Class.forName("net.sourceforge.jtds.jdbc.Driver");
                            Statement st = conexion.createStatement();
                            st.executeUpdate("USE CML;");

                            ps = conexion.prepareStatement("update top (1) ventaspagos set nombrecliente='" + JTNOMBRE.getText().toUpperCase() + "',telefonocliente='" + JCEL.getText() + "',correocliente='" + JTCORREO.getText() + "'\n"
                                    + "where fecha='" + pruebafecha + "' and sucursal='" + SUCURSAL + "' and caja='" + vcaja + "' and folio='" + vfolio + "' and clavepago<>99");
                            int n = ps.executeUpdate();

                            if (n > 0) {
                                JOptionPane.showMessageDialog(null, "SE HA GENERADO CORRECTAMENTE LA GARANTIA CON NOMBRE DE:  " + JTNOMBRE.getText().toUpperCase());
                                JTCORREO.setText("");
                                JCEL.setText("");
                                JTNOMBRE.setText("");
                            }

                        } catch (HeadlessException | SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, "Error en la base de datos,guarde el folio y en caso de ser necesario reportar a sistemas ext:235");
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(NUEVAGARANTIA.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        ////////////*****         
                        ////////////*****         
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                        JOptionPane.showMessageDialog(this, "Falla al conectar internet/Base de datos, anote el numero de folio y reportelo a la extension #235 con SISTEMAS ");

                    }
                } catch (HeadlessException | NumberFormatException | SQLException e) {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
                    JOptionPane.showMessageDialog(null, "Error revise su conexion de base de datos");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NUEVAGARANTIA.class.getName()).log(Level.SEVERE, null, ex);
                }
            
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NUEVAGARANTIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NUEVAGARANTIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NUEVAGARANTIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NUEVAGARANTIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NUEVAGARANTIA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNATRAS;
    private javax.swing.JButton BTNGENERAR;
    private javax.swing.JComboBox CBCAJA;
    private javax.swing.JLabel FONDOPANEL;
    private javax.swing.JLabel IMAGENFONDO;
    private javax.swing.JTextField JCEL;
    private javax.swing.JTextField JTCORREO;
    private com.toedter.components.JSpinField JTFOLIO;
    private javax.swing.JTextField JTNOMBRE;
    private javax.swing.JLabel LBLFECHA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JTable tblCH;
    // End of variables declaration//GEN-END:variables
}
