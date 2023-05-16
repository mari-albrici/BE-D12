package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "events")
@ToString
public class Event {
	

	@Id
	@GeneratedValue
	private long id;
	
	private String title;
	private LocalDate date;
	private String description;
	private EventType event_type;
	private int max_event_participants;

	public Event(String title, LocalDate date, String description, EventType event_type, int max_event_participants) {
		super();
		this.title = title;
		this.date = date;
		this.description = description;
		this.event_type = event_type;
		this.max_event_participants = max_event_participants;
	}

	public Event() {

	}

	@Override
	public String toString() {
		return title + " " + description + " " + "in data" + " " + date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EventType getEvent_type() {
		return event_type;
	}

	public void setEvent_type(EventType event_type) {
		this.event_type = event_type;
	}

	public int getMax_event_participants() {
		return max_event_participants;
	}

	public void setMax_event_participants(int max_event_participants) {
		this.max_event_participants = max_event_participants;
	}

}