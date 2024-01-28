package service.impl;

import db.Databese;
import models.Phone;
import service.PhoneService;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneServiceImpl implements PhoneService {
    private final Databese databese;

    public PhoneServiceImpl(Databese databese) {
        this.databese = databese;
    }
//================================================================================
    @Override
    public String addPhone(Phone phone) {databese.getPhones().add(phone);
        return "success";
    }

    @Override
    public Phone getPhoneById(long phoneId) {
        Optional<Phone> first = databese.getPhones()
                .stream()
                .filter(phone -> phone.getId() == (phoneId)).findFirst();
        return first.orElse(null);
    }

    @Override
    public Phone updatePhoneNameById(long phoneId, String newName) {
        List<Phone> phones = databese.getPhones();
        Optional<Phone> first = phones
                .stream().filter(phone -> phone.getId() == phoneId).findFirst();
        first.ifPresent(phone -> phone.setName(newName));
        return first.orElse(null);
    }

    @Override
    public List<Phone> getAllPhones(){
       return databese.getPhones();
    }

    @Override
    public List<Phone> getAllPhonesByBrand(String brand) {
        List<Phone> collect = databese.getPhones()
                .stream()
                .filter(phone -> phone.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public void deletePhoneById(long phoneId) {
        for (Phone phone : databese.getPhones()) {
            if(phoneId == phone.getId()){
                getAllPhones().remove(phone);[]
            }
        }
    }
}
