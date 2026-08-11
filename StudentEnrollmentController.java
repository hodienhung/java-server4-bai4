package com.example.controller;

import com.example.dto.ApiResponse;
import com.example.dto.StudentEnrollmentRequest;
import com.example.service.StudentEnrollmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students-enrollments")
public class StudentEnrollmentController {

    private final StudentEnrollmentService studentEnrollmentService;

    public StudentEnrollmentController(StudentEnrollmentService studentEnrollmentService) {
        this.studentEnrollmentService = studentEnrollmentService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Void>> enrollStudent(@RequestBody StudentEnrollmentRequest req) {
        studentEnrollmentService.enrollStudent(req.getStudentId(), req.getCourseId());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.success("Student Enrolled Successfully"));
    }
}
