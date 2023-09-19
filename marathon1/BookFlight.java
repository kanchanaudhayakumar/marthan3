package marathon1;

import org.testng.annotations.Test;

public class BookFlight extends ProjectFlight {
	@Test(dataProvider="fetchdata")
	public  void runBookFlight(String cname,String fname,String lname,String phno) {
	}
}
