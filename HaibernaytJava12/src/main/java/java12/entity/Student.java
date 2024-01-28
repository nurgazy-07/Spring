package java12.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_generator")
    @SequenceGenerator(name = "student_generator",
                    sequenceName = "student_sequence",
                    allocationSize = 1)
    private Long id;
    @Column(name = "first_name", nullable = false, length = 500)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(unique = true)
    private String email;
    private int age;

    public Student(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}
