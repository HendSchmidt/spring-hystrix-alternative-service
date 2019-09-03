package com.example.howtodoinjava.springhystrixalternativeservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlternativeServiceController {
    @RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
    public String getStudents(@PathVariable String schoolname) {
        return "Alternative Flow";
    }

}
