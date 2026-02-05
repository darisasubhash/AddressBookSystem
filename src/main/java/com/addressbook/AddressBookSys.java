package com.addressbook;

import java.util.HashMap;
import java.util.Map;

public class AddressBookSys {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();

    // UC-6 Add new Address Book
    public void addAddressBook(String name) {
        if (addressBookMap.containsKey(name)) {
            System.out.println("Address Book already exists!");
        } else {
            addressBookMap.put(name, new AddressBook());
            System.out.println("Address Book '" + name + "' created successfully!");
        }
    }

    public AddressBook getAddressBook(String name) {
        return addressBookMap.get(name);
    }

    public void displayAddressBooks() {
        if (addressBookMap.isEmpty()) {
            System.out.println("No Address Books available ");
        } else {
            System.out.println("Available Address Books : ");
            for (String name : addressBookMap.keySet()) {
                System.out.println("  " + name);
            }
        }
    }
}
