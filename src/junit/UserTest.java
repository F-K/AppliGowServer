package junit;

import static org.junit.Assert.assertEquals;
import model.user.User;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/*-------getID---------------------*/
	@Test
	public void testGetIdNormal() {
		System.out.println("test getID normal");
		Integer idUser = 10;
		User e = new User();
		e.setId(idUser);
		Integer idRetour = e.getId();
		assertEquals(idUser, idRetour);
	}
	
	@Test 
	public void testGetIdVide() {
		System.out.println("test getID vide");
		User e = new User();
		Integer idRetour = e.getId();
		assertEquals(null, idRetour);
	}
	
	
	/*-------setID---------------------*/
	
	@Test
	public void testSetIdNormal() {
		System.out.println("test setID normal");
		User e = new User();
		Integer newID = 10;
		e.setId(newID);
		Integer idRetour = e.getId();
		assertEquals(newID, idRetour);
	}
	
	
	
	/*-------getLogin---------------------*/
	@Test
	public void testGetLoginNormal() {
		System.out.println("test getLogin normal");
		String loginUser = "test";
		User e = new User();
		e.setLogin(loginUser);
		String loginRetour = e.getLogin();
		assertEquals(loginUser, loginRetour);
	}
	
	@Test 
	public void testGetLoginVide() {
		System.out.println("test getLogin vide");
		User e = new User();
		String loginRetour = e.getLogin();
		assertEquals(null, loginRetour);
	}
	
	
	/*-------setLogin---------------------*/
	
	@Test
	public void testSetLoginNormal() {
		System.out.println("test setLogin normal");
		User e = new User();
		String loginUser = "test";
		e.setLogin(loginUser);
		String loginRetour = e.getLogin();
		assertEquals(loginUser, loginRetour);
	}
	
	
	/*-------getPassword---------------------*/
	@Test
	public void testGetPasswordNormal() {
		System.out.println("test getPassword normal");
		String passwordUser = "test";
		User e = new User();
		e.setPassword(passwordUser);
		String passwordRetour = e.getPassword();
		assertEquals(passwordUser, passwordRetour);
	}
	
	@Test 
	public void testGetPasswordVide() {
		System.out.println("test getPassword vide");
		User e = new User();
		String passwordRetour = e.getPassword();
		assertEquals(null, passwordRetour);
	}
	
	
	/*-------setPassword---------------------*/
	
	@Test
	public void testSetPasswordNormal() {
		System.out.println("test setPassword normal");
		User e = new User();
		String passwordUser = "test";
		e.setPassword(passwordUser);
		String passwordRetour = e.getPassword();
		assertEquals(passwordUser, passwordRetour);
	}
	
	
	

	/*-------getFirstName---------------------*/
	@Test
	public void testGetFirstNameNormal() {
		System.out.println("test getFirstName normal");
		String firstNameUser = "test";
		User e = new User();
		e.setFirstName(firstNameUser);
		String firstNameRetour = e.getFirstName();
		assertEquals(firstNameUser, firstNameRetour);
	}
	
	@Test 
	public void testGetFirstNameVide() {
		System.out.println("test getFirstName vide");
		User e = new User();
		String firstNameRetour = e.getFirstName();
		assertEquals(null, firstNameRetour);
	}
	
	
	/*-------setFirstName---------------------*/
	
	@Test
	public void testSetFirstNameNormal() {
		System.out.println("test setFirstName normal");
		User e = new User();
		String firstNameUser = "test";
		e.setFirstName(firstNameUser);
		String firstNameRetour = e.getFirstName();
		assertEquals(firstNameUser, firstNameRetour);
	}
	
	
	
	/*-------getFirstLastName---------------------*/
	@Test
	public void testGetLastNameNormal() {
		System.out.println("test getLastName normal");
		String lastNameUser = "test";
		User e = new User();
		e.setLastName(lastNameUser);
		String lastNameRetour = e.getLastName();
		assertEquals(lastNameUser, lastNameRetour);
	}
	
	@Test 
	public void testGetLastNameVide() {
		System.out.println("test getLastName vide");
		User e = new User();
		String lastNameRetour = e.getLastName();
		assertEquals(null, lastNameRetour);
	}
	
	
	/*-------setLastName---------------------*/
	
	@Test
	public void testSetLastNameNormal() {
		System.out.println("test setLastName normal");
		User e = new User();
		String lastNameUser = "test";
		e.setLastName(lastNameUser);
		String lastNameRetour = e.getLastName();
		assertEquals(lastNameUser, lastNameRetour);
	}
	
	
	
	/*-------getMail---------------------*/
	@Test
	public void testGetMailNormal() {
		System.out.println("test getMail normal");
		String mailUser = "test";
		User e = new User();
		e.setMail(mailUser);
		String mailRetour = e.getMail();
		assertEquals(mailUser, mailRetour);
	}
	
	@Test 
	public void testGetMailVide() {
		System.out.println("test getMail vide");
		User e = new User();
		String mailRetour = e.getMail();
		assertEquals(null, mailRetour);
	}
	
	
	/*-------setMail---------------------*/
	
	@Test
	public void testSetMailNormal() {
		System.out.println("test setMail normal");
		User e = new User();
		String mailUser = "test";
		e.setMail(mailUser);
		String mailRetour = e.getMail();
		assertEquals(mailUser, mailRetour);
	}
	
	
	
	
	/*-------getStatut---------------------*/
	@Test
	public void testGetStatutNormal() {
		System.out.println("test getStatut normal");
		boolean statutUser = true;
		User e = new User();
		e.setStatut(statutUser);
		boolean statutRetour = e.getStatut();
		assertEquals(statutUser, statutRetour);
	}
	
	@Test ( expected = NullPointerException.class )
	public void testGetStatutVide() {
		System.out.println("test getStatut vide");
		User e = new User();
		boolean statutRetour = e.getStatut();
		assertEquals(null, statutRetour);
	}
	
	
	/*-------setStatut---------------------*/
	
	@Test
	public void testSetStatutNormal() {
		System.out.println("test setStatut normal");
		User e = new User();
		boolean statutUser = true;
		e.setStatut(statutUser);
		boolean statutRetour = e.getStatut();
		assertEquals(statutUser, statutRetour);
	}
	
}
