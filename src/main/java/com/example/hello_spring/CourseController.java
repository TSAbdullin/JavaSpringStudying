package com.example.hello_spring;


import com.example.hello_spring.model.Course;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    private List<Course> courses = new ArrayList<>() {
    };

    @PostMapping("/course")
    public Course createCourse(@RequestBody Course course) {
        courses.add(course);
        return course;
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courses;
    }

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable long id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }

        }
        throw new RuntimeException("Курс c ID " + id + " не найден");
    }
}
