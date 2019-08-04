package com.sns.swagger2.resources;

import com.sns.swagger2.entity.Contact;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/contacts")
public interface IAddressBookResource {

    @GetMapping("/")
    @ApiOperation(value = "Get all Contacts in the address book",
            notes = "Get all contacts from address book",
            response = List.class)
    List<Contact> getAllContacts();

    @GetMapping("/{id}")
    @ApiOperation(value = "Find Contacts by ID",
    notes = "Provide an ID to look up specific contact from address book",
    response = Contact.class)
    Contact getContact(@ApiParam(value = "ID value for the Contact you need to retrieve", required = true)
                       @PathVariable String id);

    @PostMapping("/")
    @ApiOperation(value = "Add new contact",
            notes = "Add new contact to address book",
            response = Contact.class)
    Contact addContact(@RequestBody Contact contact);
}
