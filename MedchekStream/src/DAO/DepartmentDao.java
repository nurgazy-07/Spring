package DAO;

import models.Department;

import java.util.List;

public interface DepartmentDao extends GenericGet<Department>{
    @Override
    Department get(int index);

    @Override
    List<Department> getAll();
}
