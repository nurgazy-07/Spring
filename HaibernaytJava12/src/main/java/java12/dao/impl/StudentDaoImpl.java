package java12.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java12.confic.HibernateConfic;
import java12.dao.StudentDao;
import java12.entity.Student;
import org.hibernate.EntityNameResolver;
import org.hibernate.Session;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    EntityManagerFactory entityManagerFactory = HibernateConfic.getEntityManager();
    @Override
    public String saveStudent(Student student) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        return student.getFirstName() + " successfully saved";
    }

    @Override
    public Student getStudentById(Long studentId) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class, studentId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Student> selectSFromStudentS = entityManager.createQuery("select s from Student s", Student.class).getResultList();
        return selectSFromStudentS;
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
