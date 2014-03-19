package model.event;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.user.User;

@Entity
@Table(name="Participant")
public class Participant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name="idEvent", referencedColumnName="id", nullable=false)
	private Event event;
	
	@OneToOne
	@JoinColumn(name="idUser", referencedColumnName="id", nullable=false)
	private User user;
	
	public Participant() {}
	
	public Participant(Event event, User user) {
		this.event = event;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
