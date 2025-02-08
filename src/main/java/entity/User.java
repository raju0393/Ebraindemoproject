package entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    private int id;
    private String name;
    private String userName;
    private String password;


    public User(int id, String name, String userName, String password) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
    }
}


