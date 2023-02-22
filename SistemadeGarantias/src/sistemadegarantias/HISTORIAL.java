/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadegarantias;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import static sistemadegarantias.Configuracionserver.IPSUCURSAL;
import static sistemadegarantias.Configuracionserver.NOMBRESUCURSAL;
import static sistemadegarantias.Configuracionserver.SUCURSAL;
import static sistemadegarantias.Configuracionserver.TELEFONOSUCURSAL;

/**
 *
 * @author AGONZALEZ
 */
public class HISTORIAL extends javax.swing.JFrame {

   
    /**
     * Creates new form HCOMPRAS
     */

    DefaultTableModel md;
    Statement st;
    PreparedStatement ps = null;
    ResultSet rs;

    String filtro;
   // private TableRowSorter trsfiltro;
    
   /* public void filtro() {
        filtro = JBUSCADOR.getText();
        trsfiltro.setRowFilter(RowFilter.regexFilter(JBUSCADOR.getText(), 1,2,3));
    }*/

    public HISTORIAL() {
        //  JRCEL.setSelected(true);
     
        initComponents();
         tblCH2.getTableHeader().setReorderingAllowed(false);
        
          setIconImage(new ImageIcon(getClass().getResource("/RECURSOS/logo.png")).getImage());
    

        String data[][] = {};
        String cabeza[] = {"NOMBRE CLIENTE", "TELEFONO","FECHA DE VENTA", "CAJA", "FOLIO","CORREO","SUCURSAL"};

        md = new DefaultTableModel(data, cabeza) {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column != 7) {
                    return false;
                } else {
                    return true;
                }
            } 
        };
        tblCH2.setModel(md);
        JTableHeader th;
        th = tblCH2.getTableHeader();
        th.setFont(new java.awt.Font("Italic", 0, 14));

        //Centrar el encabezado de la tabla
        TableCellRenderer rendererFromHeader = tblCH2.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);

        tblCH2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        tblCH2.getColumnModel().getColumn(0).setPreferredWidth(200); //NOMBRE DE CLIENTE
        tblCH2.getColumnModel().getColumn(0).setMaxWidth(350);
        tblCH2.getColumnModel().getColumn(0).setMinWidth(200);

        tblCH2.getColumnModel().getColumn(1).setPreferredWidth(125); //CELULAR
        tblCH2.getColumnModel().getColumn(1).setMaxWidth(200);
        tblCH2.getColumnModel().getColumn(1).setMinWidth(125);

        tblCH2.getColumnModel().getColumn(2).setPreferredWidth(125); //FECHA
        tblCH2.getColumnModel().getColumn(2).setMaxWidth(200);
        tblCH2.getColumnModel().getColumn(2).setMinWidth(125);

        tblCH2.getColumnModel().getColumn(3).setPreferredWidth(80); //CAJA
        tblCH2.getColumnModel().getColumn(3).setMaxWidth(80);
        tblCH2.getColumnModel().getColumn(3).setMinWidth(80);

        tblCH2.getColumnModel().getColumn(4).setPreferredWidth(80); //FOLIO
        tblCH2.getColumnModel().getColumn(4).setMaxWidth(80);
        tblCH2.getColumnModel().getColumn(4).setMinWidth(80);

        tblCH2.getColumnModel().getColumn(5).setPreferredWidth(200); //CORREO
        tblCH2.getColumnModel().getColumn(5).setMaxWidth(350);
        tblCH2.getColumnModel().getColumn(5).setMinWidth(200);
        
        tblCH2.getColumnModel().getColumn(6).setPreferredWidth(100); //CORREO
        tblCH2.getColumnModel().getColumn(6).setMaxWidth(350);
        tblCH2.getColumnModel().getColumn(6).setMinWidth(100);


        JRCEL.setSelected(true);
        
        
        
        //  BTNGENERAR.setEnabled(false);
        ///************ESCALABLIDAD DE ICONO DE IMAGEN EN BOGTONO O LABEL

        /* ImageIcon imgIcon = new ImageIcon(getClass().getResource("/RECURSOS/atras.png"));
         Image imgEscalada = imgIcon.getImage().getScaledInstance(BTNATRAS.getWidth(),
         BTNATRAS.getHeight(), Image.SCALE_SMOOTH);
         Icon iconoEscalado = new ImageIcon(imgEscalada);
         BTNATRAS.setIcon(iconoEscalado);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        JRNOMBRE = new javax.swing.JRadioButton();
        JRCEL = new javax.swing.JRadioButton();
        JBUSCADOR = new javax.swing.JTextField();
        JREMAIL = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BTNVERDETALLE = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCH2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        BTNBUSCAR = new javax.swing.JToggleButton();
        BTNGENERAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BTNATRAS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("HISTORIAL DE GARANTIAS - SOUNDS");
        setMinimumSize(new java.awt.Dimension(900, 540));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel3KeyTyped(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(JRNOMBRE);
        JRNOMBRE.setText("BUSCAR POR NOMBRE:");
        JRNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRNOMBREActionPerformed(evt);
            }
        });
        jPanel3.add(JRNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 180, 30));

        buttonGroup1.add(JRCEL);
        JRCEL.setText("BUSQUEDA POR CELULAR/TEL:");
        jPanel3.add(JRCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 91, 180, 30));

        JBUSCADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUSCADORActionPerformed(evt);
            }
        });
        JBUSCADOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JBUSCADORKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBUSCADORKeyTyped(evt);
            }
        });
        jPanel3.add(JBUSCADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 330, 50));

        buttonGroup1.add(JREMAIL);
        JREMAIL.setText("BUSQUEDA POR EMAIL:");
        jPanel3.add(JREMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 54, 180, 30));

        jLabel6.setText(" ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/TP3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 620, 140));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 620, 140));

        BTNVERDETALLE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNVERDETALLE.setText("VER DETALLE");
        BTNVERDETALLE.setBorder(null);
        BTNVERDETALLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVERDETALLEBTNBUSCAR(evt);
            }
        });
        jPanel1.add(BTNVERDETALLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 170, 50));

        tblCH2.setAutoCreateRowSorter(true);
        tblCH2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCH2.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCH2.setRowHeight(50);
        tblCH2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCH2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCH2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 810, 240));

        jLabel7.setText(" ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 210, -1));

        BTNBUSCAR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNBUSCAR.setText("BUSCAR");
        BTNBUSCAR.setBorder(null);
        BTNBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCARBTNBUSCAR(evt);
            }
        });
        BTNBUSCAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BTNBUSCARKeyTyped(evt);
            }
        });
        jPanel1.add(BTNBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 170, 50));

        BTNGENERAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNGENERAR.setForeground(new java.awt.Color(0, 153, 0));
        BTNGENERAR.setText("GENERAR");
        BTNGENERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGENERARActionPerformed(evt);
            }
        });
        jPanel1.add(BTNGENERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 150, 50));

        jLabel8.setText("  ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/TP3.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 850, 490));

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HISTORIAL/RECORD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 530, 60));

        BTNATRAS.setForeground(new java.awt.Color(240, 240, 240));
        BTNATRAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/Left.png"))); // NOI18N
        BTNATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNATRASActionPerformed(evt);
            }
        });
        getContentPane().add(BTNATRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/TP3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 930, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNBUSCARBTNBUSCAR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCARBTNBUSCAR
  String BUSCADOR=JBUSCADOR.getText().trim(); 

        if (JRCEL.isSelected()) {
             ///   ****
             try {   
         
              Class.forName("net.sourceforge.jtds.jdbc.Driver");
              java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://"+IPSUCURSAL+"", "usounds", "madljda");          
              st = conexion.createStatement();
            st.executeUpdate("use CML");
            
          //Seleccionar datos
             rs = st.executeQuery("select nombrecliente,telefonocliente,fecha,caja,folio,correocliente,sucursal from ventaspagos where telefonocliente  like'%"+BUSCADOR+"%'");
            md = (DefaultTableModel) tblCH2.getModel();        
            md.setRowCount(0);
            try {

                while (rs.next()) {
                    Object[] fila = {rs.getString(1).toUpperCase(), rs.getString(2), rs.getDate(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7)};
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
            Logger.getLogger(HISTORIAL.class.getName()).log(Level.SEVERE, null, ex);
        }   
             //***   
             //***
          
        } else if (JRNOMBRE.isSelected()) {

    ////************222222222222222222222222222222222222222222222222
                 try {   
 
                            Class.forName("net.sourceforge.jtds.jdbc.Driver");
              java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://"+IPSUCURSAL+"", "usounds", "madljda");                 st = conexion.createStatement();
            st.executeUpdate("use CML");
            
             rs = st.executeQuery("select nombrecliente,telefonocliente,fecha,caja,folio,correocliente,sucursal from ventaspagos where nombrecliente  like'%"+BUSCADOR.trim()+"%'");
            md = (DefaultTableModel) tblCH2.getModel();
            md.setRowCount(0);
            try {

                while (rs.next()) {

                    Object[] fila = {rs.getString(1).toUpperCase(), rs.getString(2), rs.getDate(3), rs.getInt(4), rs.getInt(5),rs.getString(6), rs.getString(7)};
                    md.addRow(fila);
                                  }
                System.out.println("si hay resultados" + md.getRowCount());
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
            Logger.getLogger(HISTORIAL.class.getName()).log(Level.SEVERE, null, ex);
            
             }
            //************33333333333333333333333333333333333333333333333333333333333333333333333333
            //************33333333333333333333333333333333333333333333333333333333333333333333333333
        }  else if (JREMAIL.isSelected()) {
               try {   
            System.out.println("YA ENTRO PRIMERO");
         //   System.out.println("QUERY"+opcquery);
                            Class.forName("net.sourceforge.jtds.jdbc.Driver");
              java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://"+IPSUCURSAL+"", "usounds", "madljda");                 st = conexion.createStatement();
            st.executeUpdate("use CML");
            
            
         
          //Seleccionar datos
             rs = st.executeQuery("select nombrecliente,telefonocliente,fecha,caja,folio,correocliente,sucursal from ventaspagos where correocliente  like'%"+BUSCADOR.trim()+"%'");
           
          //  rs = st.executeQuery("select nombrecliente,fecha,caja,folio,importe from ventaspagos where nombrecliente  like'%"+BUSCADOR+"%'");
            md = (DefaultTableModel) tblCH2.getModel();
            md.setRowCount(0);
            try {

                while (rs.next()) {

                    Object[] fila = {
                        rs.getString(1).toUpperCase(), 
                        rs.getString(2), rs.getDate(3), rs.getInt(4), rs.getInt(5),rs.getString(6), rs.getString(7)};
                    md.addRow(fila);
                    
                  //  System.out.println(rs.getString(1)+"FECHA:"+ rs.getString(2)+"caja:"+ rs.getInt(3)+"folio:"+ rs.getInt(4)+ rs.getDouble(5));
                   // System.out.println("TEXT EN CONSOLA "+rs.getInt(1)+rs.getInt(2)+rs.getInt(3));
                }
                
                System.out.println("si hay resultados" + md.getRowCount());
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
            Logger.getLogger(HISTORIAL.class.getName()).log(Level.SEVERE, null, ex);
        }   
           
                
                
                
                
        }
    }//GEN-LAST:event_BTNBUSCARBTNBUSCAR

    private void JBUSCADORKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBUSCADORKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_JBUSCADORKeyReleased

    private void JBUSCADORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBUSCADORKeyTyped
   
           int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada
        if (k == 10) {
        String BUSCADOR=JBUSCADOR.getText().trim(); 

        if (JRCEL.isSelected()) {
             ///   ****
             try {   
         
              Class.forName("net.sourceforge.jtds.jdbc.Driver");
              java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://"+IPSUCURSAL+"", "usounds", "madljda");          
              st = conexion.createStatement();
            st.executeUpdate("use CML");
            
          //Seleccionar datos
             rs = st.executeQuery("select nombrecliente,telefonocliente,fecha,caja,folio,correocliente,sucursal from ventaspagos where telefonocliente  like'%"+BUSCADOR+"%'");
            md = (DefaultTableModel) tblCH2.getModel();        
            md.setRowCount(0);
            try {

                while (rs.next()) {
                    Object[] fila = {rs.getString(1).toUpperCase(), rs.getString(2), rs.getDate(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7)};
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
            Logger.getLogger(HISTORIAL.class.getName()).log(Level.SEVERE, null, ex);
        }   
             //***   
             //***
          
        } else if (JRNOMBRE.isSelected()) {

    ////************222222222222222222222222222222222222222222222222
                 try {   
 
                            Class.forName("net.sourceforge.jtds.jdbc.Driver");
              java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://"+IPSUCURSAL+"", "usounds", "madljda");                 st = conexion.createStatement();
            st.executeUpdate("use CML");
            
             rs = st.executeQuery("select nombrecliente,telefonocliente,fecha,caja,folio,correocliente,sucursal from ventaspagos where nombrecliente  like'%"+BUSCADOR+"%'");
            md = (DefaultTableModel) tblCH2.getModel();
            md.setRowCount(0);
            try {

                while (rs.next()) {

                    Object[] fila = {rs.getString(1).toUpperCase(), rs.getString(2), rs.getDate(3), rs.getInt(4), rs.getInt(5),rs.getString(6), rs.getString(7)};
                    md.addRow(fila);
                                  }
                System.out.println("si hay resultados" + md.getRowCount());
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
            Logger.getLogger(HISTORIAL.class.getName()).log(Level.SEVERE, null, ex);
            
             }
            //************33333333333333333333333333333333333333333333333333333333333333333333333333
            //************33333333333333333333333333333333333333333333333333333333333333333333333333
        }  else if (JREMAIL.isSelected()) {
               try {   
            System.out.println("YA ENTRO PRIMERO");
         //   System.out.println("QUERY"+opcquery);
                            Class.forName("net.sourceforge.jtds.jdbc.Driver");
              java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://"+IPSUCURSAL+"", "usounds", "madljda");                 st = conexion.createStatement();
            st.executeUpdate("use CML");
            
            
         
          //Seleccionar datos
             rs = st.executeQuery("select nombrecliente,telefonocliente,fecha,caja,folio,correocliente,sucursal from ventaspagos where correocliente  like'%"+BUSCADOR+"%'");
           
          //  rs = st.executeQuery("select nombrecliente,fecha,caja,folio,importe from ventaspagos where nombrecliente  like'%"+BUSCADOR+"%'");
            md = (DefaultTableModel) tblCH2.getModel();
            md.setRowCount(0);
            try {

                while (rs.next()) {

                    Object[] fila = {
                        rs.getString(1).toUpperCase(), 
                        rs.getString(2), rs.getDate(3), rs.getInt(4), rs.getInt(5),rs.getString(6), rs.getString(7)};
                    md.addRow(fila);
                    
                  //  System.out.println(rs.getString(1)+"FECHA:"+ rs.getString(2)+"caja:"+ rs.getInt(3)+"folio:"+ rs.getInt(4)+ rs.getDouble(5));
                   // System.out.println("TEXT EN CONSOLA "+rs.getInt(1)+rs.getInt(2)+rs.getInt(3));
                }
                
                System.out.println("si hay resultados" + md.getRowCount());
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
            Logger.getLogger(HISTORIAL.class.getName()).log(Level.SEVERE, null, ex);
        }   
           
                
                
                
                
        }
        }
    }//GEN-LAST:event_JBUSCADORKeyTyped

    private void JBUSCADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUSCADORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBUSCADORActionPerformed

    private void BTNATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNATRASActionPerformed
        // TODO add your handling code here:
        MENU M = new MENU();
        M.setVisible(true);
          
        this.dispose();

    }//GEN-LAST:event_BTNATRASActionPerformed

    private void JRNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRNOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRNOMBREActionPerformed

    private void BTNVERDETALLEBTNBUSCAR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVERDETALLEBTNBUSCAR
        // TODO add your handling code here:
        
         int filaseleccionada=tblCH2.getSelectedRow();
        if(filaseleccionada>=0){
            Object obj2 = (tblCH2.getValueAt(filaseleccionada, 2));
            Object obj3 = (tblCH2.getValueAt(filaseleccionada, 3));
            Object obj4 = (tblCH2.getValueAt(filaseleccionada, 4));
            Object obj6 = (tblCH2.getValueAt(filaseleccionada, 6));
            String FECHA = obj2.toString();
            String CAJA = obj3.toString();
            String FOLIO = obj4.toString();
            String SUC = obj6.toString();

            DETALLEVENTA DV = new DETALLEVENTA();
         
            DV.setVisible(true);
            DV.JTDVFECHA.setText(FECHA);
            DV.JTDVFOLIO.setText(FOLIO);
            DV.JTDVCAJA.setText(CAJA);
            DV.JTDVSUC.setText(SUC);
            DV.Enviardatos();
        }else{
            JOptionPane.showMessageDialog(this,"No ha seleccionado ningún registro");
        }        
        
    }//GEN-LAST:event_BTNVERDETALLEBTNBUSCAR

    private void BTNGENERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGENERARActionPerformed
  
      
        
        
        //FUNCION OBTENER FECHA
        GregorianCalendar gg = new GregorianCalendar();
        SimpleDateFormat dd = new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat ddd = new SimpleDateFormat("HH:mm");

        int filaseleccionada = tblCH2.getSelectedRow();
        if (filaseleccionada >= 0) {
            
            //FUNCION OBTENER FECHA
            try {
                                Class.forName("net.sourceforge.jtds.jdbc.Driver");
              java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://"+IPSUCURSAL+"", "usounds", "madljda");                st = conexion.createStatement();
                st.executeUpdate("use CML");
                Object itemcajero = "";
                String vcaja = "";
                String vfolio = "";
                String vfecha = "";

                Object itemfolio = (tblCH2.getValueAt(filaseleccionada, 4));//caja
                vfolio = itemfolio.toString();

                Object obj6 = (tblCH2.getValueAt(filaseleccionada, 6));

                String SUC = obj6.toString();
                //          String pruebafecha = LBLFECHA.getText();
                Object itemfecha = (tblCH2.getValueAt(filaseleccionada, 2));
                vfecha = itemfecha.toString();

                Object itemcaja = (tblCH2.getValueAt(filaseleccionada, 3));//caja
                vcaja = itemcaja.toString();

                rs = st.executeQuery("select v.codigo,left((select descripcion from codigos where codigo=cg.codigo),15)as descgenero, cg.garantia,cg.dias, v.cantidad,left(sum(cantidad*precioventaneto),6)as precio,\n"
                        + "(select nombrec from empleados where empleado=v.cajero) as cajero,vp.nombrecliente,vp.telefonocliente,vp.correocliente\n"
                        + "from ventas v, codigosgarantias cg, ventaspagos vp where v.fecha=vp.fecha and v.folio=vp.folio and v.caja=vp.caja and v.sucursal=vp.sucursal and\n"
                        + "v.codigo=cg.codigo and v.fecha='" + vfecha + "' and v.caja='" + vcaja + "' and v.folio='" + vfolio + "' and v.sucursal='" + SUC+ "' and vp.clavepago<>99\n"
                        + "group by v.codigo,cg.codigo,cg.garantia,v.cantidad,cg.dias,vp.nombrecliente,vp.telefonocliente,vp.correocliente,v.cajero");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>2021 "+ vfecha);
                md = (DefaultTableModel) tblCH2.getModel();
                md.setRowCount(0);
                try {

                    String Header
                            ="***************************************\n;"
                            + "***************GARANTIAS**************\n;"
                            + "******SUCURSAL: "+NOMBRESUCURSAL+"***********\n;"
                            + "*********TEL: "+TELEFONOSUCURSAL+"***********\n;"
                            + "                                        \n;"
                            + "Fecha:" + vfecha + "      Hora reimp:" + ddd.format(gg.getTime()) + "\n;"
                              + "Folio: " + vfolio + " Caja: "+vcaja+"    \n;"
                            + "                                         \n;"
                            + "Pzas " + "Codigo" + "      Garantia " + "Precio" + "\n;"
                            + "     Descripcion     Dias        " + "\n;"
                            + "--------------------------------------\n;";
                    
                    

                    String a = "";
                    String CORREORS = "";
                    String NOMBRECLIERS = "";
                    String CAJERORS = "";
                    while (rs.next()) {

                        a += rs.getString(5).trim() + "    " + rs.getString(1).trim() + "          " + rs.getString(4).trim() + " $" + rs.getString(6).trim() + "\n;"
                            + "     " + rs.getString(2).trim() + "\n;";
                        CORREORS = rs.getString(10);
                        NOMBRECLIERS = rs.getString(8);
                        CAJERORS = rs.getString(7);
    
                    }
                    
                    
                    System.out.println(">>>>>>>>>>>> "+NOMBRECLIERS+"*************");
                    String h = Header + a;

                    String amt
                            = "\n;-------------------------------------\n;"
                            + "--------------------------------------\n;"
                            + "NOTA;EL CLIENTE ESTA DE ACUERDO EN QUE\n;"
                            + "LA MERCANCIA SE LE ENTREGO CON SUS    \n;"
                            + "EMPAQUES ORIGINALES, PROTECTORES      \n;"
                            + "INSTRUCTIVOS, ACCESORIOS QUE CONTIENE \n;"
                            + "DE FABRICA AL HACER SU COMPRA         \n;"
                            + "SE ACEPTA QUE LOS EQUIPOS FUERON      \n;"
                            + "PROBADOS EN PRESENCIA DEL CLIENTE SU  \n;"
                            + "TICKET ES SU GARANTIA                 \n;"
                            + "**************************************\n;"
                            + "Esta Garantia aplica Solamente  en    \n;"
                            + "productos comprados en Casa de Musica \n;"
                            + "de Luxe S.A. de C.V., Quien garantiza \n;"
                            + "el  funcionamiento del equipo por el  \n;"
                            + "periodo señalado y bajo las condiciones\n;"
                            + "que estipula el manual del equipo  y  \n;"
                            + "accesorios adquiridos                  \n;"
                            + "           CONDICIONES                \n;"
                            + "1.-En todo caso el cliente debe       \n;"
                            + "presentar la mercancia con el ticket  \n;"
                            + "de compra y empaques en buen estado   \n;"
                            + "2.-En caso de que el articulo tenga   \n;"
                            + "poliza de proveedor, Casa de musica   \n;"
                            + "solo dara el servicio intermediario   \n;"
                            + "entre  cliente y el taller autorizado \n;"
                            + "3.-En cualquier caso,al cliente se le \n;"
                            + "dara respuesta tanto del diagnostico  \n;"
                            + "como de la reparacion en un lapso     \n;"
                            + "no mayor a 30 dias                    \n;"
                            + "4.-La garantia no aplica en los       \n;"
                            + "articulos dañados por mal manejo      \n;"
                            + "del cliente,negligencia en el uso del \n;"
                            + "articulo, mala instalacion electrica  \n;"
                            + "contingencias climaticas golpes       \n;"
                            + "caidas, polvo, agua y plagas\n;"
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
                      /*      + "5.-En el caso de este producto        \n;"
                            + "Casa de Musica  de Luxe S.A. de C.V.  \n;"
                            + "le dejara el codigo de sitio web con  \n;"
                            + "un manual de recomendaciones  para el \n;"
                            + "manejo de su equipo es importante que \n;"
                            + "lo lea a detalle ya que es causa de   \n;"
                            + "anulacion de la garantia,el no seguir \n;"
                            + " con estas recomendaciones             \n;"*/
                            + "ATENDIDO POR:" + CAJERORS.toUpperCase() + "\n;"
                            + "NOMBRE DE CLIENTE:" + NOMBRECLIERS.toUpperCase() + "\n;"
                            + "EMAIL:" + CORREORS + "\n;"
                            + "FIRMA:______________________________  \n;"
                            + "Recuerde que puede consultar nuestro  \n;"
                            + "aviso de privacidad en WWW.SOUNDS.MX  \n;"
                            + "15 DIAS DE GARANTIA EN ACCESORIOS, \n;"
                            + "--------------------------------------\n;"
                            + "PRESENTANDO TICKET Y EMPAQUES \n;"
                            + "EN BUEN ESTADO”, para conocer \n;"
                            + "políticas de garantías de todos \n;"
                            + "nuestros productos visite \n;"
                            + "sounds.mx/garantías-y-devoluciones.\n;";
                    //              JOptionPane.showMessageDialog(null,"VARIS"+NOMBRECLIERS+CORREORS);

                    String zbill = h + amt;
                    FORMATOCELDAS p = new FORMATOCELDAS();
                    FORMATOCELDAS.printCard(zbill);///ier ticket
                    // FORMATOCELDAS.printCard(zbill);2do ticket
                    JOptionPane.showMessageDialog(null, "SE HA REIMPRESO CORRECTAMENTE LA GARANTIA CON NOMBRE DE:  " + NOMBRECLIERS);

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    JOptionPane.showMessageDialog(this, "Falla al conectar internet/Base de datos, anote el numero de folio y reportelo a la extension #235 con SISTEMAS ");
                }
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
                JOptionPane.showMessageDialog(null, "Error revise su conexion de base de datos");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HISTORIAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna fila o la tabla está vacía");
        }

    }//GEN-LAST:event_BTNGENERARActionPerformed

    private void tblCH2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCH2MouseClicked
        // TODO add your handling code here:
        
               
        if (evt.getClickCount() == 2) {
            int filaseleccionada = tblCH2.getSelectedRow();
            if (filaseleccionada >= 0) {
                Object obj2 = (tblCH2.getValueAt(filaseleccionada, 2));
                Object obj3 = (tblCH2.getValueAt(filaseleccionada, 3));
                Object obj4 = (tblCH2.getValueAt(filaseleccionada, 4));
                Object obj6 = (tblCH2.getValueAt(filaseleccionada, 6));
                String FECHA = obj2.toString();
                String CAJA = obj3.toString();
                String FOLIO = obj4.toString();
                String SUC = obj6.toString();

                DETALLEVENTA DV = new DETALLEVENTA();
              
                DV.setVisible(true);
                DV.JTDVFECHA.setText(FECHA);
                DV.JTDVFOLIO.setText(FOLIO);
                DV.JTDVCAJA.setText(CAJA);
                DV.JTDVSUC.setText(SUC);
                DV.Enviardatos();
            } else {
                JOptionPane.showMessageDialog(this, "No ha seleccionado ningún registro");
            }
   }
    }//GEN-LAST:event_tblCH2MouseClicked

    private void BTNBUSCARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTNBUSCARKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNBUSCARKeyTyped

    private void jPanel3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3KeyTyped

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
            java.util.logging.Logger.getLogger(HISTORIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HISTORIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HISTORIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HISTORIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HISTORIAL().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNATRAS;
    private javax.swing.JToggleButton BTNBUSCAR;
    private javax.swing.JButton BTNGENERAR;
    private javax.swing.JToggleButton BTNVERDETALLE;
    private javax.swing.JTextField JBUSCADOR;
    private javax.swing.JRadioButton JRCEL;
    private javax.swing.JRadioButton JREMAIL;
    private javax.swing.JRadioButton JRNOMBRE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCH2;
    // End of variables declaration//GEN-END:variables
}
