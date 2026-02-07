package com.addressbook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {
        private List<Contact> contactList = new ArrayList<>();

        public void addContact(Contact contact) {
            if(contactList.contains(contact)){
                System.out.println("Person already present ");
            }
            else {
                contactList.add(contact);
                System.out.println("Contact added successfully ");
            }
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

    public List<Contact> getContactList() {
        return contactList;
    }
    // UC-11  Sort  alphabetically
    public List<Contact> sortContactsByName() {
        return contactList.stream()
                .sorted(Comparator.comparing(Contact::getFirstName,String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }
    //UC-12 Sort by city,state,zip
    public List<Contact> sortContactsByCity() {
        return contactList.stream()
                .sorted(Comparator.comparing(Contact::getCity,String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }
    public List<Contact> sortContactsByState() {
        return contactList.stream()
                .sorted(Comparator.comparing(Contact::getState,String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }
    public List<Contact> sortContactsByZip() {
        return contactList.stream()
                .sorted(Comparator.comparing(Contact::getZip))
                .collect(Collectors.toList());
    }
}
