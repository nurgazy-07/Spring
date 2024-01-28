package java12.models;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private Long id;
    private String name;
    private String country;
    private int publishedYear;
    private  int price;
}
