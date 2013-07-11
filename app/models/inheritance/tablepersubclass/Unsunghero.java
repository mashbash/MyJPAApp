package models.inheritance.tablepersubclass;

import javax.persistence.*;

@Entity
public class Unsunghero extends Hero {

	private Boolean niche;
	private Boolean appearedRecently;
	private Boolean nastyDisposition;

}
