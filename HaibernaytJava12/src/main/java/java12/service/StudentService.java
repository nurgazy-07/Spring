package java12.service;

import java12.entity.Student;

import java.util.List;

public interface StudentService {
    //CRUD

    //Create
    String saveStudent(Student student);

    //read
    Student getStudentById(Long studentId);

    List<Student> getAllStudents();

    //Update
    Student updateStudent(Long oldStudent, Long newStudent);

    //Delete
    String deleteStudent(Long studentId);
}
