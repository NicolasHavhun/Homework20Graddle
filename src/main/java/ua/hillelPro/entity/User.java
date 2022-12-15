package ua.hillelPro.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {
    private String name;
    private String surname;
    private int age;
}
