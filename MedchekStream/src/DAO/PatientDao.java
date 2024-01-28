package DAO;

import models.Patient;

import java.util.List;

public interface PatientDao extends GenericGet<Patient>{
    @Override
    Patient get(int index);

    @Override
    List<Patient> getAll();
}
