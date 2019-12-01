package MCADatabase;

//Imports use for various methods in the program
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class mailMerge {
    //Initialise some global variables which will be used throughout the program for finctions
    private static String email_my = "mcadatabase.noreply@gmail.com",
            password_my = "MasterClass",
            host_at = "smtp.gmail.com",
            port_num = "465";
    //Actual method used to send emails given the necessary parameters
    public static boolean sendMail(String strTo, String strSubject, String strBody) {
        Properties property = new Properties();
        property.put("mail.smtp.user", email_my);
        property.put("mail.smtp.host", host_at);
        property.put("mail.smtp.port", port_num);
        property.put("mail.smtp.starttls.enable", "true");
        property.put("mail.smtp.auth", "true");
        property.put("mail.smtp.socketFactory.port", port_num);
        property.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        property.put("mail.smtp.socketFactory.fallback", "false");
        try {
            Session sess = Session.getDefaultInstance(property, null);
            try (Transport trans = sess.getTransport("smtp")) {
                MimeMessage message = new MimeMessage(sess);
                message.setText(strBody);
                message.setSubject(strSubject);
                message.setFrom(new InternetAddress(email_my));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(strTo));
                message.saveChanges();
                trans.connect(host_at, email_my, password_my);
                trans.sendMessage(message, message.getAllRecipients());
            }
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
