package com.bridzelab;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookClass {
    static final Scanner scanner = new Scanner(System.in);
    static final ArrayList<Contacts> contact = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program");
        AddressBookClass addressBookClass =new AddressBookClass();
        addressBookClass.addContact();
    }

    public void addContact() {
        Contacts addressBook = new Contacts();
        System.out.println("Enter a first name:");
        addressBook.setFirstName(scanner.next());
        System.out.println("Enter a last name:");
        addressBook.setLastName(scanner.next());
        System.out.println("Enter a Address:");
        addressBook.setAddress(scanner.next());
        System.out.println("Enter a City name:");
        addressBook.setCity(scanner.next());
        System.out.println("Enter a state:");
        addressBook.setState(scanner.next());
        System.out.println("Enter a email:");
        addressBook.setEmail(scanner.next());
        System.out.println("Enter a zip code:");
        addressBook.setZip((scanner.next()));
        System.out.println("Enter a phone number:");
        addressBook.setPhoneNum((scanner.next()));
        contact.add(addressBook);
        System.out.println(contact);
        System.out.println("Contact added success fully");
    }
}
