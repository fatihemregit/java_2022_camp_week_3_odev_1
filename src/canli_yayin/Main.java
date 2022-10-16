package canli_yayin;

public class Main {

	public static void main(String[] args) {
		/*
		 //Engin öğretmen normalde kodu sildi ama ben kodlar dursun diye yorum satırına alıyorum
		 CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "Ankara";		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.taxNumber = "1000000";
		company.companyName = "Arçelik";
		company.id = 100;
		
		CustomerManager customerManager2 = new CustomerManager(new Person());
		
		
		Person person = new Person();
		person.firstName = "";
		person.nationalIdenity = "";
		 */
		//Ioc Container araştır
		CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
		customerManager.GiveCredit();
	}

}

