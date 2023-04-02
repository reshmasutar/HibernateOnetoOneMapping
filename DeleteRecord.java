package demo;

import domain.Education;
import domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DeleteRecord {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student Id: ");
            int id = sc.nextInt();

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

            Student c1 = ses.load(Student.class, id);
            tx = ses.beginTransaction();
            ses.delete(c1);
            tx.commit();
            System.out.println("DELETED SUCCESSFULLY");


        }
    }
