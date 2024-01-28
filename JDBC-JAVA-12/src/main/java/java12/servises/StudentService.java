package java12.servises;

import java12.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    void createStudentTable();
    String saveStudent(Student newStudent);
    Student findById(Long id);
    List<Student> findAll();
    String updateStudentById(Student student, Long id);
    String deleteById(Long id);
}
