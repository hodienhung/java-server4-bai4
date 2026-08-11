package com.example.dto;

import com.example.model.CourseStatus;

public class CourseCreateRequest {
    private String title;
    private CourseStatus status;
    private Long instructorId;

    // Constructors, Getters & Setters
    public CourseCreateRequest() {}

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public CourseStatus getStatus() { return status; }
    public void setStatus(CourseStatus status) { this.status = status; }

    public Long getInstructorId() { return instructorId; }
    public void setInstructorId(Long instructorId) { this.instructorId = instructorId; }
}
