package uz.lesson.services;

import uz.lesson.models.Course;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CourseService {
    boolean add(HttpServletRequest request);

    List<Course> courses();
}
