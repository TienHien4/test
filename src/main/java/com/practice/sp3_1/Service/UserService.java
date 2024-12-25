package com.practice.sp3_1.Service;

import com.practice.sp3_1.dto.UserRequest;
import com.practice.sp3_1.entities.User;

public interface UserService {
    User CreateUser(UserRequest userDto);
}
