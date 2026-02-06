package com.addressbook;

import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            AddressBook addressBook = new AddressBook();
            AddressBookSys bookSys=new AddressBookSys();

            String firstName, lastName, address, city, state, zip, phoneNumber, email;
            String choice;
            //uc-6 Add new Address book
            System.out.print("Enter Address Book Name : ");
            String bookName = scanner.nextLine();

            bookSys.addAddressBook(bookName);
            AddressBook addressOfBook = bookSys.getAddressBook(bookName);

            //UC-2 Add contact
            System.out.println("Add Single Contact ");
            System.out.print("Enter First Name: ");
            firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            lastName = scanner.nextLine();
            System.out.print("Enter Address: ");
            address = scanner.nextLine();
            System.out.print("Enter City: ");
            city = scanner.nextLine();
            System.out.print("Enter State: ");
            state = scanner.nextLine();
            System.out.print("Enter Zip: ");
            zip = scanner.nextLine();
            System.out.print("Enter Phone Number: ");
            phoneNumber = scanner.nextLine();
            System.out.print("Enter Email: ");
            email = scanner.nextLine();
            addressBook.addContact(new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email));

            //UC-3 edit contact
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

            //UC-4 delete contact
            System.out.print("\nEnter First Name to delete contact: ");
            String deleteName = scanner.nextLine();
            addressBook.deleteContact(deleteName);

            //UC-5 Adding Multiple users
            do {
                System.out.print("\nEnter First Name: ");
                firstName = scanner.nextLine();
                System.out.print("Enter Last Name: ");
                lastName = scanner.nextLine();
                System.out.print("Enter Address: ");
                address = scanner.nextLine();
                System.out.print("Enter City: ");
                city = scanner.nextLine();
                System.out.print("Enter State: ");
                state = scanner.nextLine();
                System.out.print("Enter Zip: ");
                zip = scanner.nextLine();
                System.out.print("Enter Phone Number: ");
                phoneNumber = scanner.nextLine();
                System.out.print("Enter Email: ");
                email = scanner.nextLine();
                addressBook.addContact(new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email));

                System.out.print("Do you want to add another contact? (yes/no): ");
                choice = scanner.nextLine();
            } while (choice.equalsIgnoreCase("yes"));

            //UC-8 Search by City or State
            System.out.println("Enter the name of the City : ");
            city= scanner.nextLine();
            List<Contact> cityResult=bookSys.searchPersonByCity(city);
            System.out.println("Persons found in city "+city+" : ");
            cityResult.forEach(System.out::println);

            System.out.println("Enter the name of the State : ");
            state=scanner.nextLine();
            List<Contact> resultState=bookSys.searchPersonByState(state);
            System.out.println("Persons found in state "+state+" : ");
            resultState.forEach(System.out::println);

        }
}
