package service.impl;

import models.Contact;
import service.ContactService;

import java.util.List;

public class ContactServiceImpl implements ContactService {
    @Override
    public String addContactToPhone(int phoneId, Contact contact) {
        return null;
    }

    @Override
    public Contact findContactByName(int phoneId, String contactName) {
        return null;
    }

    @Override
    public Contact findContactByPhoneNumber(int phoneId, String phoneNumber) {
        return null;
    }

    @Override
    public List<Contact> sortContactsByName(int phoneId) {
        return null;
    }

    @Override
    public void deleteContactByNameFromPhone(int phoneId, String contactName) {

    }
}
