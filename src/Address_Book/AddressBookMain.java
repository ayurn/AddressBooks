package Address_Book;

import java.util.*;

public class AddressBookMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        System.out.println("Enter the contact details:");
        String firstName = sc.next();
        String lastName = sc.next();
        String address = sc.next();
        String city = sc.next();
        String state = sc.next();
        String email = sc.next();
        String phoneNumber = sc.next();
        String zip = sc.next();
        ContactDetails cd = new ContactDetails(firstName, lastName, address, city, state, email, phoneNumber, zip);

        ArrayList<ContactDetails> contactList = addressBook.contactList(cd);
        for (ContactDetails contact : contactList) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getAddress() + " " + contact.getCity() +
                    " " + contact.getState() + " " + contact.getEmail() + " " + contact.getPhoneNumber() + " " + contact.getZip());
        }
    }
}
