package model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The class that describes a user.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
@Entity
@Table(name = "User")
public class User implements Serializable {

	/**
	 * A unique serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The user id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;

	/**
	 * The user login.
	 */
	@Column(name = "login", length = 30, nullable = false, unique = true)
	private String login;

	/**
	 * The user password.
	 */
	@Column(name = "password", length = 40, nullable = false)
	private String password;

	/**
	 * The user first name.
	 */
	@Column(name = "firstName", length = 30)
	private String firstName;

	/**
	 * The user last name.
	 */
	@Column(name = "lastName", length = 30)
	private String lastName;

	/**
	 * The user mail.
	 */
	@Column(name = "mail", length = 50)
	private String mail;

	/**
	 * The user status.
	 */
	@Column(name = "statut")
	private Boolean statut;

	/**
	 * Empty constructor for a user.
	 */
	public User() {
	}

	/**
	 * Constructor for a user with a login and a password.
	 * 
	 * @param login
	 *            The login.
	 * @param password
	 *            The password.
	 */
	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	/**
	 * Get the user id.
	 * 
	 * @return Integer The id.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set the user id.
	 * 
	 * @param id
	 *            The id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the user login.
	 * 
	 * @return String The login.
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Set the user login.
	 * 
	 * @param login
	 *            The login.
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Get the user password.
	 * 
	 * @return String The password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the user password.
	 * 
	 * @param password
	 *            The password.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Get the user first name.
	 * 
	 * @return String The first name.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the user first name.
	 * 
	 * @param firstName
	 *            The first name.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get the user last name.
	 * 
	 * @return String The last name.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the user last name.
	 * 
	 * @param lastName
	 *            The last name.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Get the user mail address.
	 * 
	 * @return String The mail address.
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Set the user mail address.
	 * 
	 * @param mail
	 *            The mail address.
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Get the user status.
	 * 
	 * @return Boolean true if the user is valid, false if not.
	 */
	public Boolean getStatut() {
		return statut;
	}

	/**
	 * Set the user status.
	 * 
	 * @param statut
	 *            The user status.
	 */
	public void setStatut(Boolean statut) {
		this.statut = statut;
	}

}
