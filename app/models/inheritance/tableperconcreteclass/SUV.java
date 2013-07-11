//trying out the table-per-concrete class example

package models.inheritance.tableperconcreteclass;

import javax.persistence.*;

@Entity
@AttributeOverride(name = "owner", column =
	@Column(name = "SUV_OWNER", nullable = false)
	)
public class SUV extends Vehicle{
	
	@Id @GeneratedValue
	@Column(name="SUV_ID")
	private Long id = null;
	private Boolean sportsSuspension;
	private Boolean raisedSeating;
	
	public Boolean getSportsSuspension() {
		return sportsSuspension;
	}
	
	public void setSportsSuspension(Boolean sportsSuspension) {
		this.sportsSuspension = sportsSuspension;
	}
	
	public Boolean getRaisedSeating() {
		return raisedSeating;
	}
	
	public void setRaisedSeating(Boolean raisedSeating) {
		this.raisedSeating = raisedSeating;
	}

}
