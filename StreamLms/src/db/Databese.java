package db;

import models.Phone;

import java.util.ArrayList;
import java.util.List;

public class Databese {
   private List<Phone> phones = new ArrayList<>();

   public List<Phone> getPhones(){
       return phones;
   }
}
