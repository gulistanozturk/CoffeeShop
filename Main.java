
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

		public static void main(String[] args) throws Exception {
			Customer customer1 = new Customer(1, "Gülistan", "Öztürk", LocalDate.of(2001,07,18), "12345678901");
	        ICustomerCheckService customerCheckService = new MernisServiceAdapter();
	        BaseCustomerManager customerManager = new NeroCustomerManager(customerCheckService);
	        customerManager.save(customer1);
		}
	}


