package uz.lesson1.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Course {
    private int courseNumber;
    private String courseName;
    private String courseInfo;

    public Course(){
        System.out.println("Course Bean!!!");
    }
}
