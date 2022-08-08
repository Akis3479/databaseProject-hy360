/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360project;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author steliosmichelakakis
 */
public class Nurse extends javax.swing.JFrame {

    /**
     * Creates new form Nurse
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
    }
 catch (Exception ex) {
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
            while (patients2.getRowCount() > 0) {
                ((DefaultTableModel) patients2.getModel()).removeRow(0);
            }

            int col = tablefill.getMetaData().getColumnCount();

            while (tablefill.next()) {
                Object[] rows = new Object[col];
                for (int i = 1; i <= col; i++) {
                    rows[i - 1] = tablefill.getObject(i);
                }
                ((DefaultTableModel) patients2.getModel()).insertRow(tablefill.getRow() - 1, rows);
            }
            tablefill.close();
        } catch (Exception ex) {
        }
    }

    public Nurse() {
        initComponents();
        String patients = "SELECT amka, first, last, sex, insurance, telephone, address, long_term, allergies, status FROM PATIENT";
        populateTable(patients);
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
        docs = "SELECT amka, first, last, eksetaseis"
                + " FROM PATIENT"
                + " WHERE PATIENT.status=2";
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

        SEX = new javax.swing.ButtonGroup();
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
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        surname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amkafield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        insurance = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        longterm = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        allergies = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        puretos = new javax.swing.JCheckBox();
        vuxas = new javax.swing.JCheckBox();
        naftia = new javax.swing.JCheckBox();
        eksanthima = new javax.swing.JCheckBox();
        gevsi = new javax.swing.JCheckBox();
        travma = new javax.swing.JCheckBox();
        ponokefalos = new javax.swing.JCheckBox();
        anapnoi = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        doctorField = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        patients2 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        amkasearch = new javax.swing.JTextField();
        amkasearchbutton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        done = new javax.swing.JButton();
        examfield = new javax.swing.JLabel();
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
                .addContainerGap(32, Short.MAX_VALUE))
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
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ΑΜΚΑ", "Όνομα", "Επίθετο", "Φύλο", "Ασφάλεια", "Τηλέφωνο", "Διεύθυνση", "Χρόνια Ν.", "Αλλεργίες", "Κατάσταση"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
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
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("       Ασθενείς        ", jPanel4);

        jLabel1.setText("Όνομα");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel3.setText("Επίθετο");

        jLabel4.setText("ΑΜΚΑ");

        jLabel6.setText("Ασφάλεια");

        jLabel7.setText("Τηλέφωνο");

        telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephoneActionPerformed(evt);
            }
        });

        jLabel8.setText("Διέυθυνση");

        jLabel9.setText("Αλλεργείες");

        jLabel10.setText("Χρόνιες Παθήσεις");

        longterm.setColumns(20);
        longterm.setRows(5);
        jScrollPane1.setViewportView(longterm);

        allergies.setColumns(20);
        allergies.setRows(5);
        jScrollPane2.setViewportView(allergies);

        jLabel12.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        jLabel12.setText("Στοιχεία Ασθενή");

        SEX.add(male);
        male.setText("MALE");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        SEX.add(female);
        female.setText("FEMALE");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(female)
                    .addComponent(male)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(178, 178, 178)))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(insurance)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(56, 56, 56)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(surname)
                                .addComponent(amkafield)
                                .addComponent(address)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amkafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(male)
                .addGap(1, 1, 1)
                .addComponent(female)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        puretos.setText("Πυρετός");

        vuxas.setText("Βύχας");

        naftia.setText("Ναυτία");

        eksanthima.setText("Εξάνθημα");

        gevsi.setText("Απώλεια γεύσης");

        travma.setText("Εξωτερικό τραύμα");

        ponokefalos.setText("Πονοκέφαλος");

        anapnoi.setText("Δυσκολία αναπνοής");

        jLabel11.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        jLabel11.setText("Συμπτώματα");

        submit.setText("Δήλωση");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font(".SF NS Text", 0, 20)); // NOI18N
        jLabel14.setText("Υπέυθυνος Ιατρός : ");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        doctorField.setFont(new java.awt.Font(".SF NS Text", 0, 24)); // NOI18N
        doctorField.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(puretos, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(vuxas, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(naftia, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(eksanthima, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(gevsi, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(travma, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(ponokefalos, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(anapnoi, javax.swing.GroupLayout.PREFERRED_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 120, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(27, 27, 27)
                        .addComponent(puretos)
                        .addGap(18, 18, 18)
                        .addComponent(vuxas))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(naftia)
                .addGap(22, 22, 22)
                .addComponent(eksanthima)
                .addGap(18, 18, 18)
                .addComponent(gevsi)
                .addGap(18, 18, 18)
                .addComponent(travma)
                .addGap(18, 18, 18)
                .addComponent(ponokefalos)
                .addGap(18, 18, 18)
                .addComponent(anapnoi)
                .addGap(137, 137, 137)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("     Εγγραφή     ", jPanel6);

        patients2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Αμκα", "Όνομα", "Επίθετο", "Εξετάσεις"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(patients2);
        if (patients2.getColumnModel().getColumnCount() > 0) {
            patients2.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel19.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        jLabel19.setText("ΑΜΚΑ :");

        amkasearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amkasearchActionPerformed(evt);
            }
        });

        amkasearchbutton.setText("Αναζήτηση");
        amkasearchbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amkasearchbuttonMouseClicked(evt);
            }
        });
        amkasearchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amkasearchbuttonActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        jLabel20.setText("Ασθενείς Προς Εξέταση ");

        jCheckBox1.setText("Urine Test");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Supersonic");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Heart Pulse Test");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Blood Test");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("COVID-19 Test");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        done.setText("Ολοκλήρωση");
        done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneMouseClicked(evt);
            }
        });
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(126, 126, 126)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(done)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(examfield, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amkasearch, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amkasearchbutton)))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(amkasearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amkasearchbutton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(examfield, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox4)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox5)
                        .addGap(18, 18, 18)
                        .addComponent(done)))
                .addContainerGap(263, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Διεξαγωγή Εξετάσεων", jPanel8);

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
        if (NurseTable.getColumnModel().getColumnCount() > 0) {
            NurseTable.getColumnModel().getColumn(2).setHeaderValue("Τηλέφωνο");
        }

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane6))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
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
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("      Εφημερία      ", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE)
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
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void telephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telephoneActionPerformed

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        String amka = searchfield.getText();
        populateTable("SELECT * FROM PATIENT WHERE PATIENT.amka =" + amka);
    }//GEN-LAST:event_searchMouseClicked

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked

        String drop = "DROP TABLE SYMP";
        try {
            Login.stmt.executeUpdate(drop);
        } catch (SQLException ex) {
            Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
        }
        String Sex = "";
        String Name = name.getText();
        String Surname = surname.getText();
        String Longterm = longterm.getText();
        String Address = address.getText();
        String Allergies = allergies.getText();
        String Amka = amkafield.getText();
        String Insurance = insurance.getText();
        if (male.isSelected()) {
            Sex = "MALE";
        }else{
            Sex = "FEMALE";
        }
        String Telephone = telephone.getText();

        String sql = "INSERT INTO PATIENT(amka, first, last, sex, insurance, telephone, address, long_term, allergies, status)" 
                + "VALUES(" + Amka + ",'" + Name + "','" + Surname + "','" + Sex + "','" + Insurance + "'," + Telephone + ",'" + Address + "','" + Longterm + "','" + Allergies + "',1)";

        String sql2 = "CREATE TABLE IF NOT EXISTS SYMP (doctor VARCHAR(255))";
        try {
            Login.stmt.executeUpdate(sql2);
        } catch (SQLException ex) {
            Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (puretos.isSelected()) {
            sql2 = "INSERT INTO SYMP(doctor)"
                    + "VALUES('Pathologos')";
            try {
                Login.stmt.executeUpdate(sql2);
            } catch (SQLException ex) {
                Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (vuxas.isSelected()) {
            sql2= "INSERT INTO SYMP(doctor)"
                    + "VALUES('Pathologos')";
            try {
                Login.stmt.executeUpdate(sql2);
            } catch (SQLException ex) {
                Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (ponokefalos.isSelected()) {
            sql2 = "INSERT INTO SYMP(doctor)"
                    + "VALUES('Ofthalmiatros')";
            try {
                Login.stmt.executeUpdate(sql2);
            } catch (SQLException ex) {
                Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (eksanthima.isSelected()) {
            sql2 = "INSERT INTO SYMP(doctor)"
                    + "VALUES('Dermatologos')";
            try {
                Login.stmt.executeUpdate(sql2);
            } catch (SQLException ex) {
                Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (gevsi.isSelected()) {
            sql2 = "INSERT INTO SYMP(doctor)"
                    + "VALUES('Pathologos')";
            try {
                Login.stmt.executeUpdate(sql2);
            } catch (SQLException ex) {
                Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (travma.isSelected()) {
            sql2 = "INSERT INTO SYMP(doctor)"
                    + "VALUES('Xeirourgos')";
            try {
                Login.stmt.executeUpdate(sql2);
            } catch (SQLException ex) {
                Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (naftia.isSelected()) {
            sql2 = "INSERT INTO SYMP(doctor)"
                    + "VALUES('Gunaikologos')";
            try {
                Login.stmt.executeUpdate(sql2);
            } catch (SQLException ex) {
                Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (anapnoi.isSelected()) {
            sql2 = "INSERT INTO SYMP(doctor)"
                    + "VALUES('Orthopedikos')";
            try {
                Login.stmt.executeUpdate(sql2);
            } catch (SQLException ex) {
                Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        String s = "SELECT doctor, COUNT(*) "
        +"FROM SYMP "
        +"GROUP BY doctor "
        +"ORDER BY 2 DESC";


        try {
            ResultSet table2 = Login.stmt.executeQuery(s);
            table2.next();
            doctorField.setText(table2.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Login.stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Patient added succesfully!");

        } catch (SQLException ex) {
            Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitMouseClicked

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void amkasearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amkasearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amkasearchActionPerformed

    private void amkasearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amkasearchbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amkasearchbuttonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doneActionPerformed

    private void amkasearchbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amkasearchbuttonMouseClicked
    String amka = amkasearch.getText();
    String sql = "SELECT eksetaseis"
            +" FROM PATIENT"
                + " WHERE PATIENT.amka=" + amka;
        ResultSet rs = null;
        try {
            rs = Login.stmt.executeQuery(sql);
            rs.next();
            examfield.setText(rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_amkasearchbuttonMouseClicked

    private void doneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneMouseClicked
        String sql = "UPDATE\n" +
"    patient\n" +
"SET\n" +
 "    patient.status = 3\n"
                + "WHERE\n" +
 "    patient.amka =" + amkasearch.getText();
      try {
            Login.stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Οι Εξετάσεις Ολοκληρώθηκαν!");
            String docs = "SELECT amka, first, last, eksetaseis"
                + " FROM PATIENT"
                + " WHERE PATIENT.status=2";
          populateTable4(docs);
        } catch (SQLException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_doneMouseClicked

    
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
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nurse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable NurseTable;
    private javax.swing.ButtonGroup SEX;
    private javax.swing.JTextField address;
    private javax.swing.JTextArea allergies;
    private javax.swing.JTextField amkafield;
    private javax.swing.JTextField amkasearch;
    private javax.swing.JButton amkasearchbutton;
    private javax.swing.JCheckBox anapnoi;
    private javax.swing.JTable docTable;
    private javax.swing.JLabel doctorField;
    private javax.swing.JButton done;
    private javax.swing.JCheckBox eksanthima;
    private javax.swing.JLabel examfield;
    private javax.swing.JRadioButton female;
    private javax.swing.JCheckBox gevsi;
    private javax.swing.JTextField insurance;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea longterm;
    private javax.swing.JRadioButton male;
    private javax.swing.JTable managerTable;
    private javax.swing.JCheckBox naftia;
    private javax.swing.JTextField name;
    private javax.swing.JTable patients2;
    private javax.swing.JCheckBox ponokefalos;
    private javax.swing.JCheckBox puretos;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchfield;
    private javax.swing.JButton submit;
    private javax.swing.JTextField surname;
    private javax.swing.JTextField telephone;
    private javax.swing.JCheckBox travma;
    private javax.swing.JCheckBox vuxas;
    // End of variables declaration//GEN-END:variables
}
