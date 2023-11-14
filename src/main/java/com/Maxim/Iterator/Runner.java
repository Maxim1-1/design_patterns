package com.Maxim.Iterator;

import java.util.Iterator;

public class Runner {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Contact contact1 = new Contact();

        contact1.setName("Test");
        contact1.setPhoneNumber("+12121212");

        Contact contact2 = new Contact();

        contact2.setName("Test");
        contact2.setPhoneNumber("+12121212");

        contactList.addContact(contact1);
        contactList.addContact(contact2);

        Iterator<Contact> iterator = contactList.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
        }
    }
}
