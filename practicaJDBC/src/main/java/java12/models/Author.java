package java12.models;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Author {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private LocalDate dateOfBirth;
}
