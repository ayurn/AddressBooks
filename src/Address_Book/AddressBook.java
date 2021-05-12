package Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static Scanner sc = new Scanner(System.in);
    public ArrayList<ContactDetails> contactList = new ArrayList<>();

    public  ArrayList<ContactDetails> contactList(ContactDetails cd){
        contactList.add(cd);
        return contactList;
    }

    public void addContactDetails(){
        System.out.println("Enter the contact details:");
        String firstName = sc.next();
        String lastName = sc.next();
        String address = sc.next();
        String city = sc.next();
        String state = sc.next();
        String email = sc.next();
        String phoneNumber = sc.next();
        String zip = sc.next();
        ContactDetails contactDetails = new ContactDetails(firstName, lastName, address, city, state, email, phoneNumber, zip);
        contactList.add(contactDetails);

    }

}
