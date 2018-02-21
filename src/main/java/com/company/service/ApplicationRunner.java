package com.company.service;

import com.company.model.User;
import com.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ApplicationRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;


    @Transactional
    public void save() {

        User user_1 = User.builder()
                .firstName("Peter")
                .lastName("Dale")
                .username("peter_dale")
                .build();

        User user_2 = User.builder()
                .firstName("Martin")
                .lastName("Yale")
                .username("martin_yale")
                .build();

        userRepository.save(user_1);


        userRepository.save(user_2);

        System.out.println(user_1);
        System.out.println(user_2);
    }

    @Transactional
    public void updateUser() {
        User user_1 = userRepository.findById(1);
        user_1.setFirstName("David");
        user_1.setLastName("Davids");
        user_1.setUsername("david_davids");

        userRepository.update(user_1);

        System.out.println(user_1);
    }

    @Transactional
    public void printAll() {
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }


}
