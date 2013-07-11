package models.inheritance.tablepersubclass;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "ID") //this is just to rename the id in this table, it still points to HERO_ID
public class SuperHero extends Hero {

	private Boolean tvShow;
	private Boolean ownFigurine;
	private Boolean movie;

}
