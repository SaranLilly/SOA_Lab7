import java.sql.SQLException;
import java.util.HashSet;

//import th.ac.ku.kps.eng.cpe.soa.model.Customer;
//import test.Customer;
//import test.Phonenumber;
import th.ac.ku.kps.eng.cpe.soa.model.Customer;
import th.ac.ku.kps.eng.cpe.soa.model.Phonenumber;
import th.ac.ku.kps.eng.cpe.soa.dao.CustomerDAO;
//import th.ac.ku.kps.eng.cpe.soa.model.Phonenumber;

public class MethodMain {
	public static void main(String[] args) throws SQLException {
		CustomerDAO c = new CustomerDAO();
		c.findCustomer("somsri2");
		for (Customer cs : c.getAllCustomers())
			System.out.println(cs.getName());
		//c.addCustomer(new Customer("S1","2","3","4", new HashSet<Phonenumber>()));
		//for (Customer cs : c.getAllCustomers())
		//	System.out.println(cs.getName());
	}

}
