package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            AddressBook addressBook = new AddressBook();
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter City: ");
            String city = scanner.nextLine();
            System.out.print("Enter State: ");
            String state = scanner.nextLine();
            System.out.print("Enter Zip: ");
            String zip = scanner.nextLine();
            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            Contact contact = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
            addressBook.addContact(contact);

            System.out.print("\nEnter First Name to edit contact: ");
            String editName = scanner.nextLine();
            System.out.print("Enter New Address: ");
            address = scanner.nextLine();
            System.out.print("Enter New City: ");
            city = scanner.nextLine();
            System.out.print("Enter New State: ");
            state = scanner.nextLine();
            System.out.print("Enter New Zip: ");
            zip = scanner.nextLine();
            System.out.print("Enter New Phone Number: ");
            phoneNumber = scanner.nextLine();
            System.out.print("Enter New Email: ");
            email = scanner.nextLine();
            addressBook.editContact(editName, address, city, state, zip, phoneNumber, email);
        }
}
