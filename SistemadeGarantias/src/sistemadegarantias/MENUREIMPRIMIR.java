/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadegarantias;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
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
import static sistemadegarantias.Configuracionserver.IMPRESORA;


/**
 *
 * @author AGONZALEZ
 */
public class MENUREIMPRIMIR extends javax.swing.JFrame {
        Statement st,st2;
        PreparedStatement ps = null;
        ResultSet rs,rs2;
        DefaultTableModel md;
        GregorianCalendar gg = new GregorianCalendar();
        SimpleDateFormat dd = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat ddd = new SimpleDateFormat("HH:mm");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
       

 
    public MENUREIMPRIMIR() {
           initComponents();
            tblCH.getTableHeader().setReorderingAllowed(false);
        
           setIconImage(new ImageIcon(getClass().getResource("/RECURSOS/logo.png")).getImage());
        String data[][]={};
        String cabeza[]={ "CAJA", "FOLIO",  "CODIGO", "PRECIO","ARTICULO","NOMBRE CAJERO"};
        
        md = new DefaultTableModel(data, cabeza){
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column != 6)
                    return false;
                else 
                    return true;
            }
        };
        tblCH.setModel(md);
        JTableHeader th;
        th = tblCH.getTableHeader();
        th.setFont(new java.awt.Font("Italic", 0, 14));
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

        //BTNGENERAR.setEnabled(false);
       
        ///************ESCALABLIDAD DE ICONO DE IMAGEN EN BOGTONO O LABEL
      //  ImageIcon imgIcon = new ImageIcon(getClass().getResource("/RECURSOS/Left.png"));
      //  Image imgEscalada = imgIcon.getImage().getScaledInstance(BTNATRAS.getWidth(),
       //         BTNATRAS.getHeight(), Image.SCALE_SMOOTH);
    //    Icon iconoEscalado = new ImageIcon(imgEscalada);
       // BTNATRAS.setIcon(iconoEscalado);
        ///************ESCALABLIDAD DE ICONO DE IMAGEN EN BOGTONO O LABEL ---AQUI TERMINA


    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JTFECHA = new com.toedter.calendar.JDateChooser();
        BTNGENERAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCH = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTFOLIO = new com.toedter.components.JSpinField();
        jLabel12 = new javax.swing.JLabel();
        CBCAJA = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        BTNBUSCAR = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTNATRAS = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RE IMPRIMIR GARANTIA - SOUNDS");
        setMinimumSize(new java.awt.Dimension(950, 500));
        setPreferredSize(new java.awt.Dimension(860, 510));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FECHA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 50, 40));

        JTFECHA.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(JTFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 130, 40));

        BTNGENERAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNGENERAR.setForeground(new java.awt.Color(0, 153, 0));
        BTNGENERAR.setText("GENERAR");
        BTNGENERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGENERARActionPerformed(evt);
            }
        });
        jPanel1.add(BTNGENERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 150, 60));

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
        jScrollPane1.setViewportView(tblCH);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 840, 240));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 20, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 20, 30));
        jPanel1.add(JTFOLIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("FOLIO:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

        CBCAJA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        CBCAJA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCAJAActionPerformed(evt);
            }
        });
        jPanel1.add(CBCAJA, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 110, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CAJA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 50, 40));

        BTNBUSCAR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNBUSCAR.setText("BUSCAR");
        BTNBUSCAR.setBorder(null);
        BTNBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCARBTNBUSCAR(evt);
            }
        });
        jPanel1.add(BTNBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 130, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/TP3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 900, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 890, 450));

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel1.setText("RE IMPRIMIR GARANTIA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 419, 51));

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RE IMPRIMIR GARANTIA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 530, 50));

        BTNATRAS.setForeground(new java.awt.Color(240, 240, 240));
        BTNATRAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/Left.png"))); // NOI18N
        BTNATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNATRASActionPerformed(evt);
            }
        });
        getContentPane().add(BTNATRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 60));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/TP3.jpg"))); // NOI18N
        FONDO.setText("jLabel4");
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 530));

        getAccessibleContext().setAccessibleName("Reimprimir Garantia");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNATRASActionPerformed
        MENU M = new MENU();
        M.setVisible(true);
      
        dispose();
    }//GEN-LAST:event_BTNATRASActionPerformed

    private void BTNBUSCARBTNBUSCAR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCARBTNBUSCAR
        ///Datos para generar garantia
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String fechaformateada = sdf.format(JTFECHA.getDate());
        int folio = JTFOLIO.getValue();
        String caja = CBCAJA.getSelectedItem().toString();
  
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://"+IPSUCURSAL+"", "usounds", "madljda");
            st = conexion.createStatement();
            st.executeUpdate("use CML");
    //Seleccionar datos
            System.out.println("FECHA FORMATEADA"+fechaformateada+">>>"+JTFECHA.getDate()+"xxxxxx"+sdf);
            // rs = st.executeQuery("select caja,folio,articulo,codigo,precioventa FROM VENTAS WHERE FOLIO='"+folio+"' and FECHA='"+fechaformateada+"' and CAJA='"+caja+"' ;");
            rs = st.executeQuery("select caja,folio,codigo,precioventaneto ,(select descripcion from codigos where codigo=ventas.codigo)as descrip,(select nombrec from empleados where empleado=ventas.cajero)as cajero from ventas where fecha='" + fechaformateada + "' and sucursal='"+SUCURSAL+"' and folio='" + folio + "' and caja='" + caja + "'; ");

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
            Logger.getLogger(MENUREIMPRIMIR.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_BTNBUSCARBTNBUSCAR

    private void CBCAJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCAJAActionPerformed
   
    }//GEN-LAST:event_CBCAJAActionPerformed

    private void BTNGENERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGENERARActionPerformed
         int filaseleccionada = tblCH.getSelectedRow();
          if (filaseleccionada >= 0) {

            int folio = JTFOLIO.getValue();
            String caja = CBCAJA.getSelectedItem().toString();
            Date pruebafecha = JTFECHA.getDate();

            Object itemcodigo = (tblCH.getValueAt(filaseleccionada, 2));//caja
            String vcodigo = "";
            vcodigo = itemcodigo.toString();
            if (vcodigo.contains("(LIQ_APAR)")) {
                reimpresionporloquidacion();
            } else {
                reimpresion();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna fila o la tabla está vacía");
        }

    }//GEN-LAST:event_BTNGENERARActionPerformed

    public void reimpresionporloquidacion() {

        int filaseleccionada = tblCH.getSelectedRow();
        String fechaformateada = sdf.format(JTFECHA.getDate());
        String fechaformateada2 = sdfr.format(JTFECHA.getDate());
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://" + IPSUCURSAL + "", "usounds", "madljda");
            st = conexion.createStatement();
            st.executeUpdate("use CML");
            Object itemcajero = "";
            //Seleccionar datos
                    Object itemcaja = (tblCH.getValueAt(filaseleccionada, 0));//caja
                    String vcaja = itemcaja.toString();
                    Object itemfolio = (tblCH.getValueAt(filaseleccionada, 1));//folio
                    String vfolio = itemfolio.toString();
                    itemcajero = (tblCH.getValueAt(filaseleccionada, 5));//codigo
                    rs = st.executeQuery("select apa.codigo,(select descripcion from codigos where codigo=apa.codigo)as descgenero,cg.garantia,cg.dias,apa.cantidad,apa.precioventa,\n"
                            + "(select nombrec from empleados where empleado=v.cajero) as cajero,vp.nombrecliente,vp.telefonocliente,vp.correocliente,(select genero from codigos where codigo=apa.codigo)as descgenero\n"
                            + "from ventas v, apartadosdetalle apa,codigosgarantias cg, ventaspagos vp\n"
                            + "where  v.fecha=vp.fecha and v.folio=vp.folio and v.caja=vp.caja and v.sucursal=vp.sucursal and SubString(v.Codigo, 1,10)=apa.apartado and apa.codigo=cg.codigo and v.fecha ='" + fechaformateada + "' and v.codigo not in (select codigo from codigos) and v.ClaveVenta IN ('LB','LN','LI')\n"
                            + "and V.caja='" + vcaja + "' and V.folio='" + vfolio + "' and V.sucursal='" + SUCURSAL + "' order by NombreCliente  asc");

                    ////   System.out.println("fechaformateada"+fechaformateada); ES EL BUENO PARA IQUERYS
                    md = (DefaultTableModel) tblCH.getModel();
                    md.setRowCount(0);

                    try {

                        String Header
                                = "***************REIMPRESION***************\n;"
                                + "***************GARANTIAS**************\n;"
                                + "******SUCURSAL: " + NOMBRESUCURSAL + "***********\n;"
                                + "*********TEL: " + TELEFONOSUCURSAL + "***********\n;"
                                + "                                        \n;"
                                + "Fecha:" + fechaformateada2.trim() + "      Hora:" + ddd.format(gg.getTime()) + "\n;"
                                + "Folio: " + vfolio + "              Caja: "+vcaja+"    \n;"
                                + "                                         \n;"
                                + "Pzas " + "Codigo" + "      Garantia " + "Precio" + "\n;"
                                + "     Descripcion     Dias        " + "\n;"
                                + "--------------------------------------\n;";

                        String a = "";
                        String b = "";
                        String CORREORS = "";
                        String NOMBRECLIERS = "";
                        String CAJERORS = "";
                        
                        while (rs.next()) {

                            a += rs.getString(5).trim() + " " + rs.getString(1).trim() + " " + rs.getString(4).trim() + " $" + rs.getString(6).trim() + "\n;"
                                    + " " + rs.getString(2).trim() + "\n;";
                            CORREORS = rs.getString(10)+"";
                            NOMBRECLIERS = rs.getString(8)+"";
                            CAJERORS = rs.getString(7)+"";
                          //  System.out.println("8=========D---"+rs.getString(8)+rs.getString(9)+rs.getString(10));
                            b += rs.getString(11).trim() + "";
                        }
                      
                        String capricho = "";
                        if (b.contains("154")//||b.contains("153")
                                ) {
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
                                    + "telefono 616-1194, extension 0 \n;";
                        } else {
                        ///    System.out.println(" NO LLEVA BAFLE");
                        }
                        String h = Header + a;
                        String amt
                                = "\n;-----------------------------------\n;"
                                + "           NOTA            \n;"
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
                                + "5.-Si requiere asistencia técnica o "
                                + "garantías de aparatos con garantía "
                                + "Sounds y para una respuesta más "
                                + "rápida, debe acudir directamente "
                                + "a nuestro taller de servicio "
                                + "ubicado en Av. Antonio J. Bermúdez "
                                + "1550 entre Av. Tomás Fernández "
                                + "y calle Ohm, Parque industrial "
                                + "Antonio J. Bermúdez, en un horario "
                                + "de Lunes a Viernes de 9am a 1:30pm "
                                + "y de 3:00pm a 5:00pm, Sábados y "
                                + "Domingos cerrado, hacer cita "
                                + "previa al Tel 6161194 ext. 0, "
                                + "también puede acudir directamente "
                                + "a la sucursal donde le darán un "
                                + "tiempo de respuesta no mayor a 15 "
                                + "días hábiles."
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
                                + "ATENDIDO POR:" + CAJERORS.toUpperCase() + "\n;"
                                + "NOMBRE DE CLIENTE:" + NOMBRECLIERS.toUpperCase() + "\n;"
                                + "EMAIL:" + CORREORS + "\n;"
                                + "FIRMA:______________________________  \n;"
                                + "Recuerde que puede consultar nuestro  \n;"
                                + "aviso de privacidad en WWW.SOUNDS.MX  \n;"
                                + "--------------------------------------\n;"
                                + "15 DIAS DE GARANTIA EN ACCESORIOS, "
                                + "PRESENTANDO TICKET Y EMPAQUES "
                                + "EN BUEN ESTADO”, para conocer "
                                + "políticas de garantías de todos "
                                + "nuestros productos visite "
                                + "sounds.mx/garantías-y-devoluciones.";
                                
                        
                        
                         //      JOptionPane.showMessageDialog(null,"VARIS"+NOMBRECLIERS+CORREORS);
                        String zbill = h + amt+capricho;/// suma de header y cuerpo

                        FORMATOCELDAS p = new FORMATOCELDAS();
                        FORMATOCELDAS.printCard(zbill);; ///primer ticket
                        //  FORMATOCELDAS.printCard(zbill);; ///segundo ticket
                        JOptionPane.showMessageDialog(null, "SE HA REIMPRESO CORRECTAMENTE LA GARANTIA CON NOMBRE DE:  " + NOMBRECLIERS.trim().toUpperCase());

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Falla al conectar internet/Base de datos, anote el numero de folio y reportelo a la extension #235 con SISTEMAS ");

                    }
                } catch (HeadlessException | NumberFormatException | SQLException e) {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MENUREIMPRIMIR.class.getName()).log(Level.SEVERE, null, ex);
                }

    }

    public void reimpresion() {

        String fechaformateada = sdf.format(JTFECHA.getDate());
        String fechaformateada2 = sdfr.format(JTFECHA.getDate());
        int filaseleccionada = tblCH.getSelectedRow();
        //FUNCION OBTENER FECHA
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://" + IPSUCURSAL + "", "usounds", "madljda");
            st = conexion.createStatement();
            st.executeUpdate("use CML");
            Object itemcajero = "";
            //Seleccionar datos

            Object itemcaja = (tblCH.getValueAt(filaseleccionada, 0));//caja
            String vcaja = itemcaja.toString();
            Object itemfolio = (tblCH.getValueAt(filaseleccionada, 1));//folio
            String vfolio = itemfolio.toString();

            itemcajero = (tblCH.getValueAt(filaseleccionada, 5));//codigo
          ///  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> FECHA FORMATEADA" + fechaformateada);
            rs = st.executeQuery("select v.codigo,left((select descripcion from codigos where codigo=cg.codigo),15)as descgenero, cg.garantia,cg.dias, v.cantidad,left(sum(cantidad*precioventaneto),6)as precio,\n"
                    + "(select nombrec from empleados where empleado=v.cajero) as cajero,vp.nombrecliente,vp.telefonocliente,vp.correocliente,(select genero from codigos where codigo=cg.codigo  )as genero\n"
                    + "from ventas v, codigosgarantias cg, ventaspagos vp where v.fecha=vp.fecha and v.folio=vp.folio and v.caja=vp.caja and v.sucursal=vp.sucursal and\n"
                    + "v.codigo=cg.codigo and v.fecha='" + fechaformateada + "' and v.caja='" + vcaja + "' and v.folio='" + vfolio + "' and v.sucursal='" + SUCURSAL + "' and vp.clavepago<>99\n"
                    + "group by v.codigo,cg.codigo,cg.garantia,v.cantidad,cg.dias,vp.nombrecliente,vp.telefonocliente,vp.correocliente,v.cajero");

            ////   System.out.println("fechaformateada"+fechaformateada); ES EL BUENO PARA IQUERYS
            md = (DefaultTableModel) tblCH.getModel();
            md.setRowCount(0);

            try {

                String Header
                        = "**************REIMPRESION***************\n;"
                        + "***************GARANTIAS**************\n;"
                        + "******SUCURSAL: " + NOMBRESUCURSAL + "***********\n;"
                        + "*********TEL: " + TELEFONOSUCURSAL + "***********\n;"
                        + "                                        \n;"
                        + "Fecha:" + fechaformateada2.trim() + "      Hora:" + ddd.format(gg.getTime()) + "\n;"
                        + "Folio: " + vfolio + "             Caja: " + vcaja + "    \n;"
                        + "                                         \n;"
                        + "Pzas " + "Codigo" + "      Garantia " + "Precio" + "\n;"
                        + "     Descripcion     Dias        " + "\n;"
                        + "--------------------------------------\n;";

                String a = "";
                String b = "";
                String CORREORS = "";
                String NOMBRECLIERS = "";
                String CAJERORS = "";
                while (rs.next()) {

                    a += rs.getString(5).trim() + "    " + rs.getString(1).trim() + "          " + rs.getString(4).trim() + " $" + rs.getString(6).trim() + "\n;"
                            + "     " + rs.getString(2).trim() + "\n;";
                    CORREORS = rs.getString(10)+"";
                    NOMBRECLIERS = rs.getString(8)+"";
                    CAJERORS = rs.getString(7)+"";
                    b += rs.getString(11).trim() + "";
                }
             //   System.out.println(" >>>"+NOMBRECLIERS+CORREORS+CAJERORS);
                    String capricho="";
                        if (b.contains("154")){
                          /// System.out.println("lleva bafle");
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
                          ///  System.out.println(" NO LLEVA BAFLE");
                        }
                String h = Header + a;

                String amt
                        = "\n;--------------------------------------\n;"
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
                        + "ATENDIDO POR:" + CAJERORS.toUpperCase() + "\n;"
                        + "NOMBRE DE CLIENTE:" + NOMBRECLIERS .toUpperCase()+"\n;"
                        + "EMAIL:" + CORREORS + "\n;"
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
                //             JOptionPane.showMessageDialog(null,"VARIS"+NOMBRECLIERS+CORREORS);
              ///  System.out.println("<><><><><><><><>"+NOMBRECLIERS+CORREORS+CAJERORS);
                String zbill = h + amt+capricho;/// suma de header y cuerpo

                FORMATOCELDAS p = new FORMATOCELDAS();
                FORMATOCELDAS.printCard(zbill);; ///primer ticket
                // FORMATOCELDAS.printCard(zbill);; ///segundo ticket
                JOptionPane.showMessageDialog(null, "SE HA REIMPRESO CORRECTAMENTE LA GARANTIA CON NOMBRE DE:  " + NOMBRECLIERS.trim().toUpperCase());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Falla al conectar internet/Base de datos, vuelva a intentarlo o anote el numero de folio y reportelo a la extension #235 con SISTEMAS ");
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MENUREIMPRIMIR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENUREIMPRIMIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENUREIMPRIMIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENUREIMPRIMIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENUREIMPRIMIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENUREIMPRIMIR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNATRAS;
    private javax.swing.JToggleButton BTNBUSCAR;
    private javax.swing.JButton BTNGENERAR;
    private javax.swing.JComboBox CBCAJA;
    private javax.swing.JLabel FONDO;
    private com.toedter.calendar.JDateChooser JTFECHA;
    private com.toedter.components.JSpinField JTFOLIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblCH;
    // End of variables declaration//GEN-END:variables
}
