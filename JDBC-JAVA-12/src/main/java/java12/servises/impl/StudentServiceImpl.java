package java12.servises.impl;

import java12.dao.StudentDao;
import java12.dao.impl.StudentDaoImpl;
import java12.models.Student;
import java12.servises.StudentService;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {
    private final StudentDao studentDao = new StudentDaoImpl();


    @Override
    public void createStudentTable() {
        studentDao.createStudentTable();
    }

    @Override
    public String saveStudent(Student newStudent) {
        return null;
    }

    @Override
    public Student findById(Long id) {
      return     studentDao.findById(id).orElseThrow(() -> new RuntimeException("Student with id:"+id+" not found! "));
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public String updateStudentById(Student student, Long id) {
        return null;
    }

    @Override
    public String deleteById(Long id) {
        return null;
    }
}
