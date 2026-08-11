package com.example.service;

import com.example.model.Course;
import com.example.model.Student;
import com.example.model.StudentEnrollment;
import com.example.repository.CourseRepository;
import com.example.repository.StudentEnrollmentRepository;
import com.example.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentEnrollmentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final StudentEnrollmentRepository studentEnrollmentRepository;

    public StudentEnrollmentService(StudentRepository studentRepository,
                                    CourseRepository courseRepository,
                                    StudentEnrollmentRepository studentEnrollmentRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.studentEnrollmentRepository = studentEnrollmentRepository;
    }

    public void enrollStudent(Long studentId, Long courseId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + studentId));

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + courseId));

        StudentEnrollment enrollment = new StudentEnrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);

        studentEnrollmentRepository.save(enrollment);
    }
}
