package models.inheritance.tableperclasshierarchy;

import javax.persistence.*;

@Entity
@DiscriminatorValue("AP")
public class Apple extends Fruit {

	//@Id @GeneratedValue //why is it if I leave this in, there is an error, to think about
	//because it will take on the ID from the superclass so unnecessary to have it's own primary key
//	@Column(name = "APPLE_ID")
//	private Long id = null;
	private String size;
	private String colour;


}
