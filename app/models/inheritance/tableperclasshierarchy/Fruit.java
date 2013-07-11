//the fruit, apple and orange table show up as one table called FRUIT_TYPE
package models.inheritance.tableperclasshierarchy;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name = "FRUIT_TYPE",
		discriminatorType = DiscriminatorType.STRING
		)
public abstract class Fruit {

		@Id @GeneratedValue
		@Column(name = "FRUIT_ID")
		private Long id = null;
		
		private Boolean edible;
		private String countryOfOrigin;

	
}
