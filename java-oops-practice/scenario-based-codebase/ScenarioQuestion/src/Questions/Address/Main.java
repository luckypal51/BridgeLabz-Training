package Questions.Address;

public class Main {
	 public static void main(String[] args) {
	        AddressBook book = new AddressBook();

	        Address a1 = new Address("Bhopal", " M P ", "462022");
	        Address a2 = new Address("Bangalore", " Karnataka ", "560001");

	        Contact c1 = new Contact("Lucky", "Pal", "9876543210", "pallucky@gmail.com", a1);
	        Contact c2 = new Contact("Himesh", "kurmi", "9123456789", "himesh@gmail.com", a2);

	        book.addContact(c1);
	        book.addContact(c2);

	        System.out.println("\nAll Contacts:");
	        book.displayAllContacts();

	        System.out.println("\nSearch by City:");
	        book.searchByCityOrState("Bhopal");

	        System.out.println("\nEdit Contact:");
	        book.editContact("Himesh kurmi", "9999999999", "himesh@gmail.com", a1);

	        System.out.println("\nDelete Contact:");
	        book.deleteContact("Lucky Pal");

	        System.out.println("\nFinal Contacts:");
	        book.displayAllContacts();
	    }
}
