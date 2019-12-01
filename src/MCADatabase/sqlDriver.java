package MCADatabase;

//Imports use for various methods in the program
import java.sql.*;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.util.Locale;
import javax.swing.event.*;

public class sqlDriver {
    //This method is called multiple times throughout the program. It ensures that the database and the table exists.
    //If they do not exist then this code creates them with no rows
    public static Connection connectDatabase() throws SQLException {
        Connection con;
        Statement st = null;
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
        st = con.createStatement();
        st.executeUpdate("CREATE DATABASE IF NOT EXISTS CricketDatabase");
        st.executeUpdate("CREATE TABLE IF NOT EXISTS CricketDatabase.pupils("
                + "ID int(11) NOT NULL AUTO_INCREMENT,"
                + "Name text,"
                + "Age int(11) DEFAULT NULL,"
                + "DOB date DEFAULT NULL,"
                + "Gender text,"
                + "Email text,"
                + "Phone text,"
                + "Emergency text,"
                + "Hand text,"
                + "SessDate date DEFAULT NULL,"
                + "SessTime text DEFAULT NULL,"
                + "SessInfo text,"
                + "Exp text,"
                + "Medical text,"
                + "Pay text,"
                + "PaySess int(11) DEFAULT NULL,"
                + "PRIMARY KEY (ID)"
                + ")");
        st.executeUpdate("CREATE TABLE IF NOT EXISTS CricketDatabase.login("
                + "  Username text,"
                + "  Passcode text"
                + ")");
        st.executeUpdate("CREATE TABLE IF NOT EXISTS CricketDatabase.forms("
                + "  Name text,"
                + "  Form text"
                + ")");
        st.executeUpdate("CREATE TABLE IF NOT EXISTS CricketDatabase.forgot("
                + "  State text,"
                + "  Question text,"
                + "  Answer text"
                + ")");
        st.executeUpdate("CREATE TABLE IF NOT EXISTS CricketDatabase.documents("
                + "  Name text,"
                + "  FileName text,"
                + "  FilePath text"
                + ")");
        return con;
    }
}
