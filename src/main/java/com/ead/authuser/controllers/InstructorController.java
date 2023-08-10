package com.ead.authuser.controllers;

import com.ead.authuser.dtos.InstructorDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Log4j2
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/instructors")
public class InstructorController {


    @PostMapping("/subscription")
    public ResponseEntity<Object> sabeSubscriptionInstructor(@RequestBody @Valid InstructorDto instructorDto) {
        return null;
    }
}
