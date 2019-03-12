package inventorydatabase.service;

import java.util.List;

import inventorydatabase.model.Customer;

public interface InventoryService {
	public void addCustomer(Customer customer);
	public List<Customer> listCustomer();
	public Customer findByCustomerBy(String id);
	public String deleteCustomerById(String id);
}
