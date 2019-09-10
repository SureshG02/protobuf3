package com.digia.protobuf.training;

import java.util.Map;

import com.digia.protobuf.training.ProtobufTrainingProtos.Course;

public class CourseRepository {

    private final Map<Integer, Course> courses;

    public CourseRepository(Map<Integer, Course> courses) {
        this.courses = courses;
    }

    public Course getCourse(int id) {
        return courses.get(id);
    }
}
