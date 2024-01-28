package DAO;

import models.Doctor;

import java.util.List;

public interface DoctorDao extends GenericGet<Doctor> {
    @Override
    Doctor get(int index);

    @Override
    List<Doctor> getAll();
}
