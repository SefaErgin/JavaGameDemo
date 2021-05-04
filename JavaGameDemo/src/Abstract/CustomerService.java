package Abstract;

import Entities.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);

}
