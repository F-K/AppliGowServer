package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Utils class for the Hibernate framework.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public class HibernateUtil {
	/**
	 * The session factory.
	 */
	private static final SessionFactory sessionFactory;

	// Create an unique instance of SessionFactory from hibernate.cfg.xml
	static {
		try {
			sessionFactory = new AnnotationConfiguration().configure()
					.buildSessionFactory();
		} catch (HibernateException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	/**
	 * Get a Hibernate session
	 * 
	 * @return Session The session.
	 * @throws HibernateException
	 */
	public static Session getSession() throws HibernateException {
		return sessionFactory.openSession();
	}
}
