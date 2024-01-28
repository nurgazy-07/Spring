package service;

import models.Phone;

import java.util.List;

public interface PhoneService {
    String addPhone(Phone phone);
    Phone getPhoneById(long phoneId);
    Phone updatePhoneNameById(long phoneId, String newName);
    List<Phone> getAllPhones();
    List<Phone> getAllPhonesByBrand(String brand);
    void deletePhoneById(long phoneId);
}
