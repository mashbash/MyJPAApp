//all 3 classes show up as tables and are connected by foreign key, each table has their own pk

package models.inheritance.tablepersubclass;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Hero {
	
	@Id @GeneratedValue
	@Column(name = "HERO_ID")
	private Long id;
	private String superpower;
	private String popularity;

}
