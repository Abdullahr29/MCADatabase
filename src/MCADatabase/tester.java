package MCADatabase;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class tester {

    public static void main(String args[]) throws SQLException {
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
            rs = st.executeQuery("select * from login");
            if(rs.last()==false){
                System.out.println("Error");
            }
            else{
                System.out.println("Errosr");
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
}
