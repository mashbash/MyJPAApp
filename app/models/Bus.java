package models;

import java.util.*;

import javax.persistence.*;

import play.db.jpa.Model;

//a user can take many different buses
//many different buses are taken by many different users
//manytomany

@Entity
public class Bus extends Model {
	
	@ManyToMany(cascade = CascadeType.ALL)
	
	//defines the association table
	@JoinTable(name = "Bus_MyFirstModel", //name of the table
		joinColumns = { @JoinColumn(name = "Bus_id")}, //this refers to a column in this class
		inverseJoinColumns = { @JoinColumn(name="MyFirstModel_id")}) //refers to the column in the inverse class
	public List<MyFirstModel> users;
	
	public Integer number;
	
	public Bus(Integer number) {
		this.number = number;
	}
	
//	public String toString() {
//		return String.valueOf(number);
//	}
	
	public static Bus findOrCreateByNum(Integer number) {
		Bus bus = Bus.find("ByNumber", number).first();
		if(bus == null) {
			bus = new Bus(number);
		}
		return bus;
	}

}
