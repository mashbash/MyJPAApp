//trying out the table-per-concrete class example

package models.inheritance.tableperconcreteclass;

import javax.persistence.*;

@Entity
@AttributeOverride(name = "owner", column =
	@Column(name = "Sedan_owner", nullable = false)
	)
public class Sedan extends Vehicle{

	@Id @GeneratedValue
	@Column(name="Sedan_ID")
	private Long id = null;
	private Boolean safeCar;

	public Boolean getSafeCar() {
		return safeCar;
	}

	public void setSafeCar(Boolean safeCar) {
		this.safeCar = safeCar;
	}

}
