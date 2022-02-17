package com.example.amittest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/")
@RestController
public class StudentController {
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable(value = "id") Long id){
        return studentService.getStudent(id);
    }
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @PutMapping("/students/{id}")
    public void updateStudent(@RequestBody Student student,@PathVariable(value = "id") Long id){
        studentService.updateStudent(student,id);
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable(value = "id") Long id){
        studentService.deleteStudent(id);
    }
}
