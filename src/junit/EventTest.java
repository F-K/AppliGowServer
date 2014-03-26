package junit;

import static org.junit.Assert.*;

import java.util.Date;

import model.event.Event;
import model.user.User;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EventTest {
	
	

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
		int idEvent = 10;
		Event e = new Event();
		e.setId(idEvent);
		int idRetour = e.getId();
		assertEquals(idEvent, idRetour);
	}
	
	@Test ( expected = NullPointerException.class )
	public void testGetIdVide() {
		System.out.println("test getID vide");
		Event e = new Event();
		int idRetour = e.getId();
		assertEquals(null, idRetour);
	}
	
	
	/*-------setID---------------------*/
	
	@Test
	public void testSetIdNormal() {
		System.out.println("test setID normal");
		Event e = new Event();
		int newID = 10;
		e.setId(newID);
		int idRetour = e.getId();
		assertEquals(newID, idRetour);
	}
	
	
	
	/*-------getUser---------------------*/
	@Test
	public void testGetUserNormal() {
		System.out.println("test getUser normal");
		User user = new User();
		Event e = new Event();
		e.setUser(user);
		User userRetour = e.getUser();
		assertEquals(user, userRetour);
	}
	
	@Test
	public void testGetUserVide() {
		System.out.println("test getUser vide");
		Event e = new Event();
		User userRetour = e.getUser();
		assertEquals(null, userRetour);
	}
	
	
	/*-------setUser---------------------*/
	
	@Test
	public void testSetUserNormal() {
		System.out.println("test setUser normal");
		Event e = new Event();
		User user = new User();
		e.setUser(user);
		User userRetour = e.getUser();
		assertEquals(user, userRetour);
	}
	
	
	
	/*-------getTitle---------------------*/
	@Test
	public void testGetTitle() {
		System.out.println("test getTitle normal");
		String titreDep = "test";
		Event e = new Event();
		e.setTitle(titreDep);
		String titreRetour = e.getTitle();
		assertEquals(titreDep, titreRetour);
	}
	
	@Test 
	public void testGetTitleVide() {
		System.out.println("test getTitle vide");
		Event e = new Event();
		String titreRetour = e.getTitle();
		assertEquals(null, titreRetour);
	}
	
	
	/*-------setTitle---------------------*/
	
	@Test
	public void testSetTitleNormal() {
		System.out.println("test setTitle normal");
		Event e = new Event();
		String titreDep = "test";
		e.setTitle(titreDep);
		String titreRetour = e.getTitle();
		assertEquals(titreDep, titreRetour);
	}
	
	
	/*-------getAddress---------------------*/
	@Test
	public void testGetAddressNormal() {
		System.out.println("test getAddress normal");
		String addressDep = "test";
		Event e = new Event();
		e.setAddress(addressDep);
		String titreRetour = e.getAddress();
		assertEquals(addressDep, titreRetour);
	}
	
	@Test 
	public void testGetAddressVide() {
		System.out.println("test getAddress vide");
		Event e = new Event();
		String addressRetour = e.getAddress();
		assertEquals(null, addressRetour);
	}
	
	
	/*-------setAddress---------------------*/
	
	@Test
	public void testSetAddressNormal() {
		System.out.println("test setAddress normal");
		Event e = new Event();
		String addressDep = "test";
		e.setTitle(addressDep);
		String addressRetour = e.getTitle();
		assertEquals(addressDep, addressRetour);
	}
	
	/*-------getCategory---------------------*/
	@Test
	public void testGetCategoryNormal() {
		System.out.println("test getCategory normal");
		String categoryDep = "test";
		Event e = new Event();
		e.setCategory(categoryDep);
		String categoryRetour = e.getCategory();
		assertEquals(categoryDep, categoryRetour);
	}
	
	@Test 
	public void testGetCategoryVide() {
		System.out.println("test getCategory vide");
		Event e = new Event();
		String categoryRetour = e.getCategory();
		assertEquals(null, categoryRetour);
	}
	
	
	/*-------setCategory---------------------*/
	
	@Test
	public void testSetCategoryNormal() {
		System.out.println("test setCategory normal");
		Event e = new Event();
		String categoryDep = "test";
		e.setCategory(categoryDep);
		String categoryRetour = e.getCategory();
		assertEquals(categoryDep, categoryRetour);
	}
	
	
	
	/*-------getDescription---------------------*/
	@Test
	public void testGetDescriptionNormal() {
		System.out.println("test getDescription normal");
		String descriptionDep = "test";
		Event e = new Event();
		e.setDescription(descriptionDep);
		String descriptionRetour = e.getDescription();
		assertEquals(descriptionDep, descriptionRetour);
	}
	
	@Test 
	public void testGetDescriptionVide() {
		System.out.println("test getDescription vide");
		Event e = new Event();
		String descriptionRetour = e.getDescription();
		assertEquals(null, descriptionRetour);
	}
	
	
	/*-------setDescription---------------------*/
	
	@Test
	public void testSetDescriptionyNormal() {
		System.out.println("test setDescription normal");
		Event e = new Event();
		String descriptionDep = "test";
		e.setDescription(descriptionDep);
		String descriptionRetour = e.getDescription();
		assertEquals(descriptionDep, descriptionRetour);
	}
	
	
	/*-------getDateStart---------------------*/
	@Test
	public void testGetDateStartNormal() {
		System.out.println("test getDateStart normal");
		Date dateStartDep = new Date();
		Event e = new Event();
		e.setDateStart(dateStartDep);
		Date dateStartRetour = e.getDateStart();
		assertEquals(dateStartDep, dateStartRetour);
	}
	
	@Test 
	public void testGetDateStartVide() {
		System.out.println("test getDateStart vide");
		Event e = new Event();
		Date dateStartRetour = e.getDateStart();
		assertEquals(null, dateStartRetour);
	}
	
	
	/*-------setDateStart---------------------*/
	
	@Test
	public void testSetDateStartNormal() {
		System.out.println("test setDateStart normal");
		Event e = new Event();
		Date dateStartDep = new Date();
		e.setDateStart(dateStartDep);
		Date dateStartRetour = e.getDateStart();
		assertEquals(dateStartDep, dateStartRetour);
	}
	
	
	
	
	/*-------getDateEnd---------------------*/
	@Test
	public void testGetDateEndNormal() {
		System.out.println("test getDateEnd normal");
		Date dateEndDep = new Date();
		Event e = new Event();
		e.setDateEnd(dateEndDep);
		Date dateEndRetour = e.getDateEnd();
		assertEquals(dateEndDep, dateEndRetour);
	}
	
	@Test 
	public void testGetDateEndVide() {
		System.out.println("test getDateEnd vide");
		Event e = new Event();
		Date dateEndRetour = e.getDateEnd();
		assertEquals(null, dateEndRetour);
	}
	
	
	/*-------setDateEnd---------------------*/
	
	@Test
	public void testSetDateEndNormal() {
		System.out.println("test setDateEnd normal");
		Event e = new Event();
		Date dateEndDep = new Date();
		e.setDateEnd(dateEndDep);
		Date dateEndRetour = e.getDateEnd();
		assertEquals(dateEndDep, dateEndRetour);
	}
	
	
	
	

}
