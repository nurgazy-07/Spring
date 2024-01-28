package java12.service.impl;

import java12.dao.StudentDao;
import java12.dao.impl.StudentDaoImpl;
import java12.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentDao {
    StudentDao studentDao = new StudentDaoImpl();
    @Override
    public String saveStudent(Student student) {
      return  studentDao.saveStudent(student);
    }
    @Override
    public Student getStudentById(Long studentId) {
        return studentDao.getStudentById(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student updateStudent(Long oldStudent, Long newStudent) {
        return null;
    }

    @Override
    public String deleteStudent(Long studentId) {
        return null;
    }
}
