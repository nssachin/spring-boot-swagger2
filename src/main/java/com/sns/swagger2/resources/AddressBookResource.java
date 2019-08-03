package com.sns.swagger2.resources;

import com.sns.swagger2.entity.Contact;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class AddressBookResource implements IAddressBookResource {

    ConcurrentHashMap<String, Contact> contacts = new ConcurrentHashMap<>();

    @Override
    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts.values());
    }

    @Override
    public Contact getContact(String id) {
        return contacts.get(id);
    }

    @Override
    public Contact addContact(Contact contact) {
        contacts.put(contact.getId(), contact);
        return contact;
    }
}
