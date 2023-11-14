package com.Maxim.Iterator;

import java.util.Iterator;

public class ContactList {


    private Contact[]contacts;

    private int size;

    public ContactList() {
        contacts = new Contact[10];
        size = 0;
    }


    public void addContact(Contact contact) {

        if (size < contacts.length) {
            contacts[size] = contact;
            size++;
        } else {
            Contact[] newContacts = new Contact[contacts.length * 2];
            System.arraycopy(contacts, 0, newContacts, 0, contacts.length);
            newContacts[size] = contact;
            size++;
            contacts = newContacts;
        }
    }

    private class ContactIterator implements Iterator<Contact> {
        private int position;

        public ContactIterator() {
            position = 0;
        }

        public boolean hasNext() {
            return position < size;
        }

        public Contact next() {
            Contact contact = contacts[position];
            position++;
            return contact;
        }
    }
    public Iterator<Contact> iterator() {
        return new ContactIterator();
    }
}
