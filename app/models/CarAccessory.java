package models;

import javax.persistence.*;

import play.db.jpa.Model;

@Entity
@Table(name = "CAR_KEY")
public class CarAccessory extends Model{

	@ManyToOne
	public Car car;
	
	@ManyToOne
	public Accessory accessory;
	
}
