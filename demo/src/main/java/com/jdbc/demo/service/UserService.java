package com.jdbc.demo.service;
import com.jdbc.demo.entity.User;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface UserService {
    User saveUser(User user);
    User updateUser(User user);
    User getUser(Integer id);
    String deleteById(Integer id);
    List<User> allUser();
}
