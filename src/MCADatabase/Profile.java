package MCADatabase;

//Imports use for various methods in the program
import static MCADatabase.Application.people;
import java.sql.*;
import java.text.*;
import java.util.Locale;
import java.util.logging.*;
import javax.swing.ImageIcon;

public class Profile extends javax.swing.JFrame {
    
    //Initialise some global variables which will be used throughout the program for various finctions
    public static String param;
    public boolean gen;
    public boolean hand;
    ImageIcon img = new ImageIcon(getClass().getResource("MCA.PNG"));

    public Profile() {
        initComponents();
        //Method used to load data about relevant object or pupil into all the fields
        values();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        phoLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        emerLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        sessInfoLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        sessInfoField = new javax.swing.JTextArea();
        expLabel = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        expField = new javax.swing.JTextArea();
        medLabel = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        medField = new javax.swing.JTextArea();
        dobLabel = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        genLabel = new javax.swing.JLabel();
        payInfoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        payInfoField = new javax.swing.JTextArea();
        handLabel = new javax.swing.JLabel();
        sessTimeLabel = new javax.swing.JLabel();
        emerField = new javax.swing.JTextField();
        maleTogButton = new javax.swing.JToggleButton();
        femTogButton = new javax.swing.JToggleButton();
        rightTogButton = new javax.swing.JToggleButton();
        leftTogButton = new javax.swing.JToggleButton();
        phoField = new javax.swing.JTextField();
        sessDateLabel = new javax.swing.JLabel();
        sessDateField = new javax.swing.JTextField();
        paySessLabel = new javax.swing.JLabel();
        paySessField = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        timeBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MCA Pupil Profile");
        setBackground(java.awt.SystemColor.info);
        setForeground(new java.awt.Color(255, 255, 204));
        setIconImage(img.getImage());

        phoLabel.setForeground(new java.awt.Color(0, 0, 102));
        phoLabel.setText("Phone number:");

        nameLabel.setForeground(new java.awt.Color(0, 0, 102));
        nameLabel.setText("Name:");

        emailField.setForeground(new java.awt.Color(0, 0, 102));

        nameField.setForeground(new java.awt.Color(0, 0, 102));

        emerLabel.setForeground(new java.awt.Color(0, 0, 102));
        emerLabel.setText("Emergency number:");

        emailLabel.setForeground(new java.awt.Color(0, 0, 102));
        emailLabel.setText("Email:");

        sessInfoLabel.setForeground(new java.awt.Color(0, 0, 102));
        sessInfoLabel.setText("Next Session Information:");

        ageField.setForeground(new java.awt.Color(0, 0, 102));

        ageLabel.setForeground(new java.awt.Color(0, 0, 102));
        ageLabel.setText("Age:");

        jScrollPane7.setForeground(new java.awt.Color(0, 0, 102));

        sessInfoField.setColumns(20);
        sessInfoField.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        sessInfoField.setRows(5);
        jScrollPane7.setViewportView(sessInfoField);

        expLabel.setForeground(new java.awt.Color(0, 0, 102));
        expLabel.setText("Cricketing Experience:");

        jScrollPane8.setForeground(new java.awt.Color(0, 0, 102));

        expField.setColumns(20);
        expField.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        expField.setRows(5);
        jScrollPane8.setViewportView(expField);

        medLabel.setForeground(new java.awt.Color(0, 0, 102));
        medLabel.setText("Medical Information:");

        jScrollPane9.setForeground(new java.awt.Color(0, 0, 102));

        medField.setColumns(20);
        medField.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        medField.setRows(5);
        jScrollPane9.setViewportView(medField);

        dobLabel.setForeground(new java.awt.Color(0, 0, 102));
        dobLabel.setText("DOB(dd/mm/yyyy):");

        dobField.setForeground(new java.awt.Color(0, 0, 102));

        genLabel.setForeground(new java.awt.Color(0, 0, 102));
        genLabel.setText("Gender:");

        payInfoLabel.setForeground(new java.awt.Color(0, 0, 102));
        payInfoLabel.setText("Payment Information");

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 102));

        payInfoField.setColumns(20);
        payInfoField.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        payInfoField.setRows(5);
        jScrollPane1.setViewportView(payInfoField);

        handLabel.setForeground(new java.awt.Color(0, 0, 102));
        handLabel.setText("Batting Hand:");

        sessTimeLabel.setForeground(new java.awt.Color(0, 0, 102));
        sessTimeLabel.setText("Next Session Time:");

        emerField.setForeground(new java.awt.Color(0, 0, 102));

        maleTogButton.setForeground(new java.awt.Color(0, 0, 102));
        maleTogButton.setText("Male");
        maleTogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleTogButtonActionPerformed(evt);
            }
        });

        femTogButton.setForeground(new java.awt.Color(0, 0, 102));
        femTogButton.setText("Female");
        femTogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femTogButtonActionPerformed(evt);
            }
        });

        rightTogButton.setForeground(new java.awt.Color(0, 0, 102));
        rightTogButton.setText("Right");
        rightTogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightTogButtonActionPerformed(evt);
            }
        });

        leftTogButton.setForeground(new java.awt.Color(0, 0, 102));
        leftTogButton.setText("Left");
        leftTogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftTogButtonActionPerformed(evt);
            }
        });

        phoField.setForeground(new java.awt.Color(0, 0, 102));

        sessDateLabel.setForeground(new java.awt.Color(0, 0, 102));
        sessDateLabel.setText("Next Session Date:");

        sessDateField.setForeground(new java.awt.Color(0, 0, 102));

        paySessLabel.setForeground(new java.awt.Color(0, 0, 102));
        paySessLabel.setText("Pay per Session:");

        paySessField.setForeground(new java.awt.Color(0, 0, 102));

        exitButton.setForeground(new java.awt.Color(0, 0, 102));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        saveButton.setForeground(new java.awt.Color(0, 0, 102));
        saveButton.setText("Save & Exit");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        resetButton.setForeground(new java.awt.Color(0, 0, 102));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        timeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time", "00:00", "00:15", "00:30", "00:45", "01:00", "01:15", "01:30", "01:45", "02:00", "02:15", "02:30", "02:45", "03:00", "03:15", "03:30", "03:45", "04:00", "04:15", "04:30", "04:45", "05:00", "05:15", "05:30", "05:45", "06:00", "06:15", "06:30", "06:45", "07:00", "07:15", "07:30", "07:45", "08:00", "08:15", "08:30", "08:45", "09:00", "09:15", "09:30", "09:45", "10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "17:45", "18:00", "18:15", "18:30", "18:45", "19:00", "19:15", "19:30", "19:45", "20:00", "20:15", "20:30", "20:45", "21:00", "21:15", "21:30", "21:45", "22:00", "22:15", "22:30", "22:45", "23:00", "23:15", "23:30", "23:45" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(handLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sessDateLabel)
                            .addComponent(sessTimeLabel))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paySessField)
                            .addComponent(sessDateField, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(timeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(paySessLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoLabel)
                            .addComponent(emerLabel)
                            .addComponent(nameLabel)
                            .addComponent(ageLabel)
                            .addComponent(dobLabel)
                            .addComponent(emailLabel)
                            .addComponent(genLabel))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dobField)
                                        .addComponent(ageField)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(phoField)
                                        .addComponent(emerField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maleTogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(femTogButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(leftTogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rightTogButton)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetButton)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sessInfoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(medLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(payInfoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(expLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sessInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dobLabel)
                            .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(maleTogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(femTogButton))))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payInfoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetButton)
                            .addComponent(saveButton)
                            .addComponent(exitButton))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoLabel)
                            .addComponent(phoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emerLabel)
                            .addComponent(emerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(handLabel)
                            .addComponent(rightTogButton)
                            .addComponent(leftTogButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sessDateLabel)
                            .addComponent(sessDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sessTimeLabel)
                            .addComponent(timeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paySessField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paySessLabel))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleTogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleTogButtonActionPerformed
        //Toggle button used to select pupil gender
        gen = true;
    }//GEN-LAST:event_maleTogButtonActionPerformed

    private void femTogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femTogButtonActionPerformed
        //Toggle button used to select pupil gender
        gen = false;
    }//GEN-LAST:event_femTogButtonActionPerformed

    private void leftTogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftTogButtonActionPerformed
        //Toggle button used to select pupil batting hand
        hand = false;
    }//GEN-LAST:event_leftTogButtonActionPerformed

    private void rightTogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightTogButtonActionPerformed
        //Toggle button used to select pupil batting hand
        hand = true;
    }//GEN-LAST:event_rightTogButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        //Button used to return fields to their original state
        values();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // Button used to update object after changes have been made 
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/CricketDatabase";
        String user = "root";
        String password = "";
        int rowNum = 0;
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("select distinct ID from Pupils where Name='" + param + "'");
            if (rs.next()) {
                rowNum = (rs.getInt(1));
            }
            for (int count = 0; count < Application.index; count++) {
                if (Application.people[count].getName().equals(param)) {
                    Application.people[count].setName(nameField.getText());
                    Application.people[count].setAge(Integer.parseInt(ageField.getText()));
                    DateFormat fDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                    try {
                        Application.people[count].setDOB(fDate.parse(dobField.getText()));
                    } catch (ParseException ex) {
                        Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Application.people[count].setGender(gen);
                    Application.people[count].setEmail(emailField.getText());
                    Application.people[count].setPhoNum(phoField.getText());
                    Application.people[count].setEmerNum(emerField.getText());
                    Application.people[count].setHand(hand);
                    try {
                        Application.people[count].setSessDate(fDate.parse(sessDateField.getText()));
                    } catch (ParseException ex) {
                        Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Application.people[count].setSessTime(timeBox.getSelectedItem() + "");
                    Application.people[count].setPaySess(Integer.parseInt(paySessField.getText()));
                    Application.people[count].setSessInfo(sessInfoField.getText());
                    Application.people[count].setExp(expField.getText());
                    Application.people[count].setMedical(medField.getText());
                    Application.people[count].setPay(payInfoField.getText());
                    try {
                        reWrite();
                    } catch (ParseException ex) {
                        Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(tester.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(tester.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
        this.dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //Exits this frame and goes back to the main one 
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }
    //Method used to rewrite changes and updates back to the database
    public void reWrite() throws ParseException {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/CricketDatabase";
        String user = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            st.executeUpdate("truncate Pupils");
            for (int count = 0; count < Application.index; count++) {
                String gen, hand;
                java.util.Date utilDate = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy").parse(Application.people[count].getDOB() + "");
                java.sql.Date dateB = new java.sql.Date(utilDate.getTime());
                java.util.Date utilDatea = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy").parse(Application.people[count].getSessDate() + "");
                java.sql.Date dateS = new java.sql.Date(utilDatea.getTime());
                if (Application.people[count].getGender() == true) {
                    gen = "Male";
                } else {
                    gen = "Female";
                }
                if (Application.people[count].getHand() == true) {
                    hand = "Right";
                } else {
                    hand = "Left";
                }
                st.executeUpdate("insert into Pupils values(" + (count + 1) + ",'" + rep(people[count].getName()) + "'," + people[count].getAge() + ",'" + dateB + "','"
                        + gen + "','" + rep(people[count].getEmail()) + "','" + people[count].getPhoNum() + "','" + people[count].getEmerNum() + "','"
                        + hand + "','" + dateS + "','" + people[count].getSessTime() + "','" + rep(people[count].getSessInfo()) + "','"
                        + rep(people[count].getExp()) + "','" + rep(people[count].getMedical()) + "','" + rep(people[count].getPay()) + "'," + people[count].getPaySess()
                        + ")");
            }
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(tester.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(tester.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
    public String rep(String rep) {
        try{
        if(rep.contains("'"))
            return rep.replaceAll("'", "''");
        else
            return rep;
        } catch(NullPointerException e){}
        return rep;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField dobField;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emerField;
    private javax.swing.JLabel emerLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextArea expField;
    private javax.swing.JLabel expLabel;
    private javax.swing.JToggleButton femTogButton;
    private javax.swing.JLabel genLabel;
    private javax.swing.JLabel handLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JToggleButton leftTogButton;
    private javax.swing.JToggleButton maleTogButton;
    private javax.swing.JTextArea medField;
    private javax.swing.JLabel medLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextArea payInfoField;
    private javax.swing.JLabel payInfoLabel;
    private javax.swing.JTextField paySessField;
    private javax.swing.JLabel paySessLabel;
    private javax.swing.JTextField phoField;
    private javax.swing.JLabel phoLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JToggleButton rightTogButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField sessDateField;
    private javax.swing.JLabel sessDateLabel;
    private javax.swing.JTextArea sessInfoField;
    private javax.swing.JLabel sessInfoLabel;
    private javax.swing.JLabel sessTimeLabel;
    private javax.swing.JComboBox<String> timeBox;
    // End of variables declaration//GEN-END:variables
    //Method used to load values into every field from current pupil or object values
    private void values() {
        for (int count = 0; count < Application.index; count++) {
            if (Application.people[count].getName().equals(param)) {
                nameField.setText(Application.people[count].getName());
                ageField.setText(Application.people[count].getAge() + "");
                SimpleDateFormat fDate = new SimpleDateFormat("dd/MM/yyyy");
                dobField.setText(fDate.format(Application.people[count].getDOB()));
                if (Application.people[count].getGender() == true) {
                    genLabel.setText("Gender(Currently: Male)");
                } else {
                    genLabel.setText("Gender(Currently: Female");
                }
                emailField.setText(Application.people[count].getEmail());
                phoField.setText(Application.people[count].getPhoNum());
                emerField.setText(Application.people[count].getEmerNum());
                if (Application.people[count].getHand() == true) {
                    handLabel.setText("Batting Hand(Currently: Right)");
                } else {
                    handLabel.setText("Batting Hand(Currently: Left)");
                }
                sessDateField.setText(fDate.format(Application.people[count].getSessDate()));
                timeBox.setSelectedItem(Application.people[count].getSessTime());
                paySessField.setText(Application.people[count].getPaySess() + "");
                sessInfoField.setText(Application.people[count].getSessInfo());
                expField.setText(Application.people[count].getExp());
                medField.setText(Application.people[count].getMedical());
                payInfoField.setText(Application.people[count].getPay());
            }
        }
    }
}
