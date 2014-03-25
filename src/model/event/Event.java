package model.event;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.user.User;

/**
 * Class that describes the event table.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
@Entity
@Table(name = "Event")
public class Event implements Serializable {

	/**
	 * A unique serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The event id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;

	/**
	 * The creator of the event (user).
	 */
	@OneToOne
	@JoinColumn(name = "idUser", referencedColumnName = "id", nullable = false)
	private User user;

	/**
	 * The event title.
	 */
	@Column(name = "title", length = 30, nullable = false)
	private String title;

	/**
	 * The event address.
	 */
	@Column(name = "address", length = 150, nullable = false)
	private String address;

	/**
	 * The event latitude.
	 */
	@Column(name = "latitude", nullable = false)
	private double latitude;

	/**
	 * The event longitude.
	 */
	@Column(name = "longitude", nullable = false)
	private double longitude;

	/**
	 * The category of the event.
	 */
	@Column(name = "category", length = 30, nullable = false)
	private String category;

	/**
	 * The event description.
	 */
	@Column(name = "description", columnDefinition = "text")
	private String description;

	/**
	 * The event start date.
	 */
	@Column(name = "dateStart", nullable = false)
	private Date dateStart;

	/**
	 * The event end date.
	 */
	@Column(name = "dateEnd", nullable = false)
	private Date dateEnd;

	/**
	 * Empty constructor for the Event class.
	 */
	public Event() {
	}

	/**
	 * Get the event id.
	 * 
	 * @return Integer The event id.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set the event id.
	 * 
	 * @param id
	 *            The id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the creator of the event.
	 * 
	 * @return User The user.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Set the event creator.
	 * 
	 * @param user
	 *            The user that created the event.
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Get the event title.
	 * 
	 * @return String The title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set the event title.
	 * 
	 * @param title
	 *            The title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Get the event address.
	 * 
	 * @return String The event address.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Set the event address.
	 * 
	 * @param address
	 *            The address.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Get the event latitude.
	 * 
	 * @return double The latitude.
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * Set the event latitude.
	 * 
	 * @param latitude
	 *            The latitude.
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * Get the event longitude.
	 * 
	 * @return double The longitude.
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Set the event longitude.
	 * 
	 * @param longitude
	 *            The longitude.
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * Get the event category.
	 * 
	 * @return String The category.
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Set the category of the event.
	 * 
	 * @param category
	 *            The category.
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Get the event description.
	 * 
	 * @return String The description.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the event description.
	 * 
	 * @param description
	 *            The description of the event.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the event start date.
	 * 
	 * @return Date The start date.
	 */
	public Date getDateStart() {
		return dateStart;
	}

	/**
	 * Set the event start date.
	 * 
	 * @param dateStart
	 *            The start date.
	 */
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	/**
	 * Get the event end time.
	 * 
	 * @return Date The end time.
	 */
	public Date getDateEnd() {
		return dateEnd;
	}

	/**
	 * Set the event end date.
	 * 
	 * @param dateEnd
	 *            The end date.
	 */
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	@Override
	public String toString() {
		return title;
	}

}
