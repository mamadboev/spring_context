package uz.lesson1.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int birthYear;

    public Student() {
        System.out.println("Student Bean!!!");
    }
}
