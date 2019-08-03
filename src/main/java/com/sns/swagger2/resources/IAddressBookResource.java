package com.sns.swagger2.resources;

import com.sns.swagger2.entity.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/contacts")
public interface IAddressBookResource {

    @GetMapping("/")
    List<Contact> getAllContacts();

    @GetMapping("/{id}")
    Contact getContact(@PathVariable String id);

    @PostMapping("/")
    Contact addContact(@RequestBody Contact contact);
}
