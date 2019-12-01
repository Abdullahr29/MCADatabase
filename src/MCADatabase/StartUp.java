package MCADatabase;

//Imports use for various methods in the program
import java.sql.*;
import java.util.logging.*;
import javax.swing.ImageIcon;

public class StartUp extends javax.swing.JFrame {

    //Initialise some global variables which will be used throughout the program for various finctions
    static boolean safeCondition;
    static String safeQuestion, safeAnswer;
    static boolean defCondition = false;
    ImageIcon img = new ImageIcon(getClass().getResource("MCA.PNG"));

    public StartUp() {
        initComponents();
        //Method used to check if it is first time using database. Default login credentials are set and steps to update 
        //the data are outlined
        defaultCheck();
        //Method used to check if the security option has been set up, as makes sure that even if login details are forgotten 
        //they can be retrieved through validation checks and email
        safeCheck();
        forgotButton.setVisible(safeCondition);
        forgotButton.setEnabled(safeCondition);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        userLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        enterButton = new javax.swing.JButton();
        forgotButton = new javax.swing.JButton();
        mainLabel = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setTitle("MCA Login");
        setIconImage(img.getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(251, 5, 5));
        userLabel.setText("Username:");
        getContentPane().add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, -1));

        userField.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 80, 30));

        passLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 6, 6));
        passLabel.setText("Password:");
        getContentPane().add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, -1));

        passField.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 80, 30));

        enterButton.setForeground(new java.awt.Color(0, 0, 102));
        enterButton.setText("Submit");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(enterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 90, -1));

        forgotButton.setForeground(new java.awt.Color(0, 0, 102));
        forgotButton.setText("Forgot username or password?");
        forgotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotButtonActionPerformed(evt);
            }
        });
        getContentPane().add(forgotButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 210, -1));

        mainLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MCADatabase/Cricket_Kids.jpg"))); // NOI18N
        getContentPane().add(mainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        //Button used to enter the username and password which are btoh then checked
        if (userField.getText().equals("")) {
            output("You must enter a username");
        } else if (passField.getText().equals("")) {
            output("You must enter a password");
        //Method databaseCheck is used to make sure that entered login details match those in database
        } else if (databaseCheck()) {
            appStart();
            if (safeCondition == true) {
                output("Welcome");
            } else {
                output("Welcome. Please set up a security option in the Personal Information tab as this will better "
                        + "secure your account");
            }
            this.dispose();
        } else {
            output("Invalid username or password");
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void forgotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotButtonActionPerformed
        //Button used to retrieve forgotten login credentials 
        String answer = "", email = "", sub = "", body = "";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/CricketDatabase";
        String user = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("select * from Forgot");
            rs.absolute(1);
            safeQuestion = rs.getString(2);
            safeAnswer = rs.getString(3);
            answer = input("We'll get you your username and password immediately. Firstly, please answer your security question\n"
                    + safeQuestion);
            if (answer.equalsIgnoreCase(safeAnswer)) {
                email = input("Correct. Now can you enter the email to which you wish to send your login details. Be careful to enter your own email.");
                sub = "Masterclass Database Login Details";
                body = "Your login credentials are as follows:\n ";
                rs = st.executeQuery("select * from Login");
                rs.absolute(1);
                body = body + "Username: " + rs.getString(1) + "\nPassword: " + rs.getString(2) + "\nThank you.";
                //mailMerge class is used to send email to client with credentials
                mailMerge.sendMail(email, sub, body);
            } else {
                output("This isn't the right answer. Please try again.");
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
    }//GEN-LAST:event_forgotButtonActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartUp().setVisible(true);
            }
        });
    }
    //Methods used to show dialog boxes and messages, for either taking input or simply outputting a message
    public String input(String prompt) {
        return javax.swing.JOptionPane.showInputDialog(null, prompt);
    }
    public void output(String message) {
        javax.swing.JOptionPane.showMessageDialog(null, message);
    }
    //Method used to start the actual database if login credentials are correct
    public void appStart() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }
    //Method databaseCheck is used to make sure that entered login details match those in database
    public boolean databaseCheck() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/CricketDatabase";
        String user = "root";
        String password = "";
        boolean check = false;
        try {
            con = sqlDriver.connectDatabase();
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("select * from Login");
            rs.absolute(1);
            if (rs.getString(1).equals(userField.getText()) && rs.getString(2).equals(passField.getText())) {
                check = true;
            }
            rs.absolute(1);
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
        return check;
    }
    //Method used to check if the security option has been set up, as makes sure that even if login details are forgotten 
    //they can be retrieved through validation checks and email
    public void safeCheck() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/CricketDatabase";
        String user = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("select * from Forgot");
            rs.absolute(1);
            try {
                if (rs.getString(1).equals("true")) {
                    safeCondition = true;
                } else {
                    safeCondition = false;
                }
            } catch (SQLException e) {
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
    //Method used to check if it is first time using database. Default login credentials are set and steps to update 
    //the data are outlined
    public void defaultCheck() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/CricketDatabase";
        String user = "root";
        String password = "";
        try {
            con = sqlDriver.connectDatabase();
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("select * from Login");
            if (rs.last() == false) {
                defCondition = true;
                st.executeUpdate("insert into login values('Admin','Admin')");
                output("This is your first login. The username and password are set to: \"Admin\". Please "
                        + "change this in the Personal Information tab in the database immediately. Please also set up a security "
                        + "option to secure your account");
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterButton;
    private javax.swing.JButton forgotButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
