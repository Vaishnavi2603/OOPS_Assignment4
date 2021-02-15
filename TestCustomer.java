package Aggregation_Encapsulation2;

public class TestCustomer {

	public static void main(String[] args) {
		

		Address address2=new Address("Ist Main HSR Layout,","Bangalore"); // using parameterized constructor
		OfficialAddress o=new OfficialAddress(" Ist Main Electronics city","Bangalore");
		
		
		Customer customer5=new Customer("John",address2,o);
		
		customer5.getCustomerDetails();

	}

}
