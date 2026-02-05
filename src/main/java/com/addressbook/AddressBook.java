package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
        private List<Contact> contactList = new ArrayList<>();

        public void addContact(Contact contact) {
            contactList.add(contact);
            System.out.println("Contact added successfully ");
        }
        public void editContact(String name, String address, String city,
                                String state, String zip,
                                String phoneNumber, String email) {
            for (Contact contact : contactList) {
                if (contact.getFirstName().equalsIgnoreCase(name)) {
                    contact.setAddress(address);
                    contact.setCity(city);
                    contact.setState(state);
                    contact.setZip(zip);
                    contact.setPhoneNumber(phoneNumber);
                    contact.setEmail(email);
                    System.out.println("Contact updated successfully ");
                    return;
                }
            }
            System.out.println("Contact not found ");
        }
        public void deleteContact(String name) {
            for (Contact contact : contactList) {
                if (contact.getFirstName().equalsIgnoreCase(name)) {
                    contactList.remove(contact);
                    System.out.println("Contact deleted successfully ");
                    return;
                }
            }
            System.out.println("Contact not found ");
        }
}
