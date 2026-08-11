package com.example.dto;

public class StudentEnrollmentRequest {
    private Long studentId;
    private Long courseId;

    // Constructors, Getters & Setters
    public StudentEnrollmentRequest() {}

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public Long getCourseId() { return courseId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }
}
