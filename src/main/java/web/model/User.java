package web.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", nullable = false)
    @NotEmpty(message = "first_name should not be empty")
    private String first_name;

    @Column(name = "last_name", nullable = false)
    @NotEmpty(message = "last_name should not be empty")
    private String last_name;

    @Column(name = "age")
    private int age;

}
