package models;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private long id;
    private String name;
    private String brand;
    private List<Contact> contacts = new ArrayList<>();

    public Phone() {
    }

    private static long idGen = 1L;
    public long getIdGen (){
        return idGen++;
    }


    public Phone( String name, String brand, List<Contact> contacts) {
        this.name = name;
        this.brand = brand;
        this.contacts = contacts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
