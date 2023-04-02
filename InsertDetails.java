package demo;

import domain.Education;
import domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class InsertDetails {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student name: ");
            String name = sc.next();
            System.out.println("Enter student contact: ");
            int contact = sc.nextInt();
            System.out.println("Enter ssc percentage: ");
            double ssc = sc.nextDouble();
            System.out.println("Enter hsc percentage: ");
            double hsc = sc.nextDouble();
            System.out.println("Enter degree percentage: ");
            double deg = sc.nextDouble();

            Configuration cfg;
            SessionFactory factory;
            Session ses;
            Transaction tx;

            cfg = new Configuration();
            cfg = cfg.configure();
            cfg = cfg.addAnnotatedClass(Education.class);
            cfg = cfg.addAnnotatedClass(Student.class);
            factory = cfg.buildSessionFactory();
            ses = factory.openSession();

            //create object of passport
            Education e1 = new Education();
            e1.setSsc(ssc);
            e1.setHsc(hsc);
            e1.setDegree(deg);

            //create object of Citizen
            Student s1 = new Student();
            s1.setStudName(name);
            s1.setStudContact(contact);

            //assign passport details to citizen object
            s1.setEidRef(e1);
            tx = ses.beginTransaction();
            ses.save(s1);
            tx.commit();
            System.out.println("DETAILS INSERTED SUCCESSFULLY");


        }
    }


