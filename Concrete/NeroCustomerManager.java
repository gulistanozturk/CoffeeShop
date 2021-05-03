package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;
	
	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;

	}
	@Override
	public void save(Customer customer) throws Exception {

		if (customerCheckService.CheckIfRealPerson(customer))
		{
			super.save(customer);	
		}
		else
		{
			System.out.println("Not a valid person");
		}
	}
}
