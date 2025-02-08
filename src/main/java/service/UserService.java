package service;


import entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<User> userList(){
            List<User> users =
            Arrays.asList(
                    new User(1,"Rajkumar","raj","1234"),
                    new User(2,"Kavin","kavi","23445"),
                    new User(3,"Lavanya","Lav","9876"),
                    new User(4,"Andrew","drew","76554"),
                    new User(5,"Thiru","thiru","6656")
            );
        return users;
    }
}
