/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360project;

import java.sql.*;


/**
 *
 * @author Akis Sougias
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost";
        String databaseName = "mysql";
        int port = 3306;
        String username = "root";
        String password = "";
        Connection con = DriverManager.getConnection(
                url + ":" + port + "/" + databaseName + "?characterEncoding=UTF-8", username, password);

        System.out.println("Creating database...");
        Statement stmt = con.createStatement();
        //String drop = "DROP DATABASE HOSPITALDB";
        //stmt.executeUpdate(drop);

        ResultSet resultSet = con.getMetaData().getCatalogs();


        String db = "HOSPITALDB";
        int exists = 0;
        //iterate each catalog in the ResultSet
        while (resultSet.next()) {
            // Get the database name, which is at position 1
            String databasename = resultSet.getString(1);
            System.out.println(databasename);
            if (databasename.equals(db)) {
                exists = 1;
            }
        }

        if (exists == 0) {
            String sql = "CREATE DATABASE HOSPITALDB";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        }
        resultSet.close();
        //Connecting with the HospitalDB
        String DB_URL = "jdbc:mysql://localhost/hospitaldb";
        System.out.println("Connecting to a selected database...");
        con = DriverManager.getConnection(DB_URL, username, password);
        System.out.println("Connected database successfully...");

        Statement stmt2 = con.createStatement();

        // EMPLOYEES TABLE
        String sql = "CREATE TABLE IF NOT EXISTS EMPLOYEE"
                + "(id INTEGER not NULL,"
                + "password varchar(255),"
                + "first VARCHAR(255) not NULL,"
                + "last VARCHAR(255) not NULL,"
                + "type VARCHAR(255) not NULL, "
                + "telephone VARCHAR(255),"
                + "address VARCHAR(255),"
                + "PRIMARY KEY ( id ))";

        stmt2.executeUpdate(sql);

        // DOCTORS TABLE
        sql = "CREATE TABLE IF NOT EXISTS DOCTORS"
                + "(id INTEGER PRIMARY KEY REFERENCES EMPLOYEE(id),"
                + "specialty VARCHAR(255),"
                + "first VARCHAR(255) REFERENCES EMPLOYEE (first),"
                + "last VARCHAR(255) REFERENCES EMPLOYEE (last))";


        stmt2.executeUpdate(sql);
        // MANAGERS TABLE
        sql = "CREATE TABLE IF NOT EXISTS MANAGERS"
                + "(id INTEGER PRIMARY KEY REFERENCES EMPLOYEE(id),"
                + "grade VARCHAR(255),"
                + "first VARCHAR(255) REFERENCES EMPLOYEE (first),"
                + "last VARCHAR(255)  REFERENCES EMPLOYEE (last))";

        stmt2.executeUpdate(sql);

        // PATIENT TABLE
        sql = "CREATE TABLE IF NOT EXISTS PATIENT"
                + "(amka INTEGER not NULL,"
                + "first VARCHAR(255) not NULL,"
                + "last VARCHAR(255) not NULL,"
                + "sex VARCHAR(255),"
                + "insurance VARCHAR(255),"
                + "telephone VARCHAR(255),"
                + "address VARCHAR(255),"
                + "long_term VARCHAR(255),"
                + "allergies VARCHAR(255),"
                + "diagnose VARCHAR(255),"
                + "eksetaseis VARCHAR(255),"
                + "status VARCHAR(255),"
                + "PRIMARY KEY ( amka ))";

        stmt2.executeUpdate(sql);

        // MEDICINES TABLE
        sql = "CREATE TABLE IF NOT EXISTS MEDICINE"
                + "(mid INTEGER not NULL,"
                + "name VARCHAR(255) not NULL,"
                + "type VARCHAR(255) not NULL,"
                + "injection VARCHAR(255) not NULL,"
                + "isindicated VARCHAR(255),"
                + "quantity VARCHAR(255),"
                + "PRIMARY KEY ( mid ))";

        stmt2.executeUpdate(sql);

         // SYMPTOMES TABLE
        sql = "CREATE TABLE IF NOT EXISTS SYMPTOME"
                + "(type VARCHAR(255) not NULL,"
                + "doctor VARCHAR(255) not NULL,"
                + "PRIMARY KEY ( type ))";

        stmt2.executeUpdate(sql);

        // RECORD TABLE
        sql = "CREATE TABLE IF NOT EXISTS RECORD"
                + "(amka INTEGER PRIMARY KEY REFERENCES EMPLOYEE(amka),"
                + "date DATE,"
                + "treatment VARCHAR(255),"
                + "diagnose TEXT)";

        stmt2.executeUpdate(sql);

        // DIAGNOSE TABLE
        sql = "CREATE TABLE IF NOT EXISTS DIAGNOSE"
                +"(id VARCHAR(255))";

        stmt2.executeUpdate(sql);

        // EXAMINATIONS TABLE
        sql = "CREATE TABLE IF NOT EXISTS EXAMINATION"
                +"(id VARCHAR(255))";

        stmt2.executeUpdate(sql);



        /***************** INSERTIONS ***************/

        /** DOCTORS **/

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(1314, 'password123','Jason', 'Ntagian', 'Doctor', 666, 'Archanes 69')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(1324, 'password123','Jason', 'Ntagian', 'Manager', 666, 'Archanes 69')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO DOCTORS(id, specialty, first, last)"
                + "VALUES(1314, 'Gynaikologos', 'Jason', 'Ntagian' )";
        stmt2.executeUpdate(sql);
        
        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(1315, 'password123','Jason', 'Antigon', 'Doctor', 6944365487, 'Palama 13')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO DOCTORS(id, specialty, first, last)"
                + "VALUES(1315,'Ofthalmiatros', 'Jason', 'Antigon' )";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(1316, 'password123','MondeChristo', 'Rafto', 'Doctor', 6987423142, 'Kalokairinou 12')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO DOCTORS(id, specialty, first, last)"
                + "VALUES(1316,'Pneumonologos', 'MondeChristo', 'Rafto' )";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(1317, 'password123','Madclip', 'Gamma', 'Doctor', 6987424203, 'Kariotisis 9')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO DOCTORS(id, specialty, first, last)"
                + "VALUES(1317,'Pathologos', 'Madclip', 'Gamma' )";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(1318, 'password123','Xaralabos', 'ElSouyiaa', 'Doctor', 6947517372, 'Diktis 13')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO DOCTORS(id, specialty, first, last)"
                + "VALUES(1318,'Xeirourgos', 'Xaralabos', 'ElSouyia' )";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(2314, 'password123','Jasonee', 'Ntagianee', 'Doctor', 666, 'Archanes 69')";
        stmt2.executeUpdate(sql);

        sql= "INSERT INTO DOCTORS(id, specialty, first, last)"
                + "VALUES(2318,'Xeirourgos', 'Xaralabosee', 'ElSouyiaee' )";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(2318, 'password123','Xaralabosee', 'ElSouyiaaee', 'Doctor', 6947517372, 'Diktis 13')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO DOCTORS(id, specialty, first, last)"
                 +"VALUES(2317,'Pathologos', 'Madclipee', 'Gammaee' )";
stmt2.executeUpdate(sql);

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                +"VALUES(2317, 'password123','Madclipee', 'Gammaee', 'Doctor', 6987424203, 'Kariotisis 9')";
stmt2.executeUpdate(sql);

        sql = "INSERT INTO DOCTORS(id, specialty, first, last)"
                + "VALUES(2316,'Pneumonologos', 'MondeChristoee', 'Raftoee' )";
stmt2.executeUpdate(sql);

        sql = "INSERT INTO DOCTORS(id, specialty, first, last)"
                + "VALUES(2315,'Ofthalmiatros', 'Jasonee', 'Antigonee' )";

stmt2.executeUpdate(sql);

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(2316, 'password123','MondeChristoee', 'Raftoee', 'Doctor', 6987423142, 'Kalokairinou 12')";
                 
                 stmt2.executeUpdate(sql);
        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                 +"VALUES(2315, 'password123','Jasonee', 'Antigonee', 'Doctor', 6944365487, 'Palama 13')";
stmt2.executeUpdate(sql);

        sql = "INSERT INTO DOCTORS(id, specialty, first, last)"
                 +"VALUES(2314, 'Gynaikologos', 'Jasonee', 'Ntagianee' )";
stmt2.executeUpdate(sql);

        /** SYMPTOMES **/
        sql = "INSERT INTO SYMPTOME(type,doctor)"
                +"VALUES('puretos', 'Pathologos')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO SYMPTOME(type,doctor)"
                +"VALUES('vuxas', 'Pathologos')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO SYMPTOME(type,doctor)"
                +"VALUES('tuflwsi', 'Ofthalmiatros')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO SYMPTOME(type,doctor)"
                +"VALUES('eksanthima', 'Dermatologos')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO SYMPTOME(type,doctor)"
                +"VALUES('ponolaimos', 'Pathologos')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO SYMPTOME(type,doctor)"
                +"VALUES('diarroia', 'Gunaikologos')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO SYMPTOME(type,doctor)"
                +"VALUES('naftia', 'Gunaikologos')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO SYMPTOME(type,doctor)"
                +"VALUES('anapnoi', 'Orthopaidikos')";
        stmt2.executeUpdate(sql);

        /** NURSES **/

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                +"VALUES(1331, 'password123','Amanda', 'Cherry', 'Nurse', 6938654531, 'Ieroloxitwn 29')";
        stmt2.executeUpdate(sql);

         sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                +"VALUES(1332, 'password123','Dimitra', 'Stavropoulou', 'Nurse', 6958654531, 'Dionisiou 52')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                +"VALUES(1333, 'password123','Dima', 'Dramountanou', 'Nurse', 6938654831, 'Palmeti 58')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
        +"VALUES(1334,  'password123','Jenny','Mpotsi', 'Nurse', 69386578458, 'Skra 12')";
        stmt2.executeUpdate(sql);


        /** MANAGERS **/

        sql = "INSERT INTO MANAGERS(id, grade, first, last)"
                + "VALUES(1324, 'President', 'Jason', 'Ntagian')";
        stmt2.executeUpdate(sql);
        
        sql = "INSERT INTO MANAGERS(id, grade, first, last)"
                + "VALUES(1325, 'Vice President', 'Camala', 'Harris')";
        stmt2.executeUpdate(sql);
        
        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(1325, 'password123','Camala', 'Harris', 'Manager', 694572135, 'Kalamitsion 16')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO MANAGERS(id, grade, first, last)"
                + "VALUES(1326, 'Secretary', 'Katia', 'Sakellaropoulou')";
        stmt2.executeUpdate(sql);
        
        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(1326, 'password123','Katia', 'Sakellaropoulou', 'Manager', 6983876373, 'Diktis 19')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO MANAGERS(id, grade, first, last)"
                + "VALUES(1358, 'Member', 'Bonson', 'Joris')";
        stmt2.executeUpdate(sql);
        
        sql = "INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)"
                + "VALUES(1358, 'password123','Bonson', 'Joris', 'Manager', 6983845549, 'Evans 858')";
        stmt2.executeUpdate(sql);


        /** DIAGNOSE **/

        sql = "INSERT INTO DIAGNOSE(id)"
                + "VALUES('COVID-19')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO DIAGNOSE(id)"
                + "VALUES('flue')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO DIAGNOSE(id)"
                + "VALUES('Otitis')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO DIAGNOSE(id)"
                + "VALUES('Egkefaliko')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO DIAGNOSE(id)"
                + "VALUES('Katagma')";
        stmt2.executeUpdate(sql);

        /** EXAMINATIONS **/

        sql = "INSERT INTO EXAMINATION(id)"
                + "VALUES('Urine Test')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EXAMINATION(id)"
                + "VALUES('Supersonic')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EXAMINATION(id)"
                + "VALUES('Heart Pulse Test')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EXAMINATION(id)"
                + "VALUES('Blood Test')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO EXAMINATION(id)"
                + "VALUES('Covid-19')";
        stmt2.executeUpdate(sql);

        /** MEDICINES **/

        sql = "INSERT INTO MEDICINE(mid, name, type, injection, isindicated,quantity)"
                + "VALUES(1236,'Advil','Tablet','Oral','PainKiller','100mg')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO MEDICINE(mid, name, type, injection, isindicated,quantity)"
                + "VALUES(1238,'Acetamoniphen','Tablet','Oral','PainKiller','100mg')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO MEDICINE(mid, name, type, injection, isindicated,quantity)"
                + "VALUES(1239,'Amoxyl','Tablet','Oral','Depression','150mg')";
        stmt2.executeUpdate(sql);

        sql = "INSERT INTO MEDICINE(mid, name, type, injection, isindicated,quantity)"
                + "VALUES(1246,'Augmentin','Liquid','Oral','Influenza','500mg')";
        stmt2.executeUpdate(sql);

         sql = "INSERT INTO MEDICINE(mid, name, type, injection, isindicated,quantity)"
                + "VALUES(1287,'Vyzantinon','Gel','Skin','Covid-19','1000mg')";
        stmt2.executeUpdate(sql);

        sql = "CREATE TABLE IF NOT EXISTS SHIFT"
                + "(id VARCHAR(255),date DATE)";

        stmt2.executeUpdate(sql);

                /***************** INSERTIONS ***************/

        /** SHIFT **/

        sql = "INSERT INTO SHIFT(id, date)"
                +"VALUES(1314, '2020-10-10')";
                stmt2.executeUpdate(sql);

        sql = "INSERT INTO SHIFT(id, date)"
                +" VALUES(1315, '2020-10-10')";
                stmt2.executeUpdate(sql);

        sql = "INSERT INTO SHIFT(id, date)"
                + "VALUES(1316, '2020-10-10')";
                stmt2.executeUpdate(sql);

        sql = "INSERT INTO SHIFT(id, date)"                 +"VALUES(1317, '2020-10-10')";
                 stmt2.executeUpdate(sql);

        sql = "INSERT INTO SHIFT(id, date)"
                + "VALUES(1318, '2020-10-10')";
                stmt2.executeUpdate(sql);

        sql = "INSERT INTO SHIFT(id, date)"                 +"VALUES(1331, '2020-10-10')";
                 stmt2.executeUpdate(sql);

        sql = "INSERT INTO SHIFT(id, date)"                 +"VALUES(1332, '2020-10-10')";
                 stmt2.executeUpdate(sql);

        sql = "INSERT INTO SHIFT(id, date)"                 +"VALUES(1326, '2020-10-10')";
                 stmt2.executeUpdate(sql);



        if (con != null) {
            con.close();
        }

    }

}
