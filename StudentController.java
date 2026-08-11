package com.example.controller;

import com.example.dto.ApiResponse;
import com.example.dto.StudentCreateRequest;
import com.example.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Void>> createStudent(@RequestBody StudentCreateRequest req) {
        studentService.createStudent(req);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.success("Student Created Successfully"));
    }
}
