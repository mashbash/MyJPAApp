//Vehicle does not show up as a table, only sedan and SUV show up as tables


package models.inheritance.tableperconcreteclass;

import javax.persistence.*;

@MappedSuperclass
public abstract class Vehicle {

	@Column(name = "OWNER", nullable = false)
	private String owner;
	private Integer numOfWheels;
	private String engineSize;
	private String fuelType;

}
