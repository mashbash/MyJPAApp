package models;

import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Hobby extends Model {
	
	@ManyToOne
	public User participant; 
	
	
	public String name;
	public String mainOrNiche;
	public Boolean timeConsuming;
	
	public Hobby(User participant, String name, String mainOrNiche, Boolean timeConsuming) {
		this.participant = participant;
		this.name = name;
		this.mainOrNiche = mainOrNiche;
		this.timeConsuming = timeConsuming;
	}

	
}
