package com.practice.sp3_1.Service.Iplm;

import com.practice.sp3_1.Service.UserService;
import com.practice.sp3_1.dto.UserRequest;
import com.practice.sp3_1.entities.User;
import com.practice.sp3_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIplm implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User CreateUser(UserRequest userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setDob(userDto.getDob());
        user.setAddress(userDto.getAddress());

        return userRepository.save(user);
    }
}
