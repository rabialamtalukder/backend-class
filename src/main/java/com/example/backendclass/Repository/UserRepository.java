package com.example.backendclass.Repository;
import com.example.backendclass.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser(){
        User user = new User("Rabi","United State",25,"www.picture.com");
        return user;
    }
}
