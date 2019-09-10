package com.digia.protobuf.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.digia.protobuf.training.ProtobufTrainingProtos.Course;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepo;

    @RequestMapping(path = "/courses/{id}", method= RequestMethod.GET, produces = "application/x-protobuf")
    Course customerJson(@PathVariable Integer id) {
        return courseRepo.getCourse(id);
    }
    
    /*@RequestMapping(path = "/courses/{id}", method= RequestMethod.GET, produces = "application/x-protobuf")
    Course customerProtobuf(@PathVariable Integer id) {
        return courseRepo.getCourse(id);
    }*/
}