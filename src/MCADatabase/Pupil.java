package MCADatabase;

//Import use for methods in the program
import java.util.Date;

public class Pupil {
    //Initialise some global variables which will be used throughout the program for various finctions
    private String name;
    private int age;
    private Date dob;
    private boolean gender;
    private String email;
    private String phoNum;
    private String emerNum;
    private boolean hand;
    private Date sessDate;
    private String sessTime;
    private String sessInfo;
    private String exp;
    private String medical;
    private String pay;
    private int paySess;
    
    //Constructor method used to create an instance of the object and store data on it
    Pupil(String nm, int ag, Date db, boolean gen, String em, String pho) {
        name = nm;
        age = ag;
        dob = db;
        gender = gen;
        email = em;
        phoNum = pho;
    }
    //The accessor and mutator method for each parameter
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    Date getDOB() {
        return dob;
    }

    boolean getGender() {
        return gender;
    }

    String getEmail() {
        return email;
    }

    String getPhoNum() {
        return phoNum;
    }

    String getEmerNum() {
        return emerNum;
    }

    boolean getHand() {
        return hand;
    }

    Date getSessDate() {
        return sessDate;
    }

    String getSessTime() {
        return sessTime;
    }

    String getSessInfo() {
        return sessInfo;
    }

    String getExp() {
        return exp;
    }

    String getMedical() {
        return medical;
    }

    String getPay() {
        return pay;
    }

    int getPaySess() {
        return paySess;
    }

    void setName(String nm) {
        name = nm;
    }

    void setAge(int ag) {
        age = ag;
    }

    void setDOB(Date db) {
        dob = db;
    }

    void setGender(boolean gen) {
        gender = gen;
    }

    void setEmail(String em) {
        email = em;
    }

    void setPhoNum(String pho) {
        phoNum = pho;
    }

    void setEmerNum(String emer) {
        emerNum = emer;
    }

    void setHand(boolean hd) {
        hand = hd;
    }

    void setSessDate(Date sd) {
        sessDate = sd;
    }

    void setSessTime(String st) {
        sessTime = st;
    }

    void setSessInfo(String si) {
        sessInfo = si;
    }

    void setExp(String ex) {
        exp = ex;
    }

    void setMedical(String med) {
        medical = med;
    }

    void setPay(String py) {
        pay = py;
    }

    void setPaySess(int ps) {
        paySess = ps;
    }
}
