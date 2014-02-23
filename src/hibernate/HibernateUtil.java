package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;

	// Create an unique instance of SessionFactory from hibernate.cfg.xml
	static {
		try {
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		} catch (HibernateException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	// Returns an Hibernate's session
	public static Session getSession() throws HibernateException {
		return sessionFactory.openSession();
	}
}
