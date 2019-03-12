package inventorydatabase.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import inventorydatabase.model.Customer;
import inventorydatabase.service.InventoryService;

public class InventoryServiceImpl implements InventoryService{
	
	private List<Customer> list = new ArrayList<>();
	
	public InventoryServiceImpl() {
		Customer customer1 = new Customer("IT100","suren","vithanage","0769391251","surenanthonyithanage@gmail.com","athurugiriya");
		Customer customer2 = new Customer("IT101","stephanie","vithanage","0769391255","stephanie@gmail.com","athurugiriya");
		Customer customer3 = new Customer("IT102","natasha","vithanage","0769391252","natasha@gmail.com","malabe");
		Customer customer4 = new Customer("IT103","sam","sesh","0769321251","sam@gmail.com","kottawa");
		Customer customer5 = new Customer("IT104","simson","last","0763391251","simson@gmail.com","moratuwa");
		
		//inserting the records into an arraylist
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		list.add(customer5);
	}

	@Override
	public void addCustomer(Customer customer) {
		list.add(customer);
	}

	@Override
	public List<Customer> listCustomer() {
		return list;
	}

	@Override
	public Customer findByCustomerBy(String id) {
		return (Customer) list.stream().filter(l -> l.getId().equals("id")).collect(Collectors.toList());
	}

	@Override
	public String deleteCustomerById(String id) {
		if(list.removeIf(customer -> customer.getId().equals("id"))) {
			return "Deleted Successfully";
		}else {
			return "Error Deleting Customer : " + id;
		}
	}

}
