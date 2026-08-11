package com.example.dto;

public class StudentCreateRequest {
    private String name;
    private String email;

    // Constructors, Getters & Setters
    public StudentCreateRequest() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
