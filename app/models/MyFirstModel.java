package models;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.CollectionOfElements;


import play.db.jpa.*;

@Entity
//@Table(name = "Test_Users")
public class MyFirstModel extends Model {

	@OneToMany (mappedBy = "participant", cascade=CascadeType.ALL)
	private List<Hobby> hobbies; //convert this to private and then create our own setter, getter and add methods
	
	@OneToMany (mappedBy = "owner", cascade=CascadeType.ALL)
	private List<Car> cars;
	
	@ManyToMany (mappedBy = "users", cascade=CascadeType.ALL)//mappedBy means this controls the relationship
	public List<Bus> buses; 
	
	public String name;
	
	@Column(length=1024)
	public String address;
	
	public int age;
//	
//	@ElementCollection
//	public List<String> addresses = new ArrayList();
//	
	public MyFirstModel(String name, String address) {
		this.name = name;
		this.address = address;
		this.age = 0;
		this.hobbies = new ArrayList<Hobby>();// added this for the one to many with hobby r/s
		this.cars = new ArrayList<Car>(); //added this for the one to many with car r/s
//		this.buses = new ArrayList<Bus>(); //added this for the many to many with buses r/s
	}
	
	public List<Hobby> getHobbies(){
		if(this.hobbies == null){
			return Collections.EMPTY_LIST;
		}
		return this.hobbies;
	}
	
	public void setHobbies(List<Hobby> hobbies) {
		if(this.hobbies == null){
			this.hobbies = new ArrayList<Hobby>();
		}
		this.hobbies = hobbies;
	}
	
	public void add(Hobby hobby) {
//      this is not necessary because already instantiated in MyFirstModel constructor
//		if(this.hobbies == null) {
//			this.hobbies = new ArrayList<Hobby>();
//		}
		this.hobbies.add(hobby);
	}
	
	public List<Car> getCars() {
		if(this.cars == null) {
			return Collections.EMPTY_LIST;
		}
		return this.cars;
	}
	
	public void setCars(List<Car> cars) {
		if(this.cars == null) {
			this.cars = new ArrayList<Car>();
		}
		this.cars = cars;
	}
	
	public void add(Car car) {
//		this is not necessary because already instantiated in MyFirstModel Constructor
//		if(this.cars == null) {
//			this.cars = new ArrayList<Car>();
//		}
		this.cars.add(car);
	}
	
	public void addBus(Integer number) {
		buses.add(Bus.findOrCreateByNum(number));
	}
	
	public static List<MyFirstModel> findByBusNum (Integer number) {
		return MyFirstModel.find(
			"select distinct u from MyFirstModel u join u.buses as b where b.number = ? ", number).fetch(); 
	}
	
}

