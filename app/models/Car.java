package models;

import java.util.List;

import javax.persistence.*;

import play.db.jpa.Model;

@Entity
public class Car extends Model {
	
	public String accessories;

	@ManyToOne
	public User owner;
	
	@OneToMany(mappedBy = "car", cascade=CascadeType.ALL)
	public List<CarAccessory> carAccessories;
	
	public String brand;
	public String make;
	
	public Car(User owner, String brand, String make, String accessories) {
		this.owner = owner;
		this.brand = brand;
		this.make = make;
		this.accessories = accessories; 
	}


}
