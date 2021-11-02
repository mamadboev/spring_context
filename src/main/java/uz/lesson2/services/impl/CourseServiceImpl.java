package uz.lesson2.services.impl;

import org.springframework.stereotype.Service;
import uz.lesson2.models.Course;
import uz.lesson2.services.CourseService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Override
    public List<Course> list() {
        List<Course> courses = new ArrayList<>(
                Arrays.asList(
                        new Course(20, "Test", "Test"),
                        new Course(15, "Test1", "Test1"),
                        new Course(15, "Test2", "Test2"),
                        new Course(20, "Test3", "Test3"),
                        new Course(55, "Test4", "Test4")
                )
        );
        return courses;
    }
}
