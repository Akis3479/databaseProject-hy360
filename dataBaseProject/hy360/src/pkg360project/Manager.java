/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360project;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author steliosmichelakakis
 */
public class Manager extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
    void populateTable(String x) {
        try {
            ResultSet tablefill = Login.stmt.executeQuery(x);
            while (jTable1.getRowCount() > 0) {
                ((DefaultTableModel) jTable1.getModel()).removeRow(0);
            }

            int col = tablefill.getMetaData().getColumnCount();

            while (tablefill.next()) {
                Object[] rows = new Object[col];
                for (int i = 1; i <= col; i++) {
                    rows[i - 1] = tablefill.getObject(i);
                }
                ((DefaultTableModel) jTable1.getModel()).insertRow(tablefill.getRow() - 1, rows);
            }
            tablefill.close();
        } catch (Exception ex) {
        }
    }

    void populateTableq(String x) {
        try {
            ResultSet tablefill = Login.stmt.executeQuery(x);
            while (quest.getRowCount() > 0) {
                ((DefaultTableModel) quest.getModel()).removeRow(0);
            }

            int col = tablefill.getMetaData().getColumnCount();

            while (tablefill.next()) {
                Object[] rows = new Object[col];
                for (int i = 1; i <= col; i++) {
                    rows[i - 1] = tablefill.getObject(i);
                }
                ((DefaultTableModel) quest.getModel()).insertRow(tablefill.getRow() - 1, rows);
            }
            tablefill.close();
        } catch (Exception ex) {
        }
    }

    void populateTable1(String x) {
        try {
            ResultSet tablefill = Login.stmt.executeQuery(x);
            while (managerTable.getRowCount() > 0) {
                ((DefaultTableModel) managerTable.getModel()).removeRow(0);
            }

            int col = tablefill.getMetaData().getColumnCount();

            while (tablefill.next()) {
                Object[] rows = new Object[col];
                for (int i = 1; i <= col; i++) {
                    rows[i - 1] = tablefill.getObject(i);
                }
                ((DefaultTableModel) managerTable.getModel()).insertRow(tablefill.getRow() - 1, rows);
            }
            tablefill.close();
        } catch (Exception ex) {
        }
    }

    void populateTable2(String x) {
        try {
            ResultSet tablefill = Login.stmt.executeQuery(x);
            while (NurseTable.getRowCount() > 0) {
                ((DefaultTableModel) NurseTable.getModel()).removeRow(0);
            }

            int col = tablefill.getMetaData().getColumnCount();

            while (tablefill.next()) {
                Object[] rows = new Object[col];
                for (int i = 1; i <= col; i++) {
                    rows[i - 1] = tablefill.getObject(i);
                }
                ((DefaultTableModel) NurseTable.getModel()).insertRow(tablefill.getRow() - 1, rows);
            }
            tablefill.close();
        } catch (Exception ex) {
        }
    }

    void populateTable3(String x) {
        try {
            ResultSet tablefill = Login.stmt.executeQuery(x);
            while (docTable.getRowCount() > 0) {
                ((DefaultTableModel) docTable.getModel()).removeRow(0);
            }

            int col = tablefill.getMetaData().getColumnCount();

            while (tablefill.next()) {
                Object[] rows = new Object[col];
                for (int i = 1; i <= col; i++) {
                    rows[i - 1] = tablefill.getObject(i);
                }
                ((DefaultTableModel) docTable.getModel()).insertRow(tablefill.getRow() - 1, rows);
            }
            tablefill.close();
        } catch (Exception ex) {
        }
    }

    void populateTable4(String x) {
        try {
            ResultSet tablefill = Login.stmt.executeQuery(x);
            while (covidtable.getRowCount() > 0) {
                ((DefaultTableModel) covidtable.getModel()).removeRow(0);
            }

            int col = tablefill.getMetaData().getColumnCount();

            while (tablefill.next()) {
                Object[] rows = new Object[col];
                for (int i = 1; i <= col; i++) {
                    rows[i - 1] = tablefill.getObject(i);
                }
                ((DefaultTableModel) covidtable.getModel()).insertRow(tablefill.getRow() - 1, rows);
            }
            tablefill.close();
        } catch (Exception ex) {
        }
    }


    public Manager() throws SQLException {
        initComponents();
        String yeet = "CREATE TABLE IF NOT EXISTS SHIFTRECORD\n"
                + "                (\n"
                + "                    id VARCHAR(255),\n"
                + "                    date DATE\n"
                + "                );";
        Login.stmt.executeUpdate(yeet);
        String sql = "SELECT id, first, last, type, telephone, address FROM EMPLOYEE";
        populateTable(sql);
        String docs = "SELECT specialty, first, last\n"
                + "        FROM DOCTORS \n"
                + "        WHERE DOCTORS.id IN (SELECT SHIFT.id FROM SHIFT)";
        populateTable3(docs);
        docs = "SELECT first, last, telephone\n"
                + "        FROM EMPLOYEE \n"
                + "        WHERE EMPLOYEE.id IN (SELECT SHIFT.id FROM SHIFT)\n"
                + "        AND (EMPLOYEE.type = 'Nurse')";
        populateTable2(docs);
        docs = "SELECT first, last, grade\n"
                + "        FROM MANAGERS \n"
                + "        WHERE MANAGERS.id IN (SELECT SHIFT.id FROM SHIFT)";
        populateTable1(docs);
        docs = "SELECT amka, first, last, telephone, long_term FROM PATIENT WHERE diagnose='Covid19' ";
        populateTable4(docs);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        searchfield = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        docTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        NurseTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        managerTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        quest = new javax.swing.JTable();
        commandline = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        covidtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font(".SF NS Text", 0, 24)); // NOI18N
        jLabel2.setText("Τμήμα Επιγόντων Περιστατικών");

        jButton1.setText("Αποσύνδεση");

        jLabel5.setFont(new java.awt.Font(".SF NS Text", 0, 24)); // NOI18N
        jLabel5.setText("Καλαμιτσίου");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });

        jLabel13.setText("Αναζήτηση Ασθενή");

        search.setText("Αναζήτηση");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ΑΜΚΑ", "Όνομα", "Επίθετο", "Ειδικότητα", "Τηλέφωνο", "Διεύθυνση"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1183, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchfield)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Προσωπικό", jPanel4);

        jLabel15.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        jLabel15.setText("Γιατροί");

        jLabel16.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        jLabel16.setText("Νοσοκόμοι");

        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ειδικότητα", "Όνομα", "Επώνυμο"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(docTable);

        NurseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Όνομα", "Επώνυμο", "Τηλέφωνο"
            }
        ));
        jScrollPane5.setViewportView(NurseTable);

        jLabel17.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        jLabel17.setText("Διοικητικό Προσωπικό");

        managerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Όνομα", "Επώνυμο", "Βαθμός"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(managerTable);

        jButton2.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        jButton2.setText("Ενημέρωση Εφημερίας");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel16)
                        .addComponent(jLabel15)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane5)
                        .addComponent(jLabel17)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("      Εφημερία      ", jPanel5);

        quest.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(quest);

        commandline.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                commandlineKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                    .addComponent(commandline))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(commandline, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Επερώτηση", jPanel6);

        covidtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ΑΜΚΑ", "Όνομα", "Επίθετο", "Τηλέφωνο", "Χρόνια Νοσήματα"
            }
        ));
        jScrollPane2.setViewportView(covidtable);

        jLabel1.setText("Συνολικά Κρούσματα :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("COVID-19", jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        String id = searchfield.getText();
        populateTable("SELECT * FROM EMPLOYEE WHERE EMPLOYEE.id =" + id);
    }//GEN-LAST:event_searchMouseClicked

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        


        String sql ="INSERT INTO SHIFTRECORD (id, date)\n" +
"        SELECT id,date\n" +
"        FROM SHIFT";
        try {
            Login.stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }

        sql = "INSERT INTO SHIFT (id)\n" +
"        SELECT DOCTORS.id  FROM DOCTORS \n" +
"        WHERE \n" +
"            DOCTORS.id NOT IN ( SELECT SHIFT.id FROM SHIFT )\n" +
"            AND (DOCTORS.specialty = 'Gynaikologos');";

        try {
            Login.stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }

        sql = "INSERT INTO SHIFT (id)\n" +
"        SELECT DOCTORS.id  FROM DOCTORS \n" +
"        WHERE \n" +
"            DOCTORS.id NOT IN ( SELECT SHIFT.id FROM SHIFT )\n" +
"            AND (DOCTORS.specialty = 'Pathologos');";

        try {
            Login.stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        sql = "INSERT INTO SHIFT (id)\n" +
"        SELECT DOCTORS.id  FROM DOCTORS \n" +
"        WHERE \n" +
"            DOCTORS.id NOT IN ( SELECT SHIFT.id FROM SHIFT )\n" +
 "            AND (DOCTORS.specialty = 'Pneumonologos');";

        try {
            Login.stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }

        sql = "INSERT INTO SHIFT (id)\n" +
"        SELECT DOCTORS.id  FROM DOCTORS \n" +
"        WHERE \n" +
"            DOCTORS.id NOT IN ( SELECT SHIFT.id FROM SHIFT )\n" +
"            AND (DOCTORS.specialty = 'Ofthalmiatros');";

        try {
            Login.stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }

        sql = "INSERT INTO SHIFT (id)\n" +
"        SELECT DOCTORS.id  FROM DOCTORS \n" +
"        WHERE \n" +
"            DOCTORS.id NOT IN ( SELECT SHIFT.id FROM SHIFT )\n" +
"            AND (DOCTORS.specialty = 'Xeirourgos');";

        try {
            Login.stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }

        sql = "        INSERT INTO SHIFT (id)\n" +
"        SELECT EMPLOYEE.id FROM EMPLOYEE \n" +
"        WHERE \n" +
"            EMPLOYEE.id NOT IN ( SELECT SHIFT.id FROM SHIFT )\n" +
"            AND (EMPLOYEE.type = 'nurse')\n" +
 "            LIMIT 2;";
        try {
            Login.stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }

        sql = "        INSERT INTO SHIFT (id)\n"
                + "        SELECT EMPLOYEE.id FROM EMPLOYEE \n" +
"        WHERE \n" +
"            EMPLOYEE.id NOT IN ( SELECT SHIFT.id FROM SHIFT )\n" +
"            AND (EMPLOYEE.type = 'Manager')\n" +
 "            LIMIT 1;";
        try {
            Login.stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Login.stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }

        sql = "DELETE FROM SHIFT WHERE date IS NOT NULL;";
        try {
            Login.stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        sql = "UPDATE SHIFT \n"
                + "        SET date = CURDATE()\n" +
 "        WHERE date IS NULL;";
        try {
            JOptionPane.showMessageDialog(null, "Shift Updated!");
            Login.stmt.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void commandlineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commandlineKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String quest = commandline.getText();
            populateTableq(quest);
   }
    }//GEN-LAST:event_commandlineKeyPressed

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Manager().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable NurseTable;
    private javax.swing.JTextField commandline;
    private javax.swing.JTable covidtable;
    private javax.swing.JTable docTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable managerTable;
    private javax.swing.JTable quest;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchfield;
    // End of variables declaration//GEN-END:variables
}
