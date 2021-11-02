package uz.lesson.services.impl;

import org.springframework.stereotype.Service;
import uz.lesson.models.Course;
import uz.lesson.services.CourseService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final List<Course> courses = new ArrayList<>();

    @Override
    public boolean add(HttpServletRequest request) {
        int courseNumber = Integer.valueOf(request.getParameter("courseNumber"));
        String courseName = request.getParameter("courseName");
        String courseInfo = request.getParameter("courseInfo");
        Course course = new Course();
        course.setCourseName(courseName);
        course.setCourseInfo(courseInfo);
        course.setCourseNumber(courseNumber);
        courses.add(course);
        return true;
    }

    @Override
    public List<Course> courses() {
        return courses;
    }
}
