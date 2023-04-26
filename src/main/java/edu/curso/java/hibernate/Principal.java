package edu.curso.java.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import edu.curso.java.hibernate.herencia1.Cliente1;
import edu.curso.java.hibernate.herencia1.Empleado1;

import edu.curso.java.hibernate.herencia2.Cliente2;
import edu.curso.java.hibernate.herencia2.Empleado2;

import edu.curso.java.hibernate.herencia3.Cliente3;
import edu.curso.java.hibernate.herencia3.Empleado3;

public class Principal {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();

		//HERENCIA 1 - SINGLE_TABLE:
		Cliente1 cliente1 = new Cliente1();
		cliente1.setNombre("cliente1");
		Empleado1 empleado1 = new Empleado1();
		empleado1.setNombre("empleado1");
		session.save(cliente1);
		session.save(empleado1);

		//HERENCIA 2 - TABLE_PER_CLASS:
		Cliente2 cliente2 = new Cliente2();
		cliente2.setNombre("cliente2");
		Empleado2 empleado2 = new Empleado2();
		empleado2.setNombre("empleado2");
		session.save(cliente2);
		session.save(empleado2);
		
		//HERENCIA 3 - JOINED:
		Cliente3 cliente3 = new Cliente3();
		cliente3.setNombre("cliente3");
		Empleado3 empleado3 = new Empleado3();
		empleado3.setNombre("empleado3");
		session.save(cliente3);
		session.save(empleado3);

		
		
		transaction.commit();
		session.close();
		
		HibernateUtil.close();
				
	}

}
