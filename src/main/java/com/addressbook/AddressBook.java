package com.addressbook;

public class AddressBook {

        private Contact contact;

        public void addContact(Contact contact) {
            this.contact = contact;
            System.out.println("Contact added successfully!");
        }
}
