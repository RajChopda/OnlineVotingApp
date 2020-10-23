package ThreadPackage;

import LoginPackage.LoginPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;

public class DaemonThread extends Thread {

    Connection con;
    String dbUrl;
    String dbUsername;
    String dbPassword;

    public DaemonThread(Connection con, String dbUrl, String dbUsername, String dbPassword) {
        this.con = con;
        this.dbUrl = dbUrl;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }

/////////////////////////////////////////////////////////

    //Infinite Daemon Thread using for loop and Thread.sleep() method

    /*    public void run() {
        for (;;) {
            try {
//                System.out.println("Started");
                Thread.sleep(3000);
//                System.out.println(LoginPage.isConnected);
                if (!LoginPage.isConnected) {
                    con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
                }
                LoginPage.isConnected = true;
//                System.out.println(LoginPage.isConnected);

            } catch (InterruptedException | SQLException ex) {
                //            Logger.getLogger(DaemonThread.class.getName()).log(Level.SEVERE, null, ex);
                LoginPage.isConnected = false;
                JOptionPane.showMessageDialog(null, "Check Your Internet Connection !");
            }
        }
    }
     */
/////////////////////////////////////////////////////
    
/////////////////////////////////////////////////////    

    //Infinite Thread using Timer class

    Timer timer = new Timer();

    @Override
    public void run() {

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
//                    System.out.println("Started");
//                    System.out.println(LoginPage.isConnected);
                    if (!LoginPage.isConnected) {
                        con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
                    }
                    LoginPage.isConnected = true;
//                    System.out.println(LoginPage.isConnected);

                } catch (SQLException ex) {
//                    Logger.getLogger(DaemonThread.class.getName()).log(Level.SEVERE, null, ex);
                    LoginPage.isConnected = false;
                    JOptionPane.showMessageDialog(null, "Check Your Internet Connection !");
                }
            }
        }, 30000, 30000);
    }
    
///////////////////////////////////////////////////////////
}
