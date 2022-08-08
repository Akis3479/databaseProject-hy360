
/** CREATING DATABASE **/

CREATE DATABASE HOSPITALDB;

/** CREATING EMPLOYEE TABLE **/

CREATE TABLE IF NOT EXISTS EMPLOYEE
                (
                id INTEGER not NULL,
                password varchar(255),
                first VARCHAR(255) not NULL,
                last VARCHAR(255) not NULL,
                type VARCHAR(255) not NULL, 
                telephone VARCHAR(255),
                address VARCHAR(255),
                PRIMARY KEY ( id )
                );

/** CREATING DOCTORS TABLE **/

CREATE TABLE IF NOT EXISTS DOCTORS
                (
                id INTEGER PRIMARY KEY REFERENCES EMPLOYEE(id),
                specialty VARCHAR(255),
                first VARCHAR(255) REFERENCES EMPLOYEE (first),
                last VARCHAR(255) REFERENCES EMPLOYEE (last)
                );

/** CREATING DOCTORS TABLE **/

CREATE TABLE IF NOT EXISTS MANAGERS
                (
                id INTEGER PRIMARY KEY REFERENCES EMPLOYEE(id),
                grade VARCHAR(255),
                first VARCHAR(255) REFERENCES EMPLOYEE (first),
                last VARCHAR(255)  REFERENCES EMPLOYEE (last)
                );

/** CREATING PATIENTS TABLE **/
/*status 1 neos
         2 eggrafi
         3 diagnosi 
         4 eksetasi
         5 eksitirio
*/

CREATE TABLE IF NOT EXISTS PATIENT
                (
                amka INTEGER not NULL,
                first VARCHAR(255) not NULL,
                last VARCHAR(255) not NULL,
                sex VARCHAR(255),
                insurance VARCHAR(255),
                telephone VARCHAR(255),
                address VARCHAR(255),
                long_term VARCHAR(255),
                allergies VARCHAR(255),
                status INTEGER,
                diagnose VARCHAR(255)
                PRIMARY KEY ( amka )
                );

/** CREATING MEDICINES TABLE **/

CREATE TABLE IF NOT EXISTS MEDICINE
                (mid INTEGER not NULL,
                name VARCHAR(255) not NULL,
                type VARCHAR(255) not NULL,
                injection VARCHAR(255) not NULL,
                isindicated VARCHAR(255),
                quantity VARCHAR(255),
                PRIMARY KEY ( mid )
                );

/** CREATING SYMPTOMS TABLE **/

CREATE TABLE IF NOT EXISTS SYMPTOME
                (type VARCHAR(255) not NULL,
                doctor VARCHAR(255) not NULL,
                PRIMARY KEY ( type )
                );

/** CREATING PATIENT RECORD TABLE **/

CREATE TABLE IF NOT EXISTS RECORD
                (amka INTEGER PRIMARY KEY REFERENCES EMPLOYEE(amka),
                date DATE,
                treatment VARCHAR(255),
                diagnose VARCHAR(255)
                );


CREATE TABLE IF NOT EXISTS DIAGNOSE
                (id VARCHAR(255),
                PRIMARY KEY ( id )
                );

CREATE TABLE IF NOT EXISTS EXAMINATION
                (
                    id VARCHAR(255)
                );

CREATE TABLE IF NOT EXISTS SHIFT
                (
                    id VARCHAR(255),
                    date DATE
                );

CREATE TABLE IF NOT EXISTS SHIFTRECORD
                (
                    id VARCHAR(255),
                    date DATE
                );


                /***************** INSERTIONS ***************/

/**INSERT DUMMY PATIENTS**/
INSERT INTO PATIENT(amka, first, last, sex, insurance, telephone, address, long_term, allergies, status)
         VALUES(123, 'Akritas','Arximidis', 'MALE', 'IKA', 6669, 'Archanes 25','Asthma','Kafes', 1 );

INSERT INTO PATIENT(amka, first, last, sex, insurance, telephone, address, long_term, allergies, status)
         VALUES(125, 'Giannis','Anetokoumpo', 'MALE', 'OGA', 6969, 'Palma 12','Arthritis','Anthos elias', 1 );

INSERT INTO PATIENT(amka, first, last, sex, insurance, telephone, address, long_term, allergies, status)
         VALUES(126, 'Orestis','Pirosvestidis', 'MALE', 'TEBE', 6945, 'Aristofani 15','Alzheimer','Celery', 4 );

INSERT INTO PATIENT(amka, first, last, sex, insurance, telephone, address, long_term, allergies, status)
         VALUES(127, 'Maria','Papadimtriadou', 'FEMALE', 'IKA', 6947, 'Palmeti 15','Myalgic','Garlic,eggs,oats', 5 );

INSERT INTO PATIENT(amka, first, last, sex, insurance, telephone, address, long_term, allergies, status)
         VALUES(128, 'Ksenia','Dafnopoulou', 'FEMALE', 'TEBE', 6957, 'Kalokairinou 15','Hypertension','Hot peppers', 3 );

        /** SHIFT **/

INSERT INTO SHIFT(id, date)
                 VALUES(1314, 2020-10-10);

INSERT INTO SHIFT(id, date)
                 VALUES(1315, 2020-10-10);

INSERT INTO SHIFT(id, date)
                 VALUES(1316, 2020-10-10);

INSERT INTO SHIFT(id, date)
                 VALUES(1317, 2020-10-10);

INSERT INTO SHIFT(id, date)
                 VALUES(1318, 2020-10-10);

INSERT INTO SHIFT(id, date)
                 VALUES(1331, 2020-10-10);

INSERT INTO SHIFT(id, date)
                 VALUES(1332, 2020-10-10);

INSERT INTO SHIFT(id, date)
                 VALUES(1326, 2020-10-10);

        /** DOCTORS **/

        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(1314, 'password123','Jason', 'Ntagian', 'Doctor', 666, 'Archanes 69');
        
        
        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(1324, 'password123','Jason', 'Ntagian', 'Manager', 666, 'Archanes 69');
        

        INSERT INTO DOCTORS(id, specialty, first, last)
                 VALUES(1314, 'Gynaikologos', 'Jason', 'Ntagian' );
        
        
        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(1315, 'password123','Jason', 'Antigon', 'Doctor', 6944365487, 'Palama 13');
        

        INSERT INTO DOCTORS(id, specialty, first, last)
                 VALUES(1315,'Ofthalmiatros', 'Jason', 'Antigon' );
        
        

        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(1316, 'password123','MondeChristo', 'Rafto', 'Doctor', 6987423142, 'Kalokairinou 12');
        
        

        INSERT INTO DOCTORS(id, specialty, first, last)
                 VALUES(1316,'Pneumonologos', 'MondeChristo', 'Rafto' );
        
        

        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(1317, 'password123','Madclipee', 'Gammaee', 'Doctor', 6987424203, 'Kariotisis 9');
        
        

        INSERT INTO DOCTORS(id, specialty, first, last)
                 VALUES(1317,'Pathologos', 'Madclip', 'Gamma' );
        
        

        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(1318, 'password123','Xaralabos', 'ElSouyiaa', 'Doctor', 6947517372, 'Diktis 13');
        

        INSERT INTO DOCTORS(id, specialty, first, last)
                 VALUES(1318,'Xeirourgos', 'Xaralabos', 'ElSouyia' );
        
        
        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(2314, 'password123','Jasonee', 'Ntagianee', 'Doctor', 666, 'Archanes 69');
        

        INSERT INTO DOCTORS(id, specialty, first, last)
                 VALUES(2318,'Xeirourgos', 'Xaralabosee', 'ElSouyiaee' );

        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(2318, 'password123','Xaralabosee', 'ElSouyiaaee', 'Doctor', 6947517372, 'Diktis 13');
        
        INSERT INTO DOCTORS(id, specialty, first, last)
                 VALUES(2317,'Pathologos', 'Madclipee', 'Gammaee' );

        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(2317, 'password123','Madclipee', 'Gammaee', 'Doctor', 6987424203, 'Kariotisis 9');

        INSERT INTO DOCTORS(id, specialty, first, last)
                 VALUES(2316,'Pneumonologos', 'MondeChristoee', 'Raftoee' );

        INSERT INTO DOCTORS(id, specialty, first, last)
                 VALUES(2315,'Ofthalmiatros', 'Jasonee', 'Antigonee' );

        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(2316, 'password123','MondeChristoee', 'Raftoee', 'Doctor', 6987423142, 'Kalokairinou 12');
                 
        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(2315, 'password123','Jasonee', 'Antigonee', 'Doctor', 6944365487, 'Palama 13');

        INSERT INTO DOCTORS(id, specialty, first, last)
                 VALUES(2314, 'Gynaikologos', 'Jasonee', 'Ntagianee');
        
        

        /** SYMPTOMES **/
        INSERT INTO SYMPTOME(type,doctor)
                VALUES('puretos', 'Pathologos');
        

        INSERT INTO SYMPTOME(type,doctor)
                VALUES('vuxas', 'Pathologos');
        

        INSERT INTO SYMPTOME(type,doctor)
                VALUES('ponokefalos', 'Ofthalmiatros');
        

        INSERT INTO SYMPTOME(type,doctor)
                VALUES('eksanthima', 'Dermatologos');

        INSERT INTO SYMPTOME(type,doctor)
                VALUES('travma', 'xeirourgos');
        

        INSERT INTO SYMPTOME(type,doctor)
                VALUES('ponolaimos', 'Pathologos');
        

        INSERT INTO SYMPTOME(type,doctor)
                VALUES('diarroia', 'Gunaikologos');
        

        INSERT INTO SYMPTOME(type,doctor)
                VALUES('naftia', 'Gunaikologos');
        

        INSERT INTO SYMPTOME(type,doctor)
                VALUES('anapnoi', 'Orthopaidikos');
        

        /** NURSES **/

        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                VALUES(1331, 'password123','Amanda', 'Cherry', 'Nurse', 6938654531, 'Ieroloxitwn 29');
        

         INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                VALUES(1332, 'password123','Dimitra', 'Stavropoulou', 'Nurse', 6958654531, 'Dionisiou 52');
        

        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                VALUES(1333, 'password123','Dima', 'Dramountanou', 'Nurse', 6938654831, 'Palmeti 58');
        

        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
        VALUES(1334,  'password123','Jenny','Mpotsi', 'Nurse', 69386578458, 'Skra 12');
        


        /** MANAGERS **/

        INSERT INTO MANAGERS(id, grade, first, last)
                 VALUES(1324, 'President', 'Jason', 'Ntagian');
        
        
        INSERT INTO MANAGERS(id, grade, first, last)
                 VALUES(1325, 'Vice President', 'Camala', 'Harris');
        
        
        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(1325, 'password123','Camala', 'Harris', 'Manager', 694572135, 'Kalamitsion 16');
        

        INSERT INTO MANAGERS(id, grade, first, last)
                 VALUES(1326, 'Secretary', 'Katia', 'Sakellaropoulou');
        
        
        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(1326, 'password123','Katia', 'Sakellaropoulou', 'Manager', 6983876373, 'Diktis 19');
        

        INSERT INTO MANAGERS(id, grade, first, last)
                 VALUES(1358, 'Member', 'Bonson', 'Joris');
        
        
        INSERT INTO EMPLOYEE(id, password, first, last, type, telephone, address)
                 VALUES(1358, 'password123','Bonson', 'Joris', 'Manager', 6983845549, 'Evans 858');
        


        /** DIAGNOSE **/

        INSERT INTO DIAGNOSE(id)
                 VALUES('COVID-19');
        

        INSERT INTO DIAGNOSE(id)
                 VALUES('flue');
        

        INSERT INTO DIAGNOSE(id)
                 VALUES('Otitis');
        

        INSERT INTO DIAGNOSE(id)
                 VALUES('Egkefaliko');
        

        INSERT INTO DIAGNOSE(id)
                 VALUES('Katagma');
        

        /** EXAMINATIONS **/

        INSERT INTO EXAMINATION(id)
                 VALUES('Urine Test');
        

        INSERT INTO EXAMINATION(id)
                 VALUES('Supersonic');
        

        INSERT INTO EXAMINATION(id)
                 VALUES('Heart Pulse Test');
        

        INSERT INTO EXAMINATION(id)
                 VALUES('Blood Test');
        

        INSERT INTO EXAMINATION(id)
                 VALUES('Covid-19');
        

        /** MEDICINES **/

        INSERT INTO MEDICINE(mid, name, type, injection, isindicated,quantity)
                 VALUES(1236,'Advil','Tablet','Oral','PainKiller','100mg');
        

        INSERT INTO MEDICINE(mid, name, type, injection, isindicated,quantity)
                 VALUES(1238,'Acetamoniphen','Tablet','Oral','PainKiller','100mg');
        

        INSERT INTO MEDICINE(mid, name, type, injection, isindicated,quantity)
                 VALUES(1239,'Amoxyl','Tablet','Oral','Depression','150mg');
        

        INSERT INTO MEDICINE(mid, name, type, injection, isindicated,quantity)
                 VALUES(1246,'Augmentin','Liquid','Oral','Influenza','500mg');
        

        INSERT INTO MEDICINE(mid, name, type, injection, isindicated,quantity)
                 VALUES(1287,'Vyzantinon','Gel','Skin','Covid-19','1000mg');


        /** CREATING A NEW SHIFT */

        /*INSERT LAST SHIFT IN THE RECORD OF SHIFTS */
        INSERT INTO SHIFTRECORD (id, date)
        SELECT id,date
        FROM SHIFT

        /** SELECT DOCTORS FOR THE NIGHT SHIFT **/

            /** SELECT 1 FROM EVERY SPECIALITY*/

        INSERT INTO SHIFT (id)
        SELECT DOCTORS.id  FROM DOCTORS 
        WHERE 
            DOCTORS.id NOT IN ( SELECT SHIFT.id FROM SHIFT )
            AND (DOCTORS.specialty = 'Gynaikologos');

        INSERT INTO SHIFT (id)
        SELECT DOCTORS.id FROM DOCTORS 
        WHERE 
            DOCTORS.id NOT IN ( SELECT SHIFT.id FROM SHIFT )
            AND (DOCTORS.specialty = 'Ofthalmiatros');

        INSERT INTO SHIFT (id)
        SELECT DOCTORS.id FROM DOCTORS 
        WHERE 
            DOCTORS.id NOT IN ( SELECT SHIFT.id FROM SHIFT )
            AND (DOCTORS.specialty = 'Xeirourgos');

        INSERT INTO SHIFT (id)
        SELECT DOCTORS.id FROM DOCTORS 
        WHERE 
            DOCTORS.id NOT IN ( SELECT SHIFT.id FROM SHIFT )
            AND (DOCTORS.specialty = 'Pneumonologos');

        INSERT INTO SHIFT (id)
        SELECT DOCTORS.id FROM DOCTORS 
        WHERE 
            DOCTORS.id NOT IN ( SELECT SHIFT.id FROM SHIFT )
            AND (DOCTORS.specialty = 'Pathologos');
            

        INSERT INTO SHIFT (id)
        SELECT EMPLOYEE.id FROM EMPLOYEE 
        WHERE 
            EMPLOYEE.id NOT IN ( SELECT SHIFT.id FROM SHIFT )
            AND (EMPLOYEE.type = 'nurse')
            LIMIT 2;

        INSERT INTO SHIFT (id)
        SELECT EMPLOYEE.id FROM EMPLOYEE 
        WHERE 
            EMPLOYEE.id NOT IN ( SELECT SHIFT.id FROM SHIFT )
            AND (EMPLOYEE.type = 'Manager')
            LIMIT 1;
        

        DELETE SHIFT WHERE date IS NOT NULL;

        UPDATE SHIFT 
        SET date = CURDATE()
        WHERE date IS NULL;

        /*SHOW COVID-19 REPORT*/
        
        select *
          from PATIENT
        where PATIENT.diagnose = 'COVID-19';


        SELECT doctor, COUNT(doctor) 
        FROM SYMPTOME  GROUP BY doctor
        HAVING COUNT (doctor)=( 
        SELECT MAX(mycount) 
        FROM ( 
        SELECT doctor, COUNT(doctor) mycount 
        FROM SYMPTOME 
        GROUP BY doctor));
