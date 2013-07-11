package models.inheritance.tableperclasshierarchy;

import javax.persistence.*;

@Entity
@DiscriminatorValue("OR")
public class Orange extends Fruit{
	
    //@Id @GeneratedValue //if I have this then it is incorrect
//	@Column(name = "ORANGE_ID")
//	private Long id = null;
	private boolean sour;
	private boolean citrus;


}
