import org.junit.*;
import java.util.*;

import play.db.jpa.JPABase;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {
	
	@Before
	public void setup() {
		Fixtures.deleteDatabase();
	}

//    @Test
//    public void createandRetrieveUser() {
//        MyFirstModel model = new MyFirstModel("Bob", "45 Hope Drive");
//        
//        MyFirstModel persistedModel = model.save();
//        
//        MyFirstModel bob = MyFirstModel.findById(persistedModel.id);
//        
//        assert(bob.equals(persistedModel));
//        assertEquals("45 Hope Drive", bob.address);
//    }
//    
//    @Test
//    public void saveAndRetriveHobbybyUser() {
//    	MyFirstModel bob = new MyFirstModel("Bob", "45 Hope Drive");
//    	bob.save();
////    	bob.hobbies.add(new Hobby(bob, "rugby", "main", false).<Hobby>save()); //this saves to the Hobby
//    	bob.add(new Hobby(bob, "rugby", "main", false)); //is there a way to write code so I don't have to write bob again inside the Hobby constructor?
//    	bob.add(new Hobby(bob, "running", "main", false));
//    	bob.save();
//    	assertEquals(2, bob.getHobbies().size());
//    }
//    
//    @Test
//    public void saveAndRetrieveCarbyUser() {
//    	MyFirstModel bob = new MyFirstModel("Bob", "45 Hope Drive");
//    	bob.save();
//    	bob.add(new Car(bob, "toyota", "rav4"));
//    	bob.save();
//    	assertEquals(1, bob.getCars().size());
//    }
//    
//    @Test
//    public void RetriveCarBrandAndListUsers() {
//    	MyFirstModel bob = new MyFirstModel("Bob", "45 Hope Drive");
//    	MyFirstModel george = new MyFirstModel("George", "56 Bush Drive");
//    	bob.add(new Car(bob, "toyota", "rav4"));
//    	george.add(new Car(george, "toyota", "camry"));
//    	bob.save();
//    	george.save();
//    	List<Car> toyotaCars = Car.find("byBrand", "toyota").fetch();
//    	List<MyFirstModel> toyotaOwners = new ArrayList<MyFirstModel>();
//    	for (Car car : toyotaCars) {
//			toyotaOwners.add(car.owner);
//		}
//    	assertEquals(2, toyotaOwners.size());
//    	assertEquals("Bob", toyotaOwners.get(0).name);
//    	assertEquals("George", toyotaOwners.get(1).name);	
//    }
    
    @Test
    public void BusRelationship() {
    	User bob = new User("Bob", "45 Hope Street");
    	bob.addBus(10);
    	bob.addBus(61);
    	bob.save();
    	User george = new User("George", "56 Bush Drive");
    	george.addBus(61);
    	george.addBus(170);
    	george.save();
    }
    

}
