package models;

import javax.persistence.*;

import play.db.jpa.Model;

@Entity
public class Car extends Model {

	@ManyToOne
	public MyFirstModel owner;

	public String brand;
	public String make;
	
	public Car(MyFirstModel owner, String brand, String make) {
		this.owner = owner;
		this.brand = brand;
		this.make = make;
	}


}
