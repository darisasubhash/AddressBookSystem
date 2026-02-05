package com.addressbook;

public class AddressBook {

        private Contact contact;

        public void addContact(Contact contact) {
            this.contact = contact;
            System.out.println("Contact added successfully!");
        }
        public void editContact(String name, String address, String city,
                                String state, String zip,
                                String phoneNumber, String email) {

            if (contact != null && contact.getFirstName().equalsIgnoreCase(name)) {
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);
                System.out.println("Contact updated successfully!");
            } else {
                System.out.println("Contact not found!");
            }
        }
    public void deleteContact(String name) {
        if (contact != null && contact.getFirstName().equalsIgnoreCase(name)) {
            contact = null;
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }
}
