package LoginPackage;

import ThreadPackage.DaemonThread;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class LoginPage extends javax.swing.JFrame {

    Connection con = null;

    public LoginPage() {

        initComponents();
        setTitle("Online Voting App");
        warning.setVisible(false);

        try {
            DaemonThread dt = new DaemonThread(con, dbUrl, dbUsername, dbPassword);
            dt.setDaemon(true);
            dt.start();

            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            isConnected = true;

        } catch (SQLException e) {
            isConnected = false;
            JOptionPane.showMessageDialog(null, "Check Your Internet Connection !");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        GotoResult = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jcheckbox = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        userName = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        LoginButton = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("The Most Powerful thing");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 270, 44));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CHARUSAT");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 190, 44));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("we own is our vote");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 230, 44));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 210, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginPackage/login backgroung.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        GotoResult.setBackground(new java.awt.Color(36, 47, 65));
        GotoResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GotoResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GotoResultMouseClicked(evt);
            }
        });
        GotoResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Log In");
        GotoResult.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 230, 44));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Go to Results");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GotoResult.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        jPanel1.add(GotoResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 600));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" VOTING APP");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 230, 44));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 190, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Log in");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 80, 40));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 240, 10));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID NO.");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 230, 44));

        jcheckbox.setBackground(new java.awt.Color(204, 204, 204));
        jcheckbox.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcheckbox.setForeground(new java.awt.Color(0, 204, 204));
        jcheckbox.setText("Show password");
        jcheckbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckboxActionPerformed(evt);
            }
        });
        jPanel2.add(jcheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 120, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PASSWORD");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 230, 20));

        password.setBackground(new java.awt.Color(36, 47, 65));
        password.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 240, 30));

        userName.setBackground(new java.awt.Color(36, 47, 65));
        userName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setBorder(null);
        jPanel2.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 240, 30));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 240, 20));

        LoginButton.setBackground(new java.awt.Color(0, 204, 204));
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        LoginButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Log In");
        LoginButton.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 230, 44));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Login");
        LoginButton.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel2.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 100, 30));

        warning.setForeground(new java.awt.Color(255, 0, 0));
        warning.setText("*  Please  enter  ID  and / or  Password");
        jPanel2.add(warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 260, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 360, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckboxActionPerformed
        // TODO add your handling code here:
        if (jcheckbox.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_jcheckboxActionPerformed

    private void GotoResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GotoResultMouseClicked
        // TODO add your handling code here:
        ResultPage rp = new ResultPage(con, dbUrl, dbUsername, dbPassword);
        setVisible(false);
        rp.setVisible(true);
//        dispose();
    }//GEN-LAST:event_GotoResultMouseClicked

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        // TODO add your handling code here:
        if (userName.getText().equalsIgnoreCase("") || password.getText().equalsIgnoreCase("")){

            warning.setVisible(true);
        } 
        else{
            try {
                warning.setVisible(false);
//                  Class.forName("com.mysql.cj.jdbc.Driver");
                if (!isConnected) {
                    con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
                }
                isConnected = true;

                String query = "select * from Candidates";

                Statement st = st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                ArrayList<String> al = new ArrayList<String>();

                while (rs.next()) {
                    al.add(rs.getString("Name"));
                }

                String[] str = new String[al.size()];

                for (int i = 0; i < al.size(); i++) {
                    str[i] = al.get(i);
                }

                VotingPage vt = new VotingPage(con, userName.getText());
                vt.candidateList.setListData(str);

                query = "select * from Voters";
                rs = st.executeQuery(query);

                short cnt = 0;

                while (rs.next()) {
                    if (rs.getString("Username").equalsIgnoreCase(userName.getText()) && rs.getString("Password").equals(password.getText())) {

                        cnt = 1;

                        if (rs.getInt("Count") == 0) {

                            setVisible(false);
                            vt.setVisible(true);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "You have already voted.");
                            userName.setText(null);
                            password.setText(null);
                        }
                    }
                }
                if (cnt == 0) {
                    JOptionPane.showMessageDialog(null, "Login fail !!!\nCheck Username and Password !");
                    password.setText(null);
                }

            } catch (SQLException sqle) {

                isConnected = false;
                JOptionPane.showMessageDialog(null, "Check Your Internet Connection !");
            } catch (Exception e) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Some error accours !!!");
            }
        }
    }//GEN-LAST:event_LoginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
    
    //You have to enter your remote database datails to make it working project                     //OR you can use local database 
    //You can use free remote database i.g., db4free.com                                            //But it is limited to your PC only
    
    private String hostName = "/*Host name of your remote database provider*/";                      //"localhost:3306";
    private String databaseName = "/*Name of your database*/";                                      //"raj";
    private String dbUrl = "jdbc:mysql://" + hostName + "/" + databaseName;
    private String dbUsername = "/*Username of your remote database*/";                             //"root";
    private String dbPassword = "/*Password of your remote database*/";                             //"MySQL@123";    

    public static boolean isConnected = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GotoResult;
    private javax.swing.JPanel LoginButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JCheckBox jcheckbox;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
