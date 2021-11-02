package uz.lesson.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private int courseNumber;
    private String courseName;
    private String courseInfo;
}
