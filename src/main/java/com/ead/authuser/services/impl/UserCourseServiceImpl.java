package com.ead.authuser.services.impl;

import com.ead.authuser.repositories.UserCourseRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCourseServiceImpl {

    private final UserCourseRepository userCourseRepository;

    public UserCourseServiceImpl(UserCourseRepository userCourseRepository) {
        this.userCourseRepository = userCourseRepository;
    }


}
